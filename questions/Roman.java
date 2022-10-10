import java.util.Scanner;

import javax.lang.model.element.Element;
import javax.swing.event.DocumentEvent.ElementChange;

public class convertRoman {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the ransome note string");

        String ransomeNote = sc.nextLine();

        System.out.println("Enter the magzine note string");

        String magzine = sc.nextLine();

        Boolean output = false;

        String revstr ="";

        char ch;

        for(int j=0; j<magzine.length(); j++){
            ch = magzine.charAt(j);
            revstr = ch+revstr;
        }
        System.out.println(revstr);

    
    }
}
