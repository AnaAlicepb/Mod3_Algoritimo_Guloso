<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <h1>Troco Mínimo com Algoritmo Guloso</h1>
    <h2>Descrição</h2>
    <p>Este projeto contém uma implementação simples de um algoritmo guloso em Java para calcular o troco mínimo a ser dado em uma transação financeira, utilizando o menor número possível de moedas. O algoritmo funciona iterando sobre as moedas disponíveis, sempre escolhendo a maior moeda possível que não exceda o valor restante do troco.</p>
    <h2>Funcionalidades</h2>
    <ul>
        <li><strong>Ordenação das moedas:</strong> As moedas disponíveis são ordenadas em ordem decrescente para garantir que o algoritmo sempre escolha a maior denominação possível primeiro.</li>
        <li><strong>Cálculo do troco mínimo:</strong> Dado um valor e uma lista de moedas disponíveis, o algoritmo calcula o troco mínimo, retornando uma lista com as moedas que compõem esse troco.</li>
    </ul>
    <h2>Estrutura do Código</h2>
    <p>A classe <code>TrocoMinimo</code> é responsável por executar o algoritmo guloso para calcular o troco mínimo. Ela contém o método principal <code>trocoMinimo</code>, que recebe o valor do troco e um array de moedas disponíveis como parâmetros.</p>
    <h3>Explicação do Código</h3>
    <ol>
        <li><strong>Conversão de Array para Lista:</strong> As moedas disponíveis, que são fornecidas como um array de inteiros (<code>int[]</code>), são convertidas para uma lista de inteiros (<code>List&lt;Integer&gt;</code>) para facilitar a ordenação.</li>
        <li><strong>Ordenação das Moedas:</strong> A lista de moedas é ordenada em ordem decrescente usando <code>Collections.sort()</code> e <code>Collections.reverseOrder()</code>, garantindo que o algoritmo sempre comece com a maior moeda disponível.</li>
        <li><strong>Cálculo do Troco:</strong> O algoritmo percorre a lista de moedas ordenadas e, enquanto o valor restante do troco for maior ou igual à moeda atual, subtrai essa moeda do valor restante e a adiciona à lista de troco. Esse processo se repete até que o valor restante seja zero, momento em que a lista de troco é retornada.</li>
    </ol>
    <h2>Exemplo de Uso</h2>
    <p>Um exemplo de uso prático do algoritmo pode ser visto na classe <code>App</code>, onde é possível testar a funcionalidade de calcular o troco mínimo.</p>
    <h2>Pré-requisitos</h2>
    <ul>
        <li>Java 8 ou superior instalado</li>
        <li>IDE compatível com Java (Eclipse, IntelliJ, VS Code, etc.)</li>
    </ul>
    <h2>Como Executar</h2>
    <ol>
        <li>Clone o repositório ou baixe os arquivos do projeto.</li>
        <li>Abra o projeto em sua IDE preferida.</li>
        <li>Compile e execute a classe <code>App</code> para ver o algoritmo em ação.</li>
    </ol>
    <h2>Contribuições</h2>
    <p>Sinta-se à vontade para contribuir com melhorias para este projeto. Faça um fork do repositório e envie um pull request com suas sugestões.</p>
    <h2>Licença</h2>
    <p>Este projeto está licenciado sob a licença MIT - consulte o arquivo LICENSE para obter detalhes.</p>
</body>
</html>

