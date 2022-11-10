

# Using Stack
def removeDuplicate(s :str)->str:
    stack=list()
    for i in s:
        if stack and stack[-1]==i:
            stack.pop()
        else:
            stack.append(i)
    return "".join(stack)


# Using two pointer 
def removeDuplicate_(s : str) -> str:
    s=list(s)
    left=0
    for right in range(len(s)):
        if left!=0 and s[left-1]==s[right]:
            left-=1
        else:
            s[left]=s[right]
            left+=1
    return "".join(s[:left])