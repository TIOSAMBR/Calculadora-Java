package com.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField tela;

    private StringBuilder expressao = new StringBuilder("0");
    
     @FXML
    public void initialize() {
        expressao = new StringBuilder("0");
        atualizarTela();
    }

    @FXML
    private void adicionarNumero(ActionEvent event) {
        Button button = (Button) event.getSource();
        if (expressao.toString().equals("0")) {
            expressao.setLength(0);
        }
        expressao.append(button.getText());
        atualizarTela();
    }

    @FXML
    private void adicionarOperacao(ActionEvent event) {
        Button button = (Button) event.getSource();
        if (!expressao.toString().equals("0")) {
            expressao.append(" ").append(button.getText()).append(" ");
            atualizarTela();
        }
    }

    @FXML
    private void limpar() {
        expressao.setLength(0);
        expressao.append("0");
        tela.clear();
        atualizarTela();
    }

    private void atualizarTela() {
        tela.setText(expressao.toString());
    }

    @FXML
private void calcular() {
    if (!expressao.toString().equals("0")) {
        String[] partes = expressao.toString().split(" ");

        if (partes.length == 3) {
            try {
                double num1 = Double.parseDouble(partes[0]);
                String operacao = partes[1];
                double num2 = Double.parseDouble(partes[2]);

                double resultado = 0;

                switch (operacao) {
                    case "+":
                        resultado = num1 + num2;
                        break;
                    case "-":
                        resultado = num1 - num2;
                        break;
                    case "*":
                        resultado = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            resultado = num1 / num2;
                        } else {
                            return;
                        }
                        break;
                    default:
                        break;
                }

                // Verificar se o resultado tem parte decimal
                if (resultado % 1 == 0) {
                    // Resultado é um número inteiro
                    expressao.setLength(0);
                    expressao.append((int) resultado);
                } else {
                    // Resultado tem parte decimal
                    expressao.setLength(0);
                    expressao.append(resultado);
                }

                tela.setText(expressao.toString());

            } catch (NumberFormatException e) {
            }
        }
    }
    }
}

