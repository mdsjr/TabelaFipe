# Tabela Fipe

## Descrição do Projeto
O **Tabela Fipe** é uma aplicação desenvolvida em Java com o framework Spring Boot. Ela fornece uma interface para acessar e manipular informações relacionadas à tabela Fipe, permitindo ao usuário consultar preços de veículos, exibir menus interativos e gerenciar dados de forma eficiente.

## Tecnologias Utilizadas
- **Java 17**: Linguagem de programação principal.
- **Spring Boot**: Framework para desenvolvimento rápido de aplicações Java.
- **Maven**: Gerenciador de dependências e build.
- **Tabela Fipe API**: (se aplicável) Integração com APIs para obtenção de dados.

## Estrutura do Projeto

- `br.com.alura.TabelaFipe`
  - **TabelaFipeApplication.java**: Classe principal que inicializa a aplicação.
  - **Principal**: Classe responsável por exibir o menu principal e gerenciar a interação com o usuário.

## Como Executar

### Pré-requisitos
1. **Java 17** ou superior instalado.
2. **Maven** instalado para gerenciar dependências.

### Passos para execução
1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/TabelaFipe.git
   ```

2. Acesse o diretório do projeto:
   ```bash
   cd TabelaFipe
   ```

3. Compile o projeto:
   ```bash
   mvn clean install
   ```

4. Execute a aplicação:
   ```bash
   java -jar target/TabelaFipe-1.0.0.jar
   ```

5. Interaja com o menu exibido no console.

## Estrutura do Código

### Classe Principal
A classe `TabelaFipeApplication` é o ponto de entrada da aplicação. Ela utiliza o método `run` para inicializar a classe `Principal`, que gerencia o menu principal.

```java
@Override
public void run(String... args) throws Exception {
    Principal principal = new Principal();
    principal.exibeMenu();
}
```

### Menu Interativo
A funcionalidade do menu está centralizada na classe `Principal`. Ela permite ao usuário navegar pelas opções e executar ações específicas relacionadas à Tabela Fipe.

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

## Licença
Este projeto está licenciado sob a [MIT License](LICENSE).
