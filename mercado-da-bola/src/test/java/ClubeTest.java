import clube.Clube;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class ClubeTest {

    @Test
    public void deveRetornarAReputacaoMaximaSeOValorPassadoForMaiorQueOPermitido() {
        Clube clube = new Clube("Grêmio",13, BigDecimal.valueOf(1000));
        int reputacaoEsperada = 10;

        Assert.assertEquals(reputacaoEsperada, clube.getReputacaoHistorica());
    }
    @Test
    public void deveRetornarAReputacaoMinimaSeOValorPassadoForMenorQueOPermitido() {
        Clube clube = new Clube("Inter",-2,BigDecimal.valueOf(1000));
        int reputacaoEsperada = 0;

        Assert.assertEquals(reputacaoEsperada, clube.getReputacaoHistorica());
    }

}
