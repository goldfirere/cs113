all: exercises.pdf

%.pdf: %.tex
	pdflatex $^

exercises.tex: exercises.lhs
	lhs2TeX -o $@ $<

