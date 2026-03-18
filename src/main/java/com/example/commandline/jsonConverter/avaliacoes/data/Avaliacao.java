package com.example.commandline.jsonConverter.avaliacoes.data;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Avaliacao {
    @Getter
    @Setter
    int nota;

    @Getter
    @Setter
    String comentario;

}
