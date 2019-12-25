package com.springDemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface TestMapper {

    @Select("Select user_id from mall_my_trace")
    List<Object> selectTrace();

    List<Map<String,String>> selectTrace2();
}
