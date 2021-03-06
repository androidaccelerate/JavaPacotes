package br.com.androidpro.pacotes.automovel;

import br.com.androidpro.pacotes.tipocombustivel.Gasolina;

/**
 * Created by fillipecordeiro on 05/07/16.
 */
public class Caminhonete extends Automovel implements Gasolina {

    private double capacidadeCarga;

    @Override
    public void acelera(double velocidade) {
        double novaVelocidade = this.velocidadeAtual + velocidade;

        if (verificaVelocidadeMáxima(novaVelocidade)) {
            this.velocidadeAtual = novaVelocidade;
        } else {
            this.velocidadeAtual = this.velocidadeMaxima;
        }
    }

    public double getCapacidadeDeCarga() {
        return this.capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void abastecer(double quantidade) {
        this.tanque = quantidade;
    }
}
