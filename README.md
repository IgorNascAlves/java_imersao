Desafio 1:

![Animação](https://user-images.githubusercontent.com/26041581/179647738-3130d870-facc-45a5-a81e-dd9a700b0d13.gif)

UML:

![image](https://user-images.githubusercontent.com/26041581/180108101-469c0715-c2fc-4f60-b042-4cdff3a6b622.png)


# Desafios

## Aula 1
- [X] Consumir o endpoint de filmes mais populares da API do IMDB. Procure também, na documentação da API do IMDB, o endpoint que retorna as melhores séries e o que retorna as séries mais populares.
- [ ] Usar sua criatividade para deixar a saída dos dados mais bonitinha: usar emojis com código UTF-8, mostrar a nota do filme como estrelinhas, decorar o terminal com cores, negrito e itálico usando códigos ANSI, e mais!
- [ ] Colocar a chave da API do IMDB em algum lugar fora do código como um arquivo de configuração (p. ex, um arquivo .properties) ou uma variável de ambiente
- [ ] Mudar o JsonParser para usar uma biblioteca de parsing de JSON como Jackson ou GSON
- [ ] Desafio supremo: criar alguma maneira para você dar uma avaliação ao filme, puxando de algum arquivo de configuração OU pedindo a avaliação para o usuário digitar no terminal.

## Aula 2

- [ ] Ler a documentação da classe abstrata InputStream.
- [ ] Centralizar o texto na figurinha.
- [ ] Fazer um pacote no Whatsapp e/ou Telegram com as suas próprias figurinhas!
- [ ] Criar diretório de saída das imagens, se ainda não existir.
- [ ] Colocar outra fonte como a Comic Sans ou a Impact, a fonte usada em memes.
- [ ] Colocar uma imagem de você que está fazendo esse curso sorrindo, fazendo joinha!
- [ ] Colocar contorno (outline) no texto da imagem.
- [ ] Tratar as imagens retornadas pela API do IMDB para pegar uma imagem maior ao invés dos thumbnails. Opções: pegar a URL da imagem e remover o trecho mostrado durante a aula ou - [ ] consumir o endpoint de posters da API do IMDB (mais trabalhoso), tratando o JSON retornado.
- [ ] Fazer com que o texto da figurinha seja personalizado de acordo com as classificações do IMDB.
- [ ] Desafio supremo: usar alguma biblioteca de manipulação de imagens como OpenCV pra extrair imagem principal e contorná-la.

## Aula 3

- [X] Transformar a classe que representa os conteúdos em um Record, disponível a partir do Java 16
- [ ] Criar as suas próprias exceções e usá-las na classe que implementa o cliente HTTP
- [ ] Usar recursos do Java 8 e posterior, como Streams e Lambdas, para mapear uma lista em uma outra
- [ ] Criar uma Enum que une, como configurações, a URL da API e o extrator utilizado
- [ ] Desafio supremo: consumir outras APIs que contém imagens, como a da Marvel, que é bem diferente. Repositório com APIs públicas: clique aqui.

## Aula 4

- [ ] Finalizar o CRUD (Create, Read, Update e Delete) para que se possa atualizar e excluir uma linguagem cadastrada;
- [ ] Devolver a listagem ordenada pelo ranking;
- [ ] Criar na sua API um modelo de entidade com nomes diferentes de title e image e criar seu próprio extrator de informações personalizado OU, manter com o nome title e image e traduzir para que seja retornado como título e imagem através do uso de DTO (Data Transfer Object);
- [ ] Retornar o status 201 quando um recurso (linguagem, no nosso caso) for cadastrado através do POST;
- [ ] Desafio supremo: Aplicar modificações parciais no recurso através do método PATCH, por exemplo, modificando o número de votos ou de pessoas que utilizam cada linguagem de programação.
