package com.springDemo.service.Impl;

import com.springDemo.service.JdbcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcServiceImpl implements JdbcService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Boolean save() throws RuntimeException {
        String sql = "insert into mall_my_trace(user_id,sku_id) values (?,?)";
        jdbcTemplate.update(sql,1,1);
        // 测试事务
        /*if (true){
            throw new RuntimeException("1");
        }*/
        return true;
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
