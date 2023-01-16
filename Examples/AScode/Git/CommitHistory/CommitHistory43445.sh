commit 0745d369ae306d0ecdf4ec4fbd7a710ca271baa4 (HEAD -> main, origin/main, origin/HEAD)
Author: Alec Sears <76724804+searsam1@users.noreply.github.com>
Date:   Mon Dec 19 04:42:10 2022 -0700

    add tests
    
    add 100 tests that compare fact and math.factorial

diff --git a/factorial.py b/factorial.py
index b6e7bc7..3592d3a 100644
--- a/factorial.py
+++ b/factorial.py
@@ -1,5 +1,6 @@
 # By AS
-def factorial(n):
+import math
+def fact(n):
   """
   n! = n × (n-1) × (n-2) × …1  
   Return n!
@@ -13,7 +14,8 @@ def factorial(n):
   return prod 
 
 def main():
-  assert factorial(3) == 6
+  for i in range(100):
+    assert math.factorial(i) == fact(i)
   print("Tests Passed")
 
 if __name__ == "__main__":
~
(END)
