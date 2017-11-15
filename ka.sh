#!/bin/bash
#用途：演示IFS的用法
line="root:x:0:root:/root:/bin/bash"
oldifs=$IFS
IFS=":"
count=0
for item in $line;
do
test $count -eq 0 && test $USER==$item;
test $count -eq 6 && test $SHELL = $item;
 let count++
done;
IFS=oldifs;
echo $USER\'s shell is $SHELL;

