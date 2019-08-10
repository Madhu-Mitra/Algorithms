def solution(A):
    # write your code in Python 3.6
    count=0
    i=0
    
    while (i <len(A)):
        print(i)
        if (A[i]==0):
            
            A=A[i:]
            print(A)
            count+=A.count(1)
            
def solution(A):
    # write your code in Python 3.6
    count=0
    i=0
    
    while (i <len(A)):
        print(i)
        if (A[i]==0):
            
            A=A[i:]
            print()
            count+=A.count(1)
            
            
        i+=1
        
    
    return count
    pass
A=[0, 1, 0, 1, 0, 1]
print(solution(A)))
            
            
        i+=1
        
    
    return count
    pass
A=[0, 1, 0, 1, 0, 1]
print(solution(A))