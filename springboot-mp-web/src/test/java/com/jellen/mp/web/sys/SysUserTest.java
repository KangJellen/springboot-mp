package com.jellen.mp.web.sys;

import com.jellen.mp.model.po.sys.SysUser;
import com.jellen.mp.service.sys.SysUserService;
import static org.junit.Assert.assertTrue;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 系统用户测试类
 *
 * @author afei@yscredit.com
 * @version 1.0
 * @date 2020-06-12 15:37
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class SysUserTest {

    @Autowired
    private SysUserService sysUserService;

    @Test
    public void addUserTest() {
        SysUser user = new SysUser("afei1");
        user.setPassword("123456");
        user.setNickName("阿飞哥");
        user.setMobile("18621192830");
        user.setEmail("afei@yscredit.com");
        boolean result = sysUserService.save(user);
        log.info("add result: {}", result);
        assertTrue(result);
    }

}
