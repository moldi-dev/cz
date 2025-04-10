clean:
	rm -f lex.yy.c y.tab.c y.tab.h CZ

build-run:
	lex cz.l
	yacc -d cz.y
	gcc -o CZ lex.yy.c y.tab.c functions.c -Wno-implicit-function-declaration
	./CZ