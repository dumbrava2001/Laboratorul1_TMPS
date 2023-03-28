package builder.laptop;

import builder.component.Cpu;
import builder.component.MotherBoard;
import builder.component.Ram;
import builder.component.Screen;
import builder.component.VideoCard;
import builder.enums.CpuBrand;
import builder.enums.LaptopType;
import builder.enums.MotherBoardType;
import builder.enums.PanelType;
import builder.enums.RamType;
import builder.enums.VideoCardType;

public class Company {

  public void createGamingLaptop(Builder builder) {
    builder.setLaptopType(LaptopType.GAMING);
    builder.setMotherBoard(new MotherBoard(MotherBoardType.ATX, CpuBrand.INTEL));
    builder.setCpu(new Cpu(CpuBrand.INTEL, "i7", 8));
    builder.setVideoCard(new VideoCard("Asus Rog", "RTX 3070", VideoCardType.DEDICATED));
    builder.setRam(new Ram(3600, RamType.DDR5, 16));
    builder.setScreen(new Screen(PanelType.IPS, 120, 15.6));
  }

  public void createUltraBookLaptop(Builder builder) {
    builder.setLaptopType(LaptopType.ULTRABOOK);
    builder.setMotherBoard(new MotherBoard(MotherBoardType.MINI_ATX, CpuBrand.AMD));
    builder.setCpu(new Cpu(CpuBrand.AMD, "Ryzen 7", 8));
    builder.setVideoCard(new VideoCard("AMD Radeon", "Mobile series", VideoCardType.INTEGRATED));
    builder.setRam(new Ram(3600, RamType.DDR4, 8));
    builder.setScreen(new Screen(PanelType.OLED, 60, 14));
  }
}
