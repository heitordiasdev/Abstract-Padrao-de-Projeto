package br.edu.catolica.es.nacional;

import br.edu.catolica.es.interfaces.TaxaBagagem;

public class TaxaBagagemNacional implements TaxaBagagem {
    @Override
    public double calcularTaxa() {
        return 0.03;
    }
}
