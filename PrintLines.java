import java.util.Scanner;

class PrintLines {
    public static void main(final String[] args) {
        
        //initialise variables
        String strName = "Eve";
        String strEmail = "myemail@domain.com";
        String strAddress1 ="12 Wide Road";
        String strAddress2 ="London";
        String strAddress3 ="SE23 4RH";

        //user defined input

        Scanner sc = new Scanner(System.in); //input stream

        System.out.print("Do you want to enter your own data? ");
        String strDecision = sc.nextLine(); //get input
        strDecision = strDecision.toUpperCase(); //capitalise letters for minimising variants of responses

    //    System.out.println(strDecision); //troubleshooting
        
        //if yes, get the user input
        if (strDecision.equals("Y") || strDecision.equals("YES")){ //strings can't be compared with ==
            System.out.print("\nEnter your name: ");
            strName = sc.nextLine();

            System.out.print("Enter your email address: ");
            strEmail = sc.nextLine();

            System.out.print("Enter your house number and street name: ");
            strAddress1 = sc.nextLine();

            System.out.print("Enter your town: ");
            strAddress2 = sc.nextLine();

            System.out.print("Enter your postcode: ");
            strAddress3 = sc.nextLine();

        } else {
            System.out.println("Example of data");
        }

        //replace initials with asterisks
        var n = strName.indexOf(" "); //find the character after space - only works with two substrings (first name + last name)
        char ch = '*';
        
        char[] arChars = strName.toCharArray();
        arChars[0] = ch; //replace first letter
       
        //only run this if the string contains a space
        if (n > 0){
            arChars[n+1] = ch; //replace first letter after space
        }

        //reassemble the string
        String strNewName = String.valueOf(chars);
        
      
        System.out.println("\n\nName: \t\t" + strNewName);
        System.out.println("\nEmail: \t\t" + strEmail);
        System.out.println("\nAddress: \t" + strAddress1 + "\n\t\t" + strAddress2 + "\n\t\t" + strAddress3);
    }
}