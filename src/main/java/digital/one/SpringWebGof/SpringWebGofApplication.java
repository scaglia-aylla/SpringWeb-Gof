package digital.one.SpringWebGof;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 */
@SpringBootApplication
@EnableFeignClients
@OpenAPIDefinition
public class SpringWebGofApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebGofApplication.class, args);
	}

}
