cBerilo(contem_oxido, duro, mineral).
cEsmeralda(contem_oxido, verde).
cRubi(contem_oxido, avermelhada).
cSafira(contem_oxido, (n�o_verde; n�o_avermelhada)).

berilo(X,Y,Z):-
    cBerilo(X, Y, Z).

esmeralda(X, Y):-
    cEsmeralda(X, Y).

rubi(X, Y):-
    cRubi(X, Y).

safira(X, Y):-
    cSafira(X, _),
    Y\=verde,
    Y\=avermelhada.
