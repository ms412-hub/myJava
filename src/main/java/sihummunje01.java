public class sihummunje01 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,9,3,2,1,3,};
        int m =nums[0];

        for(int i=0;i<nums.length;i++){
            if(nums[i]>m){
                m=nums[i];
            }
        }
        System.out.println(m+"입니다.");
    }
}