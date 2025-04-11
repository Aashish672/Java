def xor_series(n):
    if n%4 ==0:
        return n
    elif n%4 == 1:
        return 1    
    else:
        return 0
    
print(xor_series(10)) # 4