#!/bin/bash
str=ka.sh
#if [ -f $str]
if test -f $str #使用中括号还是报错，暂时还是只能使用这个方法
then 
  echo "$str is exist";
else
  echo "$str is not exists";
fi
exit 0
 
