#!/bin/bash
#中括号练习
str=0
str1=1
echo $str
#if [$str -eq 0] #这一步一直报警，用下面的
#if test $str -eq $str1
if ($str==$str1)
then 
 echo '$str=0'
else 
 echo '$str/=0';
fi

