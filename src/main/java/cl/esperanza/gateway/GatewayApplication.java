package cl.esperanza.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {
    
    @Value("${mi.prueba}")
    private String prueba;

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}


    @Bean
    CommandLineRunner test() {
        return args -> System.out.println("VALOR = " + prueba);
    }
}
