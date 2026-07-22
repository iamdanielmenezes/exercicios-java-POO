## Descrição

Projeto desenvolvido para praticar o acesso a banco de dados utilizando JDBC e o padrão de projeto DAO (Data Access Object).

O sistema realiza operações de **CRUD (Create, Read, Update e Delete)** para as entidades **Seller** e **Department**, utilizando uma camada de acesso a dados responsável por encapsular toda a comunicação com o banco de dados.

Durante o desenvolvimento, a implementação da entidade **Seller** (incluindo `SellerDaoJDBC`) foi realizada acompanhando o curso. Como forma de consolidar o aprendizado, toda a implementação da entidade **Department**, incluindo a classe `DepartmentDaoJDBC` e o `Program2` responsável pelos testes das operações, foi desenvolvida de forma independente, aplicando os mesmos conceitos estudados.

As operações implementadas incluem:

- Buscar registro por ID
- Buscar todos os registros
- Inserir novos registros
- Atualizar registros existentes
- Remover registros
- Recuperação automática do ID gerado pelo banco de dados

## Conceitos praticados

- JDBC (Java Database Connectivity)
- Padrão de projeto DAO (Data Access Object)
- Separação entre regras de negócio e acesso a dados
- Interfaces e implementação de DAOs
- Factory Method (`DaoFactory`)
- CRUD completo em banco de dados
- PreparedStatement
- ResultSet
- Tratamento de exceções (`SQLException`)
- Encapsulamento da conexão com banco de dados
- Organização em camadas
- Manipulação de entidades relacionadas ao banco de dados

## Objetivo

Praticar o desenvolvimento de uma camada de acesso a dados utilizando JDBC e o padrão DAO, compreendendo como organizar aplicações em camadas e realizar operações de persistência de forma desacoplada da lógica de negócio.
