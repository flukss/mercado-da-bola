package clube;

import java.math.BigDecimal;

public class Clube {
    static public String nome;
    private int reputacaoHistorica;
    private BigDecimal saldoEmCaixa; // TODO transformar em bigDecimal

    public Clube (String nome, int reputacaoHistorica, BigDecimal saldoEmCaixa) {
        if (reputacaoHistorica > 10) {
            reputacaoHistorica = 10;
        }
        if (reputacaoHistorica < 0) {
            reputacaoHistorica = 0;
        }
        this.nome = nome;
        this.reputacaoHistorica = reputacaoHistorica;
        this.saldoEmCaixa = saldoEmCaixa;
    }

    public static String getNome() {
        return nome;
    }

    public int getReputacaoHistorica() {
        return reputacaoHistorica;
    }

    public BigDecimal getSaldoEmCaixa() {
        return saldoEmCaixa;
    }

    public void setSaldoEmCaixa(BigDecimal saldoEmCaixa) {
        this.saldoEmCaixa = saldoEmCaixa;
    }
}
