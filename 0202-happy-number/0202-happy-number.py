class Solution:
    def isHappy(self, n: int) -> bool:
        def getNext(number: int):
            return sum(int(digit)**2 for digit in str(number))
        
        slow=n
        fast=getNext(n)

        while fast!=1 and slow!=fast:
            slow=getNext(slow)
            fast=getNext(getNext(fast))
        return fast==1