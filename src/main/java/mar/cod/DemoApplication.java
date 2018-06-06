package mar.cod;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication


public class DemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		SpringApplication sa = new SpringApplication(DemoApplication.class);
		sa.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("------------------------------------------: HUA");
//		System.exit(0);
	}
}
