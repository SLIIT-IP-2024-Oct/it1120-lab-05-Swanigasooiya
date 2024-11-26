import java.util.Scanner;

public class IT24104110Lab5Q3 {
    public static void main(String[] args) {
        final double ROOM_RATE = 48000.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date should be less than the end date");
            return;
        }

        int daysReserved = endDate - startDate;

        double totalAmount = daysReserved * ROOM_RATE;

        if (daysReserved >= 3 && daysReserved <= 4) {
            totalAmount *= 0.95;  // 5% discount
        } else if (daysReserved >= 5) {
            totalAmount *= 0.80;  // 20% discount
        }

        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Room Charge Per Day: Rs " + ROOM_RATE);
        System.out.println("Total Amount to Be Paid: Rs " + totalAmount);
    }
}
