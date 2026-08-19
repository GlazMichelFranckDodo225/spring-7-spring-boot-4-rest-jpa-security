package com.dgmf.ex2;

import com.dgmf.ex2.beans.Vehicle;
import com.dgmf.ex2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    static void main() {
            var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

            // NoSuchBeanDefinitionException: No bean named 'vehicle1' available
            // var veh = context.getBean("vehicle1", Vehicle.class);
            // System.out.println("Vehicle name from Spring Context is : " + veh.getName());

            var veh = context.getBean("audiVehicle", Vehicle.class);
            System.out.println("Vehicle name from Spring Context is : " + veh.getName());

            var vehicle = (Vehicle) context.getBean("ferrariVehicle");
            System.out.println("Vehicle name from Spring Context is : " + vehicle.getName());

            var mercedes = (Vehicle) context.getBean("myFavouriteVehicle");
            System.out.println("Vehicle name from Spring Context is : " + mercedes.getName());

        }
    }