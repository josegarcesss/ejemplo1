/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Alakyan
 */
public class EjemploAyuda {


        Scanner input = new Scanner(System.in);
        Random random = new Random();

    public EjemploAyuda() {
    }
        
        

        public void ejemplofinal(){
        System.out.println("Bienvenido a la simulación de ruleta rusa para múltiples jugadores");
        System.out.print("Ingrese el número de jugadores (máximo 6): ");
        int numJugadores = input.nextInt();

        if (numJugadores < 1 || numJugadores > 6) {
            System.out.println("El número de jugadores debe estar entre 1 y 6.");
        } else {
            for (int i = 1; i <= numJugadores; i++) {
                System.out.println("\nJugador " + i + ":");
                System.out.print("Ingrese la cantidad de balas a cargar en el arma: ");
                int balas = input.nextInt();

                if (balas <= 0) {
                    System.out.println("La cantidad de balas debe ser mayor que cero.");
                } else {
                    int posicionBala = random.nextInt(balas) + 1;
                    System.out.println("Girando la ruleta para el jugador " + i + "...");

                    if (posicionBala == 1) {
                        System.out.println("**¡BANG! La bala estaba en la posición " + posicionBala + ". El jugador " + i + " ha sido eliminado.**");
                    } else {
                        System.out.println("Clic. La bala estaba en la posición " + posicionBala + ". ¡El jugador " + i + " sobrevivió!");
                    }
                }
            }
        }
    }
}
