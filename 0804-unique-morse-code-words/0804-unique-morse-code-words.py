class Solution:
    def uniqueMorseRepresentations(self, words: List[str]) -> int:
        arr=[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        arr1=["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]
        morse=[]
        x=0
        s=""
        for word in words:
            for char in word:
                i=arr1.index(char)
                s=s+arr[i]
            morse.append(s)
            s=""
            x=x+1
        unique_strings=set(morse)
        return len(unique_strings)