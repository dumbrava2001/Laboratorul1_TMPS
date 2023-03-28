package builder.laptop;

import builder.component.Cpu;
import builder.component.MotherBoard;
import builder.component.Ram;
import builder.component.Screen;
import builder.component.VideoCard;
import builder.enums.LaptopType;

public interface Builder {

  void setLaptopType(LaptopType type);

  void setMotherBoard(MotherBoard motherBoard);

  void setCpu(Cpu cpu);

  void setVideoCard(VideoCard videoCard);

  void setRam(Ram ram);

  void setScreen(Screen screen);
}
