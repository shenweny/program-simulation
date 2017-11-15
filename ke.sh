#!/bin/bash
#while 测试
str=10
while test $str -gt  1
do
echo "$str"
let str=$str-1

done
