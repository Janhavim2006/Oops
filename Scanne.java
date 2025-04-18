import java.util.Scanner;

class Scanne{
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter user name");
        String userName =s.nextLine();
        
        System.out.println("User name is:"+userName);
    }
}