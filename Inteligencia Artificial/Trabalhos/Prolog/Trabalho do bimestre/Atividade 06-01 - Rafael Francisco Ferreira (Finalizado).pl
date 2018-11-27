num(7).

numero(X):-
    num(X),
    format("O número ~w é o número correto!", X).

numero(X):-
    num(N),
    X < N,
    write('Maior').

numero(X):-
    num(N),
    X > N,
    write('Menor').
