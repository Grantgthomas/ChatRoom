import java.util.Scanner;

/**
 * Created by Grant on 1/26/2018.
 */

public class TextHandler {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String text = "";
        int input = 0;
        do  {
        System.out.println("Enter a text");
        text = in.nextLine().toString();
        do {
            System.out.println("enter one of these function");
            System.out.println("1. palindrome \n" +
                    "2. findAllPalindromes \n" +
                    "3. searchText \n" +
                    "4. removeText \n" +
                    "5. addText \n" +
                    "6. reverseText \n" +
                    "7. reverseEachWord \n" +
                    "8. printText \n" +
                    "9. newText ");
            input = in.nextInt();

            in.nextLine();
            switch (input) {


                case (1): {
                    System.out.println(Palindrome(text));
                    break;
                }
                case (2): {
                    System.out.println("There are this many palindomes " +findAllPalindromes(text));
                    break;
                }
                case (3): {
                    System.out.println("enter a string to be found");
                    String search = in.nextLine().toString();
                    System.out.println(searchText(text, search));
                    break;
                }
                case (4): {
                    System.out.println("Enter text to be removed");
                    String remove = in.nextLine().toString();
                    System.out.println(removeText(text, remove));
                    break;
                }
                case (5): {
                    System.out.println("enter a string to inserted");
                    String added = in.nextLine().toString();
                    System.out.println("enter a place for the string");
                    int place = in.nextInt();
                    System.out.println(addText(place, text, added));
                    break;
                }
                case (6):
                {
                    System.out.println(reverseText(text));
                    break;
                }
                case (7): {
                    System.out.println(reverseEachWord(text));
                    break;
                }
                case (8): {
                    printText(text);
                    break;
                }
                default: {
                    System.out.println("this is not a function");
                    break;
                }
            }
            if (input == 9)
                break;

            } while (input != 0);

        }while(!(text.isEmpty())&&!(text.equals("quit")));
    }

    public static String removeText(String x,String y){

       String returnVal = x.replaceAll(y,"");

        return returnVal;
    }

    public static int findAllPalindromes(String x)
    {
        int count = 0;

        String [] words = x.split(" ");

            for(int j = 0; j < words.length; j++){
                if( Palindrome(words[j])){
                    System.out.println(words[j]);
                    count++;
                }
            }

        return count;
    }

    public static Boolean Palindrome(String s){

        int i = 0,j = s.length()-1;
         do {
             if((s.charAt(i) != s.charAt(j))||s.length() ==1){
                 return false;
             }
             i++;
             j--;
        }while(i < j);

        return true;
    }

    public static String reverseText (String a){
        String returnVal = "";
        int y=0,x = a.length()-1;

        do {
            returnVal += a.charAt(x);
            x--;
        }while (x != -1);

        return returnVal;

    }

    public static String addText(int x, String s, String add){
        if(x == 0)
        {
            String concat = "";
            return concat = add + " " + s;
        }
        if(x >= s.length())
        {
            return "This index is out of bounds";
        }
        String returnVal = "";
        String firstHalf = s.substring(0,x);
        String otherHalf = s.substring(x+1,s.length());
        firstHalf += add;
        firstHalf+=" ";
        firstHalf += otherHalf;

        returnVal = firstHalf;
        return returnVal;
    }

    public static int searchText(String a, String b){

        int count = 0;
        for(int x = 0; x < a.length()-1;x++ ) {
            if (a.substring(x, x+b.length()).equals(b)){
                count++;
                System.out.println(x + " This an index of" + b);
            }

        }

        return count;
    }

    public static String reverseEachWord(String x){

        String returnVal = "";

        String [] words = x.split(" ");

        for (int i = 0;i < words.length; i++){
            String w = words[i];
            String r = "";
            for(int j =w.length()-1;j >= 0;j--)
            {
                r = r+w.charAt(j);
            }

            returnVal = returnVal + r + " ";
        }
        return returnVal;
    }

    public static void printText(String x){
        System.out.println(x);
        return;
    }

}
