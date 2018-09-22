package com.shenrong.service.impl;

import com.shenrong.dao.RedPacketDao;
import com.shenrong.dao.UserRedPacketDao;
import com.shenrong.pojo.RedPacket;
import com.shenrong.pojo.UserRedPacket;
import com.shenrong.service.UserRedPacketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserRedPacketServiceImpl implements UserRedPacketService {

    @Autowired
    private UserRedPacketDao userRedPacketDao;
    @Autowired
    private RedPacketDao redPacketDao;

    private static final int FAILED = 0;

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public int grabRedPacket(Long redPacketId, Long userId) {
        RedPacket redPacket = redPacketDao.getRedPacket(redPacketId);
        if (redPacket.getStock() > 0) {
            redPacketDao.decreaseRedPacket(redPacketId);
            UserRedPacket userRedPacket = new UserRedPacket();
            userRedPacket.setRedPacketId(redPacketId);
            userRedPacket.setUserId(userId);
            userRedPacket.setAmount(redPacket.getAmount());
            userRedPacket.setNote("抢红包" + redPacketId);

            int result = userRedPacketDao.grabRedPacket(userRedPacket);
            return result;
        }
        return FAILED;
    }
}
