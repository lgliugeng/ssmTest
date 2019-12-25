package com.springDemo.service.Impl;

import com.springDemo.mapper.TestMapper;
import com.springDemo.service.IMyBatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MyBatisServiceImpl implements IMyBatisService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Object> selectTrace() {
        System.out.println(testMapper.selectTrace());
        return null;
    }

    @Override
    public List<Map<String,String>> selectTrace2() {
        System.out.println(testMapper.selectTrace2());
        return null;
    }
}
