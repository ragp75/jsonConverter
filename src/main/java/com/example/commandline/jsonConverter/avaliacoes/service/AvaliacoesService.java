package com.example.commandline.jsonConverter.avaliacoes.service;

import com.example.commandline.jsonConverter.avaliacoes.data.Avaliacao;

import java.util.List;

public class AvaliacoesService {

    public static float calcularMediaDeAvaliacoes(List<Avaliacao> avaliacoes){
        if (avaliacoes.isEmpty()) {
            return  0;
        }
        int sum = 0;
        for( Avaliacao avaliacao : avaliacoes ){
            sum =+ avaliacao.getNota();
        }
        return (float) (sum / avaliacoes.size());
    }

}
