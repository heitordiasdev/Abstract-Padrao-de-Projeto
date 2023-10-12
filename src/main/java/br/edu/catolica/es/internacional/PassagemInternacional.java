package br.edu.catolica.es.internacional;

import br.edu.catolica.es.interfaces.Passagem;

public class PassagemInternacional implements Passagem {
    private double valor;

    public PassagemInternacional(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }
}
