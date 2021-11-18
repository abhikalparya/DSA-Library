def power(base,exponent):
    assert exponent>=0 and int(exponent)==exponent , "Exponent should be positive integer!"
    if exponent==0:
        return 1
    if exponent==1:
        return base
    return base * power(base,exponent-1)

print(power(2,4))