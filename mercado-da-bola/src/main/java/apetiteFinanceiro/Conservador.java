package apetiteFinanceiro;

import java.math.BigDecimal;

public class Conservador extends ApetiteFinanceiro{
    private static final BigDecimal VALOR_INDIFERENTE = BigDecimal.valueOf(1.4);

    public Conservador(){
        super(valor);
        valor = VALOR_INDIFERENTE;
    }
}
