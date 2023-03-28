package singleton_prototype;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MainSingleton {

  public static void main(String[] args) {
    List<Transaction> transactionList = new ArrayList<>();
    var transactionToJson = new Income(LocalDateTime.now(), 1240, "Creating new Income transaction");
    var transactionToYaml = new Expense(LocalDateTime.now(), 3500, "Creating new Expense transaction");

    transactionList.add(transactionToJson);
    transactionList.add(transactionToYaml);

    transactionList.add(transactionToJson.clone());
    transactionList.add(transactionToYaml.clone());

    System.out.println("Get all transactions in Json format");
    for (Transaction transaction : transactionList) {
      System.out.println(TransactionConverterService.getInstance().convertToJson(transaction));
    }

    System.out.println("Get all transactions in YAML format");

    for (Transaction transaction : transactionList) {
      System.out.println(TransactionConverterService.getInstance().convertToYaml(transaction));
    }
  }
}
