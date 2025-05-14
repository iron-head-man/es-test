package com.example.demo.aa;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * <p>
 *
 * </p>
 *
 * @author xxingheng@hand-china.com 2025/05/14 22:58
 */
@DubboService(version = "3.2.0")
public class HelloServiceImpl implements HelloService{
    @Override
    public String hello(String msg) {
        return "你好 ！！！";
    }
}
