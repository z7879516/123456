
package e2字串長度計算及反向顯示;
import java.util.Scanner;
public class E2字串長度計算及反向顯示 
{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        String b;
        System.out.println("輸入字串");
        b=a.nextLine();
        length(b);
        System.out.println("反向顯示:");
        System.out.println(un(b));
    }
   public static void length(String a)
   {System.out.println("字串長度"+a.length());}
   public static String un(String a)
   {String c="";
    for(int y=a.length()-1;y>=0;y--)
    {
     c=c+a.charAt(y);
    }
     return c;
   }  
}