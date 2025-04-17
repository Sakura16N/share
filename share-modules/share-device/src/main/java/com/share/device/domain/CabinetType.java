package com.share.device.domain;

import com.share.common.core.web.domain.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "柜机类型")
public class CabinetType extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Schema(description = "柜机名称")
    private String name;
    @Schema(description = "总插槽数量")
    private Integer totalSlots;
    @Schema(description = "描述")
    private String description;
    @Schema(description = "柜机状态")
    private String status;


}
