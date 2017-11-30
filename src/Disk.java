public abstract class Disk implements Rentable{


        private String Rating;
        private String Condition;
        private String Genre;
        private int timesRented;
        private int noOfdays;

    public Disk(String rating, String condition, String genre, int timesRented, int noOfdays) {
        Rating = rating;
        Condition = condition;
        Genre = genre;
        this.timesRented = timesRented;
        this.noOfdays = noOfdays;
    }


    public Disk()
    {
        this("no Rating","standered","null",0,0);
    }

    public int getNoOfdays() {
        return noOfdays;
    }

    public void setNoOfdays(int noOfdays) {
        this.noOfdays = noOfdays;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String condition) {
        Condition = condition;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public int getTimesRented() {
        return timesRented;
    }

    public void setTimesRented(int timesRented) {
        this.timesRented = timesRented;
    }

    public double calRentFee() {
        double price = setRentFee();
        double fee = price * noOfdays;
        return fee;
    }

    public  String toString()
    {
        return "Condition " + getCondition() + " Rating " + Rating + "Genre " + getGenre();
    }
}
