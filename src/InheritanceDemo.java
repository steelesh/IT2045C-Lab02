import java.util.ArrayList;

public class InheritanceDemo {

    public static void main(String[] args) {

        Worker worker1 = new Worker("000001", "John", "Doe", "Mr.", 2000, 10.75); // Worker obj.
        Worker worker2 = new Worker("000002", "Jane", "Doe", "Mrs.", 1990, 18.50); // Worker obj.
        Worker worker3 = new Worker("000003", "Tom", "Smith", "Mr.", 1980, 22.75); // Worker obj.

        SalaryWorker salWorker1 = new SalaryWorker("000004", "Bob", "Jones", "Mr.", 1950, 15.50, 31500); // SalaryWorker obj.
        SalaryWorker salWorker2 = new SalaryWorker("000005", "Thomas", "Williams", "Mr.", 2000, 18.75, 37600); // SalaryWorker obj.
        SalaryWorker salWorker3 = new SalaryWorker("000006", "Steve", "Brown", "Mr.", 1960, 32.50, 72500); // SalaryWorker obj.

        ArrayList<Worker> workers = new ArrayList<>(); // Create new ArrayList of type Worker to store created worker objects

        workers.add(worker1); // Add worker
        workers.add(worker2); // Add worker
        workers.add(worker3); // Add worker
        workers.add(salWorker1); // Add SalaryWorker
        workers.add(salWorker2); // Add SalaryWorker
        workers.add(salWorker3); // Add SalaryWorker

        System.out.println("-------------------------------------------------------------------------------------"); // Top of tabular display
        for(int i = 0; i < workers.size(); i++){ // For loop
            // Print worker info + weekly pay
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
            System.out.println("-------------------------------------------------------------------------------------"); // Bottom of tabular display
        }
    }
}