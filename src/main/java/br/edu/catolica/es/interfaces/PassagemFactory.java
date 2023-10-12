package br.edu.catolica.es.interfaces;

public interface PassagemFactory {
    Passagem criarPassagem(double valor);
    TaxaEmbarque criarTaxaEmbarque();
    TaxaBagagem criarTaxaBagagem();
}
