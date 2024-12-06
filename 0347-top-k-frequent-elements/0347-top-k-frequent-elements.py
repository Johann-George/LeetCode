class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counter={}
        heap=[]
        res=[]
        for n in nums:
            counter[n]=counter.get(n,0)+1
        
        for key,val in counter.items():
            heapq.heappush(heap,(-val,key))

        while len(res)<k:
            res.append(heapq.heappop(heap)[1])
        
        return res