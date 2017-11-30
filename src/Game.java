import java.io.Serializable;

public class Game extends Disk implements Serializable {

    private String Name;
    private String Style;
    private  String Setting;

    public Game(String name, String style, String setting) {
        Name = name;
        Style = style;
        Setting = setting;
    }

    public Game() {
        this("null","Unknown","Null");
    }

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

    public String toString()
    {
        return getName() + getGenre()+ getSetting() + getStyle() + super.toString();
    }

    @Override
    public Double setRentFee() {

        double rent= 0.0f;

        if(Style.equals("FPS"))
        {
            rent = 6.00f;
        }

        else if (Style.equals("RPG"))
        {
            rent = 6.50f;

        }

        else if (Style.equals("Puzzle"))
        {
            rent = 4.00f;
        }

        else if(Style.equals("Platform"))
        {
            rent = 4.50f;
        }


        return rent;
    }
}
