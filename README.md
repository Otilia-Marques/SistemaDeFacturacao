# Bebesuki'store - Sistema de Faturação

Bem-vindo ao sistema de faturação Bebesuki'store! 
Este sistema foi desenvolvido para facilitar a gestão de vendas e faturação de uma loja de artigos diversos. 
O objetivo é proporcionar uma ferramenta eficiente e intuitiva para gerenciar produtos, clientes, pedidos e emitir faturas.

## Funcionalidades

- **Gestão de Produtos**: Adicionar, editar e remover produtos do estoque.
- **Gestão de Clientes**: Adicionar, editar e remover informações de clientes.
- **Gestão de Pedidos**: Criar e gerenciar pedidos de clientes.
- **Emissão de Faturas**: Gerar e imprimir faturas detalhadas para os pedidos realizados.
- **Relatórios**: Gerar relatórios de vendas, produtos e clientes.

## Tecnologias Utilizadas

- **Linguagem de Programação**: Java
- **Interface Gráfica**: Swing
- **Persistência de Dados**: MySQL
- **Frameworks**: Spring Boot (para serviços e segurança), MigLayout (para layout)
- **Ferramentas de Build**: Maven

## Pré-requisitos

Para executar este projeto, você precisará ter instalado:

- JDK 8 ou superior
- MySQL 5.7 ou superior
- Maven 3.6 ou superior

## Configuração do Projeto

1. Clone o repositório:
No terminal:

   git clone https://github.com/Otilia-Marques/SistemaDeFacturacao.git 
   cd SistemaDeFacturacao
   

3. Configure o banco de dados no arquivo `application.properties`:
   
   - `spring.datasource.url` = jdbc:mysql://localhost:3306/SistemaDeFacturacao 
   - `spring.datasource.username` = seu-usuario
   - `spring.datasource.password` = sua-senha
   - `spring.jpa.hibernate.ddl-auto`= update
   

4. Execute o projeto usando Maven:
   
   mvn spring-boot:run
   

## Estrutura do Projeto

  - `src/main/java/com/mycompany/sistemadefacturacao20211958/` - Pacotes principais do sistema
  - `controller` - Controladores do sistema
  - `models` - Modelos e entidades do sistema
  - `repositorio` - Repositórios para acesso a dados
  - `services` - Serviços de negócio
  - `view` - Interface gráfica (formulários e componentes)
  - `src/main/resources/` - Recursos do projeto
  - `application.properties` - Configurações do Spring Boot

## Uso

1. Inicie o sistema.
2. Faça login com suas credenciais.
3. Navegue pelos menus para gerenciar produtos, clientes e pedidos.
4. Utilize as funcionalidades de emissão de faturas e geração de relatórios conforme necessário.


*Desenvolvido por Otilia-Marques* - *2024*
