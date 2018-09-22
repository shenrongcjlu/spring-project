package com.shenrong.dao;

import com.shenrong.pojo.UserRedPacket;

public interface UserRedPacketDao {
    /**
     * 插入抢红包信息
     * @param userRedPacket
     * @return
     */
    int grabRedPacket(UserRedPacket userRedPacket);
}
