package com.clk.webservices.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * <p></p>
 *
 * @author likui
 * @version 1.0
 * @date 2018/8/29
 * @since JDK 1.7
 */
@WebService(
        name = "TestService", // 暴露服务名称
        targetNamespace = "http://service.webservices.clk.com"// 命名空间,一般是接口的包名倒序
)
public interface ITestService {


    @WebMethod
    @WebResult(name = "String", targetNamespace = "")
    String sendMessage(@WebParam(name = "username") String username);


    @WebMethod
    @WebResult(name = "String", targetNamespace = "")
    String message();
}
