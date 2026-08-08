class Solution {
    int minEatingSpeed(int[] piles, int h) {
    int minSpeed = 1;

    // Find max pile size
    int maxSpeed = 0;
    for (int pile : piles)
      maxSpeed = Math.max(maxSpeed, pile);

    // Binary search
    while (minSpeed < maxSpeed) {
      int mid = minSpeed + (maxSpeed - minSpeed) / 2;

      if (canEatInTime(piles, h, mid))
        maxSpeed = mid;
      else
        minSpeed = mid + 1;
    }

    return minSpeed;
  }

  private boolean canEatInTime(int[] piles, int h, int speed) {
    int hours = 0;
    for(int pile : piles)
      hours += (int) Math.ceil((double) pile / speed);

    return hours <= h;
  }

    // public boolean isVisible(int[] arr, int hour, int maxBanana){
    //     int hours = 0;
    //     for(int pile : arr){
    //         hours +=  Math.ceil( arr / maxBanana);
    //     }
    //     return hours <= hour;
    // }
    // public int minEatingSpeed(int[] piles, int h) {
    //     int s = 1;
    //     int sum = 0;
    //     for(int i=0; i<piles.length; i++){
    //         sum += piles[i];
    //     }
    //     int e = sum;
    //     int ans = 0;
    //     while(s <= e){
    //         int mid = s + (e-s)/2;
    //         if(isVisible(piles, h, mid)){
    //             ans = mid;
    //             e = mid-1;
    //         }
    //         else{
    //             s = mid+1;
    //         }
    //     }
    //     return ans;
    // }
}