<h2><a href="https://www.geeksforgeeks.org/problems/data-types-java/1?page=1&category=Java&difficulty=Basic,Easy&sortBy=submissions">Data Types - Java</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Working with Data Types is very important in the programming world. Here, we will learn to manipulate the basic data types in Java. You will be given four different variables of different data types: <strong>a (int)</strong>, <strong>b (float)</strong>, <strong>c (double)</strong>, <strong>l (long)</strong><strong>, d (<a href="https://www.geeksforgeeks.org/data-types-in-java/">byte</a>)</strong>. Your task is to do step-wise operations as given below:<br><strong>1.</strong> Divide <strong>c</strong> <strong>by b</strong>.<br><strong>2.</strong> Divide <strong>b</strong> <strong>by a</strong>.<br><strong>3.</strong> Divide <strong>c</strong> <strong>by a</strong>.<br><strong>4.</strong> Add the result at step 3 with <strong>l</strong>.<br><strong>5.</strong> Divide <strong>a</strong> <strong>by d</strong>.</span></p>
<p><strong><span style="font-size: 18px;">Example 1:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong>
1 2 3 5 127</span>
<span style="font-size: 18px;"><strong>Output:</strong></span>
<span style="font-size: 18px;">1.5 2.0 3.0 8.0 0</span>
<span style="font-size: 18px;"><strong>Exaplanation:</strong></span>
<span style="font-size: 18px;">a=1, b=2, c=3, l=5, d=127
c/b=1.5
b/a=2.0
c/a=3.0
(c/a)+l=8.0
a/d=0</span></pre>
<p><strong><span style="font-size: 18px;">Example 2:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong>
2 4 8 16 32</span>
<span style="font-size: 18px;"><strong>Output:
</strong>2.0 2.0 4.0 20.0 0</span>
<span style="font-size: 18px;"><strong>Exaplanation:</strong></span>
<span style="font-size: 18px;">a=2, b=4, c=8, l=16, d=32
c/b=2.0
b/a=2.0
c/a=4.0
(c/a)+l=2.0
a/d=0</span></pre>
<p><span style="font-size: 18px;"><strong>User Task: </strong><br>Your task is to complete the provided function <strong>dataTypes()</strong> following the above-given steps.</span></p>
<p><span style="font-size: 18px;">Expected Time Complexity: O(1).<br></span><span style="font-size: 18px;">Expected Auxiliary Space: O(1).</span></p>
<p>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= a, b, c &lt;= 10<sup>6</sup></span><br><span style="font-size: 18px;">1 &lt;= d &lt;= 127<br>1 &lt;= l &lt;= 10<sup>18</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Java</code>&nbsp;