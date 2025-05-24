#  Projeto spotifei

Introdução

Este projeto consiste em um sistema  de gerenciamento de músicas e usuários, inspirado na plataforma Spotify. Desenvolvido em Java utilizando a IDE NetBeans, e com banco de dados em PostgreSQL, o sistema tem como objetivo principal a prática de CRUD (Create, Read, Update, Delete), conexão com banco de dados e criação de uma interface gráfica funcional para o usuário.

O projeto não realiza a reprodução de músicas, sendo voltado exclusivamente para o cadastro, visualização, curtir/descurtir e exclusão de músicas e usuários.

Objetivos:

-Desenvolver um sistema simples de gerenciamento de músicas.

-Praticar a integração entre Java e PostgreSQL via JDBC.

-Criar um sistema funcional com interface gráfica.

-Aplicar conceitos de banco de dados relacional.

-Trabalhar com busca, filtros e ações específicas em uma base de dados.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Funcionalidades do Sistema:

-Cadastro de Usuários:

-Os usuários podem ser cadastrados no sistema com os seguintes dados:

-Nome (campo obrigatório)

-E-mail (campo obrigatório)

-Senha (campo obrigatório)

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

-Cadastro de Músicas:

O sistema permite o cadastro de músicas com os seguintes atributos:

-Nome da música (obrigatório)

-Autor (obrigatório)

-Gênero (obrigatório)

-Lançamento (opcional)

-Duração (opcional)

Essas informações são salvas no banco de dados PostgreSQL e exibidas na interface gráfica.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Busca de Músicas:

A interface permite buscar músicas cadastradas através de três filtros:

-Buscar por nome

-Buscar por autor

-Buscar por gênero


O usuário pode digitar o critério desejado e clicar no botão correspondente para visualizar os resultados filtrados dinamicamente.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

-Ações nas Músicas:

Para cada música cadastrada, o sistema permite:

-Curtir a música (incrementa um contador de curtidas).

-Descurtir (decrementa ou zera o contador de curtidas).

-Excluir música (remove o registro do banco de dados).


Essas funcionalidades tornam a experiência mais interativa e simulam algumas das funções básicas de plataformas de streaming.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

-Tecnologias Utilizadas:

-Java SE (NetBeans IDE)

-PostgreSQL como sistema de gerenciamento de banco de dados

-pgAdmin para visualização e gerenciamento do banco
