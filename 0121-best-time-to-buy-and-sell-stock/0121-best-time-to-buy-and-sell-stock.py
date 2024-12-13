class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        l=0
        r=1
        largest=0
        while l<r and r<len(prices):
            temp=prices[r]-prices[l]
            if temp<0:
                l+=1
                r=l+1
                continue
            elif temp>largest:
                largest=temp
            r+=1
        return largest