package com.share.device.domain;

import com.share.common.core.web.domain.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "柜机插槽")
public class CabinetSlot extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 柜机Id
     */
    @Schema(description = "柜机id")
    private Long cabinetId;
    /**
     * 插槽编号
     */
    @Schema(description = "插槽编号")
    private String slotNo;
    /**
     * 充电宝id
     */
    @Schema(description = "充电宝id")
    private Long powerBankId;
    /**
     * 状态
     */
    @Schema(description = "状态")
    private String status;
}
