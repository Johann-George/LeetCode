class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        if(len(stones)==1): 
            return stones[0]
        for i in range (0, len(stones)):
            stones[i] = stones[i]*-1
        heapq.heapify(stones)
        while(len(stones) > 1):
            a = heapq.heappop(stones)
            b = heapq.heappop(stones)
            if(a!=b):
                heapq.heappush(stones,-1 * (b-a))

        if(len(stones)==1):
            return -1 * stones[0]
        else:
            return 0 