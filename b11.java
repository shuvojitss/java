import java.util.Scanner;
class b11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
	System.out.print("Enter a line:");
        String l = s.nextLine();
	System.out.print("Enter a character:");
        char ch = s.next().charAt(0);
        int c = 0;
        for (char x : l.toCharArray()) 
	if (x == ch) 
	c++;
        System.out.println("Count: " + c);
        s.close();
    }
}

// Enter a line:Play Bold
// Enter a character:l
// Count: 2
