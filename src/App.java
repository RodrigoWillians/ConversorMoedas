
import javax.swing.*;

public class App {
    public static void main(String[] args) {
        TipoDeConversao moedas = new TipoDeConversao();

        while (true) {

            String opcao = JOptionPane.showInputDialog(null, "Escolha uma opção ", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de Moeda", "Conversor de Temperatura"}, "Escolha").toString();

            switch (opcao) {
                case "Conversor de Moeda":
                    String input = JOptionPane.showInputDialog("Insira um valor: ");
                    if (checar(input)) {
                        double valorRecebido = Double.parseDouble(input);
                        moedas.converterMoeda(valorRecebido);

                        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                        if (JOptionPane.OK_OPTION == resposta) {
                            System.out.println("Escolha opção Afirmativa");
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa finalizado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;
             }
        }
    }

    public static boolean checar(String input) {
        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0) ;
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}