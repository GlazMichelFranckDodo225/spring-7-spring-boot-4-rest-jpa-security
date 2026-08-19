package com.dgmf.ex1;

import com.dgmf.ex2.beans.Vehicle;
import com.dgmf.ex2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    static void main() {
            var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
            // NoUniqueBeanDefinitionException: No qualifying bean of
            // type 'com.dgmf.ex1.beans.Vehicle' available: expected single matching bean but
            // found 3: vehicle1,vehicle2,vehicle3
            // var veh = context.getBean(Vehicle.class);
           //  System.out.println("Vehicle name from Spring Context is : " + veh.getName());

            var veh = context.getBean("vehicle1", Vehicle.class);
            System.out.println("Vehicle name from Spring Context is : " + veh.getName());

            var vehicle = (Vehicle) context.getBean("vehicle2");
            System.out.println("Vehicle name from Spring Context is : " + vehicle.getName());

        }
    }