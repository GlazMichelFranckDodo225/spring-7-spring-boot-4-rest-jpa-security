package com.dgmf.ex2.config;

import com.dgmf.ex2.beans.Vehicle;
import org.springframework.context.annotation.*;

@Configuration
@Import({AnotherProjectConfig.class})
public class ProjectConfig {

    @Bean(name = "audiVehicle")
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Audi");
        return  veh;
    }

    @Primary
    @Bean(value = "hondaVehicle")
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("Honda");
        return  veh;
    }

    @Bean("ferrariVehicle")
    @Description("This is a Vehicle Class Bean")
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return  veh;
    }

    @Bean({"mercedesVehicle", "myFavouriteVehicle"})
    Vehicle vehicle4() {
        var veh = new Vehicle();
        veh.setName("Mercedes Benz");
        return  veh;
    }
}
