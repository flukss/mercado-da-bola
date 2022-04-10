import apetiteFinanceiro.Indiferente;
import apetiteFinanceiro.Mercenario;
import clube.Clube;
import jogador.Atacante;
import jogador.MeioCampo;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class AtacanteTest {
    @Test
    public void deveAcrescerUmPorCentoPorGolSobreOSeuValor() {
        Atacante novoAtacante = new Atacante("Vitor", 23, 5, BigDecimal.valueOf(100000000), null, new Indiferente(), 1);

        Assert.assertEquals((new BigDecimal(101000000).stripTrailingZeros()), novoAtacante.valorDeCompra().stripTrailingZeros());
    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoAtacanteComMenosDeTrintaAnos() {
        Atacante novoAtacante = new Atacante("Vitor", 25, 5, BigDecimal.valueOf(1000), null, new Indiferente(), 0);
        BigDecimal valorEsperado = BigDecimal.valueOf(1000.0);

        Assert.assertEquals(valorEsperado, novoAtacante.valorDeCompra());
    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoAtacanteComMaisDeTrintaAnos() {
        Atacante novoMeioCampo = new Atacante("Vitor", 31, 5, BigDecimal.valueOf(100000000), null, new Indiferente(), 0);

        Assert.assertEquals((new BigDecimal(85000000).stripTrailingZeros()), novoMeioCampo.valorDeCompra().stripTrailingZeros());
    }

    @Test
    public void deveRetornarQueOAtacanteTemInteresseEmAtuarNoClubeQuandoAReputacaoDoClubeForMaiorQueASua() {
        Clube gremio = new Clube("Grêmio", 10, BigDecimal.valueOf(1000));
        Atacante lucas = new Atacante("Lucas", 23, 5, BigDecimal.valueOf(1000), null, new Indiferente(), 0);
        boolean interesseEsperado = true;

        boolean temInteresse = lucas.interesseDeTransferencia(gremio);

        Assert.assertSame(interesseEsperado, temInteresse);
    }
}