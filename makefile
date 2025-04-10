build-run:
	lex cz.l
	yacc -d cz.y
	gcc -o CZ lex.yy.c y.tab.c -Wno-implicit-function-declaration
	./CZ