package com.adalbertosn1982.multimodule.modulesub;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }, scanBasePackages = "com.adalbertosn1982.*")
@Slf4j
public class ModuleSub implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(ModuleSub.class,args);

    }

    @Override
    public void run(String... args) throws Exception {
        log.info("======== Begin run Execute ModuleSub =========");
    }
}
