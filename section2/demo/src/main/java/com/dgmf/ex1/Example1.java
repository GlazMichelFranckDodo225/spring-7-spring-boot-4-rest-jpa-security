package com.dgmf.ex1;

import com.dgmf.ex1.beans.Vehicle;
import com.dgmf.ex1.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    static void main() {
            var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
            // NoUniqueBeanDefinitionException: No qualifying bean of
            // type 'com.dgmf.ex1.beans.Vehicle' available: expected single matching bean but
            // found 3: vehicle1,vehicle2,vehicle3
            var veh = context.getBean(Vehicle.class);
            System.out.println("Vehicle name from Spring Context is : " + veh.getName());

        }
    }