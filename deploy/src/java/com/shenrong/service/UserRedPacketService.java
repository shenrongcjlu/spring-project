package com.shenrong.service;

import com.shenrong.pojo.UserRedPacket;

public interface UserRedPacketService {
    /**
     * 插入抢红包信息
     * @param userRedPacket
     * @return
     */
    int grabRedPacket(UserRedPacket userRedPacket);
}
