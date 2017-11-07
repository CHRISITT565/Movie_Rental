public class Game extends Disk{

    private String Name;
    private String Style;
    private  String Setting;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStyle() {
        return Style;
    }

    public void setStyle(String style) {
        Style = style;
    }

    public String getSetting() {
        return Setting;
    }

    public void setSetting(String setting) {
        Setting = setting;
    }

    @Override
    public void setRentFee() {

    }
}
