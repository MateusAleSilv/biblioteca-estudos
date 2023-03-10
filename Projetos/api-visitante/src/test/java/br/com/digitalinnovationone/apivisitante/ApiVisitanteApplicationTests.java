package br.com.digitalinnovationone.apivisitante;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;


@SpringBootTest
class ApiVisitanteApplicationTests {

	@Test
	void contextLoads() {
		assertDoesNotThrow(() -> ApiVisitanteApplication.main(new String[]{}));
	}

}
