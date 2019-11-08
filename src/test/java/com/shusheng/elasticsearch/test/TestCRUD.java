package com.shusheng.elasticsearch.test;

import com.shusheng.elasticsearch.Main;
import com.shusheng.elasticsearch.dao.domain.User;
import com.shusheng.elasticsearch.dao.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description
 * @Author Created by wupeng.
 * @Email eric_wu_peng@126.com
 * @Date 2019/11/8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={Main.class})
public class TestCRUD {
    private static Logger logger = LoggerFactory.getLogger(TestCRUD.class);

    @Autowired
    ElasticsearchTemplate elasticsearchTemplate;

    @Autowired
    UserRepository userRepository;

    @Test
    public void testCreateIndex(){
        logger.info("测试创建索引功能");
        elasticsearchTemplate.createIndex(User.class);
    }

    @Test
    public void testSaveDocument(){
        logger.info("测试添加功能");
        User user = new User();
        user.setId(1L);
        user.setFirstName("shu");
        user.setLastName("sheng");

        userRepository.save(user);
    }


}
