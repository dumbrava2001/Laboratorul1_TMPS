package singleton_prototype;

public class TransactionConverterService {

  private static TransactionConverterService INSTANCE;

  private TransactionConverterService(){}

  public static TransactionConverterService getInstance(){
    if (INSTANCE == null) {
      synchronized (TransactionConverterService.class){
        if (INSTANCE == null) {
          return new TransactionConverterService();
        }
      }
    }
    return INSTANCE;
  }

  public String convertToJson(Transaction transaction){
    return "{description:"
        + transaction.getDescription()
        + ",sum:"
        + transaction.getSum()
        + ",time:"
        + transaction.getTime()
        + "}";
  }

  public String convertToYaml(Transaction expense) {
    return "Transaction:\n"
        + " - Description: " + expense.getDescription() + "\n"
        + " - Sum: " + expense.getSum() + "\n"
        + " - Time: " + expense.getTime() + "\n";
  }
}
