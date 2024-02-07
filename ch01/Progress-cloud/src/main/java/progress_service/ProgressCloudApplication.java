package progress_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   // <1>
public class ProgressCloudApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProgressCloudApplication.class, args); // <2>
  }

}
