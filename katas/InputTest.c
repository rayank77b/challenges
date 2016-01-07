#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>

int main() 
{
	char inp[256];
	int len=0;

	while(fgets(inp, 20 , stdin) != NULL)
    	{
		len=strlen(inp);
		inp[len-1]='\0';
        	printf("%s!\n", inp);
    	}

	return 0;
}
