package dev.tnordquist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Bruteforce solution to bytebybyte problem Find Duplicates.
 */
public class Duplicates {

  static Set<Integer> duplicates (int[] nums) {
    Set<Integer> dups = new HashSet<>();
    Arrays.sort(nums);
    for(int i = 0; i < nums.length-1; ++i) {

      if(nums[i+1]>nums[i]){
        continue;
      }
       else if(nums[i]==nums[i+1]){
         dups.add(nums[i]);
       }

      }


    return dups;
  }

  public static void main(String[] args) {

    int[] arr = {2,2,1,2,1, 8, 3, 3};
    System.out.println(duplicates(arr));

  }

}
