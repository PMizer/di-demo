package com.pm.spring5didemo;

import com.pm.spring5didemo.controllers.MyController;
import com.pm.spring5didemo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring5DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource = (FakeDataSource)ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUser());

    }
}
