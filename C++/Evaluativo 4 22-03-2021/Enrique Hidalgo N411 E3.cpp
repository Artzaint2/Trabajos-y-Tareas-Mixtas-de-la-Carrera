//Realizar un programa de ordenamiento ascendente (método burbuja) C++

#include<iostream>

using namespace std ;
int main(){
    
 int n,aux;
 cout<<"Por favor, escriba los numeros :";
 cin>>n;
 int V[n];
 for(int i=0;i<n;i++){
  cout<<"\n Numero "<<i+1<<" = ";
  cin>>V[i];
 }
 for(int i=0;i<n;i++){
  for(int j=i+1;j<n;j++){
   if(V[j]<V[i]){
    aux=V[i];
    V[i]=V[j];
    V[j]=aux;
    
   }
  }
 }
 cout<<"Orden Ascendente: "<<endl;
 for(int i=0;i<n;i++){
  cout<<V[i]<<endl;
}

system("PAUSE");
 return 0;
} 

