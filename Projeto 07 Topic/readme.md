RELATÓRIO DA SEMANA

*O QUE FEZ:

    Fiz o projeto 'Topic'

*COM QUEM FEZ:

    Fiz sozinho, assistindo a aula referente e me baseando no código do projeto 06 Pula Pula

*COMO FEZ:

    O projeto é composto de três classes:
    
    *Controller:
        Aqui é minha classe principal onde fica a interação com o usuário
        e onde instancio um objeto referência para a classe Topic.
        
        Os comandos interativos são:

        - 'init' Inicia a classe Topic, e passa a quantidade de cadeiras e a quantas dessas serão preferenciais
        - 'in' para inserir uma pessoa na topic passando o nome e a idade
        - 'out' para tirar alguém da topic passando o nome dela como parâmetro
        - 'show' para mostrar a lista de passageiros nas cadeiras preferenciais e normais
        - 'end' encerra o programa
    
    *Topic:
        -Criei uma duas ArrayLists do tipo Pass 
        -Uma para as cadeiras normais e outra para as cadeiras preferenciais

        -O construtor dar um 'new' nas duas ArrayList e adiciona em cada uma certa quantidade de objetos ferenciados para null

        essa classe possui os seguintes métodos:

        -Topic()
            esse é o construtor e dar um 'new' nas duas ArrayList.
        
        -in()
            insere alguém em uma das filas na topic
        
        -out()
            remove alguém passando o nome como parametro.

        -toString()
            toString clássico. Retorna as duas listas       
         
    
    *Pass:
        -Criei o atributo 'name' para receber um nome
        -Criei o atributo 'age' para receber uma idade

        -O construtor recebe um nome e uma idade

        essa classe possui os seguintes métodos:

        -Possui os Getters para name, age 
        -Possui um toString  

*O QUE APRENDEU:

    Aprendi mais sobre excessões com nullPointer. Quando se tenta acessar um atributo ou
    método de um objeto referenciado para null é gerado esse erro. Para isso, deve-se verificar
    em um laço. E ir iterando, se o objeto for null, então der um continue. 

*MAIOR DIFICULDADE:

    Tive dificuldade no algorítmo que subscreve o toString. E tive dificuldades para criar 
    o métod in(). Pois deve-se verificar a idade, e colocar cada passageiro na sua fila respectiva.

*QUANTO TEMPO LEVOU:

    Levei cerca de três a quatro horas. Pois tive que para várias vezes para numa solução 
    quando via um certo problema