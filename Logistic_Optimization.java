public class Logistic_Optimization {
     public static int maximizeValue(int[] values, int[] weights, int numVehicles, int[] capacities, int[][] dependencies) {
          int maxValue = 0;
          for (int i = 0; i < values.length; i++) {
               int weight = weights[i];
               int value = values[i];
               boolean included = false;
               for (int j = 0; j < numVehicles; j++) {
                    if (weight <= capacities[j]) {
                         capacities[j] -= weight;
                         maxValue += value;
                         included = true;
                         break;
                    }
               }
               if (!included) {
                    return 0;
               }
          }
          for (int[] dependency : dependencies) {
               int item1 = dependency[0];
               int item2 = dependency[1];
               boolean foundItem1 = false;
               boolean foundItem2 = false;
               for (int j = 0; j < numVehicles; j++) {
                    for (int k = 0; k < values.length; k++) {
                         if (weights[k] <= capacities[j]) {
                              if (k == item1) {
                                   foundItem1 = true;
                              }
                              if (k == item2) {
                                   foundItem2 = true;
                              }
                         }
                    }
               }
               if (!(foundItem1 && foundItem2)) {
                    return 0;
               }
          }
          return maxValue;
     }
     public static void main(String[] args) {
          int[] values = {60, 100, 120, 80, 30};
          int[] weights = {10, 20, 30, 40, 50};
          int numVehicles = 2;
          int[] capacities = {50, 50};
          int[][] dependencies = {{3, 1}, {4, 2}};

          int maxValue = maximizeValue(values, weights, numVehicles, capacities, dependencies);
          System.out.println("Maximum Value: " + maxValue);
     }
}