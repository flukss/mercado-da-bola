package apetiteFinanceiro;

import java.math.BigDecimal;

public class ApetiteFinanceiro {
    public static BigDecimal valor;

    public ApetiteFinanceiro(BigDecimal valor) {
        this.valor = valor;
    }

    public static BigDecimal getValor() {
        return valor;
    }
}
