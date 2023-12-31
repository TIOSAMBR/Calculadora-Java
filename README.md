# Calculadora-Java

## Descrição do Código: Calculadora em JavaFX

Este código implementa uma calculadora gráfica em JavaFX, proporcionando uma experiência interativa para realizar operações matemáticas fundamentais. A estrutura modular e intuitiva do código facilita a compreensão e futuras modificações.

## Componentes da Interface Gráfica:

- **Tela (TextField):** Responsável por exibir a expressão e o resultado das operações, proporcionando uma interface de usuário clara e informativa.

- **Botões Numéricos (1 a 9, 0):** Cada botão está associado a um dígito, facilitando a entrada dos números de forma direta.

- **Botões de Operação (+, -, *, /):** Representam as operações básicas de adição, subtração, multiplicação e divisão.

- **Botão de Igual (=):** Executa o cálculo da expressão, oferecendo uma conclusão lógica para as operações.

- **Botão AC (Clear):** Permite a limpeza da tela, reiniciando a calculadora para uma nova entrada.

## Variáveis e Estruturas de Dados:

- **expressao (StringBuilder):** Utilizado dinamicamente para construir a expressão matemática durante a interação do usuário, proporcionando flexibilidade.

- **resultado (double):** Armazena o resultado do cálculo para uma gestão eficiente dos valores obtidos.

## Métodos Principais:

- **adicionarNumero(ActionEvent event):** Adiciona o número correspondente à expressão quando um botão numérico é pressionado, garantindo uma entrada suave.

- **adicionarOperacao(ActionEvent event):** Adiciona a operação à expressão quando um botão de operação é pressionado, mantendo a consistência na construção da expressão.

- **limpar():** Reinicia a calculadora, limpando a expressão e proporcionando um ambiente de entrada de dados limpo.

- **calcular():** Realiza o cálculo da expressão, tratando exceções como divisão por zero e formatos inválidos, garantindo uma resposta precisa e segura.

## Lógica de Cálculo:

A lógica está encapsulada no método calcular(), analisando a expressão, extraindo números e operações, e efetuando o cálculo correspondente.

## Interatividade com a Interface Gráfica:

Os métodos são vinculados aos botões por meio do atributo onAction no arquivo FXML, proporcionando uma experiência interativa e responsiva.

## Ferramentas Utilizadas:

- **Ambiente de Desenvolvimento:** NetBeans
- **Biblioteca de Interface Gráfica:** JavaFX, SceneBuilder

## Imagem da Calculadora: 

[![Calculadora](https://github.com/TIOSAMBR/Calculadora-Java/assets/102129312/a4201a80-6c27-4076-bebc-9bc101026a69)
](https://github.com/TIOSAMBR/Calculadora-Java/blob/main/Calculadora.png?raw=true)

Esta descrição refinada destaca a organização cuidadosa do código, enfatizando a clareza de cada componente e método, bem como a ênfase na usabilidade e na experiência do usuário. O código está preparado para evoluções futuras e mantém uma estrutura coesa para modificações subsequentes.
