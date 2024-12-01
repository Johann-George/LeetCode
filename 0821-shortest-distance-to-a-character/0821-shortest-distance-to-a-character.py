class Solution:
    def shortestToChar(self, s: str, c: str) -> List[int]:
        arr=[]
        arr1=[]
        answer=[]
        j=0        
        for char in s:
            if char==c:
                arr.append(j)
            j+=1
        print(arr)
        for ind in range(0,len(s)):
            arr1.append(ind)
            ind+=1
        for ind in range(0,len(s)):
            smallest=float("inf")
            for i in range(0,len(arr)):
                temp=abs(arr1[ind]-arr[i])
                if temp<smallest:
                    smallest=temp
            answer.append(smallest)
           
        return answer