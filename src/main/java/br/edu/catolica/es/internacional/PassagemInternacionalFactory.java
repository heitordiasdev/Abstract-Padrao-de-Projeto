package br.edu.catolica.es.internacional;

import br.edu.catolica.es.interfaces.Passagem;
import br.edu.catolica.es.interfaces.PassagemFactory;
import br.edu.catolica.es.interfaces.TaxaBagagem;
import br.edu.catolica.es.interfaces.TaxaEmbarque;

public class PassagemInternacionalFactory implements PassagemFactory {
    @Override
    public Passagem criarPassagem(double valor) {
        return new PassagemInternacional(valor);
    }

    @Override
    public TaxaEmbarque criarTaxaEmbarque() {
        return new TaxaEmbarqueInternacional();
    }

    @Override
    public TaxaBagagem criarTaxaBagagem() {
        return new TaxaBagagemInternacional();
    }
}
