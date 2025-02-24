import java.io.*;
import java.util.Scanner;


public class FileHandling  {

    static void f1() throws IOException{
        FileOutputStream fout;
        int i;
        fout = new FileOutputStream("./files/myData.txt",true);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        for( i=0; i<name.length(); i++){
            fout.write(name.charAt(i));
        }
        fout.close();
    }

    static void f2() throws Exception{
        
            FileInputStream fin = new FileInputStream("./files/myData.txt");
            int i;
            do{
                i = fin.read();
                if(i!=-1){
                    System.out.print((char)i);
                }
            }while(i!=-1);
        
    }

    static void f3() throws Exception{
        FileWriter fw = new FileWriter("./files/mydata.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        bw.write(name);
        bw.close();
    }
    static void f4() throws Exception{
        FileReader fr = new FileReader("./files/mydata.txt");
        BufferedReader br = new BufferedReader(fr);
        while(br.readLine()!=null){
            System.out.println(br.readLine());
            br.readLine();
        }

    }
    public static void main(String[] args) {
        try {
            // f1();
            // f2();
            f3();
            f4();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
