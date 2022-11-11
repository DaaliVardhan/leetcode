

def removeDuplicate(nums):
    low=0
    for right in range(len(nums)):
        if low!=0 and nums[low-1]==nums[right]:
            continue 
        else:
            nums[low]=nums[right]
            low+=1 
    return low 
