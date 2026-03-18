package com.example.commandline.jsonConverter.avaliacoes.data;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Servico extends Avaliacao {

    @Getter
    @Setter
    String nome;

    @Getter
    @Setter
    String descricao;

}
