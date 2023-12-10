public class Rate extends Workers {
    private int salary;
    private int day;

    public Rate(String name, int salary, int day) {
        super(name);
        this.salary = salary;
        this.day = day;
    }
    public int getSalary() {
        return salary * day;
    }
}
