public class Movie extends Disk {

    private String Name;
    private Double Length;
    private Boolean Bonus;


    public Movie(String name, Double length, Boolean bonus) {
        Name = name;
        Length = length;
        Bonus = bonus;
    }

    public Movie()
    {
        this("null", 60.0, true);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getLength() {
        return Length;
    }

    public void setLength(Double length) {
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
        return getName() + getGenre()+ getBonus() + super.toString();
    }

    @Override
    public void setRentFee() {



    }
}
