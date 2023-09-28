package fr.eni.demoSpring.Service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"anglais","default"})

public class HelloServiceImpl implements HelloService{

    @Override
    public String hello(){
        return "Hello World";
    }
}
