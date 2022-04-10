import apetiteFinanceiro.Conservador;
import apetiteFinanceiro.Indiferente;
import apetiteFinanceiro.Mercenario;
import jogador.Lateral;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class LateralTest {
    @Test
    public void deveAcrescerDoisPorCentoPorCruzamentoCertoSobreOSeuValorQuandoOApetiteForIndiferente() {
        Lateral novoLateral = new Lateral("Vitor", 23, 5, BigDecimal.valueOf(100000000), null, new Indiferente(), 2);

        Assert.assertEquals((new BigDecimal(104040000).stripTrailingZeros()), novoLateral.valorDeCompra().stripTrailingZeros());
    }

    @Test
    public void deveAcrescerDoisPorCentoPorCruzamentoCertoSobreOSeuValorQuandoOApetiteForConservador() {
        Lateral novoLateral = new Lateral("Vitor", 23, 5, BigDecimal.valueOf(100000000), null, new Conservador(), 2);

        Assert.assertEquals((new BigDecimal(145656000).stripTrailingZeros()), novoLateral.valorDeCompra().stripTrailingZeros());
    }

    @Test
    public void deveAcrescerDoisPorCentoPorCruzamentoCertoSobreOSeuValorQuandoOApetiteForMercenario() {
        Lateral novoLateral = new Lateral("Vitor", 23, 5, BigDecimal.valueOf(100000000), null, new Mercenario(), 2);

        Assert.assertEquals((new BigDecimal(187272000).stripTrailingZeros()), novoLateral.valorDeCompra().stripTrailingZeros());
    }
    @Test
    public void deveOcorrerODescontodeTrintaPorcentoSobreOValorTotalPadraoSeEleTiverMaisDeVinteEOitoAnos() {
        Lateral novoLateral = new Lateral("Vitor", 30, 5, BigDecimal.valueOf(100000000), null, new Indiferente(), 0);

        Assert.assertEquals((new BigDecimal(70000000).stripTrailingZeros()), novoLateral.valorDeCompra().stripTrailingZeros());
    }
}
