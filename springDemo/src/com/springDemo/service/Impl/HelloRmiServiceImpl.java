package com.springDemo.service.Impl;

import com.springDemo.service.RmiService;

public class HelloRmiServiceImpl implements RmiService {

    @Override
    public int getAdd(int a, int b) {
        return a+b;
    }
}
