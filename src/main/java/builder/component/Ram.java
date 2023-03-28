package builder.component;

import builder.enums.RamType;

public class Ram {
  private final int frequency;

  private final RamType generation;

  private final int numberOfMemory;

  public Ram(int frequency, RamType generation, int numberOfMemory) {
    this.frequency = frequency;
    this.generation = generation;
    this.numberOfMemory = numberOfMemory;
  }

  @Override
  public String toString() {
    return "Ram{" +
        "\n\t\tfrequency=" + frequency +
        ",\n\t\tgeneration=" + generation +
        ",\n\t\tnumberOfMemory=" + numberOfMemory +
        "\n\t}";
  }
}
