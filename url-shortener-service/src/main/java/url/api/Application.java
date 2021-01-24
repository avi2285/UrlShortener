package url.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

  public static void main(final String[] args) {

    final SpringApplication application = new SpringApplication(Application.class);
    application.run(args);
  }

  @SpringBootConfiguration
  @EnableAutoConfiguration
  public static class Config {

  }
}
