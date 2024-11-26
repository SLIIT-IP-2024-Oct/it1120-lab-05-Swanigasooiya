import java.util.Scanner;

public class IT24104110Lab5Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	String prize;
        
        System.out.print("Enter the number of new members introduced: ");
        int newMembers = input.nextInt();
        
        if (newMembers < 0) {
            System.out.println("Error: Number of new members must be a number 0 or greater ");
            return;
        }
	
	switch (newMembers){
	case 0:
		prize = "No prize";
		break;
	case 1:
                prize = "Pen";
                break;
        case 2:
                prize = "Umbrella";
                break;
        case 3:
                prize = "Bag";
                break;
        case 4:
                prize = "Travelling Chair";
                break;
        default:
                prize = "Headphone";
                break;
	}
	System.out.println("Prize is: " + prize);
    }
}