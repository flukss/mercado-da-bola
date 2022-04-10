package jogador;

import apetiteFinanceiro.ApetiteFinanceiro;
import clube.Clube;

import java.math.BigDecimal;

public class Goleiro extends Jogador {
    static int penaltisDefendidos;
    private static double acrescimoPorPenaltiDefendido = 1.04;

    public Goleiro(String nome, int idade, int reputacaoHistorica, BigDecimal preco,
                   Clube clube, ApetiteFinanceiro tipoDeApetite, int penaltisDefendidos) {
        super(nome, idade, reputacaoHistorica, preco, clube, tipoDeApetite);
        this.penaltisDefendidos = penaltisDefendidos;
    }
   public BigDecimal valorDeCompra() {
       BigDecimal precoComApetite = tipoDeApetite.getValor().multiply(this.preco) ;
       BigDecimal acrescimo = BigDecimal.valueOf(Math.pow(acrescimoPorPenaltiDefendido, penaltisDefendidos));
       BigDecimal precoComAcrescimo = precoComApetite.multiply(acrescimo);
       return  precoComAcrescimo;
    }

    public static int getPenaltisDefendidos() {
        return penaltisDefendidos;
    }
}


