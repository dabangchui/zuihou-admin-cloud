package com.github.zuihou.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author tyh
 * @createTime 2017-12-13 15:02
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients({"com.github.zuihou.geteway.feign",
        "com.github.zuihou.auth.client.feign"})
@EnableZuulProxy
//@EnableScheduling
//@EnableGxqptAuthClient
//@EnableAceGateRateLimit
public class GatewayServerApplication {
    public static void main(String[] args) {
        //DBLog.getInstance().start();
        SpringApplication.run(GatewayServerApplication.class, args);
    }
}
