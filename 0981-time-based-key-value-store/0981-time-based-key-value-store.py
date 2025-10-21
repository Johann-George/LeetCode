class TimeMap:

    def __init__(self):
        self.keyStore = {}

    def set(self, key: str, value: str, timestamp: int) -> None:
        if key not in self.keyStore:
            self.keyStore[key] = []
        self.keyStore[key].append([value, timestamp])

    def get(self, key: str, timestamp: int) -> str:
        res, value = "", self.keyStore.get(key, [])
        l, r = 0, len(value) - 1
        while(l<=r):
            m = (l+r) // 2
            if(value[m][1] <= timestamp):
                res = value[m][0]
                l = m + 1
            else:
                r = m-1
        return res

# Your TimeMap object will be instantiated and called as such:
# obj = TimeMap()
# obj.set(key,value,timestamp)
# param_2 = obj.get(key,timestamp)