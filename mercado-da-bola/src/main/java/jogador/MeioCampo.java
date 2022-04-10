package jogador;

import apetiteFinanceiro.ApetiteFinanceiro;
import clube.Clube;

import java.math.BigDecimal;

public class MeioCampo extends Jogador {

    public MeioCampo(String nome, int idade, int reputacaoHistorica, BigDecimal preco, Clube clube, ApetiteFinanceiro tipoDeApetite) {
        super(nome, idade, reputacaoHistorica, preco, clube, tipoDeApetite);
    }
    public BigDecimal valorDeCompra() {
        BigDecimal precoComApetite = tipoDeApetite.getValor().multiply(this.preco);
        if (idade >= 30) {
            this.preco = precoComApetite.multiply(BigDecimal.valueOf(0.7));
            return this.preco;
        }
        return preco;
    }
    public boolean interesseDeTransferencia(Clube clube) {
        if (clube.getReputacaoHistorica() <= this.reputacaoHistorica - 2) {
            return true;
        }
        return false;
    }

}
