package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ruleta_Rusa {
    private List<String> jugadores;
    private int Posicion_de_la_bala;
    private Random random;

    public Ruleta_Rusa() {
    }

    public List<String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<String> jugadores) {
        this.jugadores = jugadores;
    }

    public int getPosicion_de_la_bala() {
        return Posicion_de_la_bala;
    }

    public void setPosicion_de_la_bala(int posicion_de_la_bala) {
        Posicion_de_la_bala = posicion_de_la_bala;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public Ruleta_Rusa(List<String> jugadores){
        this.jugadores = new ArrayList<>(jugadores);
        this.random = new Random();
        Nueva_Posicion_de_la_bala();
    }
    public boolean Dispara_bala(int Numero_jugador) {
        System.out.println("Jugador: " + jugadores.get(Numero_jugador) + "No la piense y dispare >:>...");

        if (Numero_jugador == Posicion_de_la_bala) {
            System.out.println("!!BANGGG!! " + jugadores.get(Numero_jugador) + "Has tenido mala suerte esta vez, Sera para la proxima >:>");
            return true;
        } else {
            System.out.println("""
                    Felicidades hoy vuelves a ver a tu familia, 
                    oh espera no es verdad HAHAHAHA SIGUIENTE RONDAAA >:>
                    """);
            Nueva_Posicion_de_la_bala();
            return false;
        }
    }

    private void Nueva_Posicion_de_la_bala(){
        this.Posicion_de_la_bala = random.nextInt(jugadores.size());
        System.out.println("La bala se esta moviendo de posicion >:>...");
    }

}
