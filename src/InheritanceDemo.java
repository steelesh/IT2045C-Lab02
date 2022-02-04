import java.util.ArrayList;

public class InheritanceDemo {

    public static void main(String[] args) {
        Worker worker1 = new Worker("000001", "John", "Doe", "Mr.", 2000, 10.75);
        Worker worker2 = new Worker("000002", "Jane", "Doe", "Mrs.", 1990, 18.50);
        Worker worker3 = new Worker("000003", "Tom", "Smith", "Mr.", 1980, 22.75);
        SalaryWorker salWorker1 = new SalaryWorker("000004", "Bob", "Jones", "Mr.", 1950, 15.50, 31500);
        SalaryWorker salWorker2 = new SalaryWorker("000005", "Thomas", "Williams", "Mr.", 2000, 18.75, 37600);
        SalaryWorker salWorker3 = new SalaryWorker("000006", "Steve", "Brown", "Mr.", 1960, 32.50, 72500);

        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(salWorker1);
        workers.add(salWorker2);
        workers.add(salWorker3);

        System.out.println("-------------------------------------------------------------------------------------");
        for(int i = 0; i < workers.size(); i++){
            Worker worker = (Worker) workers.get(i);
            System.out.printf("%-30s", worker.formalName());
            System.out.printf("%-20s", "Week One");
            System.out.printf("%-20s", "Week Two");
            System.out.print("Week Three");
            System.out.println();
            System.out.print("ID #: " + worker.getID());
            System.out.printf("%-18s", " ");
            System.out.printf("$" + worker.displayWeeklyPay(40));
            System.out.printf("%-13s", " ");
            System.out.print("$" + worker.displayWeeklyPay(50));
            System.out.printf("%-13s", " ");
            System.out.print("$" + worker.displayWeeklyPay(40));
            System.out.println();
            System.out.println("-------------------------------------------------------------------------------------");
        }
    }
}