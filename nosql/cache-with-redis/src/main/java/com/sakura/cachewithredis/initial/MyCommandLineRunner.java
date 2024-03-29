package com.sakura.cachewithredis.initial;

import com.sakura.cachewithredis.service.ICoffeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author DM
 * @version 1.0
 * @description 服务启动初始化
 * @date 2022/07/09
 */
@Slf4j
@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Resource
    private ICoffeeService coffeeService;

    @Override
    public void run(String... args) throws Exception {
        log.info("Coffee count: {}", coffeeService.findAllCoffee().size());
        for (int i = 0; i < 5; i++) {
            log.info("============================Reading from cache============================");
            coffeeService.findAllCoffee();
        }
        // 延迟5秒执行
        Thread.sleep(5000);
//        coffeeService.reloadCoffee();
        log.info("===============================Reading after refresh=================================");
        coffeeService.findAllCoffee().forEach(item -> log.info("All coffee: {}", item.getName()));
    }
}
