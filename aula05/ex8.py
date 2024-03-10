def ispolindrome(s):
         r=""
         for t in range(len(s)-1,-1,-1):
            r = r + s[t]
         if s==r:
            return True
         else:
            return False

print(ispolindrome("maam"))
print(ispolindrome("clinicamente tenso"))