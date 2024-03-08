def findDuplicate(arr):
    # Write your code here

    freq={}
    for i in arr:
        if i in freq:
            freq[i]+=1
            return i
        else:
            freq[i]=1
  
