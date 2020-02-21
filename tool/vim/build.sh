#!/bin/sh
make distclean
cd src
./configure --prefix=/home/nightzlh/tmp/vim	\
	--with-features=huge	\
	--enable-python3interp	\ 
	--enable-rubyinterp 	\
	--enable-luainterp 	\
	--enable-perlinterp 	\
	--enable-multibyte	\
	--enable-cscope      
make
./vim --version | grep python
