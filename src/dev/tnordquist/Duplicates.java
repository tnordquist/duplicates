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

  static List<Integer> duplicates (int[] nums) {

    List<Integer> theDups;
    Set<Integer> dups = new HashSet<>();

    for(int i = 0; i < nums.length; ++i) {

      for(int j = i+1; j < nums.length; ++j) {

        if(nums[j] == nums[i]){
          dups.add(nums[j]);
        }

      }
    }

    theDups = new ArrayList(dups);
    Collections.sort(theDups);
    return theDups;
  }

  public static void main(String[] args) {

    int[] arr = {2,1,2,1};
    System.out.println(duplicates(arr));

  }

}
