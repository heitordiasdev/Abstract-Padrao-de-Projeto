package br.edu.catolica.es.nacional;

import br.edu.catolica.es.interfaces.Passagem;
import br.edu.catolica.es.interfaces.PassagemFactory;
import br.edu.catolica.es.interfaces.TaxaBagagem;
import br.edu.catolica.es.interfaces.TaxaEmbarque;

public class PassagemNacionalFactory implements PassagemFactory {
    @Override
    public Passagem criarPassagem(double valor) {
        return new PassagemNacional(valor);
    }

    @Override
    public TaxaEmbarque criarTaxaEmbarque() {
        return new TaxaEmbarqueNacional();
    }

    @Override
    public TaxaBagagem criarTaxaBagagem() {
        return new TaxaBagagemNacional();
    }
}
