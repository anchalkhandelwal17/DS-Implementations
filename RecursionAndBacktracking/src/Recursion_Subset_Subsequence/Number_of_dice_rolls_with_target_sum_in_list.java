package Recursion_Subset_Subsequence;

import java.util.ArrayList;

public class Number_of_dice_rolls_with_target_sum_in_list {
    public static void main(String[] args){
        ArrayList<String> ans = diceRolls("", 4);
        System.out.println(ans);
    }

    static ArrayList<String> diceRolls(String p, int target){
        // base case
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        for(int i=1; i<=6 && i<=target; i++){
            list.addAll(diceRolls(p + i, target -i));
        }
        return list;
    }
}
