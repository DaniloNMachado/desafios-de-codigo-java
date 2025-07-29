### 🚀 Projeto Principal: Sistema Bancário Completo (POO)

Este projeto representa a consolidação de todos os conceitos de Programação Orientada a Objetos estudados. Trata-se de uma simulação de um sistema bancário básico, projetado com foco em boas práticas, reutilização de código e uma arquitetura limpa e escalável.

#### Arquitetura e Decisões de Design

O sistema foi estruturado em camadas lógicas para separar responsabilidades, uma prática comum no desenvolvimento de software profissional:

1.  **Camada de Domínio (Entidades):** Onde os "tijolos" do nosso sistema foram modelados.
    * **`Conta.java` (Classe Mãe Abstrata):** Define o "contrato" fundamental para qualquer tipo de conta. Contém atributos comuns (`agencia`, `numeroConta`, `saldo`) e métodos abstratos (`sacar`, `depositar`, `transferir`), forçando as classes filhas a implementarem suas próprias regras de negócio.
        * **Habilidade Demonstrada:** Abstração e Herança.
    * **`ContaCorrente.java` e `ContaPoupanca.java` (Classes Filhas):** Implementações concretas que herdam de `Conta`. Cada uma sobrescreve (`@Override`) os métodos de operação para refletir suas regras específicas (ex: `ContaCorrente` pode usar um limite especial, enquanto `ContaPoupanca` não pode ter saldo negativo).
        * **Habilidade Demonstrada:** Polimorfismo e Especialização.
    * **`Transacao.java` (Record):** Utilização de um `record` do Java moderno para criar um objeto de transferência de dados (DTO) imutável e conciso, representando cada transação no histórico.
        * **Habilidade Demonstrada:** Conhecimento de features modernas da linguagem Java.

2.  **Gerenciamento de Dados em Memória:**
    * **`List<Transacao>`:** Cada objeto `Conta` possui uma lista interna (`ArrayList`) para armazenar seu próprio histórico de transações, simulando a persistência de dados em memória.
        * **Habilidade Demonstrada:** Uso de Coleções (Collections Framework) para gerenciar dados.

3.  **Camada de Interação (Aplicação Principal):**
    * **`Banco.java`:** O ponto de entrada do programa, responsável por interagir com o usuário. Ele não contém regras de negócio, apenas orquestra as chamadas aos objetos de conta.
        * **Habilidade Demonstrada:** Separação de Responsabilidades (a interface do usuário é separada da lógica de negócio).

#### Funcionalidades Implementadas

* **Criação de Contas:** Permite a instanciação de `ContaCorrente` e `ContaPoupanca` com dados iniciais.
* **Operações Bancárias Polimórficas:**
    * **Depósito:** Adiciona valor ao saldo e registra uma transação no histórico.
    * **Saque:** Valida se o saldo (ou saldo + limite) é suficiente antes de debitar o valor e registrar a transação. O método retorna um `boolean` para indicar o sucesso ou falha da operação, uma prática de design robusta.
    * **Transferência (PIX):** Demonstra a interação entre objetos. O método `transferir` reutiliza a lógica dos métodos `sacar` (na conta de origem) e `depositar` (na conta de destino), evitando a duplicação de código (princípio DRY - Don't Repeat Yourself).
* **Histórico de Transações (Extrato):** Cada operação bem-sucedida é registrada em uma lista de objetos `Transacao`, que pode ser consultada a qualquer momento, exibindo um extrato formatado com tipo, data, hora e valor.

#### O que este projeto demonstra:

Este projeto vai além de um simples exercício de sintaxe. Ele demonstra a capacidade de **modelar um problema do mundo real** usando os princípios da Orientação a Objetos, resultando em um código que é:
* **Organizado:** Dividido em classes com responsabilidades claras.
* **Reutilizável:** A lógica de `sacar` e `depositar` é reaproveitada pela função de `transferir`.
* **Extensível:** A arquitetura com a classe abstrata `Conta` permite que novos tipos de conta (ex: `ContaSalario`, `ContaInvestimento`) sejam adicionados no futuro com o mínimo de esforço, sem quebrar o código existente.
* **Robusto:** As validações garantem que as regras de negócio (como limites de saque) sejam sempre respeitadas.