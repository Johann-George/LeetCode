class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        output={}
        large=0
        s=""
        x=0
        for char in paragraph:
            if char.isalpha():
                char=char.lower()
                s+=char
                flag=1
            else:
                if flag==1:
                    output[s]=output.get(s,0)+1
                    s=""
                    flag=0
        # if flag==1:
        output[s]=output.get(s,0)+1
        # output[s]=output.get(s,0)+1
        for val,freq in output.items():
            temp=output.get(val,0)
            if temp>large and val not in banned:
                large=temp
                x=val
        return x