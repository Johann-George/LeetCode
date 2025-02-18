class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        memo = {}
        def dfs(Sum):
            if amount==Sum:
                return 0
            if Sum in memo:
                return memo[Sum]
            output = float("inf")
            for i in range(len(coins)):
                if amount>=(Sum+coins[i]):
                    output = min(output,1+dfs(Sum+coins[i]))
            memo[Sum] = output
            return output
        value = dfs(0)
        return -1 if value>=float("inf") else value