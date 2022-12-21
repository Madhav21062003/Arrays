package Arrays;
import java.util.* ;
    public class TrappingRainwater {

        static int trappedRainwater(int height[]){
            int n = height.length;;
            int width =1 ;
            // step -1 : calculate left max boundary in an array
                int leftMax[] = new int[n];
                leftMax[0] = height[0] ;
            for (int i = 1; i < n ; i++) {
                leftMax[i] = Math.max(height[i], leftMax[i-1] );
            }

            // step -2 : calculate right max boundary in an array
                int rightMax[] = new int[n] ;
            rightMax[n-1] = height[n-1];
            for (int i =  n-2 ; i >=0 ; i--) {
                rightMax[i] = Math.max(height[i], rightMax[i+1]);
            }


                int trappedWater = 0 ;
            for (int i = 0; i <n ; i++) {
                // using lopp find : min( left max boundary, right max boundary)
                int waterLevel = Math.min(leftMax[i], rightMax[i]) ;

                // trapped water = ( Water level - height[i] ) * width ;
                trappedWater += waterLevel - height[i];
            }
                return trappedWater ;
        }

        public static void main(String[] args) {
                int height[] = {4,2,0,6,3,2,5};
            System.out.println(trappedRainwater(height));
        }
}
