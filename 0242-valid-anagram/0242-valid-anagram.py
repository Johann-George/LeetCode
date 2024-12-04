class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        return Counter(s)==Counter(t)
        # arr={}
        # arr1={}
        # temp=0
        # for char in s:
        #     arr[char]=arr.get(char,0)+1
        # for char1 in t:
        #     arr[char1]=arr.get(char1,0)+1
        # for val,freq in arr.items():
        #     for val1,freq1 in arr1.items():
        #         if val==val1:
        #             temp=1
        #             if arr.get(val,0)!=arr1.get(val1,0):
        #                 return False
        #     if temp==0:
        #         return False
        #     temp=0
        # return True
