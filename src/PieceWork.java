public class PieceWork extends Workers {
    private int completedWork;
    private  int work;

    public PieceWork(String name, int completedWork, int work) {
        super(name);
        this.completedWork = completedWork;
        this.work = work;
    }
    public int getSalary() {
        return completedWork * work;
    }
}
