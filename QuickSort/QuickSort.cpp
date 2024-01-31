#include <stdio.h>
#include <stdlib.h>

// Fun��o que particiona o vetor
int Particiona(int vetor[], int inicio, int fim) {
    int aux; // Vari�vel auxiliar para troca de posi��es
    
    int cont = inicio; // Contador para controlar a posicao do pivo

    // Percorre o vetor da posi��o seguinte ao in�cio at� o fim
    for (int i = inicio + 1; i <= fim; i++) 
	{
    	
        // Verifica se o elemento atual � menor que o elemento inicial
        if (vetor[i] < vetor[inicio]) 
		{
        	
            cont++; // Incrementa o contador do pivo

            // Troca os elementos de posi��o no vetor
            aux = vetor[i];
            vetor[i] = vetor[cont];
            vetor[cont] = aux;
        }
    }

    // Troca o elemento inicial com o elemento na posi��o do pivo
    aux = vetor[inicio];
    vetor[inicio] = vetor[cont];
    vetor[cont] = aux;

    return cont; // Retorna a posi��o do piv�
}

// Fun��o principal do Quicksort
void QuickSort(int vetor[], int inicio, int fim)
 {
    int pos;

    // Condi��o de parada para a recurs�o
    if (inicio < fim) 
	{
        pos = Particiona(vetor, inicio, fim); // Encontra a posi��o do piv�

        // Chama recursivamente a fun��o quicksort para as duas metades do vetor
        
        QuickSort(vetor, inicio, pos - 1); // Para a parte esquerda do piv�
        
        QuickSort(vetor, pos + 1, fim); // Para a parte direita do piv�
    }
}

// Fun��o main
int main() 
{
    int vetor[] = {2, 0, 1,5,3,9,4,7}; // Vetor de entrada

    int n = sizeof(vetor) / sizeof(int); // Calcula o tamanho do vetor 

    QuickSort(vetor, 0, n - 1); // Chama a fun��o quicksort

    // Imprime o vetor ordenado
    printf("\n\n\n");
    for (int i = 0; i < n; i++)
        printf("%d - ", vetor[i]);
    printf("\n\n\n");

    
    return 0;
}

