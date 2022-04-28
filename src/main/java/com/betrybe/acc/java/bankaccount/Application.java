package com.betrybe.acc.java.bankaccount;

import java.util.Scanner;

/**
 * A class.
 */
public class Application {

  /**
   * A simple get method.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("digite o número da conta:");
    int number = scanner.nextInt();
    AccountNumberFormatter formater = new AccountNumberFormatter();
    String accountNumberStringFormater = formater.formatAccountNumber(number);
    System.out.println("Numero da conta: " + accountNumberStringFormater);
  }

}
