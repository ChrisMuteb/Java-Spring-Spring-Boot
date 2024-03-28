package org.example.g1.a0;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jdk.jfr.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
//@Component
@Named
class BusinessService{
    private DataService dataService;
//    @Autowired
    @Inject
    public void setDataService(DataService dataService){
        System.out.println("Setter injection will be performed");

        this.dataService = dataService;
    }
    public DataService getDataService(){
        return dataService;
    }

}
//@Component
@Named
class DataService{}
@Configuration
@ComponentScan
public class CDIContextLauncherApplication {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(CDIContextLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessService.class));
        }
    }
}
