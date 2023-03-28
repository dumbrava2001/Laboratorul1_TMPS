package builder.laptop;

import builder.component.Cpu;
import builder.component.MotherBoard;
import builder.component.Ram;
import builder.component.Screen;
import builder.component.VideoCard;
import builder.enums.LaptopType;

public class Laptop {

  private final LaptopType type;

  private final Cpu cpu;

  private final VideoCard videoCard;

  private final MotherBoard motherBoard;

  private final Ram ram;

  private final Screen screen;

  public Laptop(LaptopType type, Cpu cpu, VideoCard videoCard, MotherBoard motherBoard, Ram ram,
      Screen screen) {
    this.type = type;
    this.cpu = cpu;
    this.videoCard = videoCard;
    this.motherBoard = motherBoard;
    this.ram = ram;
    this.screen = screen;
  }

  @Override
  public String toString() {
    return "Laptop{" +
        "\n\ttype=" + type +
        ",\n\tcpu=" + cpu +
        ",\n\tvideoCard=" + videoCard +
        ",\n\tmotherBoard=" + motherBoard +
        ",\n\tram=" + ram +
        ",\n\tscreen=" + screen +
        "\n}";
  }
}
