num(7).

numero(X):-
    num(X),
    format("O n�mero ~w � o n�mero correto!", X).

numero(X):-
    num(N),
    X < N,
    write('Maior').

numero(X):-
    num(N),
    X > N,
    write('Menor').
