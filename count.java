import java.util.Scanner;
class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter a paragraph:");
        String p = sc.nextLine();
        int c = p.replace(" ", "").length();
        int w = p.trim().split("\\s+").length;
        System.out.println("Chars: " + c + ", Words: " + w);
        sc.close();
    }
}

//Enter a paragraph:My name is Shuvojit
//Chars: 16, Words: 4
