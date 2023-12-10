public abstract class Workers extends Person {
    public Workers(String name) {
        super(name);
    }
    public String getName() {
        return " " + super.getName();
    }
    public abstract int getSalary();

}
