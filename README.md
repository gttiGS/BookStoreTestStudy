# 📚 BookStoreTestStudy

Automação de testes para a aplicação Book Store usando Java, Maven e Selenium WebDriver.

## 🛠️ Tecnologias Utilizadas

- Java
- Maven
- Selenium WebDriver
- JUnit
- POM (Page Object Model)

## 📁 Estrutura do Projeto

```
automacaotestsbookstore/
├── pom.xml                       # Gerenciamento de dependências (Maven)
├── src/
│   ├── main/
│   │   └── java/com/bsautomation/Main.java
│   └── test/
│       ├── java/
│       │   ├── com/core/         # Classes base e de configuração
│       │   │   ├── BaseTest.java
│       │   │   ├── DriverFactory.java
│       │   │   └── GlobalProperty.java
│       │   ├── com/page/         # Páginas da aplicação (Page Object Model)
│       │   │   ├── LoginBSPage.java
│       │   │   └── MainBSPage.java
│       │   └── com/test/         # Casos de teste
│       │       ├── AddCartBSTest.java
│       │       └── LoginBSTest.java
│       └── resources/
│           └── environment.properties  # Configurações de ambiente
```

## 🚀 Como Executar os Testes

1. **Pré-requisitos**:
   - JDK 11 ou superior
   - Maven instalado
   - Navegador e driver correspondente (ex: chromedriver)

2. **Clone o projeto**:
   ```bash
   git clone https://github.com/gttiGS/BookStoreTestStudy.git
   ```

3. **Ajuste o arquivo `environment.properties`**:
   Defina o caminho do driver e o navegador que será utilizado:
   ```properties
   webdriver.driver = chrome
   webdriver.path = C:\caminho\para\chromedriver.exe
   ```

4. **Execute os testes**:
   ```bash
   mvn test
   ```

## ✅ Funcionalidades Testadas

- Login na aplicação
- Adição de itens ao carrinho
- Validações de elementos na página principal

## ✍️ Autor

Gustavo Supranzetti – [@gttiGS](https://github.com/gttiGS)
