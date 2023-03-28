package singleton_prototype;

import java.time.LocalDateTime;

public class Income implements Transaction{
  private final LocalDateTime time;
  private final double sum;

  private final String description;

  public Income(LocalDateTime time, double sum, String description) {
    this.time = time;
    this.sum = sum;
    this.description = description;
  }

  public LocalDateTime getTime() {
    return time;
  }

  public double getSum() {
    return sum;
  }

  public String getDescription() {
    return description;
  }

  @Override
  public Transaction clone() {
    return new Income(this.time, this.sum, this.description);
  }
}
