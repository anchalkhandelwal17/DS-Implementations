package Recursion_Subset_Subsequence;

public class Number_of_dice_rolls_with_target_sum {
    public static void main(String[] args){
        diceRolls("", 4);
    }

    static void diceRolls(String p, int target){
        // base case
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i=1; i<=6 && i<=target; i++){
            diceRolls(p + i, target -i);
        }
    }
}
