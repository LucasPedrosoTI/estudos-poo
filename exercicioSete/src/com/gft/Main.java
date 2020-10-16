package com.gft;

import com.gft.models.*;

public class Main {
  public static void main(String[] args) {
    Gerente mark = new Gerente("Mark Zuckerberg", 30, 100000);
    Supervisor jeff = new Supervisor("Jeff Bezos", 40, 80000);
    Vendedor bill = new Vendedor("Bill", 60, 50000);

    System.out.println(mark.toString() + ", bonificação: " + mark.bonificacao());
    System.out.println(jeff.toString() + ", bonificação: " + jeff.bonificacao());
    System.out.println(bill.toString() + ", bonificação: " + bill.bonificacao());

  }
}