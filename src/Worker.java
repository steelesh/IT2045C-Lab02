public class Worker extends Person {
    /**
     * Variables
     */
    
    private double hourlyPayRate;

    /**
     * Constructor
     */

    public Worker(String ID, String firstName, String lastName, String title, int yob, double hourlyPayRate) {
        super(ID, firstName, lastName, title, yob);
        this.hourlyPayRate = hourlyPayRate;
    }

    /**
     * Getter method
     */

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    /**
     * Method that calculates a worker's weekly pay
     * @param hoursWorked
     * @return totalPay
     */

    public double calculateWeeklyPay(double hoursWorked){
        double totalPay = hourlyPayRate * hoursWorked;
        if (hoursWorked > 40){
            totalPay = hourlyPayRate * 40 + (hourlyPayRate * 1.5) * (hoursWorked - 40);
        }
        else{
            totalPay = hourlyPayRate * hoursWorked;
        }
        return totalPay;
    }

    /**
     * Method that displays a worker's hours/pay
     * @param hoursWorked
     * @return results
     */

    public String displayWeeklyPay(double hoursWorked){
        double regHours;
        double regPay;
        double overtimeHours;
        double overtimePay;
        double totalPay;
        String weeklyPay;
        if (hoursWorked >= 40){
            regHours = 40;
            overtimeHours = hoursWorked - 40;
        }
        else{
            regHours = hoursWorked;
            overtimeHours = 0;
        }
        overtimePay = overtimeHours * (hourlyPayRate * 1.5);
        regPay = regHours * hourlyPayRate;
        totalPay = overtimePay + regPay;
        weeklyPay = "Regular pay hours: " + regHours + "\nRegular pay: " + regPay + "\nOvertime hours: " + overtimeHours + "\nOvertime pay: " + overtimePay + "\nTotal pay: " + totalPay;
        String totalPayOutput = String.format("%.2f", totalPay);
        return totalPayOutput;
    }
}