package com.clk;

import com.clk.webservices.client.CxfClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <p></p>
 *
 * @author likui
 * @version 1.0
 * @date 2018/8/29
 * @since JDK 1.7
 */
@SpringBootTest(classes = WsApplication.class)
@RunWith(SpringRunner.class)
public class CxfClientTest {

    @Autowired
    private CxfClient cxfClient;

    @Test
    public void sayHello() throws Exception {
        final String res = cxfClient.sayHello();
        System.out.println(res);
    }

}