int majorityElement(int* nums, int numsSize) {
    int maj=nums[0];
    int votes=1;
    for(int i=1;i<numsSize;i++){
      if(votes==0){
        votes++;
           maj=nums[i];
      }
      else if(maj==nums[i]){
        votes++;
      }
      else{
        votes--;    
      }
      
    }
    return maj;
}