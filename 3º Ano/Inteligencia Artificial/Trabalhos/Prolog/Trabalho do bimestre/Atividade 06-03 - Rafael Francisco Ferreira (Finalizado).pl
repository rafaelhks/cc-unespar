%  Bloco D
%  Bloco C    Bloco G
%  Bloco B    Bloco F    Bloco I
%  Bloco A    Bloco E    Bloco H
%--Mesa----------------------Mesa--
%
% Autor: Rafael Francisco Ferreira
%
:-dynamic(pilha/2).
mesa(pilha(1,_), pilha(2,_), pilha(3,_)).

pilha(1,[d,c,b,a]).
pilha(2,[g,f,e]).
pilha(3,[i,h]).

topo():-
    format("Informe a pilha:"), read(Pilha),
    pilha(Pilha,[H|_]),
    format("Pilha ~w: bloco ~w\n",[Pilha, H]).

sobre_a_mesa():-
    format("Informe a pilha:"), read(Pilha),
    pilha(Pilha, Lista),
    last(Lista, Ultimo),
    format("Pilha ~w: bloco ~w\n",[Pilha, Ultimo]).

indice():-
    format("OBS: Os indices começam em 0!\n"),
    format("Informe a pilha:"), read(Pilha),
    format("Informe o indice do bloco:"), read(Indice),
    pilha(Pilha, Lista),
    nth0(Indice, Lista, Elemento),
    format("(Pilha ~w, Indice ~w) = bloco ~w",[Pilha, Indice, Elemento]).

acimaDe():-
    format("Informe a pilha:"), read(Pilha),
    format("Informe o bloco:"), read(Elemento),
    pilha(Pilha, L),
    reverse(L, Lista),
    nextto(Elemento, Acima, Lista),
    format("O bloco que está acima de ~w é o bloco ~w !", [Elemento, Acima]).

abaixoDe():-
    format("Informe a pilha:"), read(Pilha),
    format("Informe o bloco:"), read(Elemento),
    pilha(Pilha, Lista),
    nextto(Elemento, Acima, Lista),
    format("O bloco que está abaixo de ~w é o bloco ~w !", [Elemento, Acima]).

porPilha():-
    format("Informe a pilha:"), read(Pilha),
    pilha(Pilha, Lista),
    format("Pilha: ~w, Blocos: ~w", [Pilha, Lista]).

alterarPosicoes():-
    format("Informe a pilha: "), read(Pilha),
    format("Informe a pilha para qual quer mover o bloco"), read(PilhaDest),
    (   Pilha\=PilhaDest;
        format("Pilha de origem e destino são a mesma!\n")),
    pilha(Pilha, Lista),
    pilha(PilhaDest, ListaDest),
    altera(Pilha, PilhaDest, Lista, ListaDest).

altera(Pilha, PilhaDest, Lista, ListaDest):-
    nth0(0, Lista, Bloco),
    delete(Lista, Bloco, L2),
    nth0(0,LD2,Bloco,ListaDest),
    asserta(pilha(Pilha, L2)),
    asserta(pilha(PilhaDest, LD2)),
    retract(pilha(Pilha, Lista)),
    retract(pilha(PilhaDest, ListaDest)),
    format("Pilha ~w: bloco ~w", [PilhaDest, LD2]).

altera(Pilha, _, [], _):-
    format("A pilha ~w está vazia!", Pilha).



