package builder;

import builder.laptop.Company;
import builder.laptop.Laptop;
import builder.laptop.LaptopBuilder;

public class MainBuilder {

  public static void main(String[] args) {
    Company company = new Company();

    var laptopBuilder = new LaptopBuilder();

    System.out.println("<----GAMING LAPTOP------>");
    company.createGamingLaptop(laptopBuilder);
    Laptop createdGamingLaptop = laptopBuilder.getCreatedLaptop();
    System.out.println(createdGamingLaptop.toString());

    System.out.println("<----Ultrabook LAPTOP------>");
    company.createUltraBookLaptop(laptopBuilder);
    Laptop createdUltrabookLaptop = laptopBuilder.getCreatedLaptop();
    System.out.println(createdUltrabookLaptop.toString());
  }
}
