#include<stdio.h>
#include<stdlib.h>
#include<limits.h>

struct Stack{
  int top;
  unsigned capacidad;
  int* arreglo;
};
struct Stack* createStack(unsigned capacidad){
  struct Stack* pila=( struct Stack*) malloc(sizeof(struct Stack));
  pila->capacidad=capacidad;
  pila->top=-1;
  pila->arreglo=(int*) malloc(pila->capacidad * sizeof(int));
  return pila;
}

void push(struct Stack* pila, int valor){
  pila->arreglo[++pila->top]=valor;
}

int pop(struct Stack* pila){
  return pila->arreglo[pila->top--];
}

int peek(struct Stack* pila){
  return pila ->arreglo[pila->top];
}
int main() {
int tamanio, numero;
  printf("Ingrese el tamano de la pila\n");
  scanf("%d", &tamanio );
int vector[tamanio];
  struct Stack* pila=createStack(tamanio);
for(int i=0; i<tamanio; i++){
  printf("ingrese el numero %d\n", (i+1));
  scanf("%d", &numero);
  vector[i]=numero;
}
for(int i=0; i<tamanio; i++){
printf("Elemento %d\n", vector[i]);
}
return 0;
}
