package guru.springframework.sfgrestbrewery;


import guru.springframework.sfgrestbrewery.web.controller.BeerController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class KbeRestBreweryApplicationTests {

	@Autowired
	BeerController beerController;

	@Test
	public void contextLoads() {
		assertThat(beerController).isNotNull();
	}
}
