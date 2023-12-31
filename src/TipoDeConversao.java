

import javax.swing.JOptionPane;
import java.util.Objects;

public class TipoDeConversao {

    ConversorDeMoedas moedas = new ConversorDeMoedas();

    public void converterMoeda(double valorRecebido) {
        String opcao = (JOptionPane.showInputDialog(null,
                "Escolha a moeda para a qual você deseja girar seu dinheiro ", "Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Peso Argentino", "De Reais a Peso Chileno", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais", "De Peso Argentino a Reais", "De Peso Chileno a Reais"}, "Escolha")).toString();

        switch (opcao) {
            case "De Reais a Dólares":
                moedas.converterReaisParaDolares(valorRecebido);
                break;
            case "De Reais a Euros":
                moedas.converterReaisParaEuros(valorRecebido);
                break;
            case "De Reais a Libras":
                moedas.converterReaisParaLibras(valorRecebido);
                break;
            case "De Reais a Peso Argentino":
                moedas.converterReaisParaPesosArgentinos(valorRecebido);
                break;
            case "De Reais a Peso Chileno":
                moedas.converterReaisParaPesosChilenos(valorRecebido);
                break;
            case "De Dólares a Reais":
                moedas.converterDolaresParaReais(valorRecebido);
                break;
            case "De Euros a Reais":
                moedas.converterEurosParaReais(valorRecebido);
                break;
            case "De Libras a Reais":
                moedas.converterLibrasParaReais(valorRecebido);
                break;
            case "De Peso Argentino a Reais":
                moedas.converterPesosArgentinosParaReais(valorRecebido);
                break;
            case "De Peso Chileno a Reais":
                moedas.converterPesosChilenosParaReais(valorRecebido);
                break;
        }
    }
}


