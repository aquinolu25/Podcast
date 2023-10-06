package br.com.projeto.minhasmusicas.principal;
import br.com.projeto.minhasmusicas.modelos.Musica;
import br.com.projeto.minhasmusicas.modelos.Podcast;
import br.com.projeto.minhasmusicas.modelos.PreferidasDoMomento;

public class Principal {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Goodnight n go");
        minhaMusica.setCantor("Ariana Grande");

        for (int i = 0; i < 3000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Bolha Dev");
        meuPodcast.setHost("Luiz Aquino");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        PreferidasDoMomento preferidas = new PreferidasDoMomento();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}
