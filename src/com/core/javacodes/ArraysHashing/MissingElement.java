package com.core.javacodes.ArraysHashing;

public class MissingElement {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,8};
        int missingNum = findMissingNum(arr);
        System.out.println(missingNum);
    }

    private static int findMissingNum(int[] arr) {
      int firstIndex = arr[0];
      int lastIndex = arr[arr.length-1];

      for (int i = firstIndex; i<= lastIndex; i++)
      {
          if(i != arr[i-1])
          {
              return i;
          }
      }

      return -1;
    }
}
