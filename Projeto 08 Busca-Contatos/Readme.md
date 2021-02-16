RELATÓRIO DA SEMANA

*O QUE FEZ:

    Fiz o projeto 'Busca - Agenda 2'

*COM QUEM FEZ:

    Fiz sozinho, assistindo a aula referente e me baseando no código do projeto Mensagens 
    feito pelo professor em aula e na aula sobre o collections.sort. Porém, tive que copiar
    o método search do Bruno Sales. Pois eu não consegui fazer e nem entender como funciona.
    Aliás, eu testei e acho que não funcionou também.

*COMO FEZ:

    O projeto é composto de cinco classes:
    
    *Fone:
        Nessa classe Eu possuo os atributos label e name.
        Um método estático para validar números que vai me auxiliar na classe Phonebook
        Possui também dois construtores, um que me permite inicializar apenas com um label
        e o outro que eu inicializo com um label e um name.
        

    *Contact:
        -Possui como atributos um name e um ArrayList de fones
        -Seu construtor recebe um name e inicializa o ArrayList

        essa classe possui os seguintes métodos:

        -Contact()
            esse é o construtor e dar um 'new' no ArrayList.
        
        -addFone()
            Adiciona um novo fone no arraylist de fones. Mas antes verifica se é válido o número.
        
        -rmFone()
            remove um fone passando o seu índice

        -toString()
            retorna uma String auxiliar que eu fiz para organizar os fones.

        -Possui mais dois métodos, um getName e um getFones para retornar o ArrayList de fones        
         
    
    *Phonebook:
        -Possui como atributo um ArrayList de contatos

        -O construtor inicia o ArrayList

        essa classe possui os seguintes métodos:

        -addContact()
            Tenta adicionar um novo contato, verifica se ja existe com o método getContact()
            Se ja existe, então adiciona os fones nesse contato. Se não existe cria um novo,
            e adiciona esse contato no ArrayList de contatos
        
        -getContact()
            recebe um name como parâmetro e procura no ArrayList se existe algum contato com esse name

        -findContact()
            procura um nome no ArrayList, se encontrar me retorna que posição ele está

        -rmContact()
            Remove um contato do ArrayList
        
        -search()
            Procura por um padrão passado como parâmetro e retorna quais contatos possuem esse padrão.
            Mas eu não sei direito como funciona, confesso... Pois não criei e copiei de um amigo.

        -toString()
            criei uma String auxiliar que mostre cada contato e seus números e pule uma linha para cada contato.


    *ComparatorPeople
        Essa é a classe que tem o método que vai subscrever o sort da collections. 
        É o que vai ordenar o meu Phonebook a partir da ordem lexicográfica do meu ArrayList de contatos.

    *Main
        Nessa classe é onde eu possuo a interação com o usuário     
*O QUE APRENDEU:

    Aprendi bastante coisa: aprendi sobre ordenação de ArrayList, Aprendi a trabalhar com mais de duas camadas
    Consegui aplicar praticamente tudo que já vimos até agora na disciplina só nesse projeto.

*MAIOR DIFICULDADE:

    Sem dúvidas foi o projeto mais difícil que tive maior dificuldade até agora. Passei 2 dias para conseguir terminar.
    A maior dificuldade acho que foi entender o projeto. Talvez seja porque está confuso o que o projeto pede lá no 
    Github. Mas tive dificuldades em associar cada método com sua classe, em saber como cada coisa se comporta.
    O nível de complexidade desse projeto realmente me tornou um pouco melhor na linguagem Java e em POO em si.

*QUANTO TEMPO LEVOU:

    Passei mais de 2 dias fazendo, buscando entender o projeto, entender o que cada classe fazia. Ao todo na frente do computador eu diria umas 7 horas. Mas foi bastante pesado entender cada coisa. Apesar de eu não ter conseguido ter feito o método "search()". Peguei de um colega. Mas na próxima procuro entender como esse método funciona.