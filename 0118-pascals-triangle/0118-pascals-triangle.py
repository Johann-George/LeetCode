class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        arrFinal=[[1],[1,1]]
        if numRows==0:
            arrFinal.pop()
            arrFinal.pop()
            return arrFinal
        elif numRows==1:
            arrFinal.pop()
            return arrFinal
        for i in range(2,numRows):
            arr=arrFinal[-1]
            l,r=0,1
            arrNew=[]
            arrNew.append(1)
            while l<r and r<len(arr):
                arrNew.append(arr[l]+arr[r])
                l+=1
                r+=1
            arrNew.append(1)
            arrFinal.append(arrNew)
        return arrFinal