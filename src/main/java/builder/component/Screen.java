package builder.component;

import builder.enums.PanelType;

public class Screen {
  private final PanelType panelType;

  private final int frequency;

  private final double dimension;

  public Screen(PanelType panelType, int frequency, double dimension) {
    this.panelType = panelType;
    this.frequency = frequency;
    this.dimension = dimension;
  }

  @Override
  public String toString() {
    return "Screen{" +
        "\n\t\tpanelType=" + panelType +
        ",\n\t\tfrequency=" + frequency +
        ",\n\t\tdimension=" + dimension +
        "\n\t}";
  }
}
