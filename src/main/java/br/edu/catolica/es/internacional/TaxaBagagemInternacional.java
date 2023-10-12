package br.edu.catolica.es.internacional;

import br.edu.catolica.es.interfaces.TaxaBagagem;

public class TaxaBagagemInternacional implements TaxaBagagem {
    @Override
    public double calcularTaxa() {
        return 0.05;
    }
}
