package com.share.device.domain;

import com.share.common.core.web.domain.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Schema(description = "柜机类型")
public class CabinetType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 名称 */
    @Schema(description = "名称")
    @NotBlank(message = "柜机类型名称不能为空")
    private String name;

    /** 总插槽数量 */
    @Schema(description = "总插槽数量")
    @NotNull(message = "总插槽数量不得为空")
    private Integer totalSlots;

    /** 描述 */
    @Schema(description = "描述")
    private String description;

    /** 状态（0正常 1停用） */
    @Schema(description = "状态")
    private String status;

}
