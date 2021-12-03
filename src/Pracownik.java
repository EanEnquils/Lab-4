
public class Pracownik implements PracownikI {

    private double expireance;
    private String rank;
    private int salary;
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
    public double getExpireance(double expireance) {
        return expireance;
    }

    @Override
    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public int getSalary(int salary) {
        return salary;
    }

    public double getExpireance() {
        return expireance;
    }

    public void setExpireance(double expireance) {
        this.expireance = expireance;
    }

    public String getRank() {
        return rank;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "expireance=" + expireance + " years " +
                ", rank='" + rank + '\'' +
                ", salary=" + salary + "$ " +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
