#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int arr[6][6];
    for(int arr_i = 0; arr_i < 6; arr_i++){
       for(int arr_j = 0; arr_j < 6; arr_j++){
          scanf("%d",&arr[arr_i][arr_j]);
       }
    }
   int i = 0,j = 0,sum=0,tmp=0;    //tmp存入每次迭代所得的最大值
    while(i+2<=5)
        {
        while(j+2<=5){
                tmp = sum;
                sum = arr[i][j] + arr[i][j+1]  +  arr[i][j+2] 
                                       +arr[i+1][j+1]
                         + arr[i+2][j]+arr[i+2][j+1]  +  arr[i+2][j+2] ;
                 if(i==0&&tmp==0)          //第一次迭代时,tmp的默认值是0,当sum为负数时,比较就会失效,因为0 always 大于负数  所以要排除这种情况
                     tmp = sum;
                 if(tmp>sum)              
                     sum = tmp;
                   j++;
            
                
        }
              j = 0;               //注意当外层循环结束时,由于使用的是while函数,所以必须将j置0开始循环
           i++;
    }
    printf("%d",sum);
    return 0;
}
    //几点需要注意的情况
    //1.if条件语句中赋值=的情况非常容易犯
    //2.while和for循环中边界的情况老是弄反
    //3.考虑不周全