class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ans = defaultdict(list)
        for s in strs:
            key = str(sorted(s))
            ans[key].append(s)
        
        return list(ans.values())