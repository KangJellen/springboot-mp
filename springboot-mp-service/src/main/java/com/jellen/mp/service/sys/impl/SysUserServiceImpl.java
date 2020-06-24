package com.jellen.mp.service.sys.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jellen.mp.dao.mapper.sys.SysUserMapper;
import com.jellen.mp.model.po.sys.SysUser;
import com.jellen.mp.service.sys.SysUserService;
import org.springframework.stereotype.Service;

/**
 * 系统用户接口实现类
 *
 * @author afei@yscredit.com
 * @version 1.0
 * @date 2020-06-12 15:35
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
}
