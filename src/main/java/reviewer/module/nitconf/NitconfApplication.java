package reviewer.module.nitconf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }) 
public class NitconfApplication {

	public static void main(String[] args) {
		SpringApplication.run(NitconfApplication.class, args);
	}

}
