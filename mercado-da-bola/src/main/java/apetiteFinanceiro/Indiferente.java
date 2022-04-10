package apetiteFinanceiro;

import java.math.BigDecimal;

public class Indiferente extends ApetiteFinanceiro {
    private static final BigDecimal VALOR_INDIFERENTE = BigDecimal.valueOf(1);

    public Indiferente(){
       super(valor);
       valor = VALOR_INDIFERENTE;
    }
}
