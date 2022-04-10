package jogador;

import apetiteFinanceiro.ApetiteFinanceiro;
import clube.Clube;

import java.math.BigDecimal;

public class Atacante extends Jogador{
    int golsFeitosNoAno;
    private static double acrescimoPorGolFeito =1.01;

    public Atacante(String nome, int idade, int reputacaoHistorica, BigDecimal preco, Clube clube, ApetiteFinanceiro tipoDeApetite, int golsFeitosNoAno) {
        super(nome, idade, reputacaoHistorica, preco, clube, tipoDeApetite);
        this.golsFeitosNoAno = golsFeitosNoAno;
    }
    public BigDecimal valorDeCompra() {
        BigDecimal precoComApetite = tipoDeApetite.getValor().multiply(this.preco) ;
        BigDecimal acrescimo = BigDecimal.valueOf(Math.pow(acrescimoPorGolFeito, golsFeitosNoAno));
        BigDecimal precoComAcrescimo = precoComApetite.multiply(acrescimo);
        if (idade >= 30){
            this.preco = precoComAcrescimo.multiply(BigDecimal.valueOf(0.85));
            return this.preco;
        }
        return precoComAcrescimo;
    }
    public boolean interesseDeTransferencia(Clube clube) {
        if (clube.getReputacaoHistorica() > this.reputacaoHistorica) {
            return true;
        }
        return false;
    }

    public int getGolsFeitosNoAno() {
        return golsFeitosNoAno;
    }
}
