public class HourlyRate extends Workers {
    private int time;
    private int price;

    public HourlyRate(String name, int time, int price) {
        super(name);
        this.time = time;
        this.price = price;
    }

    public int getSalary() {
        return time * price;
    }
}
