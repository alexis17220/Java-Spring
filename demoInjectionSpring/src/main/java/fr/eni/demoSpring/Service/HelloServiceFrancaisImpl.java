package fr.eni.demoSpring.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"francais", "default"})
public class HelloServiceFrancaisImpl implements HelloService{

    @Override
    public String hello(){
        return "Bonjour tous le monde";
    }
}
