import apetiteFinanceiro.Conservador;
import apetiteFinanceiro.Indiferente;
import apetiteFinanceiro.Mercenario;
import clube.Clube;
import jogador.Jogador;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class JogadorTest {
    @Test
    public void deveRetornarSemClubeQuandoOJogadorNaoEstiverAtuandoEmNenhumClube() {
        Jogador vitor = new Jogador("Vitor",23,5, BigDecimal.valueOf(1000), null, new Mercenario());
        String nomeDoClubeEsperado = "Sem Clube";

        Assert.assertSame(nomeDoClubeEsperado, vitor.getClube());
    }
    @Test
    public void deveRetornarOValorDeCompraSemAlteracaoComOTipoDeApetiteIndiferente() {
        Jogador novoJogador = new Jogador("Vitor",23,5,BigDecimal.valueOf(1000), null, new Indiferente());
        BigDecimal valorEsperado = BigDecimal.valueOf(1000);;

        Assert.assertEquals(valorEsperado, novoJogador.valorDeCompra());
    }
    @Test
    public void deveRetornarOValorDeCompraComOTipoDeApetiteConservador() {
        Jogador novoJogador = new Jogador("Vitor",23,5,BigDecimal.valueOf(1000), null, new Conservador());
        BigDecimal valorEsperado = BigDecimal.valueOf(1400.0);

        Assert.assertEquals(valorEsperado, novoJogador.valorDeCompra());
    }
    @Test
    public void deveRetornarOValorDeCompraComOTipoDeApetiteMercenario() {
        Jogador novoJogador = new Jogador("Vitor",23,5, BigDecimal.valueOf(1000), null, new Mercenario());
        BigDecimal valorEsperado = BigDecimal.valueOf(1800.0);

        Assert.assertEquals(valorEsperado, novoJogador.valorDeCompra());
    }
    @Test
    public void deveRetornarSeOJogadorTemInteresseEmAtuarNoClube() {
        Clube gremio = new Clube("Grêmio", 10,BigDecimal.valueOf(1000));
        Jogador lucas = new Jogador("Lucas",23,5,BigDecimal.valueOf(1000), null, new Mercenario());
        boolean interesseEsperado = true;

        boolean temInteresse = lucas.interesseDeTransferencia(gremio);

        Assert.assertSame(interesseEsperado, temInteresse);
    }
}
