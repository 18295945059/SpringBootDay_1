package com.baizhi.service;

import org.springframework.stereotype.Service;

@Service
public class AAopImpl implements aop {
    @Override
    public void select() {
        System.out.println("++++++++++++++++++++++++");
    }
}
