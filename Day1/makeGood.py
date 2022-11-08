# # 1544. Make The String Great

# Given a string s of lower and upper case English letters.

# A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:

# 0 <= i <= s.length - 2
# s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
# To make the string good, you can choose two adjacent characters that make the string bad and remove them. You can keep doing this until the string becomes good.

# Return the string after making it good. The answer is guaranteed to be unique under the given constraints.

# Notice that an empty string is also good.

 

# Example 1:

# Input: s = "leEeetcode"
# Output: "leetcode"
# Explanation: In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode".
# Example 2:

# Input: s = "abBAcC"
# Output: ""
# Explanation: We have many possible scenarios, and all lead to the same answer. For example:
# "abBAcC" --> "aAcC" --> "cC" --> ""
# "abBAcC" --> "abBA" --> "aA" --> ""
# Example 3:

# Input: s = "s"
# Output: "s"
 

# Constraints:

# 1 <= s.length <= 100
# s contains only lower and upper case English letters.


# Stack approach

def makeGoodap1(string :str)->str:
    stack=list()
    for i in string:
        if stack and abs(ord(stack[-1])-ord(i))==32:
            stack.pop()
        else:
            stack.append(i)
    return "".join(stack)


# Two pointer approach


def makeGoodap2(string :str)->str:
    s=list(string)
    left=0
    for right in range(len(string)):
        if left>0 and abs(ord(s[right])-ord(s[left-1]))==32:
            left-=1
        else:
            s[left]=s[right]
            left+=1
    return "".join(s[:left])


print(makeGoodap1("LeEetcode"))
print(makeGoodap2("LeEetcode"))
