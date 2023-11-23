package com.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField tela;

    private StringBuilder expressao = new StringBuilder();

    @FXML
    private void adicionarNumero(ActionEvent event) {
        Button button = (Button) event.getSource();
        expressao.append(button.getText());
        atualizarTela();
    }

    @FXML
    private void adicionarOperacao(ActionEvent event) {
        Button button = (Button) event.getSource();
        expressao.append(" ").append(button.getText()).append(" ");
        atualizarTela();
    }

    @FXML
    private void limpar() {
        expressao.setLength(0);
        tela.clear();
    }

    private void atualizarTela() {
        tela.setText(expressao.toString());
    }
    @FXML
    
private void calcular() {
    if (expressao.length() > 0) {
        String[] partes = expressao.toString().split(" ");
        
        if (partes.length == 3) {
            try {
                double num1 = Double.parseDouble(partes[0]);
                String operacao = partes[1];
                double num2 = Double.parseDouble(partes[2]);
                
                switch (operacao) {
                    case "+":
                        expressao.setLength(0);
                        expressao.append(num1 + num2);
                        break;
                    case "-":
                        expressao.setLength(0);
                        expressao.append(num1 - num2);
                        break;
                    case "*":
                        expressao.setLength(0);
                        expressao.append(num1 * num2);
                        break;
                    case "/":
                        if (num2 != 0) {
                            expressao.setLength(0);
                            expressao.append(num1 / num2);
                        } else {
                            return;
                        }
                        break;
                    default:
                        break;
                }
                
                tela.setText(expressao.toString());
                
            } catch (NumberFormatException e) {
            }
        }
    }
}

}
