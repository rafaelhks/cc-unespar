:-dynamic(pais/3).
:-dynamic(fronteira/2).
continente(asia).
continente(america).
continente(europa).

pais(portugal, europa, 10).
pais(espanha, europa, 48).
pais(franca, europa, 52).
pais(belgica, europa, 9).
pais(alemanha, europa, 82).
pais(holanda, europa, 15).
pais(eua, america, 235).
pais(brasil, america, 155).
pais(china, asia, 1100).
pais(mongolia, asia, 3).

fronteira(portugal, espanha).
fronteira(franca, espanha).
fronteira(franca,belgica).
fronteira(belgica, alemanha).
fronteira(belgica, holanda).
fronteira(alemanha, holanda).
fronteira(alemanha, franca).
fronteira(china, mongolia).

vizinhos(X,Y):-
    fronteira(X,Y).
vizinhos(X,Y):-
    fronteira(Y,X).

por_continente(X):-
    continente(X),
    pais(M, X, _),
    format("País: ~w - Continente: ~w", [M,X]).

pop_maior_que(X):-
    pais(P, _, N),
    N>X,
    format("País: ~w - População: ~w", [P,N]).

pop_ordem(Dir):-
    findall(X, pais(_,_,X), L),
    sort(L, [H|T]),
    Dir == crescente,
    imprimirOrdenado(H,T).

pop_ordem(Dir):-
    findall(X, pais(_,_,X), L),
    sort(L, [H|T]),
    Dir == decrescente,
    reverse([H|T], [H2|T2]),
    imprimirOrdenado(H2,T2).

imprimirOrdenado(X, []):-
    pais(P,_,X),
    format(" ~w,(~w)", [P,X]).

imprimirOrdenado(X, [Y|Z]):-
    pais(P,_,X),
    format(" ~w(~w),\n", [P,X]),
    imprimirOrdenado(Y,Z).

listarF(P, F):-
    fronteira(P,F).

rotas(I, F, []):-
    format("~w ", I),
    fronteira(I, F).

rotas(I, F, [H|T]):-
    fronteira(H, P),
    listarF(P, M),
    format("~w,\n", H),
    rotas(T, F, M).

caminho(I, F):-
    findall(Rota, rotas(I, F, Rota), Caminho).

novo_pais():-
    write('Informe o nome:'), read(X),
    write('Informe o continente:'), read(Y),
    write('Informe a população:'), read(Z),
    write('Informe um pais com que faz fronteira:'), read(F),
    assertz(pais(X, Y, Z)),
    assertz(fronteira(X, F)).








