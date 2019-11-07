package com.shusheng.elasticsearch.dao.repository;

import com.shusheng.elasticsearch.dao.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author Created by wupeng.
 * @Email eric_wu_peng@126.com
 * @Date 2019/11/8
 */
@Component
public interface UserRepository extends ElasticsearchRepository<User,String> {

    User queryUserById(String id);

}
