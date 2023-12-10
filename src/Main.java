public class Main {
    public static void main(String[] args) {
        Rate oleg = new Rate("Олег", 3000, 10);
        HourlyRate vlad = new HourlyRate("Влад", 8, 800);
        PieceWork kris = new PieceWork("Крис",5500, 4);

        Workers[] employees = new Workers[] {oleg, vlad, kris};
                for (Workers workers: employees) {
                    System.out.println(workers.getName() + " получает " + workers.getSalary());

                }
        System.out.println((" ИТОГО ") + (oleg.getSalary() + vlad.getSalary() + kris.getSalary()));

    }
}