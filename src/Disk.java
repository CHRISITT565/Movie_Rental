public abstract class Disk implements Rentable{


        private String Rating;
        private char Condition;
        private String Genre;
        private int timesRented;

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public char getCondition() {
        return Condition;
    }

    public void setCondition(char condition) {
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
        return 0;
    }
}
