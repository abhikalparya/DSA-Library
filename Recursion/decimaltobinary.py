def dectobin(n):
    assert int(n)==n , "The parameter must be integer."
    if n==0:
        return 0
    else:
        return n%2 + 10* dectobin(int(n/2))

print(dectobin(13))