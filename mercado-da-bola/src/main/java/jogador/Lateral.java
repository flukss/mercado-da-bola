package jogador;

import apetiteFinanceiro.ApetiteFinanceiro;
import clube.Clube;

import java.math.BigDecimal;

public class Lateral extends Jogador{
    public static int cruzamentosCertos;
    private static double acrescimocruzamentosCertos = 1.02;

    public Lateral(String nome, int idade, int reputacaoHistorica, BigDecimal preco, Clube clube, ApetiteFinanceiro tipoDeApetite, int cruzamentosCertos) {
        super(nome, idade, reputacaoHistorica, preco, clube, tipoDeApetite);
        this.cruzamentosCertos = cruzamentosCertos;
    }
    public BigDecimal valorDeCompra() {
        BigDecimal precoComApetite = tipoDeApetite.getValor().multiply(this.preco);
        BigDecimal acrescimo = BigDecimal.valueOf(Math.pow(acrescimocruzamentosCertos, cruzamentosCertos));
        BigDecimal precoComAcrescimo = precoComApetite.multiply(acrescimo);
        if (idade >= 28){
            this.preco = precoComAcrescimo.multiply(BigDecimal.valueOf(0.7));
            return this.preco;
        }
        return precoComAcrescimo;
    }

    public static int getCruzamentosCertos() {
        return cruzamentosCertos;
    }
}
