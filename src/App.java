import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double notas,contador=0,soma = 0,media;
        System.out.println("Digite as quatro notas: ");
        while(contador<4){
         notas= entrada.nextInt();
         soma= soma + notas;
         contador++;
        }
        media = soma/4;
        System.out.println("A media foi: " + media);
    }
}
