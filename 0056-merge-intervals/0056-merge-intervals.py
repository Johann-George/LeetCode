class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        res=[]
        i,j=0,1
        if len(intervals)==0 or len(intervals)==1:
            return intervals
        while j<len(intervals):
            if max(intervals[i])>=min(intervals[j]):
                res.append([min(intervals[i]),max(intervals[j])])
                i=j+1
                j+=1
            else:
                res.append(intervals[i])
                i=j
                continue
            j+=1
        return res
        