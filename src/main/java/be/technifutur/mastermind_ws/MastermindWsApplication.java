package be.technifutur.mastermind_ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//(scanBasePackages = {"be.technifutur.mastermind_ws"})
//@ComponentScan(basePackages = {"be.technifutur.*"})
public class MastermindWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MastermindWsApplication.class, args);
	}

}
