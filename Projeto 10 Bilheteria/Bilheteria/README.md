RELATÓRIO DA SEMANA

*O QUE FEZ:

    Fiz o projeto 'Bilheteria'

*COM QUEM FEZ:

    Fiz sozinho, assistindo a aula referente e pedindo ajuda aos colegas e no discord 

*COMO FEZ:

    O projeto é composto de seis classes:
    
    *Pessoa:
        Nessa classe Eu possuo os atributos nome e meia. Para saber se a pessoa
        é apta a ganhar meia entrada.
        
    *Setor:
        -Possui como atributos um nome, preco, qtd e capacidade

        essa classe possui principalmente um método para venda que incremente a quantidade de pessoas
        e não permite passar da capacidade máxima.
            
    *Evento:
        -Possui como atributo um mapa de setores e um nome como chave.

        essa classe possui principalmente um método para adicionar setores. Não permitindo
        colocar outro que já exista.

    *Venda:
        -Possui como atributo objetos do tipo pessoa, evento e setor. e um double valor.

        essa classe serve para eu adicionar em um arraylist de vendas na classe bilheteria
        para controlar o registro de vendas a partir de lá.

    *Bilheteria:
        -Possui como atributo um mapa de pessoas, um mapa de eventos e um arraylist de vendas
        -Possui também um double caixa. Para armazenar o saldo das vendas.

        Essa classe serve para 
            - adicionar um pessoa
            - mostrar essas pessoas
            - adicionar um evento
            - mostrar os eventos
            - realizar uma venda
            - mostrar as vendas
            - adicionar um setor
        É por ela que é controlado todo o resto do programa

    *App:
        - Essa classe é onde fica a interação com o usuário
        - É onde instancio minha Bilheteria e partir dela, faço todas as interações.
            

*O QUE APRENDEU:

    Comecei a entender como funcionam as exceções. Apesar de não ter aplicado 100% corretamente
    acredito que estou no caminho.

*MAIOR DIFICULDADE:

    A maior dificuldade foi saber onde aplicar as exceções e entender o funcionamento em si
    de como as classes se comportam e como estão agregadas umas com as outras. 

*QUANTO TEMPO LEVOU:

    Entre 5 e 6 horas no total.
