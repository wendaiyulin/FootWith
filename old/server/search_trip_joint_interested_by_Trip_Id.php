﻿<?php
//使用utf8解析页面
header('content-type;text/html;charset=utf-8');
//修正编码
mysql_query('SET NAMES UTF8');	
//提取要查询的变量
$Trip_Id = $_POST["Trip_Id"];
//连接服务器
$link = mysql_connect('localhost','root','');
//选择数据库
mysql_select_db('banlv',$link)
	or die("Can\'t select database").mysql_errno().mysql_error();
	
//修正编码
mysql_query('SET NAMES UTF8');	
//进行查询trip_interested
$query_content = "SELECT * FROM trip_interested WHERE Trip_Id = $Trip_Id";
$result = mysql_query($query_content,$link);
//记录字段数
$cnt = mysql_num_fields($result);
while($row = mysql_fetch_array($result,MYSQL_BOTH))
{
	for($i = 0; $i< $cnt ;$i++)
	echo $row[$i].' ';
	printf("<br/>");
}

//修正编码
mysql_query('SET NAMES UTF8');	
//进行查询trip_joint
$query_content = "SELECT * FROM trip_joint WHERE Trip_Id = $Trip_Id";
$result = mysql_query($query_content,$link);
//记录字段数
$cnt = mysql_num_fields($result);
while($row = mysql_fetch_array($result,MYSQL_BOTH))
{
	for($i = 0; $i< $cnt ;$i++)
	echo $row[$i].' ';
	printf("<br/>");
}
?>