package builder.component;

import builder.enums.VideoCardType;

public class VideoCard {
  private final String name;

  private final String series;

  private final VideoCardType type;

  public VideoCard(String name, String series, VideoCardType type) {
    this.name = name;
    this.series = series;
    this.type = type;
  }

  @Override
  public String toString() {
    return "VideoCard{" +
        "\n\t\tname='" + name +
        ",\n\t\tseries='" + series +
        ",\n\t\ttype=" + type +
        "\n\t}";
  }
}
