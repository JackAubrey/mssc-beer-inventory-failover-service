package guru.sfg.beer.inventory.failover.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"guru.sfg"})
@SpringBootApplication
public class MsscBeerInventoryFailoverServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsscBeerInventoryFailoverServiceApplication.class, args);
	}

}
