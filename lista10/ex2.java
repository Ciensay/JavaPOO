/*
O modificador synchronized serve para delimitar regioes criticas de um programa. Ele é um mecanismo de sincronização baseado em monitores que garante que um método ou bloco de 
código nunca seja executado por mais de uma thread simultaneamente. Ele deve ser usado especificamente em situações onde múltiplas threads precisam acessar e manipular dados 
compartilhados ao mesmo tempo.

Nao se deve usar em todos os metodos pois:

-O acesso frequente a metodos sincronizados causa bloqueios, oque deixa mais lento o desempenho

-Risco de deadlock: Quando alguma thread fica bloqueada esperando a liberacao de recuso de uma outra thread.











*/