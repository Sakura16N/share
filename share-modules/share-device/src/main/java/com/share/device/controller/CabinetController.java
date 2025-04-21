package com.share.device.controller;

import com.share.common.core.web.controller.BaseController;
import com.share.common.core.web.domain.AjaxResult;
import com.share.common.core.web.page.TableDataInfo;
import com.share.device.domain.Cabinet;
import com.share.device.service.ICabinetService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "充电宝柜机接口管理")
@RestController
@RequestMapping("/cabinet")
public class CabinetController extends BaseController {

    @Autowired
    private ICabinetService cabinetService;

    /**
     * 分页查询柜机列表
     * @return Ruo-yi框架封装的分页查询返回的类
     */
    @Operation(summary = "分页查询柜机列表")
    @GetMapping("/list")
    public TableDataInfo list(Cabinet cabinet) {
        startPage();
        List<Cabinet> list =  cabinetService.selectCabinetList(cabinet);
        return getDataTable(list);
    }

    /**
     * 根据Id查询指定柜机
     */
    @Operation(summary = "根据Id查询指定柜机")
    @GetMapping("/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        Cabinet cabinet = cabinetService.getById(id);
        return AjaxResult.success(cabinet);
    }

    /**
     * 新增充电宝柜机
     * @param cabinet
     * @return
     */
    @Operation(summary = "新增充电宝柜机")
    @PostMapping()
    public AjaxResult save(@RequestBody @Validated Cabinet cabinet) {
        boolean isSaved = cabinetService.save(cabinet);
        return toAjax(isSaved);
    }

    /**
     * 根据id删除充电宝柜机
     * @param id
     * @return
     */
    @Operation(summary = "根据id删除充电宝柜机")
    @DeleteMapping("{id}")
    public AjaxResult remove(@PathVariable Long id) {
        boolean isDeleted = cabinetService.removeById(id);
        return toAjax(isDeleted);
    }

    /**
     * 修改柜机
     * @param cabinet
     * @return
     */
    @Operation(summary = "修改柜机")
    @PutMapping
    public AjaxResult update(@RequestBody @Validated Cabinet cabinet) {
        boolean isUpdated = cabinetService.updateById(cabinet);
        return toAjax(isUpdated);
    }

}
