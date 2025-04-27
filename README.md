# PrjUniSaoJose
Trabalho de conclusão de curso
# Projeto: Atlas Imobiliária

![Feito com ❤️ em JavaEE](https://img.shields.io/badge/Feito%20com-JavaEE-red?style=for-the-badge&logo=java)

Este projeto é parte do Trabalho de Conclusão de Curso (TCC) desenvolvido para a UniSãoJosé.  
O objetivo é criar um sistema de **gerenciamento de clientes, imóveis e agendamentos imobiliários**, focado para corretores de imóveis.

---

## 📋 Tecnologias Utilizadas

- **Java EE (Java Platform, Enterprise Edition)**
- **JDK 11**
- **Swing (Interface Gráfica)**
- **JDBC** para comunicação com banco de dados
- **PostgreSQL** como SGBD
- **pgAdmin 4** como ferramenta de administração do banco
- **NetBeans IDE** para desenvolvimento e compilação do projeto

---

## ⚙️ Como Executar o Projeto

1. **Clone este repositório**:
    ```bash
    git clone https://github.com/Flavio-Standard4-UniSJ/PrjUniSaoJose.git
    ```

2. **Abra o projeto no NetBeans IDE** (recomendado):
   - Utilizar **NetBeans 12.0+** ou superior, compatível com **JDK 11**.

3. **Banco de Dados**:
   - O projeto utiliza o banco de dados **PostgreSQL**.
   - O arquivo de criação do banco e das tabelas está localizado em:
     ```
     /BancoDeDados/sql_aplicacao_atlas.sql
     ```
   - Execute o script `sql_aplicacao_atlas.sql` utilizando o **pgAdmin 4** para criar o banco `aplicacao_atlas`.

4. **Configuração de conexão com o banco**:
   - Verifique o arquivo `criaConexao.java` para ajustar as informações de URL, usuário e senha do banco.
   - O projeto usa o driver **PostgreSQL JDBC** (`org.postgresql.Driver`).

5. **Compilação**:
   - Compile e execute o projeto diretamente pelo NetBeans.

---

## 📂 Estrutura do Projeto

- **/src/controle** — Classes de entidade (`Corretor`, `Cliente`, etc.)
- **/src/dao** — Classes de acesso a dados (`CorretorDAO`, `ClienteDAO`, `AgendaDAO`, etc.)
- **/src/servico** — Serviços auxiliares (`Imovel`, `Agenda`, `ManipulaImagem`, etc.)
- **/src/tela** — Interface gráfica (`FrameDashboard`, `FrameAgenda`, `FrameNovoCliente`, etc.)
- **/BancoDeDados** — Scripts SQL para o banco de dados.

---

## 🎯 Funcionalidades Principais

- Cadastro e gerenciamento de clientes
- Cadastro e gerenciamento de corretores
- Agendamento de visitas e atendimentos
- Controle e exibição de imóveis
- Gerenciamento de agenda para corretores
- Interface gráfica amigável e interativa

---

## ✅ Requisitos

- **JDK 11**
- **NetBeans IDE** (versão recomendada 12.0+)
- **PostgreSQL Server** ativo
- **pgAdmin 4** instalado para gerenciamento
- **Driver JDBC do PostgreSQL** incluído no projeto (`postgresql-connector`)

---

## 📚 Observações Importantes

- Arquitetura em camadas, seguindo boas práticas do JavaEE.
- Uso de DAO Pattern para separação entre lógica de negócios e acesso a dados.
- Banco de dados relacional seguro e robusto (PostgreSQL).

---

## 📑 Licença

Projeto acadêmico de uso exclusivo para a UniSãoJosé, 2022.

---

**Desenvolvido por Flávio — UniSãoJosé 2022** 🎓
