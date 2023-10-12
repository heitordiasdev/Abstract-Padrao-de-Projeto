package br.edu.catolica.es;

import br.edu.catolica.es.interfaces.Passagem;
import br.edu.catolica.es.interfaces.PassagemFactory;
import br.edu.catolica.es.interfaces.TaxaBagagem;
import br.edu.catolica.es.interfaces.TaxaEmbarque;
import br.edu.catolica.es.internacional.PassagemInternacionalFactory;
import br.edu.catolica.es.nacional.PassagemNacionalFactory;

public class App {
    public static void main(String[] args) {

        PassagemFactory nacionalFactory = new PassagemNacionalFactory();
        Passagem passagemNacional = nacionalFactory.criarPassagem(100.0);
        TaxaEmbarque taxaEmbarqueNacional = nacionalFactory.criarTaxaEmbarque();
        TaxaBagagem taxaBagagemNacional = nacionalFactory.criarTaxaBagagem();


        double valorFinalPassagemNacional = passagemNacional.getValor() +
                (passagemNacional.getValor() * taxaEmbarqueNacional.calcularTaxa()) +
                (passagemNacional.getValor() * taxaBagagemNacional.calcularTaxa());

        System.out.println("Valor final da passagem nacional: " + valorFinalPassagemNacional);


        PassagemFactory internacionalFactory = new PassagemInternacionalFactory();
        Passagem passagemInternacional = internacionalFactory.criarPassagem(100.0);
        TaxaEmbarque taxaEmbarqueInternacional = internacionalFactory.criarTaxaEmbarque();
        TaxaBagagem taxaBagagemInternacional = internacionalFactory.criarTaxaBagagem();


        double valorFinalPassagemInternacional = passagemInternacional.getValor() +
                (passagemInternacional.getValor() * taxaEmbarqueInternacional.calcularTaxa()) +
                (passagemInternacional.getValor() * taxaBagagemInternacional.calcularTaxa());

        System.out.println("Valor final da passagem internacional: " + valorFinalPassagemInternacional);
    }
}

