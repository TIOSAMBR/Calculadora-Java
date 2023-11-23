# Calculadora-Java

# Descrição do Código: Calculadora em JavaFX

Este código representa a implementação de uma calculadora simples usando JavaFX, uma biblioteca gráfica para interfaces de usuário em Java. A calculadora inclui botões numéricos, operadores de adição, subtração, multiplicação e divisão, além de botões para limpar a tela e calcular o resultado.

# Componentes da Interface Gráfica:

TextField (tela): Um campo de texto usado para exibir a expressão e o resultado.
Botões Numéricos (um, dois, ..., nove, zero): Botões que representam os dígitos de 0 a 9.
Botões de Operação (mais, menos, vezes, dividido): Botões para adição, subtração, multiplicação e divisão.
Botão Igual (igual): Botão para calcular o resultado da expressão.
Botão Limpar (ac): Botão para limpar a tela.
Variáveis e Estruturas de Dados:

expressao (StringBuilder): Uma instância de StringBuilder utilizada para construir a expressão matemática conforme os botões são pressionados.
resultado (double): Variável para armazenar o resultado do cálculo.
Métodos Principais:

adicionarNumero(ActionEvent event): Método chamado quando um botão numérico é pressionado. Adiciona o número correspondente à expressão e atualiza a tela.
adicionarOperacao(ActionEvent event): Método chamado quando um botão de operação é pressionado. Adiciona a operação à expressão e atualiza a tela.
limpar(): Método chamado quando o botão "AC" é pressionado. Limpa a expressão e a tela.
calcular(): Método chamado quando o botão "=" é pressionado. Realiza o cálculo da expressão e exibe o resultado na tela.
Lógica de Cálculo:

A lógica de cálculo é implementada no método calcular(). Ele analisa a expressão, extrai os números e a operação, realiza o cálculo correspondente e exibe o resultado na tela. O código trata exceções, como divisão por zero e formatos inválidos.
Interatividade com a Interface Gráfica:

Os métodos são vinculados aos botões por meio do atributo onAction no arquivo FXML, permitindo a interatividade do usuário.
Este código fornece uma estrutura básica para uma calculadora funcional em JavaFX. Pode ser estendido e aprimorado para atender a requisitos mais específicos de interface do usuário e lógica de cálculo.
