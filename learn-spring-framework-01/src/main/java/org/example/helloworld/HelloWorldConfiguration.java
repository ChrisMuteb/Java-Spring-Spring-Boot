package main.java.org.example.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address){};
record Address(String firstLine, String city){};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Chris";
    }
    @Bean
    public int age(){
        return 15;
    }
    @Bean
    public Person person(){
        return new Person("Elie", 9, new Address("Main street", "Lyon"));
    }
    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }
    @Bean
    public Person person3Parameters(String name, int age, Address address3){
        return new Person(name, age, address3);
    }
    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address){
        return new Person(name, age, address);
    }
    @Bean
    public Person person5Parameters(String name, int age, @Qualifier("address3qualifier") Address address){
        return new Person(name, age, address);
    }
    @Bean(name = "address2")
    @Primary
    public Address address(){
        return new Address("Yitzhak Rabin", "Kremlin Bicetre");
    }
    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3(){
        return new Address("Pasteur", "Paris");
    }
}
