package com.share.device.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.share.device.domain.Cabinet;

import java.util.List;

public interface ICabinetService extends IService<Cabinet> {
    /**
     * 查询Cabinet列表
     * @param cabinet
     * @return
     */
    List<Cabinet> selectCabinetList(Cabinet cabinet);
}
