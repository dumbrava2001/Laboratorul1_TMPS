package singleton_prototype;

import java.time.LocalDateTime;

public interface Transaction {
  Transaction clone();

  String getDescription();

  double getSum();

  LocalDateTime getTime();
}
