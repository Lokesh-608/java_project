public class Day_7 {
    public boolean containsDuplicate (int[] nums){
    
            for(int i=0;i<nums.length;i++){
                for(int j=1;j<nums.length-1;j++){
                    if(nums[i]==nums[j]){
                        return true;
                    }
                }
            }
            return false;
        }

    }
    

