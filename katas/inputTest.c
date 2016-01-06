#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>

int main() 
{

	char inp[256];
	int ret=0;
	int len=0;

	ret=read(1,inp, 10);

	while(ret>0) {
		len=strlen(inp);
		inp[len-1]='\0';
		printf("%s!\n", inp);
		ret=read(1,inp, 10);
	}

	return 0;
}
