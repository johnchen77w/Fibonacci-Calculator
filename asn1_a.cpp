#include <iostream>
using namespace std;

long long fibonacci(long x) {
    if(x!=1 && x!=0) {
        return(fibonacci(x-1) + fibonacci(x-2));
    } else {
        return(x);
    }
}

int main(){
    int i = 0;
    while (i <= 10){
        cout << "F(" << i*5 << ") = "<< fibonacci(i*5) << endl;
        i++;
    }
}
