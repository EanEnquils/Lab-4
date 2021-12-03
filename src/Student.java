public class Student implements StudentI {
    private String name;
    private int year;
    private String univer;
    private String country;
    private String city;

    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public int getYear(int year) {
        return year;
    }

    @Override
    public void setUniversity(String univer) {
        this.univer = univer;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getUniver() {
        return univer;
    }

    public void setUniver(String univer) {
        this.univer = univer;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", univer='" + univer + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
