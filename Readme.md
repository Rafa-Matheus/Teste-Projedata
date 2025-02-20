# **Teste Prático - Projedata**

## **Descrição**
Este projeto é a solução para o **Teste Prático de Programação** proposto pela **Projedata** como parte do processo seletivo para a vaga de **Desenvolvedor Java**. O sistema gerencia informações de funcionários, como nome, data de nascimento, salário e função, e implementa todas as funcionalidades solicitadas no teste.

---

## **Requisitos do Sistema**

### **1. Versão do Java**
Certifique-se de ter instalada no mínimo a versão **Java 21 LTS** para garantir compatibilidade.

### **2. Ferramentas Necessárias**
- **JDK (Java Development Kit):** Instale o JDK 21 ou superior.
- **IDE:** Este projeto foi desenvolvido utilizando o **IntelliJ IDEA**, mas também pode ser executado em outras IDEs como Eclipse ou VS Code, ou diretamente no terminal.

---

## **Instruções de Uso**

### **1. Clonar o Repositório**
Clone este repositório para sua máquina local usando o comando:
```bash
git clone https://github.com/Rafa-Matheus/Teste-Projedata.git
```

### **2. Abrir no IntelliJ IDEA**
Para abrir o projeto no IntelliJ IDEA:
1. Abra o IntelliJ IDEA.
2. Selecione `File > Open` e navegue até o diretório onde o projeto foi clonado.
3. Clique em `OK` para importar o projeto.

### **3. Compilar e Executar**

#### **Via Terminal**
Navegue até o diretório `.src` onde estão os arquivos `.java` e execute os seguintes comandos:
```bash
javac *.java
java Main
```

#### **Via IntelliJ IDEA**
1. Certifique-se de que o JDK 21 está configurado no IntelliJ (`File > Project Structure > SDK`).
2. Execute o arquivo `Main.java` clicando no botão de execução ao lado da classe `Main`.

O programa será iniciado e exibirá os resultados das operações no terminal.

---

## **Funcionalidades Implementadas**
O sistema atende a todos os requisitos do teste prático da Projedata:

1. **Classe Pessoa:**
    - Atributos: `nome` (String) e `dataNascimento` (LocalDate).

2. **Classe Funcionário:**
    - Estende a classe `Pessoa`.
    - Atributos adicionais: `salario` (BigDecimal) e `funcao` (String).

3. **Classe Principal (`Main`):**
    - Executa as seguintes ações:
        - **3.1:** Insere todos os funcionários na mesma ordem e com as informações fornecidas.
        - **3.2:** Remove o funcionário "João" da lista.
        - **3.3:** Imprime todos os funcionários com suas informações formatadas:
            - Data no formato `dd/MM/yyyy`.
            - Valores numéricos com separador de milhar como ponto (`.`) e decimal como vírgula (`,`).
        - **3.4:** Aplica um aumento de 10% nos salários de todos os funcionários.
        - **3.5:** Agrupa os funcionários por função em um `Map`, onde a chave é a função e o valor é a lista de funcionários.
        - **3.6:** Imprime os funcionários agrupados por função.
        - **3.8:** Imprime os funcionários que fazem aniversário nos meses 10 (outubro) e 12 (dezembro).
        - **3.9:** Identifica e imprime o funcionário mais velho, exibindo seu nome e idade.
        - **3.10:** Imprime a lista de funcionários ordenada alfabeticamente pelo nome.
        - **3.11:** Calcula e imprime o total dos salários dos funcionários.
        - **3.12:** Calcula e imprime quantos salários mínimos cada funcionário recebe, considerando o salário mínimo de **R$1.212,00**.


---

## **Contribuição**
Este repositório é específico para o teste prático da Projedata. Não são aceitas contribuições externas, mas fique à vontade para usá-lo como referência em projetos particulares.


---

## **Contato**
Para dúvidas ou sugestões relacionadas ao teste prático, entre em contato:
- **Nome:** Rafael Matheus de Oliveira
- **E-mail:** rafaoliveira.ipanema@gmail.com
- **GitHub:** [https://github.com/Rafa-Matheus](https://github.com/Rafa-Matheus)
- **LinkedIn:** [https://www.linkedin.com/in/rafael-matheus-de-oliveira/](https://www.linkedin.com/in/rafael-matheus-de-oliveira/)

