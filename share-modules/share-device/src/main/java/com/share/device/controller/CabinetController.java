package com.share.device.controller;

import com.share.common.core.web.controller.BaseController;
import com.share.common.core.web.page.TableDataInfo;
import com.share.device.domain.Cabinet;
import com.share.device.service.ICabinetService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "充电宝柜机接口管理")
@RestController
@RequestMapping("/cabinet")
public class CabinetController extends BaseController {

    @Autowired
    private ICabinetService cabinetService;

    @Operation(summary = "分页查询柜机列表")
    @GetMapping("/list")
    public TableDataInfo list(Cabinet cabinet) {
        startPage();
        List<Cabinet> list =  cabinetService.selectCabinetList(cabinet);
        return getDataTable(list);
    }
}
