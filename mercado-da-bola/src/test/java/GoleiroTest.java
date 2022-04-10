import apetiteFinanceiro.Conservador;
import apetiteFinanceiro.Indiferente;
import apetiteFinanceiro.Mercenario;
import jogador.Goleiro;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class GoleiroTest {
    @Test
    public void deveAcrescerQuatroPorCentoPorPenaltiDefendidoSobreOSeuValorPadrao() {
        Goleiro novoGoleiro = new Goleiro("Vitor", 23, 5, BigDecimal.valueOf(100000000), null, new Indiferente(), 1);

        Assert.assertEquals((new BigDecimal(104000000).stripTrailingZeros()), novoGoleiro.valorDeCompra().stripTrailingZeros());
    }
}