package com.wagner.tqi.loan.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class LoanDTO {
    private Long id;
    private Long valor;
    private LocalDate primeiraParcela;
    private int qtdParcelas;
    private int codigo;
    private Long idPerson;
}
