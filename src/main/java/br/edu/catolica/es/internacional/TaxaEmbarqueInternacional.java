package br.edu.catolica.es.internacional;

import br.edu.catolica.es.interfaces.TaxaEmbarque;

public class TaxaEmbarqueInternacional implements TaxaEmbarque {
    @Override
    public double calcularTaxa() {
        return 0.10;
    }
}
