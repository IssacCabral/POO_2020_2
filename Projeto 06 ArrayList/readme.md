RELATÓRIO DA SEMANA

*O QUE FEZ: 
    
    Fiz o projeto 'pula pula no parquinho' sugerido pelo professor

*COM QUEM FEZ:
    
    Fiz sozinho, assistindo a aula referente e me baseando no código do projeto 05
    
*COMO FEZ: 
    
    O projeto é composto de três classes:
        
        *PulaPula:
            Aqui é minha classe principal onde fica a interação com o usuário
            e onde instancio um objeto referência para a classe Trampolim.
            
            Os comandos interativos são:

            - 'arrive' e em seguida o nome de uma criança e a sua idade para 'chegar' ao trampolim e colocar na fila de espera
            - 'in' para colocar a primeira criança da lista de espera dentro do pula pula.
            - 'out' para tirar a primeira criança que entrou do pula pula e voltar a lista de espera
            - 'remove' e em seguida digitar o nome da criança para remover uma criança de uma das filas
            - 'show' para mostrar as duas listas
            - 'end' encerra o programa
            - 'saldo' mostra o saldo de uma criança passando o nome dela em seguida
            - 'caixa' mostra o lucro obtido pelo Pula Pula até então
            - 'fechar' todas as crianças vão embora e pagam os seus saldos e encerra o brinquedo. 
        
        *Trampolim:
            -Criei uma ArrayList do tipo Criança para a lista de espera chamada 'waiting'
            -Criei uma ArrayList do tipo Criança para a lista de brincadeiras chamada 'playing'
            -Criei um atributo 'caixaPula' para guardar o saldo do pula pula

            -O construtor dar um 'new' nas duas ArrayList.

            essa classe possui os seguintes métodos:

            -Trampolim()
                esse é o construtor e dar um 'new' nas duas ArrayList.
            
            -arrive()
                adiciona uma criança nova na lista de espera
            
            -in()
                tira da lista de espera e coloca na fila brincando
            
            -out()
                Tira da fila brincando e coloca na fila de espera

            -remove()
                Remove a crianca pra ela ir embora passando o nome como parâmetro e faz-se uma busca
            
            -saldoCrianca()
                Mostrar o saldo da criança por meio de um nome

            -saldoCaixa()
                Mostrar o valor em caixa arrecadado com as crianças

            -removeAll()
                Removendo todas as crianças e atribuindo os valores dos saldos ao caixa

            -toString()
                toString clássico. Retorna as duas listas e o valor em caixa.        
             
        
        *Crianca:
            -Criei o atributo 'name' para receber um nome
            -Criei o atributo 'age' para receber uma idade
            -Criei o atributo 'saldoCrianca' para receber o saldo da criança

            -O construtor recebe um nome e uma idade

            essa classe possui os seguintes métodos:

            -Possui os Getters para name, age e saldo
            -Possui um setSaldo
            -Possui um toString  

*O QUE APRENDEU:
    
    Aprendi a percorrer Arraylists,pratiquei um pouco mais o que já tinha visto no projeto 05 e aprendi
    a colocar um elemento de um arraylist em outro arraylist.

*MAIOR DIFICULDADE:
    
    A maior dificuldade foi apenas em passar um elemento de uma arraylist para outra.
    No mais, foi tudo tranquilo. 

*QUANTO TEMPO LEVOU: 
    
    Tive de rever a aula, e adaptar o meu código e melhorar o que o professor passou.
    levei cerca de três horas.