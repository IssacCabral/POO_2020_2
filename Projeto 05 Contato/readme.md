RELATÓRIO DA SEMANA

*O QUE FEZ: 
    
    Fiz o projeto "Celular" com base no diagrama de classes no repositório Arcade.

*COM QUEM FEZ:
    
    Fiz sozinho, lendo a apostila, assistindo a aula sobre arrays e arraylist e fóruns na internet.
    
*COMO FEZ: 
    
    O projeto é composto de três classes:
        
        **Celular:
            Aqui é minha classe principal onde fica a interação com o usuário
            e onde instancio um objeto referência para a classe Contato.
            
            -Posso dar um 'init' e digitar o nome que vai ser passado para o construtor do Contato. 
            -Posso dar um 'add' para passar como parâmetro uma label e o número do telefone
            -Posso dar um 'removeI' para remover um número através do índice
            -Posso dar um 'removeN' para remover um número digitando o próprio número
            -Posso dar um 'show' para mostrar o nome do contato e os números cadastrados 
        
        **Contato:
            -Aqui criei o atributo 'name' para receber o nome
            -Aqui criei um atributo em forma de Arraylist do tipo 'Fone'

            -Possui o método addFone para adicionar um novo número no contato
            -Possui o método removeFone para remover um número pelo índice ou digitando o número

            -Possui também getters para pegar um número pelo índice ou pelo número.
            -Possui o método toString para passar por todos os telefones em 'fones'.
        
        **Fone:
            -Aqui criei o atributo 'label' para receber um label
            -Aqui criei o atributo 'number' para receber um número

            -No construtor será passado o label e o número como parametros
            -E foi criado também um método estático para validar um número de telefone.
            onde é definida uma variável 'validos = "0123456789()-" ' e cria-se um laço
            à passar por cada elemento e verificar se o número passado como parametro é válido.  

*O QUE APRENDEU:
    
    Aprendi a percorrer Arraylists, trabalhar com Arraylists, declarar. E aprendi
    a diferença entre Arraylist e Arrays.

*MAIOR DIFICULDADE:
    
    Tive bastante dificuldade pra entender o conceito de Arraylist, e principalmente
    no toString da classe 'Fone', pois se mandar imprimir os objetos do ArrayList de 'fones', e tentar printá-los,
    ele vai voltar a referência do objeto. E você subscreve isso com o método toString forçando
    a printar uma String. Isso foi muito difícil de entender. 

*QUANTO TEMPO LEVOU: 
    
    Tive de rever a aula, ver vídeos aulas para entender o assunto e ler a apostila e tópicos na internet.
    Levou cerca de 6 a 8 horas.