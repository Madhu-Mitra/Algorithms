def solution(A, K):
    
    if (K>len(A) and len(A)!=0):
        K=K%len(A)
    #handling boundary conditions
    if(K==len(A)):
        return A
    elif(K==1):
        arr=[]
    
        arr.append(A[-1])
        return(arr+A[:-1])
    #rotating the array
    return(A[len(A)-K:]+A[:len(A)-K])
A=[]

import random
for x in range(6):
    A.append(random.randint(0,9))
K=random.randint(0,100)
print("Input list is ",A)
print("rotating the array by ",K," rotations")


print("The rotated array is ",solution(A,K))

