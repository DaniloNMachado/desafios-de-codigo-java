# Desafios de Código: Uma Jornada Prática em Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)

## 🎯 Sobre Este Repositório

Este repositório é o registro prático da minha evolução nos estudos de Java, documentando a jornada desde os conceitos fundamentais da programação procedural até a aplicação dos pilares da Programação Orientada a Objetos (POO). O projeto consiste em uma coleção de desafios de código resolvidos, cada um construído para solidificar e demonstrar a compreensão de conceitos-chave do desenvolvimento de software.

O objetivo é apresentar não apenas o código funcional, mas também o processo de aprendizado, depuração e refatoração, refletindo a mentalidade de um desenvolvedor focado em soluções robustas e bem estruturadas.

## ✨ Desafios Implementados

Os desafios foram organizados em etapas de complexidade crescente, cada uma focada em um conjunto específico de habilidades.

### Fase 1: Lógica Procedural e Fundamentos de Java

O foco inicial foi dominar a sintaxe da linguagem, o fluxo de controle e a interação com o usuário via console.

* **Calculadora de Soma e Subtração:** Leitura de uma `String` com múltiplos valores, uso de `.split()` para separá-los, e conversão (`parsing`) para realizar cálculos.
* **Simulador de Conta Bancária (Versão Procedural):** Gerenciamento de estado com variáveis, criação de menu interativo com `while` e `switch`, e implementação de lógicas de negócio.
* **Simulador de Carro (Versão Procedural):** Lógica condicional aninhada e complexa para gerenciar múltiplos estados interdependentes (velocidade, marcha, ignição).
* **Máquina de Banho de Petshop:** Gerenciamento de estado e de recursos com capacidades limitadas (água, shampoo).
* **Formatador de Telefone (Desafio de Lógica):** Manipulação de `String` e lógica condicional baseada no tamanho da entrada para aplicar formatações diferentes.

### Fase 2: Programação Orientada a Objetos (POO)

Nesta fase, o foco foi a transição para o paradigma orientado a objetos, aplicando seus pilares para criar código mais organizado, reutilizável e escalável.

* **Sistema de Ingressos de Cinema:**
    * **Conceitos:** Herança (`extends`), Polimorfismo e Sobrescrita de Métodos (`@Override`) para calcular valores de ingressos `MeiaEntrada` e `Familia`.

* **Hierarquia de Usuários de um Sistema:**
    * **Conceitos:** Encapsulamento (`private`, getters/setters), Construtores (`this`), chamada de construtor da superclasse (`super`), e criação de uma hierarquia com `Gerente`, `Vendedor` e `Atendente`.

* **Hierarquia de Relógios do Mundo:**
    * **Conceitos:** `Classes Abstratas` e `Métodos Abstratos` para definir um "contrato" para classes filhas (`RelogioBrasileiro`, `RelogioAmericano`). Prática de validação de dados nos `setters`.

* **Sistema de Marketing Multicanal:**
    * **Conceitos:** `Interfaces` para desacoplar o código, uso da palavra-chave `implements` e demonstração de polimorfismo com uma lista de objetos de diferentes classes (`EnviadorSMS`, `EnviadorEmail`, etc.) que compartilham a mesma interface.

* **Sistema Bancário Avançado (Projeto Final da DIO):**
    * **Descrição:** A consolidação de todos os conceitos de POO em um projeto mais robusto, simulando um sistema bancário com contas, transferências, investimentos e histórico de transações.
    * **Conceitos-Chave:** Herança, Polimorfismo, Abstração, `Listas` (`ArrayList`) para gerenciamento de coleções de dados (histórico), e uso de `Records` para criar objetos de transferência de dados imutáveis (`Transacao`).

### Fase 3: Introdução a Interfaces Gráficas (GUI)

Uma breve exploração sobre como conectar a lógica de backend a uma interface visual.

* **Interface Gráfica para o Banco:**
    * **Conceitos:** Fundamentos de `Java Swing` (`JFrame`, `JButton`, `JLabel`), manipulação de layout e introdução ao tratamento de eventos com `ActionListener` e expressões lambda.

## 🛠️ Tecnologias e Ferramentas

* **Linguagem:** Java (JDK 21)
* **IDE:** Visual Studio Code
* **Versionamento:** Git & GitHub (via CLI e GUI do VS Code)
* **Conceitos de POO:** Encapsulamento, Herança, Polimorfismo, Abstração
* **Estruturas de Dados:** Arrays, `List`, `ArrayList`
* **Outros:** `Records`, `Enums`, `Lombok` (mencionados no desafio final), `LocalDateTime`

## 🚀 Como Executar os Projetos

1.  Clone este repositório para a sua máquina local:
    ```bash
    git clone [https://github.com/DaniloNMachado/desafios-de-codigo-java/tree/main/4%20-%20Heran%C3%A7a%20e%20Polimorfismo%20em%20Java/Desafio%20de%20C%C3%B3digo]
    ```
2.  Abra a pasta do projeto em sua IDE de preferência (VS Code, IntelliJ, Eclipse).
3.  Navegue até o arquivo `.java` que contém o método `main` do desafio que deseja executar.
4.  Compile e execute o arquivo.

## 📫 Contato

Sinta-se à vontade para se conectar comigo e discutir sobre tecnologia e desenvolvimento!

* **LinkedIn:** [Danilo Nogueira Machado](https://www.linkedin.com/in/danilo-nogueira-machado)