class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        output=[]
        intervals.append(newInterval)
        intervals.sort(key=lambda i: i[0])
        output.append(intervals[0])

        for start,end in intervals[1:]:
            lastEnd=output[-1][1]
            if start<=lastEnd:
                output[-1][1]=max(end,lastEnd)
            else:
                output.append([start,end])
        return output