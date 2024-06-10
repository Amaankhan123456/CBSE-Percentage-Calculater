import java.util.Scanner;


public class cbsepercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The marks Of English : ");
        float eng = sc.nextInt();
        System.out.print("Enter The marks Of Hindi : ");
        float hin = sc.nextInt();
        System.out.print("Enter The marks Of Maths : ");
        float math = sc.nextInt();
        System.out.print("Enter The marks of IT : ");
        float it = sc.nextInt();
        System.out.print("Enter The marks of Science : ");
        float sci = sc.nextInt();
        System.out.print("Enter The marks Of sst : ");
        float sst = sc.nextInt();
        float sum = eng+hin+math+it+sci+sst;
        System.out.print("The Total percentage is : ");
        float totalpercentage = sum/600*100;
        System.out.println(totalpercentage);




    }




}
