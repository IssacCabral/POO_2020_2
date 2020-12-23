RELATÓRIO DA SEMANA

1. O que fez: 
    criei o projeto do Tamagochi baseado no diagrama de classes disponível no repositório da disciplina

2. Com quem: 
    Fiz sozinho.

3. Como fiz:
    Fiz a lógica baseada no exemplo posto no repositório da disciplina.
    O tamagochi pode brincar, pode tomar banho, pode comer e pode também dormir.
    mas a cada operação causa uma alteração nos atributos.

    para instanciar um novo tamagochi , é necessário informar os parametros do construtor
    que são: energia, saciedade e limpeza.

    para brincar, o pet altera -2 energia, -1 saciedade, -3 limpeza, +1 diamante, +1 idade.
    para comer, o pet altera em -1 a energia, +4 a saciedade, -2 a limpeza, +0 diamantes,  +1 a idade
    Para dormir, o pet aumenta energia até o máximo e idade aumenta do número de turnos que o pet dormiu.
    Eu considerei esses turnos, como sendo a diferença entre a energia máxima e a energia atual.
    Para banho, o pet altera em -3 energia, -1 na saciedade, MAX na limpeza, +0 diamantes, +2 na idade.
    Para dormir, o pet precisa ter perdido pelo menos 5 de energia
    Para tomar banho, o pet precisa ter perdido pelo menos 6 de energia.


4. O que aprendeu: 
    Aprendi a usar os modificadores de acesso private e public, e como eles se comportam nas classes. Entendi
    a importância de se utilizar esses modificadores, para evitar que usuários de classe façam ações nos atributos
    indevidas sem o devido encapsulamento desses atributos.

A maior dificuldade foi em usar os getters e setters, pois já estava acostumado
a trabalhar com os atributos como "default", e não a partir de métodos intermediários.

5. Quanto tempo levou:
    Tive de rever a aula pra melhor compreensão, ver umas 3 aulas da playlist gafanhoto
    e ler o cap.5 da apostila antes de codar. Isso me levou umas 5 horas ao todo.