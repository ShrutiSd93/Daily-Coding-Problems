class MaxAverageSubarray:
    def max_avg(self, nums, k):
        if len(nums) < k :
            return 0
        currentSum =0;
        maxSum=0;

        for i in range(k):
            currentSum += nums[i]
        maxSum = currentSum

        for i in range(k,len(nums)):
            currentSum+=nums[i] - nums[i-k]
            if(currentSum > maxSum):
                maxSum = currentSum
        
        return maxSum/float(k)
    
nums = [1,12,-5,-6,50,3]
k = 4
obj = MaxAverageSubarray()
print(obj.max_avg(nums, k))