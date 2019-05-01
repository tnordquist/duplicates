package dev.tnordquist;

import java.util.ArrayList;
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
    Set<Integer> arrDups = new HashSet<>();
    for(int i = 0; i < nums.length; ++i) {

       if(!dups.add(nums[i])){
         arrDups.add(nums[i]);
       }

      }


    return arrDups;
  }

  public static void main(String[] args) {

    int[] arr = {2,2,1,2,1, 8, 3, 3};
    System.out.println(duplicates(arr));

  }

}
