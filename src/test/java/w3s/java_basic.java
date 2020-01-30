package w3s;

import org.junit.Test;

import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class java_basic {
    @Test
    public void topic14() {
         System.out.println("* * * * * * ==================================");
            for (int j = 1 ; j < 5; j ++) {
                System.out.println(" * * * * *  ==================================");
                System.out.println("* * * * * * ==================================");
            }
        for(int i = 0; i < 5; i++) {
            System.out.println("==============================================");
        }
    }

    @Test
    //kiem tra java trong may
    public void topic31() {
        System.out.println("Java version: " + System.getProperty("Java.version"));
        System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
        System.out.println("Java Home: "+System.getProperty("java.home"));
        System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
    }

    @Test
    public void topic32() {
        int a = 12;
        int b = 32;

        if (a > b) {
            System.out.println( "a > b" );
        }

        if (a < b) {
            System.out.println( "a < b");
        }
    }

    @Test
    public void topic33() {
        System.out.println(sumDigits(29219));

    }
    public int sumDigits(long n) {
        int sum = 0;
        if (n !=0) {
            // lay phan sau dau phay
            sum += n%10;
            // lay phan truoc dau phay
            n/= 10;
        }
        return sum;
    }

    @Test
    public void topic34() {
        int s = 4;
        double area = (6*(s*s))/(4*Math.tan(Math.PI/6));
    }

    @Test
    public void topic37() {
        //dung string buidler de reverse
        String a = "Hello fox worlds!";
        StringBuilder s = new StringBuilder();
        s.append(a);
        System.out.println(s.reverse());
    }

    @Test
    //count the letters, spaces, numbers and other characters
    public void topic38() {
        int letter = 0;
        int number = 0;
        int other = 0;
        int space = 0;
        String a = "alskda klajalkd j1 121190 1 @!@ 1ascl $%@#5";
        char [] b = a.toCharArray();
        for (int i = 0; i < b.length; i++) {
            if(Character.isLetter(b[i])) {
                letter ++;
            }
            else if(Character.isDigit(b[i])) {
                number ++;
            }
            else if(Character.isSpaceChar(b[i])) {
                space ++;
            }
            else{
                other ++;
            }
        }
    }

    @Test
    public void topic39() {
        System.out.println("List of charSet:");
        for (String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }
    }

    @Test
    public void topic41() {
        char a = 'd';
        int ascii =  a;
        System.out.println(ascii);
    }

    @Test
    public void topic44() {
        int b = 3;
        //printf format string
        System.out.printf("%d, + , %d%d, +, %d%d%d",b,b,b,b,b,b);
    }

    @Test
    public void topic46() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date a = new Date();
        System.out.println(df.format(a));
    }

    @Test
    public void topic50(){
        int n = 100;
        List<Integer> all = new ArrayList<Integer>();
        List<Integer> for3 = new ArrayList<Integer>();
        List<Integer> for5 = new ArrayList<Integer>();
        for (int i = 1; i < n ; i++) {
            if (i%3 == 0 && i%5 == 0) {
                all.add(i);
            } else if (i%3 == 0) {
                for3.add(i);
            } else if (i%5 == 0) {
                for5.add(i);
            }
        }
        System.out.println("Divided by 3: ");
        for (int a : for3)
            System.out.print(a + ", ");

        System.out.println("\n Divided by 5: ");
        for (int a : for5)
            System.out.print(a + ", ");

        System.out.println("\n Divided by 3 and 5: ");
        for (int a : all)
            System.out.print(a + ", ");
    }

    @Test
    public void topic51() {
        int a = 15;
        int b = 20;
        int c = 35;
        if ((a + b) == c) {
            System.out.println("true");
        }
    }

    @Test
    public void topic52() {
        int seconds = 86399;
        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println( p2 + ":" + p3 + ":" + p1);
    }

    @Test
    public void topic59() {
        String a = "aASDA as ADSAS ca ASD Ac CZXCZXC ";
        String b = a.toLowerCase();
        System.out.println(b);
    }

    @Test
    public void topic60() {
        String a = "The quick brown fox jumps over the lazy dog.";
        String[] worlds = a.split(" ");
        System.out.println(worlds[worlds.length - 2]);

    }
    
    //reverse world
    @Test
    public void topic61() {
        String a = "Hello World";
        char[] ch = a.toCharArray();
        String result = "";
        for (int i = ch.length -1 ; i > 0; i--) {
            result += ch[i];
        }
        System.out.println(result);
    }
    
    @Test
    public void topic62() {
        int a = 20;
        int b = 46;
        int c = 36;
        System.out.println((Math.abs(a - b) >= 20 || Math.abs(b - c) >= 20 || Math.abs(c - a) >= 20 )); 
    }

    @Test
    public void topic63() {
        int a = 15;
        int b = 20;
        if (a > b) {
            System.out.println(a);
        } else if (a == b) {
            System.out.println(" 0 ");
        } else if ( (a/6)  == (b/6) ){
            System.out.println(b);
        }
    }

    @Test
    public void topic65() {
        int a = 10;
        int b = 3;
        int dvided = a / b;
        int result = a - (dvided * b);
        System.out.println(result);
    }



    @Test
    public void topic151() {
       Integer[] a = {1,1,1,1};
        for (int i = 0; i < a.length; i++) {
            if (a[i+1] == a[i]){
                System.out.println("equals");
            }
            System.out.println("not equals");
            break;
        }
    }
  

    @Test
    public void topic152() {
        boolean[][] array = {{true, false, true},
                            {false, true, false}};

        int row_lenght = array.length;
        int column_lenght = array[0].length;
        System.out.println(column_lenght);
        System.out.println(row_lenght);

        for (int i = 0; i < row_lenght ; i++) {
            for (int j = 0; j < column_lenght ; j++) {
                if (array[i][j]) {
                    System.out.print("t");
                } else {
                System.out.print("f");
                }
            }
            System.out.println();
        }
    }
        
    

}


