package com.jellen.mp.model.po.sys;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.jellen.mp.model.base.BaseEntity;
import lombok.Data;

/**
 * 系统用户
 *
 * @author afei@yscredit.com
 * @version 1.0
 * @date 2020-06-12 14:46
 */
@Data
@TableName("sys_user")
public class SysUser extends BaseEntity {

    @TableId(type = IdType.ID_WORKER)
    private Long userId;
    private String username;
    private String password;
    private String nickName;
    private Integer gender;
    private Integer age;
    private String mobile;
    private String email;
    /** 用户状态（0-启用;1-禁用） */
    private Integer userStatus;
    /**
     * 简介
     */
    private String remark;

    public SysUser() {
        super();
    }

    public SysUser(String username) {
        super();
        this.username = username;
    }
}
