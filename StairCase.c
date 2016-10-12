int main(int argc, char *argv[]) {
 int n;
 scanf("%d",&n);
 int i=0,j=0,k=0;
 for(i=1;i<=n;i++)
 {
 for(j=1;j<=n-i;j++)
 printf(" ");
 for(k=1;k<=i;k++)
 printf("#");
 printf("\n");
 }
 
 return 0;
}