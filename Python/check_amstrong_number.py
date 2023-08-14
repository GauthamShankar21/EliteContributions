def power_1(A, B):  
        
    if B == 0:  
        return 1  
    if B % 2 == 0:  
        return power_1(A, B // 2) * power(A, B // 2)  
            
    return A * power(A, B // 2) * power(A, B // 2)  
    
def order_1(A):  
        N = 0  
    while (A != 0):  
        N = N + 1  
        A = A // 10  
            
    return N  
    
def is_Armstrong(A):  
        
    N = order_1(A)  
    temp_1 = A  
    sum_1 = 0  
        
    while (temp_1 != 0):  
        R_1 = temp_1 % 10  
        sum_1 = sum_1 + power_1(R_1, N)  
        temp_1 = temp_1 // 10  
    
    return (sum_1 == A)  
    
A = int(input("Please enter the number to be checked: "))  
print(is_Armstrong(A))  
