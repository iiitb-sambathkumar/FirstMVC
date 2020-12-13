package Upgrad.FirstMVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class FirstMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstMvcApplication.class, args);
	}

}
