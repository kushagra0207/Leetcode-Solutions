#User function Template for python3

class Solution:
    def asteroidCollision(self, N, arr):
        # Code here
        stck=[]
        i=0
        while i<len(arr):
            if len(stck)==0:
                stck.append(arr[i])
                i+=1
            elif stck[-1]>0 and arr[i]<0:
                if (arr[i]*-1)<stck[-1]:
                    i+=1
                elif (arr[i]*-1)==stck[-1]:
                    stck.pop()
                    i+=1
                else:
                    stck.pop()
            else:
                stck.append(arr[i])
                i+=1
        return stck


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int(input())
    for _ in range(t):
        N = int(input())
        asteroids = list(map(int, input().split()))
        ob = Solution()
        res = ob.asteroidCollision(N, asteroids)
        for val in res:
            print(val, end = ' ')
        print()
# } Driver Code Ends