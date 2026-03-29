package org.eudynexc.springbootexcercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringBootExerciseApplication {

  static Logger logger = Logger.getLogger(SpringBootExerciseApplication.class.getName());

  public static void main(String[] args) {
    SpringApplication.run(SpringBootExerciseApplication.class, args);
    logger.warning("Systems are up and running!");
  }

}
