from functools import lru_cache

@@lru_cache
# very slow without cache 
def count_digits(sentence):
    return sum(sentence.count(digit) for digit in '0123456789')

# long string 
# 4,000,000 length
string = "NAZ 9"*1000000
for i in range(128):
    count_digits(string)

print(count_digits.cache_info())
# CacheInfo(hits=127, misses=1, maxsize=128, currsize=1)

# 0.05s with cache
# 2.20s without cache
