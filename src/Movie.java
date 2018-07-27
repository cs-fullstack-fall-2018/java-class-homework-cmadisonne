public class Movie {
    private String name;
    private int rate;
    private int year;

    public void setName(String setName) {
        this.name = setName;
    }

    public void setRate(int setRate) {
        this.rate = setRate;
    }

    public void setYear(int setYear) {
        this.year = setYear;
    }

    @Override
    public String toString() {
        String toPrint = "Movie name: " + name + " Rating: " + rate + " Year: " + year;
        return toPrint;

    }
}