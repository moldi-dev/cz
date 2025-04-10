clean:
	rm -f lex.yy.c y.tab.c y.tab.h CZ

build-run-file:
	lex cz.l
	yacc -d cz.y
	gcc -o CZ lex.yy.c y.tab.c functions.c -Wno-implicit-function-declaration
	./CZ $(FILE)

build-run-terminal:
	lex cz.l
	yacc -d cz.y
	gcc -o CZ lex.yy.c y.tab.c functions.c -Wno-implicit-function-declaration
	./CZ
