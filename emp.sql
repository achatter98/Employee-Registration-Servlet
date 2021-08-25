create database emp;

show databases;

use emp;

create table emp(

id int(3) not null,
first_name varchar(20) default null,
last_name varchar(20) default null,
username varchar(250) default null,
pass varchar(20) default null,
address varchar(45) default null,
contact varchar(45) default null,

primary key (id)
);

select * from emp;

