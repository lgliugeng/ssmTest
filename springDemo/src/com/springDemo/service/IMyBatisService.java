package com.springDemo.service;

import java.util.List;
import java.util.Map;

public interface IMyBatisService {

    List<Object> selectTrace();

    List<Map<String,String>> selectTrace2();
}
