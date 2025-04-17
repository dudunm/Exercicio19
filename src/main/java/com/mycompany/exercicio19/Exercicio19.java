package com.mycompany.exercicio19;
import java.util.*;

public class Exercicio19 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String frase = scan.nextLine();
        
        System.out.print("Quantidade de vezes que vai repetir: ");
        String vezes = scan.nextLine();
        
        int x = Integer.parseInt(vezes);
        
        for(int qtd = 0; qtd < x; qtd++){
            System.out.println(frase);
        }
    }
}
