class Solution:
    def numberOfLines(self, widths: List[int], s: str) -> List[int]:
        arr=["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]
        result=[]
        x=0
        y=1
        for char in s:
            i=arr.index(char)

            if x+widths[i]<=100:
                x+=widths[i]
            else:
                x=0
                x+=widths[i]
                y=y+1
        result.append(y)
        result.append(x)
        return result
