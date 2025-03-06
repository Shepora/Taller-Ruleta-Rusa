package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> jugadores = new ArrayList<>();

        System.out.println("Ahora indique cuantos jugadores van a jugar: ");
        int Numero_de_Jugadores = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < Numero_de_Jugadores; i++) {
            System.out.println("Ahora ingresa el nombre del jugador: " + (i + 1));
            jugadores.add(scanner.nextLine());
        }

        Ruleta_Rusa juego = new Ruleta_Rusa(jugadores);
        boolean Este_es_el_final = false;
        int turno = 0;

        while (!Este_es_el_final) {
            System.out.println("Es turno de " + jugadores.get(turno) + ". Bien ahora pon a prueba tu suerte >:>...");
            scanner.nextLine();

            Este_es_el_final = juego.Dispara_bala(turno);

            if (!Este_es_el_final) {
                turno = turno + 1 % jugadores.size();
            }
        }
        System.out.println("""
                Haz llegado al final del juego.
                !Gracias por jugar!,
                que tenga un dia lleno de suerte
                """);
        scanner.close();
    }
}