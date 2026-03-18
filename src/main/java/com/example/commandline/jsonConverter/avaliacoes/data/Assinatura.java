package com.example.commandline.jsonConverter.avaliacoes.data;


import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Assinatura extends Avaliacao {

    @Getter
    @Setter
    Date dataDeValidade;

}
