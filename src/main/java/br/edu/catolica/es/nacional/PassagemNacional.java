package br.edu.catolica.es.nacional;

import br.edu.catolica.es.interfaces.Passagem;

public class PassagemNacional implements Passagem {
    private double valor;

    public PassagemNacional(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }
}
