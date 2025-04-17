package com.share.device.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.share.device.domain.CabinetType;

import java.util.List;

public interface ICabinetTypeService extends IService<CabinetType> {

    /**
     * 查询该类型柜机列表
     * @param cabinetType
     * @return
     */
    List<CabinetType> selectCabinetTypeList(CabinetType cabinetType);
}
