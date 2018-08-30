package com.clk.webservices.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 *     使用cxf调用webServices接口
 * </p>
 *
 * @author likui
 * @version 1.0
 * @date 2018/8/29
 * @since JDK 1.7
 */
public class CxfClient {

    private final static Logger LOGGER = LoggerFactory.getLogger(CxfClient.class);

    public static String sayHello(){
        // 创建动态客户端
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://localhost:8009/services/TestService?wsdl");

        // 需要密码的情况需要加上用户名和密码
        // client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME, PASS_WORD));

        Object[] objects = new Object[0];
        // invoke("方法名",参数1,参数2,参数3....);
        try {
            objects = client.invoke("message");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return objects[0] + "";
    }

    public static void main(String[] args) {
        final String res = sayHello();
        LOGGER.info("使用CXF调用webServices接口 message，返回结果：{}", res);
    }

}
