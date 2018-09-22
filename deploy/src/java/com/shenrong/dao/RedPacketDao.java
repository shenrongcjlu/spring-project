package com.shenrong.dao;

import com.shenrong.pojo.RedPacket;
import org.springframework.stereotype.Repository;

@Repository
public interface RedPacketDao {

    /**
     * 获得红包信息
     * @param id
     * @return
     */
    RedPacket getRedPacket(Long id);

    /**
     * 扣减红包数量
     * @param id
     * @return
     */
    int decreaseRedPacket(Long id);
}
