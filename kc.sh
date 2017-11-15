#!/bin/bash
#数学运算练习
str=5
let str=$str+1
echo $str
sur(){
echo "hello";
echo $1;
echo $2;
echo "$*"
echo "显示参量$*"
echo "$@"
return 0;
}
sur -a "hello1" -b "hello2" #函数参数调用
echo "第一次带参数调用成功"
$sur #函数调用方法2
echo "第二次函数调用完成"
exit 0

