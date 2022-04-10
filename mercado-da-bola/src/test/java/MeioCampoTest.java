import apetiteFinanceiro.Indiferente;
import apetiteFinanceiro.Mercenario;
import clube.Clube;
import jogador.MeioCampo;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class MeioCampoTest {
    @Test
    public void deveCalcularCorretamenteOPrecoDoMeioCampoComMenosDeTrintaAnos() {
        MeioCampo novoMeioCampo = new MeioCampo("Vitor",23,5,BigDecimal.valueOf(1000), null, new Indiferente());
        BigDecimal valorEsperado = BigDecimal.valueOf(1000);

        Assert.assertEquals(valorEsperado, novoMeioCampo.valorDeCompra());
    }
    @Test
    public void deveCalcularCorretamenteOPrecoDoMeioCampoComMaisDeTrintaAnos() {
        MeioCampo novoMeioCampo = new MeioCampo("Vitor",30,5,BigDecimal.valueOf(1000), null, new Indiferente());
        BigDecimal valorEsperado = BigDecimal.valueOf(700.0);

        Assert.assertEquals(valorEsperado, novoMeioCampo.valorDeCompra());
    }
    @Test
    public void deveRetornarQueOMeioCampoTemInteresseEmAtuarNoClubeQuandoAReputacaoDoClubeForNoMinimoDoisPontosMenores() {
        Clube gremio = new Clube("Grêmio", 8,BigDecimal.valueOf(1000));
        MeioCampo lucas = new MeioCampo("Lucas",23,10,BigDecimal.valueOf(1000), null, new Mercenario());
        boolean interesseEsperado = true;

        boolean temInteresse = lucas.interesseDeTransferencia(gremio);

        Assert.assertSame(interesseEsperado, temInteresse);
    }
    @Test
    public void deveRetornarQueOMeioCampoNaoTemInteresseEmAtuarNoClubeQuandoAReputacaoDoClubeForMaiorQueADele() {
        Clube gremio = new Clube("Grêmio", 10,BigDecimal.valueOf(1000));
        MeioCampo lucas = new MeioCampo("Lucas",23,5,BigDecimal.valueOf(1000), null, new Mercenario());
        boolean interesseEsperado = false;

        boolean temInteresse = lucas.interesseDeTransferencia(gremio);

        Assert.assertSame(interesseEsperado, temInteresse);
    }

}
