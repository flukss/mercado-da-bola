package negocios;
import clube.Clube;
import jogador.Jogador;

public class Negociacao {

    public boolean negociar (Jogador jogador, Clube clube) {
        if (jogador.interesseDeTransferencia(clube)) {
            jogador.setClube(clube);
        }
        if (jogador.preco.compareTo(clube.getSaldoEmCaixa()) < 1) {
            return true;
        }
        return false;
    }
}
