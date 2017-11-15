#!/bin/bash
str=$(cat ./O1007.CNC);
#str=$(printf %s $str)
#经过这一步，去除了文本中的空格和换行符,可以添加到数据库
#str="hello25"
echo $str
user="root"   
pass="admin"
mysql -u$user -p$pass <<EOF 
#2>/dev/null

use company2;
#insert into cnc (id_name,id_info,id_text) values ("O0033","p15006","$str");

insert into cnc (id_name,id_info,id_text) values ("O0032","p15006","$str");
#在变量前面添加，居然没有影响，不知道什么机制
#insert into cnc (id_name,id_info,id_text) values ("O0031","p15006","$str");
#这一步出现，还是可以写数据到数据库，但是有警告出现，估计是文本中的空格和换行符转义。有待下一次更新代码用法
#变量到现在还是无法引用
#使用"$str"可以使用,$str无法使用
#insert into cnc (id_name,id_info,id_text) values ("O0019","p15006", "$(echo "$str")" );
#sleep(10);
select * from cnc ;
EOF
 

