package builder.component;

import builder.enums.CpuBrand;
import builder.enums.MotherBoardType;

public class MotherBoard {
  private final MotherBoardType type;

  private final CpuBrand cpuBrand;

  public MotherBoard(MotherBoardType type, CpuBrand cpuBrand) {
    this.type = type;
    this.cpuBrand = cpuBrand;
  }

  @Override
  public String toString() {
    return "MotherBoard{" +
        "\n\t\ttype=" + type +
        ",\n\t\tcpuBrand=" + cpuBrand +
        "\n\t}";
  }
}
