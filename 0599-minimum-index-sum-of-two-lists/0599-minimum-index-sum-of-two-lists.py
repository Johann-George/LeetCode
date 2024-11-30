class Solution:
    def findRestaurant(self, list1: List[str], list2: List[str]) -> List[str]:
        arr1=[]
        arr2=[]
        y=0
        least=2001
        for i in range(0,len(list1)):
            for j in range(0,len(list2)):
                if list1[i]==list2[j]:
                    temp=i+j
                    if temp<=least:
                        least=temp
                        x=i
                        arr1.append(least)
                        arr2.append(x)
        arr=[]
        while(y<len(arr1)):
            if arr1[y]==least:
                z=arr2[y]
                arr.append(list1[z])
            y+=1
        return arr
        
        

        