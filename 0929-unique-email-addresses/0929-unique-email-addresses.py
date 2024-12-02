class Solution:
    def numUniqueEmails(self, emails: List[str]) -> int:
        arr=[]
        flag=0
        s=""
        for email in emails:
            for char in email:
                if char.isalpha() and flag==0:
                    s+=char
                elif char=='+':
                    flag=1
                elif char=='@':
                    s+=email[email.index(char):]
            arr.append(s)
            s=""
            flag=0
        print(arr)
        arr1=set(arr)
        return len(arr1)