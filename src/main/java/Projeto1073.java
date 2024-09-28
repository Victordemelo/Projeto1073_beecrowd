/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author victo
 */
import java.util.Scanner;

public class Projeto1073 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int contador = leitor.nextInt();

        for (int i = 1; i <= contador; i++) {

            if (i % 2 == 0) {
                System.out.println(i + "^2 = " + (i * i));
            }
        }
    }
}
