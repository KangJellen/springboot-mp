package com.jellen.mp.model.base;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;

/**
 * 基础实体类
 *
 * @author afei@yscredit.com
 * @version 1.0
 * @date 2020-06-12 14:47
 */
public class BaseEntity extends IdEntity {

    /**
     * 逻辑删除标识(0-未删除;1-已删除)
     */
    @TableField("is_deleted")
    private Boolean deleted;
    /**
     * 乐观锁版本号
     */
    private Long version;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 更新时间
     */
    private Date updatedTime;

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}
