package com.example.commandline.jsonConverter;


import lombok.*;


@ToString
@AllArgsConstructor
@NoArgsConstructor
public class  Tarefa {

    @Getter
    @Setter
    private String descricao;

    @Getter
    @Setter
    private boolean concluida;

    @Getter
    @Setter
    private String pessoaResponsavel;

}