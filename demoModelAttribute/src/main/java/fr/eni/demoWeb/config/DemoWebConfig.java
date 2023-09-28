package fr.eni.demoWeb.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

import fr.eni.demoWeb.bo.Personne;

@Configuration
public class DemoWebConfig {

	@Bean
	@SessionScope
	public List<Personne> personnes(){
		return new ArrayList<Personne>();
	}
}
