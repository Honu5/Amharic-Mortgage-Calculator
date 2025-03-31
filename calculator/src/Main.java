//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("እንኳን ደህና መጡ።ይህ የሞርትጌጅ ማስያ ነው።\n");
        System.out.println("እባኮትን የቁስ መጠን ያስገብ (በብር):\n");
        int P= input.nextInt();

        if(P<0) {
            System.out.println("የቁስ መጠን ከዜሮ ያነሰ ሊሆን አይችልም ድጋሚ ይሞክሩ።");
            System.exit(0);
        }


        System.out.println("አመታዊ ወለድ/ዕድገት ያስገቡ: ");
        double ar= input.nextDouble();
        System.out.println("ቁሱን ያዋሱበትን ዕድሜ ያክሉ(በዓመት):  ");
        int m=input.nextInt();
        int n=12*m;
        Double r=ar/1200;
        Locale Birr=new Locale("am","ET");
        double Mortage= (P*r*Math.pow((1+r),n))/(Math.pow((1+r),n)-1);
        String value=NumberFormat.getCurrencyInstance(Birr).format(Mortage);
        value=value.replace("ብር","").trim();

        System.out.println("የክፍያ ዋጋ:  " + value + " ብር ነው።");



    }
}