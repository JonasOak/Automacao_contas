---

# Automação de Login - Exemplo

Este é um projeto de automação de login usando o Selenium WebDriver e Java. O objetivo deste projeto é demonstrar como fazer login em diferentes sites automatizados, como GitHub, Avar e Sagres, usando credenciais fornecidas pelo usuário.

## Pré-requisitos

- Java JDK (8 ou superior) instalado
- Maven instalado
- Driver do Chrome instalado (localização configurada no arquivo `Heart.java`
- Lembrar de sempre manter o ChromeDriver.exe na mesma versão do Chrome
- Conhecimento básico de automação de testes e Java

## Funcionalidades

Este projeto consiste em um programa Java que realiza a automação de login em três sites diferentes:

1. **GitHub**:
   - Realiza login no GitHub usando as credenciais fornecidas pelo usuário.
   - Demonstra como preencher campos de login e senha usando o Selenium WebDriver.
   - Interage com elementos da página para enviar as informações de login.

2. **Avar**:
   - Acessa o ambiente virtual de aprendizagem (AVA) da instituição.
   - Realiza login no AVA usando as credenciais fornecidas pelo usuário.
   - Destaca o uso do Selenium para navegar em diferentes páginas e preencher formulários.

3. **Sagres**:
   - Acessa o sistema acadêmico da instituição.
   - Realiza login no Sagres usando as credenciais fornecidas pelo usuário.
   - Demonstração de interações complexas, como manipulação de elementos dentro de um iframe e resolução de desafio reCAPTCHA.

## Instruções de Uso

1. Clone este repositório para sua máquina local:

   ```bash
   git clone <https://github.com/JonasOak/Automacao_contas.git>
   ```
   ou
   ```bash
   git clone <git@github.com:JonasOak/Automacao_contas.git>
   ```

3. Configure suas credenciais:

   No diretório raiz, crie a pasta `accounts` e dentro dela um arquivo `credentials.txt`. Adicione suas informações de login e senha no formato "login,senha", conforme o exemplo abaixo:

   ```
   login1,senha1
   login2,senha2
   login3,senha3
   ```

4. Execute o programa:

   Abra o arquivo `Program.java` localizado em `src/main/java/application/` e execute a classe `Program`.

   Isso iniciará a automação de login nos sites GitHub, Avar e Sagres usando as credenciais fornecidas.
   
---
2024-01-01T00:00:00-0300 Commit 1
2024-01-01T00:00:00-0300 Commit 2
2024-01-02T00:00:00-0300 Commit 1
2024-01-02T00:00:00-0300 Commit 2
2024-01-02T00:00:00-0300 Commit 3
2024-01-02T00:00:00-0300 Commit 4
2024-01-02T00:00:00-0300 Commit 5
2024-01-03T00:00:00-0300 Commit 1
2024-01-03T00:00:00-0300 Commit 2
2024-01-03T00:00:00-0300 Commit 3
2024-01-03T00:00:00-0300 Commit 4
