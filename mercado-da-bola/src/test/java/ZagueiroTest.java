import apetiteFinanceiro.ApetiteFinanceiro;
import apetiteFinanceiro.Conservador;
import apetiteFinanceiro.Indiferente;
import apetiteFinanceiro.Mercenario;
import clube.Clube;
import jogador.Zagueiro;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class ZagueiroTest {
    @Test
    public void deveRetornarODescontoDeIdadeNoValorPadraoQuandoOZagueiroTiverMaisDeTrintaAnos() {
        Zagueiro geromel = new Zagueiro("Geromel", 31, 10, BigDecimal.valueOf(100000000), null, new Indiferente());

        Assert.assertEquals((new BigDecimal(80000000).stripTrailingZeros()), geromel.valordeCompra().stripTrailingZeros());
    }

}
