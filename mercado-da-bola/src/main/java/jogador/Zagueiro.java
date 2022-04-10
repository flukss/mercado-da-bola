package jogador;

import apetiteFinanceiro.ApetiteFinanceiro;
import clube.Clube;

import java.math.BigDecimal;

public class Zagueiro extends Jogador {
    public Zagueiro(String nome, int idade, int reputacaoHistorica, BigDecimal preco, Clube clube, ApetiteFinanceiro tipoDeApetite) {
        super(nome, idade, reputacaoHistorica, preco, clube, tipoDeApetite);
    }
    public BigDecimal valordeCompra() {
        BigDecimal precoComApetite = tipoDeApetite.getValor().multiply(this.preco);
        if (idade >= 30) {
           this.preco = precoComApetite.multiply(BigDecimal.valueOf(0.8));
        }
        return this.preco;
    }

}
