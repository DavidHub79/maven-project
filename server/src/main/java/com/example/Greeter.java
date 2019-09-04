package com.example;


public class Greeter {
/**
* on décrit la méthode pour faire sortir.
*constructeur par défaut
*/
  
  public Greeter() {

  }

  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
