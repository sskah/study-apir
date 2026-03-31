package br.com.fiap.study_apir.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
// @Data
public class Produto {
    private final Long id;
    private final String nome;
    private final BigDecimal valor;
}
