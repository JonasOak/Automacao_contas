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
2024-01-03T00:00:00-0300 Commit 5
2024-01-03T00:00:00-0300 Commit 6
2024-01-03T00:00:00-0300 Commit 7
2024-01-04T00:00:00-0300 Commit 1
2024-01-04T00:00:00-0300 Commit 2
2024-01-04T00:00:00-0300 Commit 3
2024-01-04T00:00:00-0300 Commit 4
2024-01-04T00:00:00-0300 Commit 5
2024-01-04T00:00:00-0300 Commit 6
2024-01-04T00:00:00-0300 Commit 7
2024-01-04T00:00:00-0300 Commit 8
2024-01-04T00:00:00-0300 Commit 9
2024-01-04T00:00:00-0300 Commit 10
2024-01-05T00:00:00-0300 Commit 1
2024-01-05T00:00:00-0300 Commit 2
2024-01-05T00:00:00-0300 Commit 3
2024-01-06T00:00:00-0300 Commit 1
2024-01-06T00:00:00-0300 Commit 2
2024-01-06T00:00:00-0300 Commit 3
2024-01-07T00:00:00-0300 Commit 1
2024-01-07T00:00:00-0300 Commit 2
2024-01-07T00:00:00-0300 Commit 3
2024-01-07T00:00:00-0300 Commit 4
2024-01-07T00:00:00-0300 Commit 5
2024-01-07T00:00:00-0300 Commit 6
2024-01-07T00:00:00-0300 Commit 7
2024-01-08T00:00:00-0300 Commit 1
2024-01-09T00:00:00-0300 Commit 1
2024-01-09T00:00:00-0300 Commit 2
2024-01-09T00:00:00-0300 Commit 3
2024-01-09T00:00:00-0300 Commit 4
2024-01-09T00:00:00-0300 Commit 5
2024-01-10T00:00:00-0300 Commit 1
2024-01-10T00:00:00-0300 Commit 2
2024-01-10T00:00:00-0300 Commit 3
2024-01-10T00:00:00-0300 Commit 4
2024-01-10T00:00:00-0300 Commit 5
2024-01-11T00:00:00-0300 Commit 1
2024-01-11T00:00:00-0300 Commit 2
2024-01-11T00:00:00-0300 Commit 3
2024-01-11T00:00:00-0300 Commit 4
2024-01-12T00:00:00-0300 Commit 1
2024-01-12T00:00:00-0300 Commit 2
2024-01-12T00:00:00-0300 Commit 3
2024-01-12T00:00:00-0300 Commit 4
2024-01-12T00:00:00-0300 Commit 5
2024-01-13T00:00:00-0300 Commit 1
2024-01-13T00:00:00-0300 Commit 2
2024-01-13T00:00:00-0300 Commit 3
2024-01-13T00:00:00-0300 Commit 4
2024-01-13T00:00:00-0300 Commit 5
2024-01-14T00:00:00-0300 Commit 1
2024-01-14T00:00:00-0300 Commit 2
2024-01-14T00:00:00-0300 Commit 3
2024-01-14T00:00:00-0300 Commit 4
2024-01-14T00:00:00-0300 Commit 5
2024-01-14T00:00:00-0300 Commit 6
2024-01-15T00:00:00-0300 Commit 1
2024-01-15T00:00:00-0300 Commit 2
2024-01-15T00:00:00-0300 Commit 3
2024-01-15T00:00:00-0300 Commit 4
2024-01-15T00:00:00-0300 Commit 5
2024-01-15T00:00:00-0300 Commit 6
2024-01-15T00:00:00-0300 Commit 7
2024-01-15T00:00:00-0300 Commit 8
2024-01-16T00:00:00-0300 Commit 1
2024-01-16T00:00:00-0300 Commit 2
2024-01-16T00:00:00-0300 Commit 3
2024-01-16T00:00:00-0300 Commit 4
2024-01-16T00:00:00-0300 Commit 5
2024-01-16T00:00:00-0300 Commit 6
2024-01-16T00:00:00-0300 Commit 7
2024-01-16T00:00:00-0300 Commit 8
2024-01-16T00:00:00-0300 Commit 9
2024-01-17T00:00:00-0300 Commit 1
2024-01-17T00:00:00-0300 Commit 2
2024-01-17T00:00:00-0300 Commit 3
2024-01-17T00:00:00-0300 Commit 4
2024-01-17T00:00:00-0300 Commit 5
2024-01-17T00:00:00-0300 Commit 6
2024-01-17T00:00:00-0300 Commit 7
2024-01-17T00:00:00-0300 Commit 8
2024-01-17T00:00:00-0300 Commit 9
2024-01-17T00:00:00-0300 Commit 10
2024-01-18T00:00:00-0300 Commit 1
2024-01-18T00:00:00-0300 Commit 2
2024-01-18T00:00:00-0300 Commit 3
2024-01-18T00:00:00-0300 Commit 4
2024-01-18T00:00:00-0300 Commit 5
2024-01-18T00:00:00-0300 Commit 6
2024-01-18T00:00:00-0300 Commit 7
2024-01-19T00:00:00-0300 Commit 1
2024-01-19T00:00:00-0300 Commit 2
2024-01-19T00:00:00-0300 Commit 3
2024-01-19T00:00:00-0300 Commit 4
2024-01-20T00:00:00-0300 Commit 1
2024-01-20T00:00:00-0300 Commit 2
2024-01-20T00:00:00-0300 Commit 3
2024-01-20T00:00:00-0300 Commit 4
2024-01-20T00:00:00-0300 Commit 5
2024-01-20T00:00:00-0300 Commit 6
2024-01-20T00:00:00-0300 Commit 7
2024-01-20T00:00:00-0300 Commit 8
2024-01-20T00:00:00-0300 Commit 9
2024-01-21T00:00:00-0300 Commit 1
2024-01-21T00:00:00-0300 Commit 2
2024-01-21T00:00:00-0300 Commit 3
2024-01-21T00:00:00-0300 Commit 4
2024-01-21T00:00:00-0300 Commit 5
2024-01-21T00:00:00-0300 Commit 6
2024-01-21T00:00:00-0300 Commit 7
2024-01-21T00:00:00-0300 Commit 8
2024-01-21T00:00:00-0300 Commit 9
2024-01-21T00:00:00-0300 Commit 10
2024-01-22T00:00:00-0300 Commit 1
2024-01-22T00:00:00-0300 Commit 2
2024-01-23T00:00:00-0300 Commit 1
2024-01-23T00:00:00-0300 Commit 2
2024-01-23T00:00:00-0300 Commit 3
2024-01-23T00:00:00-0300 Commit 4
2024-01-23T00:00:00-0300 Commit 5
2024-01-24T00:00:00-0300 Commit 1
2024-01-25T00:00:00-0300 Commit 1
2024-01-25T00:00:00-0300 Commit 2
2024-01-25T00:00:00-0300 Commit 3
2024-01-25T00:00:00-0300 Commit 4
2024-01-25T00:00:00-0300 Commit 5
2024-01-25T00:00:00-0300 Commit 6
2024-01-25T00:00:00-0300 Commit 7
2024-01-26T00:00:00-0300 Commit 1
2024-01-26T00:00:00-0300 Commit 2
2024-01-26T00:00:00-0300 Commit 3
2024-01-26T00:00:00-0300 Commit 4
2024-01-26T00:00:00-0300 Commit 5
2024-01-26T00:00:00-0300 Commit 6
2024-01-26T00:00:00-0300 Commit 7
2024-01-26T00:00:00-0300 Commit 8
2024-01-27T00:00:00-0300 Commit 1
2024-01-27T00:00:00-0300 Commit 2
2024-01-27T00:00:00-0300 Commit 3
2024-01-27T00:00:00-0300 Commit 4
2024-01-27T00:00:00-0300 Commit 5
2024-01-27T00:00:00-0300 Commit 6
2024-01-28T00:00:00-0300 Commit 1
2024-01-28T00:00:00-0300 Commit 2
2024-01-28T00:00:00-0300 Commit 3
2024-01-28T00:00:00-0300 Commit 4
2024-01-28T00:00:00-0300 Commit 5
2024-01-28T00:00:00-0300 Commit 6
2024-01-28T00:00:00-0300 Commit 7
2024-01-28T00:00:00-0300 Commit 8
2024-01-28T00:00:00-0300 Commit 9
2024-01-28T00:00:00-0300 Commit 10
2024-01-29T00:00:00-0300 Commit 1
2024-01-30T00:00:00-0300 Commit 1
2024-01-30T00:00:00-0300 Commit 2
2024-01-30T00:00:00-0300 Commit 3
2024-01-30T00:00:00-0300 Commit 4
2024-01-30T00:00:00-0300 Commit 5
2024-01-30T00:00:00-0300 Commit 6
2024-01-30T00:00:00-0300 Commit 7
2024-01-30T00:00:00-0300 Commit 8
2024-01-30T00:00:00-0300 Commit 9
2024-01-30T00:00:00-0300 Commit 10
2024-01-31T00:00:00-0300 Commit 1
2024-01-31T00:00:00-0300 Commit 2
2024-01-31T00:00:00-0300 Commit 3
2024-02-01T00:00:00-0300 Commit 1
2024-02-01T00:00:00-0300 Commit 2
Modificação feita em 2024-02-01T00:00:00-0300
Modificação feita em 2024-02-02T00:00:00-0300
Modificação feita em 2024-02-03T00:00:00-0300
Modificação feita em 2024-02-04T00:00:00-0300
Modificação feita em 2024-02-05T00:00:00-0300
Modificação feita em 2024-02-06T00:00:00-0300
Modificação feita em 2024-02-07T00:00:00-0300
Modificação feita em 2024-02-08T00:00:00-0300
Modificação feita em 2024-02-09T00:00:00-0300
Modificação feita em 2024-02-10T00:00:00-0300
Modificação feita em 2024-02-11T00:00:00-0300
Modificação feita em 2024-02-12T00:00:00-0300
Modificação feita em 2024-02-13T00:00:00-0300
Modificação feita em 2024-02-14T00:00:00-0300
Modificação feita em 2024-02-15T00:00:00-0300
Modificação feita em 2024-02-16T00:00:00-0300
Modificação feita em 2024-02-17T00:00:00-0300
Modificação feita em 2024-02-18T00:00:00-0300
Modificação feita em 2024-02-19T00:00:00-0300
Modificação feita em 2024-02-20T00:00:00-0300
Modificação feita em 2024-02-21T00:00:00-0300
Modificação feita em 2024-02-22T00:00:00-0300
Modificação feita em 2024-02-23T00:00:00-0300
Modificação feita em 2024-02-24T00:00:00-0300
Modificação feita em 2024-02-25T00:00:00-0300
Modificação feita em 2024-02-01T00:00:00-0300
Modificação feita em 2024-02-02T00:00:00-0300
Modificação feita em 2024-02-03T00:00:00-0300
Modificação feita em 2024-02-04T00:00:00-0300
Modificação feita em 2024-02-05T00:00:00-0300
Modificação feita em 2024-02-06T00:00:00-0300
Modificação feita em 2024-02-07T00:00:00-0300
Modificação feita em 2024-02-08T00:00:00-0300
Modificação feita em 2024-02-09T00:00:00-0300
Modificação feita em 2024-02-10T00:00:00-0300
Modificação feita em 2024-02-11T00:00:00-0300
Modificação feita em 2024-02-12T00:00:00-0300
Modificação feita em 2024-02-13T00:00:00-0300
Modificação feita em 2024-02-14T00:00:00-0300
Modificação feita em 2024-02-15T00:00:00-0300
Modificação feita em 2024-02-16T00:00:00-0300
Modificação feita em 2024-02-17T00:00:00-0300
Modificação feita em 2024-02-18T00:00:00-0300
Modificação feita em 2024-02-19T00:00:00-0300
Modificação feita em 2024-02-20T00:00:00-0300
Modificação feita em 2024-02-21T00:00:00-0300
Modificação feita em 2024-02-22T00:00:00-0300
Modificação feita em 2024-02-23T00:00:00-0300
Modificação feita em 2024-02-24T00:00:00-0300
Modificação feita em 2024-02-25T00:00:00-0300
Modificação feita em 2024-02-26T00:00:00-0300
Modificação feita em 2024-02-27T00:00:00-0300
Modificação feita em 2024-02-28T00:00:00-0300
Modificação feita em 2024-02-29T00:00:00-0300
Modificação feita em 2024-03-01T00:00:00-0300
Modificação feita em 2024-03-02T00:00:00-0300
Modificação feita em 2024-03-03T00:00:00-0300
Modificação feita em 2024-03-04T00:00:00-0300
Modificação feita em 2024-03-05T00:00:00-0300
Modificação feita em 2024-03-06T00:00:00-0300
Modificação feita em 2024-03-07T00:00:00-0300
Modificação feita em 2024-03-08T00:00:00-0300
Modificação feita em 2024-03-09T00:00:00-0300
Modificação feita em 2024-03-10T00:00:00-0300
Modificação feita em 2024-03-11T00:00:00-0300
Modificação feita em 2024-03-12T00:00:00-0300
Modificação feita em 2024-03-13T00:00:00-0300
Modificação feita em 2024-03-14T00:00:00-0300
Modificação feita em 2024-03-15T00:00:00-0300
Modificação feita em 2024-03-16T00:00:00-0300
Modificação feita em 2024-03-17T00:00:00-0300
Modificação feita em 2024-03-18T00:00:00-0300
Modificação feita em 2024-03-19T00:00:00-0300
Modificação feita em 2024-03-20T00:00:00-0300
Modificação feita em 2024-03-21T00:00:00-0300
Modificação feita em 2024-03-22T00:00:00-0300
Modificação feita em 2024-03-23T00:00:00-0300
Modificação feita em 2024-03-24T00:00:00-0300
Modificação feita em 2024-03-25T00:00:00-0300
Modificação feita em 2024-03-26T00:00:00-0300
Modificação feita em 2024-03-27T00:00:00-0300
Modificação feita em 2024-03-28T00:00:00-0300
Modificação feita em 2024-03-29T00:00:00-0300
Modificação feita em 2024-03-30T00:00:00-0300
Modificação feita em 2024-03-31T00:00:00-0300
Modificação feita em 2024-04-01T00:00:00-0300
Modificação feita em 2024-04-02T00:00:00-0300
Modificação feita em 2024-04-03T00:00:00-0300
Modificação feita em 2024-04-04T00:00:00-0300
Modificação feita em 2024-04-05T00:00:00-0300
Modificação feita em 2024-04-06T00:00:00-0300
Modificação feita em 2024-04-07T00:00:00-0300
Modificação feita em 2024-04-08T00:00:00-0300
Modificação feita em 2024-04-09T00:00:00-0300
Modificação feita em 2024-04-10T00:00:00-0300
Modificação feita em 2024-04-11T00:00:00-0300
Modificação feita em 2024-04-12T00:00:00-0300
Modificação feita em 2024-04-13T00:00:00-0300
Modificação feita em 2024-04-14T00:00:00-0300
Modificação feita em 2024-04-15T00:00:00-0300
Modificação feita em 2024-04-16T00:00:00-0300
Modificação feita em 2024-04-17T00:00:00-0300
Modificação feita em 2024-04-18T00:00:00-0300
Modificação feita em 2024-04-19T00:00:00-0300
Modificação feita em 2024-04-20T00:00:00-0300
Modificação feita em 2024-04-21T00:00:00-0300
Modificação feita em 2024-04-22T00:00:00-0300
Modificação feita em 2024-04-23T00:00:00-0300
Modificação feita em 2024-04-24T00:00:00-0300
Modificação feita em 2024-04-25T00:00:00-0300
Modificação feita em 2024-04-26T00:00:00-0300
Modificação feita em 2024-04-27T00:00:00-0300
Modificação feita em 2024-04-28T00:00:00-0300
Modificação feita em 2024-04-29T00:00:00-0300
Modificação feita em 2024-04-30T00:00:00-0300
Modificação feita em 2024-05-01T00:00:00-0300
Modificação feita em 2024-05-02T00:00:00-0300
Modificação feita em 2024-05-03T00:00:00-0300
Modificação feita em 2024-05-04T00:00:00-0300
Modificação feita em 2024-05-05T00:00:00-0300
Modificação feita em 2024-05-06T00:00:00-0300
Modificação feita em 2024-05-07T00:00:00-0300
Modificação feita em 2024-05-08T00:00:00-0300
Modificação feita em 2024-05-09T00:00:00-0300
Modificação feita em 2024-05-10T00:00:00-0300
Modificação feita em 2024-05-11T00:00:00-0300
Modificação feita em 2024-05-12T00:00:00-0300
Modificação feita em 2024-05-13T00:00:00-0300
Modificação feita em 2024-05-14T00:00:00-0300
Modificação feita em 2024-05-15T00:00:00-0300
Modificação feita em 2024-05-16T00:00:00-0300
Modificação feita em 2024-05-17T00:00:00-0300
Modificação feita em 2024-05-18T00:00:00-0300
Modificação feita em 2024-05-19T00:00:00-0300
Modificação feita em 2024-05-20T00:00:00-0300
Modificação feita em 2024-05-21T00:00:00-0300
Modificação feita em 2024-05-22T00:00:00-0300
Modificação feita em 2024-05-23T00:00:00-0300
Modificação feita em 2024-05-24T00:00:00-0300
Modificação feita em 2024-05-25T00:00:00-0300
Modificação feita em 2024-05-26T00:00:00-0300
Modificação feita em 2024-05-27T00:00:00-0300
Modificação feita em 2024-05-28T00:00:00-0300
Modificação feita em 2024-05-29T00:00:00-0300
Modificação feita em 2024-05-30T00:00:00-0300
Modificação feita em 2024-05-31T00:00:00-0300
Modificação feita em 2024-06-01T00:00:00-0300
Modificação feita em 2024-06-02T00:00:00-0300
Modificação feita em 2024-06-03T00:00:00-0300
Modificação feita em 2024-06-04T00:00:00-0300
Modificação feita em 2024-06-05T00:00:00-0300
Modificação feita em 2024-06-06T00:00:00-0300
Modificação feita em 2024-06-07T00:00:00-0300
Modificação feita em 2024-06-08T00:00:00-0300
Modificação feita em 2024-06-09T00:00:00-0300
Modificação feita em 2024-06-10T00:00:00-0300
Modificação feita em 2024-06-11T00:00:00-0300
Modificação feita em 2024-06-12T00:00:00-0300
Modificação feita em 2024-06-13T00:00:00-0300
Modificação feita em 2024-06-14T00:00:00-0300
Modificação feita em 2024-06-15T00:00:00-0300
Modificação feita em 2024-06-16T00:00:00-0300
Modificação feita em 2024-06-17T00:00:00-0300
Modificação feita em 2024-06-18T00:00:00-0300
Modificação feita em 2024-06-19T00:00:00-0300
Modificação feita em 2024-06-20T00:00:00-0300
Modificação feita em 2024-06-21T00:00:00-0300
Modificação feita em 2024-06-22T00:00:00-0300
Modificação feita em 2024-06-23T00:00:00-0300
Modificação feita em 2024-06-24T00:00:00-0300
Modificação feita em 2024-06-25T00:00:00-0300
Modificação feita em 2024-06-26T00:00:00-0300
Modificação feita em 2024-06-27T00:00:00-0300
Modificação feita em 2024-06-28T00:00:00-0300
Modificação feita em 2024-06-29T00:00:00-0300
Modificação feita em 2024-06-30T00:00:00-0300
Modificação feita em 2024-07-01T00:00:00-0300
Modificação feita em 2024-07-02T00:00:00-0300
Modificação feita em 2024-07-03T00:00:00-0300
Modificação feita em 2024-07-04T00:00:00-0300
Modificação feita em 2024-07-05T00:00:00-0300
Modificação feita em 2024-07-06T00:00:00-0300
Modificação feita em 2024-07-07T00:00:00-0300
Modificação feita em 2024-07-08T00:00:00-0300
Modificação feita em 2024-07-09T00:00:00-0300
Modificação feita em 2024-07-10T00:00:00-0300
Modificação feita em 2024-07-11T00:00:00-0300
Modificação feita em 2024-07-12T00:00:00-0300
Modificação feita em 2024-07-13T00:00:00-0300
Modificação feita em 2024-07-14T00:00:00-0300
Modificação feita em 2024-07-15T00:00:00-0300
Modificação feita em 2024-07-16T00:00:00-0300
Modificação feita em 2024-07-17T00:00:00-0300
Modificação feita em 2024-07-18T00:00:00-0300
Modificação feita em 2024-07-19T00:00:00-0300
Modificação feita em 2024-07-20T00:00:00-0300
Modificação feita em 2024-07-21T00:00:00-0300
Modificação feita em 2024-07-22T00:00:00-0300
Modificação feita em 2024-07-23T00:00:00-0300
Modificação feita em 2024-07-24T00:00:00-0300
Modificação feita em 2024-07-25T00:00:00-0300
Modificação feita em 2024-07-26T00:00:00-0300
Modificação feita em 2024-07-27T00:00:00-0300
Modificação feita em 2024-07-28T00:00:00-0300
Modificação feita em 2024-07-29T00:00:00-0300
Modificação feita em 2024-07-30T00:00:00-0300
Modificação feita em 2024-07-31T00:00:00-0300
Modificação feita em 2024-08-01T00:00:00-0300
Modificação feita em 2024-08-02T00:00:00-0300
Modificação feita em 2024-08-03T00:00:00-0300
Modificação feita em 2024-08-04T00:00:00-0300
Modificação feita em 2024-08-05T00:00:00-0300
Modificação feita em 2024-08-06T00:00:00-0300
Modificação feita em 2024-08-07T00:00:00-0300
Modificação feita em 2024-08-08T00:00:00-0300
Modificação feita em 2024-08-09T00:00:00-0300
Modificação feita em 2024-08-10T00:00:00-0300
Modificação feita em 2024-08-11T00:00:00-0300
Modificação feita em 2024-08-12T00:00:00-0300
Modificação feita em 2024-08-13T00:00:00-0300
Modificação feita em 2024-08-14T00:00:00-0300
Modificação feita em 2024-08-15T00:00:00-0300
Modificação feita em 2024-08-16T00:00:00-0300
Modificação feita em 2024-08-17T00:00:00-0300
Modificação feita em 2024-08-18T00:00:00-0300
Modificação feita em 2024-08-19T00:00:00-0300
Modificação feita em 2024-08-20T00:00:00-0300
Modificação feita em 2024-08-21T00:00:00-0300
Modificação feita em 2024-08-22T00:00:00-0300
Modificação feita em 2024-08-23T00:00:00-0300
Modificação feita em 2024-08-24T00:00:00-0300
Modificação feita em 2024-08-25T00:00:00-0300
Modificação feita em 2024-08-26T00:00:00-0300
Modificação feita em 2024-08-27T00:00:00-0300
Modificação feita em 2024-08-28T00:00:00-0300
Modificação feita em 2024-08-29T00:00:00-0300
Modificação feita em 2024-08-30T00:00:00-0300
Modificação feita em 2024-08-31T00:00:00-0300
Modificação feita em 2024-09-01T00:00:00-0300
Modificação feita em 2024-09-02T00:00:00-0300
Modificação feita em 2024-09-03T00:00:00-0300
Modificação feita em 2024-09-04T00:00:00-0300
Modificação feita em 2024-09-05T00:00:00-0300
Modificação feita em 2024-09-06T00:00:00-0300
Modificação feita em 2024-09-07T00:00:00-0300
Modificação feita em 2024-09-08T00:00:00-0300
Modificação feita em 2024-09-09T00:00:00-0300
Modificação feita em 2024-09-10T00:00:00-0300
Modificação feita em 2024-09-11T00:00:00-0300
Modificação feita em 2024-09-12T00:00:00-0300
Modificação feita em 2024-09-13T00:00:00-0300
Modificação feita em 2024-09-14T00:00:00-0300
Modificação feita em 2024-09-15T00:00:00-0300
Modificação feita em 2024-09-16T00:00:00-0300
Modificação feita em 2024-09-17T00:00:00-0300
Modificação feita em 2024-09-18T00:00:00-0300
Modificação feita em 2024-09-19T00:00:00-0300
Modificação feita em 2024-09-20T00:00:00-0300
Modificação feita em 2024-09-21T00:00:00-0300
Modificação feita em 2024-09-22T00:00:00-0300
Modificação feita em 2024-09-23T00:00:00-0300
Modificação feita em 2024-09-24T00:00:00-0300
Modificação feita em 2024-09-25T00:00:00-0300
Modificação feita em 2024-09-26T00:00:00-0300
Modificação feita em 2024-09-27T00:00:00-0300
Modificação feita em 2024-09-28T00:00:00-0300
Modificação feita em 2024-09-29T00:00:00-0300
Modificação feita em 2024-09-30T00:00:00-0300
Modificação feita em 2024-10-01T00:00:00-0300
Modificação feita em 2024-10-02T00:00:00-0300
Modificação feita em 2024-10-03T00:00:00-0300
Modificação feita em 2024-10-04T00:00:00-0300
Modificação feita em 2024-10-05T00:00:00-0300
Modificação feita em 2024-10-06T00:00:00-0300
Modificação feita em 2024-10-07T00:00:00-0300
Modificação feita em 2024-10-08T00:00:00-0300
Modificação feita em 2024-10-09T00:00:00-0300
Modificação feita em 2024-10-10T00:00:00-0300
Modificação feita em 2024-10-11T00:00:00-0300
Modificação feita em 2024-10-12T00:00:00-0300
Modificação feita em 2024-10-13T00:00:00-0300
Modificação feita em 2024-10-14T00:00:00-0300
Modificação feita em 2024-10-15T00:00:00-0300
Modificação feita em 2024-10-16T00:00:00-0300
Modificação feita em 2024-10-17T00:00:00-0300
Modificação feita em 2024-10-18T00:00:00-0300
Modificação feita em 2024-10-19T00:00:00-0300
Modificação feita em 2024-10-20T00:00:00-0300
Modificação feita em 2024-10-21T00:00:00-0300
Modificação feita em 2024-10-22T00:00:00-0300
Modificação feita em 2024-10-23T00:00:00-0300
Modificação feita em 2024-10-24T00:00:00-0300
Modificação feita em 2024-10-25T00:00:00-0300
Modificação feita em 2024-10-26T00:00:00-0300
Modificação feita em 2024-10-27T00:00:00-0300
Modificação feita em 2024-10-28T00:00:00-0300
Modificação feita em 2024-10-29T00:00:00-0300
Modificação feita em 2024-10-30T00:00:00-0300
Modificação feita em 2024-10-31T00:00:00-0300
Modificação feita em 2024-11-01T00:00:00-0300
Modificação feita em 2024-11-02T00:00:00-0300
Modificação feita em 2024-11-03T00:00:00-0300
Modificação feita em 2024-11-04T00:00:00-0300
Modificação feita em 2024-11-05T00:00:00-0300
Modificação feita em 2024-11-06T00:00:00-0300
Modificação feita em 2024-11-07T00:00:00-0300
Modificação feita em 2024-11-08T00:00:00-0300
Modificação feita em 2024-11-09T00:00:00-0300
Modificação feita em 2024-11-10T00:00:00-0300
Modificação feita em 2024-11-11T00:00:00-0300
Modificação feita em 2024-11-12T00:00:00-0300
Modificação feita em 2024-11-13T00:00:00-0300
Modificação feita em 2024-11-14T00:00:00-0300
Modificação feita em 2024-11-15T00:00:00-0300
Modificação feita em 2024-11-16T00:00:00-0300
Modificação feita em 2024-11-17T00:00:00-0300
Modificação feita em 2024-11-18T00:00:00-0300
Modificação feita em 2024-11-19T00:00:00-0300
Modificação feita em 2024-11-20T00:00:00-0300
Modificação feita em 2024-11-21T00:00:00-0300
Modificação feita em 2024-11-22T00:00:00-0300
Modificação feita em 2024-11-23T00:00:00-0300
Modificação feita em 2024-11-24T00:00:00-0300
Modificação feita em 2024-11-25T00:00:00-0300
Modificação feita em 2024-11-26T00:00:00-0300
Modificação feita em 2024-11-27T00:00:00-0300
Modificação feita em 2024-11-28T00:00:00-0300
Modificação feita em 2024-11-29T00:00:00-0300
Modificação feita em 2024-11-30T00:00:00-0300
Modificação feita em 2024-12-01T00:00:00-0300
Modificação feita em 2024-12-02T00:00:00-0300
Modificação feita em 2024-12-03T00:00:00-0300
Modificação feita em 2024-12-04T00:00:00-0300
Modificação feita em 2024-12-05T00:00:00-0300
Modificação feita em 2024-12-06T00:00:00-0300
Modificação feita em 2024-12-07T00:00:00-0300
Modificação feita em 2024-12-08T00:00:00-0300
Modificação feita em 2024-12-09T00:00:00-0300
Modificação feita em 2024-12-10T00:00:00-0300
Modificação feita em 2024-12-11T00:00:00-0300
Modificação feita em 2024-12-12T00:00:00-0300
Modificação feita em 2024-12-13T00:00:00-0300
Modificação feita em 2024-12-14T00:00:00-0300
Modificação feita em 2024-12-15T00:00:00-0300
Modificação feita em 2024-12-16T00:00:00-0300
Modificação feita em 2024-12-17T00:00:00-0300
Modificação feita em 2024-12-18T00:00:00-0300
Modificação feita em 2024-12-19T00:00:00-0300
Modificação feita em 2024-12-20T00:00:00-0300
Modificação feita em 2024-12-21T00:00:00-0300
Modificação feita em 2024-12-22T00:00:00-0300
Modificação feita em 2024-12-23T00:00:00-0300
Modificação feita em 2024-12-24T00:00:00-0300
Modificação feita em 2024-12-25T00:00:00-0300
Modificação feita em 2024-12-26T00:00:00-0300
Modificação feita em 2024-12-27T00:00:00-0300
Modificação feita em 2024-12-28T00:00:00-0300
Modificação feita em 2024-12-29T00:00:00-0300
Modificação feita em 2024-12-30T00:00:00-0300
Modificação feita em 2024-12-31T00:00:00-0300
Modificação feita em 2025-01-01T00:00:00-0300
Modificação feita em 2025-01-02T00:00:00-0300
Modificação feita em 2025-01-03T00:00:00-0300
Modificação feita em 2025-01-04T00:00:00-0300
Modificação feita em 2025-01-05T00:00:00-0300
Modificação feita em 2025-01-06T00:00:00-0300
Modificação feita em 2025-01-07T00:00:00-0300
Modificação feita em 2025-01-08T00:00:00-0300
Modificação feita em 2025-01-09T00:00:00-0300
Modificação feita em 2025-01-10T00:00:00-0300
Modificação feita em 2025-01-11T00:00:00-0300
Modificação feita em 2025-01-12T00:00:00-0300
Modificação feita em 2025-01-13T00:00:00-0300
Modificação feita em 2025-01-14T00:00:00-0300
Modificação feita em 2025-01-15T00:00:00-0300
Modificação feita em 2025-01-16T00:00:00-0300
Modificação feita em 2025-01-17T00:00:00-0300
Modificação feita em 2025-01-18T00:00:00-0300
Modificação feita em 2025-01-19T00:00:00-0300
Modificação feita em 2025-01-20T00:00:00-0300
Modificação feita em 2025-01-21T00:00:00-0300
Modificação feita em 2025-01-22T00:00:00-0300
Modificação feita em 2025-01-23T00:00:00-0300
Modificação feita em 2025-01-24T00:00:00-0300
Modificação feita em 2025-01-25T00:00:00-0300
Modificação feita em 2025-01-26T00:00:00-0300
Modificação feita em 2025-01-27T00:00:00-0300
Modificação feita em 2025-01-28T00:00:00-0300
Modificação feita em 2025-01-29T00:00:00-0300
Modificação feita em 2025-01-30T00:00:00-0300
Modificação feita em 2025-01-31T00:00:00-0300
Modificação feita em 2025-02-01T00:00:00-0300
Modificação feita em 2024-02-01T00:00:00-0300
Modificação feita em 2024-02-02T00:00:00-0300
Modificação feita em 2024-02-03T00:00:00-0300
Modificação feita em 2024-02-04T00:00:00-0300
Modificação feita em 2024-02-05T00:00:00-0300
Modificação feita em 2024-02-06T00:00:00-0300
Modificação feita em 2024-02-07T00:00:00-0300
Modificação feita em 2024-02-08T00:00:00-0300
Modificação feita em 2024-02-09T00:00:00-0300
Modificação feita em 2024-02-10T00:00:00-0300
Modificação feita em 2024-02-11T00:00:00-0300
Modificação feita em 2024-02-12T00:00:00-0300
Modificação feita em 2024-02-13T00:00:00-0300
Modificação feita em 2024-02-14T00:00:00-0300
Modificação feita em 2024-02-15T00:00:00-0300
Modificação feita em 2024-02-16T00:00:00-0300
Modificação feita em 2024-02-17T00:00:00-0300
Modificação feita em 2024-02-18T00:00:00-0300
Modificação feita em 2024-02-19T00:00:00-0300
Modificação feita em 2024-02-20T00:00:00-0300
Modificação feita em 2024-02-21T00:00:00-0300
Modificação feita em 2024-02-22T00:00:00-0300
Modificação feita em 2024-02-23T00:00:00-0300
Modificação feita em 2024-02-24T00:00:00-0300
Modificação feita em 2024-02-25T00:00:00-0300
Modificação feita em 2024-02-26T00:00:00-0300
Modificação feita em 2024-02-27T00:00:00-0300
Modificação feita em 2024-02-28T00:00:00-0300
Modificação feita em 2024-02-29T00:00:00-0300
Modificação feita em 2024-03-01T00:00:00-0300
Modificação feita em 2024-03-02T00:00:00-0300
Modificação feita em 2024-03-03T00:00:00-0300
Modificação feita em 2024-03-04T00:00:00-0300
Modificação feita em 2024-03-05T00:00:00-0300
Modificação feita em 2024-03-06T00:00:00-0300
Modificação feita em 2024-03-07T00:00:00-0300
Modificação feita em 2024-03-08T00:00:00-0300
Modificação feita em 2024-03-09T00:00:00-0300
Modificação feita em 2024-03-10T00:00:00-0300
Modificação feita em 2024-03-11T00:00:00-0300
Modificação feita em 2024-03-12T00:00:00-0300
Modificação feita em 2024-03-13T00:00:00-0300
Modificação feita em 2024-03-14T00:00:00-0300
Modificação feita em 2024-03-15T00:00:00-0300
Modificação feita em 2024-03-16T00:00:00-0300
Modificação feita em 2024-03-17T00:00:00-0300
Modificação feita em 2024-03-18T00:00:00-0300
Modificação feita em 2024-03-19T00:00:00-0300
Modificação feita em 2024-03-20T00:00:00-0300
Modificação feita em 2024-03-21T00:00:00-0300
Modificação feita em 2024-03-22T00:00:00-0300
Modificação feita em 2024-03-23T00:00:00-0300
Modificação feita em 2024-03-24T00:00:00-0300
Modificação feita em 2024-03-25T00:00:00-0300
Modificação feita em 2024-03-26T00:00:00-0300
Modificação feita em 2024-03-27T00:00:00-0300
Modificação feita em 2024-03-28T00:00:00-0300
Modificação feita em 2024-03-29T00:00:00-0300
Modificação feita em 2024-02-01T00:00:00-0300 - Commit 1
Modificação feita em 2024-02-01T00:00:00-0300 - Commit 2
Modificação feita em 2024-02-01T00:00:00-0300 - Commit 3
Modificação feita em 2024-02-01T00:00:00-0300 - Commit 4
Modificação feita em 2024-02-01T00:00:00-0300 - Commit 5
Modificação feita em 2024-02-01T00:00:00-0300 - Commit 6
Modificação feita em 2024-02-02T00:00:00-0300 - Commit 1
Modificação feita em 2024-02-03T00:00:00-0300 - Commit 1
Modificação feita em 2024-02-03T00:00:00-0300 - Commit 2
