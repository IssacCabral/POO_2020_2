RELATÓRIO DA SEMANA

*O QUE FEZ:

    Fiz o projeto 'Busca - Agenda 3'

*COM QUEM FEZ:

    Fiz sozinho, assistindo a aula referente e me baseando na aula e na aula sobre Maps. 
    Dessa vez não implementei o método de busca. Pois além de não conseguir, não achei necessário.
    Fiz só o essencial para implementar os Mapas na minha agenda.

*COMO FEZ:

    O projeto é composto de quatro classes:
    
    *Fone:
        Nessa classe Eu possuo os atributos label e name.
        Um método estático para validar números que vai me auxiliar na classe Contato
        Possui também dois construtores, um que me permite inicializar apenas com um label
        e o outro que eu inicializo com um label e um name.
        

    *Contato:
        -Possui como atributos um name e um ArrayList de fones e um boolean starred
        -Seu construtor recebe um name e inicializa o ArrayList

        essa classe possui os seguintes métodos:

        -Contato()
            esse é o construtor e dar um 'new' no ArrayList.
        
        -addFone()
            Adiciona um novo fone no arraylist de fones. Mas antes verifica se é válido o número.
        
        -rmFone()
            remove um fone passando o seu índice

        -toString()
            retorna uma String auxiliar que eu fiz para organizar os fones.

        -Possui mais dois métodos, um getName e um getFones para retornar o ArrayList de fones        
         
    
    *Agenda:
        -Possui como atributo um mapa de contatos e um mapa de contatos favoritos

        essa classe possui os seguintes métodos:

        -addContact()
            Tenta adicionar um novo contato, verifica se ja existe com o método getContact()
            Se ja existe, então adiciona os fones nesse contato. Se não existe cria um novo,
            e adiciona esse contato no mapa de contatos
        
        -getContact()
            recebe uma chave como parâmetro e procura no mapa se existe essa chave

        -rmContact()
            Remove um contato do mapa contatos e do mapa bookmark
        
        -toString()
            criei uma String auxiliar que mostre cada contato e seus números e pule uma linha para cada contato.
            É feito uma verificação se o contato é um favorito ou não.



    *App
        Nessa classe é onde eu possuo a interação com o usuário     

*O QUE APRENDEU:

    Aprendi sobre a estrutura de dados Mapas. Os seus métodos principais e como percorrer um TreeMap.

*MAIOR DIFICULDADE:

    A maior dificuldade foi em desvincular a ideia de ArrayList. Já estava acostumado com isso
    e foi um pouco difícil saber quando usar Um mapa. Mas realmente foi bem legal, pois na verdade
    eu usei tanto ArrayList como Mapas no projeto. E ainda pude exercitar os conceitos vistos
    no Busca contato 02

*QUANTO TEMPO LEVOU:

    Cerca de três a quatro horas.