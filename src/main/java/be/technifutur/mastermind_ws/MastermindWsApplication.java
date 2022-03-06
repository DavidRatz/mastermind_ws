package be.technifutur.mastermind_ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"be.technifutur.mastermind_ws"})
@ComponentScan(basePackages = {"be.technifutur.MastermindWsApplication"})
public class MastermindWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MastermindWsApplication.class, args);
	}

}
