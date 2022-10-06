import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner Clavier=new Scanner(System.in);
        System.out.println("Hello, Entrez votre nom  svp:");
        String nom="";
        nom=Clavier.nextLine();
        System.out.println("Entrez votre age svp:");
        int age=0;
        age= Clavier.nextInt();
        System.out.println("bonjour vous etes "  + nom+  " vous aurez " +(age+2)+" ans dans deux ans");


//        nom=Clavier.nextInt(); //Pour les entiers

//



    }
}
