pais(marina, isaias).
pais(corsino, isaias).
pais(vómaria, maria).
pais(francisco, maria).
pais(maria, rafael).
pais(isaias, rafael).
pais(maria, fernando).
pais(isaias, fernando).
pais(marina, geremias).
pais(corsino, geremias).
pais(geremias, bruno).
pais(geremias, camila).
pais(celia, bruno).
pais(celia, camila).
pais(vomaria, antonio).
pais(francisco, antonio).
pais(antonio, juliana).
pais(ita, juliana).
pais(antonio, luana).
pais(ita, luana).

masculino(isaias).
masculino(corsino).
masculino(francisco).
masculino(rafael).
masculino(fernando).
masculino(geremias).
masculino(bruno).
masculino(antonio).

feminino(marina).
feminino(vomaria).
feminino(camila).
feminino(celia).
feminino(juliana).
feminino(ita).
feminino(luana).

avó(X, Y):-
	feminino(X),
	pais(X, Z),
	pais(Z, Y).

avo(X, Y):-
	masculino(X),
	pais(X, Z),
	pais(Z, Y).

pai(X, Y):-
	masculino(X),
	pais(X, Y).

mae(X, Y):-
	feminino(X),
	pais(X, Y).

filho(X, Y):-
	pais(Y, X).

irma(X, Y):-
	feminino(X),
	pais(N, X),
	pais(N, Y),
	X\=Y.

irmao(X, Y):-
	masculino(X),
	pais(N, X),
	pais(N, Y),
	X\=Y.

primo(X, Y):-
	masculino(X),
	tio(N, Y),
	pais(N, X).

prima(X, Y):-
	feminino(X),
	tio(N, Y),
	pais(N, X).

tio(X, Y):-
	masculino(X),
	irmao(X, P),
	pais(P, Y).

tia(X, Y):-
	feminino(X),
	irmao(X, P),
	pais(P, Y).

sobrinho(X, Y):-
	masculino(X),
	pais(P, X),
	irmao(Y, P).

sobrinha(X, Y):-
	feminino(X),
	pais(P, X),
	irmao(Y, P).

