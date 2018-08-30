package com.clk.webservices.service.impl;

import com.clk.webservices.service.ITestService;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * <p></p>
 *
 * @author likui
 * @version 1.0
 * @date 2018/8/29
 * @since JDK 1.7
 */
@WebService(serviceName = "TestService", // 与接口中指定的name一致
        targetNamespace = "http://service.webservices.clk.com", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.clk.webservices.service.ITestService"// 接口地址
)
@Component
public class TestServiceImpl implements ITestService {

    @Override
    public String sendMessage(String username) {
        return "hello " + username;
    }

    @Override
    public String message() {
        return "Hello World!";
    }

}
