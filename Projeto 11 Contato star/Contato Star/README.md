RELATÓRIO DA SEMANA

*O QUE FEZ:

    Fiz o projeto 'Contato Star'

*COM QUEM FEZ:

    Inicialmente comecei sozinho, Mas foi um projeto muito difícil para mim.
    E tive de buscar ajuda com o Professor e com o Henrique me auxiliando. 

*COMO FEZ:

    O projeto é composto de seis classes:
    
    *Fone:
        Nessa classe eu tenho dois construtores, os atributos
        label e number.
        
    *Contact:
        -Possui como atributos um ArrayList de fones e um nome

        essa classe possui um construtor que recebe um nome e um arraylist de fones
        e já inicializa esses dois atributos. E passa por cada fone do ArrayList, adicionando
        em fones

        Essa classe adiciona um novo fone, remove um novo fone.
            
    *ContactPlus:
        -Essa classe herda de Contact. E possui um atributo 'starred' para marcar o contato como favorito.
        Possui também um setStarred para setar o valor de 'starred'

    *Agenda:
        -Aqui eu possuo um mapa de Contact 'contacts'. O construtor inicia o TreeMap

        Essa classe adiciona um novo Contact, remove um contact, retorna o mapa de contacts
        E possui a função search para procurar padrões.

    *AgendaPlus:
        -Essa classe Herda de Agenda. E possui um TreeMap 'bookmarks' de ContactPlus
        para adicionar os contatos que estão marcados como favoritos.

        Ela subscreve o método de remoção de Contact de Agenda. Se o meu mapa
        de Contacts não obter o objeto verificado com a key, então lança um Exception.

        Caso não entre no if, então é removido o ContactPlus de bookmarks
        e também é removido o Contact de 'Contacts'

        -O método 'bookmark()' recebe um identificador, e verifica se existe um objeto
        Contact no TreeMap 'Contacts'. Caso passe do if, eu crio um Contact buscando
        em 'Contacts' o Contact com o mesmo nome. E então, crio um novo ContactPlus
        com o mesmo nome(identificador) recebido por parametro, e passo a lista de fones
        do Contact cujo peguei. Após isso, setStarred(true), e então bookmarks.put(identificador, contactplus)

        -O método 'unBookmark()' recebe um id e verifica se existe em bookmarks, se existir, remove-o.

    *App:
        - Minha classe principal onde instancio uma AgendaPlus e faço os comandos.
            

*O QUE APRENDEU:

    Aprendi um pouco sobre Herança, e um pouco de polimorfismo. Além do mais
    que pratiquei os antigos conceitos vistos antes como ArrayList, TreMaps, exceções...

*MAIOR DIFICULDADE:

    Esse sem dúvida foi, depois de 'busca contatos' o projeto mais difícil. 
    Tava complicado entender o diagrama UML, foi muito mastigado. Tive de pedir ajuda
    ao meu colega Henrique que me ajudou muito na hora da herança. Foi sofrido, mas 
    pouco a pouco a gente chega lá kk.

*QUANTO TEMPO LEVOU:

    Não fiz tudo no mesmo dia. levei 2 dias fazendo, mas horas corridas, eu diria umas 8.
