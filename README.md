# Calculadora-Java

# Descrição Aprimorada do Código: Calculadora em JavaFX

Este código representa a implementação de uma calculadora gráfica utilizando a biblioteca JavaFX, proporcionando uma experiência interativa e intuitiva para realizar operações matemáticas fundamentais. A estrutura do código é organizada de maneira modular e fácil de entender, abrangendo diversos componentes e métodos que colaboram harmoniosamente.

# Componentes da Interface Gráfica:

tela (TextField): Um campo de texto que exibe a expressão e o resultado das operações, mantendo a interface do usuário informada de maneira clara.
Botões Numéricos (um a nove, zero): Cada botão está associado a um dígito, proporcionando uma entrada fácil e direta dos números.
Botões de Operação (mais, menos, vezes, dividido): Botões responsáveis por representar operações básicas de adição, subtração, multiplicação e divisão.
igual (Button): Botão destinado a realizar o cálculo da expressão, proporcionando uma conclusão lógica para as operações.
ac (Button): Botão de limpeza, oferecendo uma funcionalidade rápida e eficiente para reiniciar a calculadora.
Variáveis e Estruturas de Dados:

expressao (StringBuilder): Utilizado de forma dinâmica para construir a expressão matemática durante a interação do usuário, contribuindo para a flexibilidade do código.
resultado (double): Armazena o resultado do cálculo, garantindo uma gestão eficaz dos valores obtidos.
Métodos Principais:

adicionarNumero(ActionEvent event): Responsável por adicionar o número correspondente à expressão quando um botão numérico é pressionado, assegurando uma entrada suave e imediata.
adicionarOperacao(ActionEvent event): Adiciona a operação à expressão quando um botão de operação é pressionado, mantendo a consistência na construção da expressão.
limpar(): Oferece a funcionalidade de reiniciar a calculadora, limpando a expressão e proporcionando um ambiente de entrada de dados limpo.
calcular(): Realiza o cálculo da expressão, abordando cenários específicos, como divisão por zero ou formatos inválidos, garantindo uma resposta precisa e segura ao usuário.
Lógica de Cálculo:

A lógica de cálculo está encapsulada no método calcular(), onde a expressão é analisada, os números e operações são extraídos e o cálculo correspondente é efetuado. Tratamento de exceções assegura a robustez do código.
Interatividade com a Interface Gráfica:

Os métodos são habilmente vinculados aos botões por meio do atributo onAction no arquivo FXML, proporcionando uma experiência interativa e responsiva ao usuário.
Esta descrição refinada destaca a organização cuidadosa do código, enfatizando a clareza de cada componente e método, bem como a ênfase na usabilidade e na experiência do usuário. Este código está preparado para evoluções futuras e mantém uma estrutura coesa para futuras modificações.
