import java.io.Serializable;

public class Movie extends Disk implements Serializable {

    private String Name;
    private int Length;
    private Boolean Bonus;


    public Movie(String name, int length, Boolean bonus) {
        Name = name;
        Length = length;
        Bonus = bonus;
    }

    public Movie()
    {
        this("null", 60, true);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getLength() {
        return Length;
    }

    public void setLength(int length) {
        Length = length;
    }

    public Boolean getBonus() {
        return Bonus;
    }

    public void setBonus(Boolean bonus) {
        Bonus = bonus;
    }

    public String toString()
    {
        return "Movie Title " + getName() +" The Genre is " +  getGenre()+" The length is "+ getLength() + "min Bounus Features" +  super.toString();
    }

    @Override
    public Double setRentFee() {

        double rent= 0.0f;

        if(Length == 60)
        {
            rent = 4.00f;
        }

        else if (Length == 120)
        {
            rent = 6.00f;

        }

        else if (Length == 180)
        {
            rent = 7.00f;
        }

        else if(Length == 95)
        {
            rent = 4.50f;
        }


        return rent;



    }
}
