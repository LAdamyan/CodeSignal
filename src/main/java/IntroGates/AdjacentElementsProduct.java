package IntroGates;

public class AdjacentElementsProduct {
    //Given an array of integers, find the pair of adjacent elements
    // that has the largest product and return that product.
    public static void main(String[] args) {
       int[] array ={3, 6, -2, -5, 7, 3};
        System.out.println(solution(array));
    }
  static     int solution(int[] inputArray){
       int maxProduct = Integer.MIN_VALUE;

      for (int i = 0; i < inputArray.length-1; i++) {
          int product = inputArray[i]* inputArray[i+1];

          if(product>maxProduct){
              maxProduct= product;
          }
      }
      return maxProduct;

}}
