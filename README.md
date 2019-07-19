# SwGame
 ## Projeto para listar planetas baseado em Star Wars
Api desenvolvida com as seguintes ferramentas:

- Spring boot
- Java
- Maven
- MongoDB

 ## Para fins de teste da Api:

- Postman

## Finalidade:

 Criar uma Api rest que contenha dados dos planetas do universo Star Wars, com três dados (nome, clima, terreno)persistidos no banco (MongoDB), e outro (aparições do planeta em filmes da franquia) consumindo de uma Api pública de Star Wars (https://swapi.co/), quanto ao desenvolvimento como foi usado o Spring boot em Java inclui uma gama de funcionalidades para deixar todo o trabalho mais rápido e eficiente com destaque a segurança aplicada que se faz necessário um token para autenticação ao realizar operações com a API, e usando um padrão arquitetural a fim de dividir para facilitar a compreensão, correção e futuras alterações do mesmo.
 
 ## Rotas
 
 ### GET
 
 - /sw/planetas/
 
 **Descrição:** Lista de todos os planetas armazenados no banco de dados.
 **Código de Resposta:** 200 - Ok.
 **Retorno:** JSON com a lista de todos os planetas.
 
 - /sw/planetas/id/{id}/
 
 **Descrição:** Lista o planeta relacionado ao id pesquisado.
 **Código de retorno:** 200 - ok; 404 - Erro.
 **Retorno:** JSON com o planeta listado pelo Id.
 
 - /sw/planetas/nome/{nome}/
 
 **Descrição:** Lista o planeta relacionado ao nome pesquisado.
 **Código de retorno:** 200 - ok; 404 - Erro.
 **Retorno:** JSON com o planeta listado pelo respectivo Nome.
 
 ### POST
 
 - sw/planetas/
 
 **Descrição:** Insere um novo planeta no banco de dados.
 **Requisição:** JSON com os dados relacionados ao planeta (nome, clima, terreno).
 **Código de retorno:** 200 - ok; 404 - Erro.
 
 ### DELETE
 
 - /sw/planetas/
 
 **Descrição:** Faz a exclusão do planeta baseado no Id do mesmo.
 **Código de retorno:** 200 - ok; 404 - Erro.
 **Retorno:** Retorna um inteiro boleano onde o 1 significa True.
 
 
 
 
 

