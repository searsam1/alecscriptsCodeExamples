import locale, functools 
sorted(['abc', 'ab', 'a'], 
    key=functools.cmp_to_key(locale.strcoll))

# ['a', 'ab', 'abc']
