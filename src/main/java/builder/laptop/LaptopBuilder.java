package builder.laptop;

import builder.component.Cpu;
import builder.component.MotherBoard;
import builder.component.Ram;
import builder.component.Screen;
import builder.component.VideoCard;
import builder.enums.LaptopType;

public class LaptopBuilder implements Builder{
  private LaptopType type;
  private Cpu cpu;
  private VideoCard videoCard;
  private MotherBoard motherBoard;
  private Ram ram;
  private Screen screen;

  @Override
  public void setLaptopType(LaptopType type) {
    this.type = type;
  }

  @Override
  public void setMotherBoard(MotherBoard motherBoard) {
    this.motherBoard = motherBoard;
  }

  @Override
  public void setCpu(Cpu cpu) {
    this.cpu = cpu;
  }

  @Override
  public void setVideoCard(VideoCard videoCard) {
    this.videoCard = videoCard;
  }

  @Override
  public void setRam(Ram ram) {
    this.ram = ram;
  }

  @Override
  public void setScreen(Screen screen) {
    this.screen = screen;
  }

  public Laptop getCreatedLaptop(){
    return new Laptop(type, cpu, videoCard, motherBoard, ram, screen);
  }
}
