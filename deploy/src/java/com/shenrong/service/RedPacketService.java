package com.shenrong.service;

import com.shenrong.pojo.RedPacket;

public interface RedPacketService {

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
