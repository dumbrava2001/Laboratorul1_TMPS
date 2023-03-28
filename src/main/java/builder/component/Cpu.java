package builder.component;

import builder.enums.CpuBrand;

public class Cpu {
  private final CpuBrand brand;

  private final String generation;

  private final int numberOfCors;

  public Cpu(CpuBrand brand, String generation, int numberOfCors) {
    this.brand = brand;
    this.generation = generation;
    this.numberOfCors = numberOfCors;
  }

  @Override
  public String toString() {
    return "Cpu{" +
        "\n\t\tbrand=" + brand +
        ",\n\t\tgeneration='" + generation +
        ",\n\t\tnumberOfCors=" + numberOfCors +
        "\n\t}";
  }
}
