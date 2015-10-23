package com.isnow;

import com.isnow.config.MysqlConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lxq on 15-10-23.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class TestYaml {

    @Autowired
    private MysqlConfig mysqlConfig;

    @Test
    public void Test1(){

        System.out.println("测试配置文件---"+ mysqlConfig.toString());
    }
}
