package com.shenrong.service.impl;

import com.shenrong.dao.UserRedPacketDao;
import com.shenrong.pojo.UserRedPacket;
import com.shenrong.service.UserRedPacketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRedPacketServiceImpl implements UserRedPacketService {

    @Autowired
    private UserRedPacketDao userRedPacketDao;

    @Override
    public int grabRedPacket(UserRedPacket userRedPacket) {
        return 0;
    }
}
