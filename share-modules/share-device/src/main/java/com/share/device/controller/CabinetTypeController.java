package com.share.device.controller;

import com.share.common.core.web.controller.BaseController;
import com.share.common.core.web.domain.AjaxResult;
import com.share.common.core.web.page.TableDataInfo;
import com.share.device.domain.CabinetType;
import com.share.device.service.ICabinetTypeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "柜机类型接口管理")
@RestController
@RequestMapping("/cabinetType")
public class CabinetTypeController extends BaseController
{
    @Autowired
    private ICabinetTypeService cabinetTypeService;

    /**
     * 查询柜机类型列表
     */
    @Operation(summary = "查询柜机类型列表")
    @GetMapping("/list")
    public TableDataInfo list(CabinetType cabinetType)
    {
        startPage();
        List<CabinetType> list = cabinetTypeService.selectCabinetTypeList(cabinetType);
        return getDataTable(list);
    }

    /**
     * 根据id查询柜机类型
     */
    @Operation(summary = "根据id查询柜机类型")
    @GetMapping("/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        CabinetType cabinetType = cabinetTypeService.getById(id);
        return success(cabinetType);
    }

    /**
     * 新增柜机类型
     * @param cabinetType
     * @return
     */
    @Operation(summary = "新增柜机类型")
    @PostMapping
    public AjaxResult add(@RequestBody CabinetType cabinetType) {
        boolean isSaved = cabinetTypeService.save(cabinetType);
        return toAjax(isSaved);
    }

    /**
     * 根据id删除柜机类型
     * @param ids
     * @return
     */
    @Operation(summary = "根据id删除柜机类型")
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable List<Long> ids) {
        boolean isDel = cabinetTypeService.removeBatchByIds(ids);
        return toAjax(isDel);
    }

    /**
     * 修改柜机类型
     * @param cabinetType
     * @return
     */
    @Operation(summary = "修改柜机类型")
    @PutMapping
    public AjaxResult update(@RequestBody CabinetType cabinetType) {
        return toAjax(cabinetTypeService.updateById(cabinetType));
    }
}
