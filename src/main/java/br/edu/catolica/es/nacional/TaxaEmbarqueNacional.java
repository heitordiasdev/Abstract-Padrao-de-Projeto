package br.edu.catolica.es.nacional;

import br.edu.catolica.es.interfaces.TaxaEmbarque;

public class TaxaEmbarqueNacional implements TaxaEmbarque {
    @Override
    public double calcularTaxa() {
        return 0.05;
    }
}
