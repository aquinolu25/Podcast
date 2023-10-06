package br.com.projeto.minhasmusicas.modelos;

public class PreferidasDoMomento {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado um sucesso absoluto entre todos!");
        } else {
            System.out.println(audio.getTitulo() + " também é uma ótima opção do nosso catálogo!");
        }
    }
}
