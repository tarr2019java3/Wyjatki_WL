package pl.sda.wyjatki;

import pl.sda.wyjatki.exception.EmailException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws EmailException {

      User user = new User();
        user.setLogin("login");
      try {
          user.setEmail("logwp.pl");
      } catch (Exception e) {
          e.printStackTrace();
      }

        System.out.println(user.getEmail() + " " + user.getLogin());
    }
}

