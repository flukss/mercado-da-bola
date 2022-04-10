package apetiteFinanceiro;

import java.math.BigDecimal;

public class Mercenario extends ApetiteFinanceiro {

    static final BigDecimal VALOR_MERCENARIO = BigDecimal.valueOf(1.8);

        public Mercenario(){
            super(valor);
            valor = VALOR_MERCENARIO;
        }
}
