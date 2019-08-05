def solution(A, K):
    # write your code in Python 3.6
    
    if(K==len(A)):
        return A
    elif(K==1):
        arr=[]
        arr.append(A[-1])
        return(arr+A[:-1])
    return(A[len(A)-K:]+A[:len(A)-K])
    
A=[6, 7, 1, 2, 3, 4, 5]
K=3
print(solution(A,K))

