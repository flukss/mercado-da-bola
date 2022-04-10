package jogador;

import apetiteFinanceiro.ApetiteFinanceiro;
import clube.Clube;

import java.math.BigDecimal;
import java.util.Objects;

public class Jogador {
    public String nome;
    public int idade;
    public Clube clube;
    public int reputacaoHistorica;
    public ApetiteFinanceiro tipoDeApetite;
    public BigDecimal preco;

    public Jogador(String nome, int idade, int reputacaoHistorica, BigDecimal preco, Clube clube, ApetiteFinanceiro tipoDeApetite) {
        this.nome = nome;
        this.idade = idade;
        this.reputacaoHistorica = reputacaoHistorica;
        this.preco = preco;
        this.clube = clube;
        this.tipoDeApetite = tipoDeApetite;
    }

    public String getClube() {
        if (Objects.isNull(this.clube)) {
            return "Sem Clube";
        }
        return Clube.getNome();
    }

    public BigDecimal valorDeCompra() {
        return  tipoDeApetite.getValor().multiply(this.preco);
    }

    public boolean interesseDeTransferencia(Clube clube) {
        if (clube.getReputacaoHistorica() >= 1 ) {
            return true;
        }
        return false;
    }

    public ApetiteFinanceiro getTipoDeApetite() {
        return tipoDeApetite;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getReputacaoHistorica() {
        return reputacaoHistorica;
    }

    public void setClube(Clube clube) {
        this.clube = clube;
    }
}