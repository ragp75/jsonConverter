package com.example.commandline.jsonConverter.avaliacoes.data;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Produto extends Avaliacao {
    @Getter
    @Setter
    String nome;

    @Getter
    @Setter
    String descricao;

    @Getter
    @Setter
    String preco;

    @Getter
    @Setter
    String cor;

}

