#!/bin/bash
user="root"
pass="admin"
mysql -u$user -p$pass <<EOF 
use company2;
insert into c (c_id,cname,t_id) values ("0005","gongcheng",1);
select * from c;
EOF

