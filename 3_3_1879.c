#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define MAX_ELEMENTS 500

int partition_1879(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = (low - 1);

    for (int j = low; j <= high - 1; j++) {
        if (arr[j] < pivot) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return (i + 1);
}

void quickSort_1879(int arr[], int low_1869, int high_1869) {
    if (low_1869 < high_1869) {
        int pi_1869 = partition_1869(arr, low_1869, high_1869);

        quickSort_1869(arr, low_1869, pi_1869 - 1);
        quickSort_1869(arr, pi_1869 + 1, high_1869);
    }
}

int main() {
    int choice_1879;
    int arr[MAX_ELEMENTS];
    int n;
    FILE *input_file, *output_file;

    while (1) {
        printf("MAIN MENU (QUICK SORT)\n");
        printf("1. Ascending Data\n");
        printf("2. Descending Data\n");
        printf("3. Random Data\n");
        printf("4. EXIT\n");
        printf("Enter option: ");
        scanf("%d", &choice_1869);

        switch (choice_1869) {
            case 1:
                input_file = fopen("inAsce_1869.dat", "r");
                output_file = fopen("outQuickAsce_1869.dat", "w");
                printf("Before Sorting: Content of the input file\n");
                break;
            case 2:
                input_file = fopen("inDesc_1869.dat", "r");
                output_file = fopen("outQuickDesc_1869.dat", "w");
                printf("Before Sorting: Content of the input file\n");
                break;
            case 3:
                input_file = fopen("inRand_1869.dat", "r");
                output_file = fopen("outQuickRand_1869.dat", "w");
                printf("Before Sorting: Content of the input file\n");
                break;
            case 4:
                printf("Exiting program...\n");
                return 0;
            default:
                printf("Invalid choice. Please try again.\n");
                continue;
        }

        n = 0;
        while (fscanf(input_file, "%d", &arr[n]) != EOF) {
            printf("%d ", arr[n]);
            n++;
        }
        printf("\n");

        quickSort_1869(arr, 0, n - 1);

        fprintf(output_file, "After Sorting: Content of the output file\n");
        for (int i = 0; i < n; i++) {
            fprintf(output_file, "%d ", arr[i]);
        }
        fclose(input_file);
        fclose(output_file);
        printf("\n");
    }

    return 0;
}
