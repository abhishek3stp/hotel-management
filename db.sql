create database hms;


use hms;

drop table login ;
drop table customer;
drop table room;
drop table employee;

create table login(
username varchar(40) primary key, 
password varchar(40), 
authorization varchar(40) 
);


insert into login values('Admin','12345','Admin');
insert into login values('K','0808','Standard');
insert into login values('Ashirbad','123','Admin');
insert into login values('Raju', '456', 'Standard');
insert into login values('Abhishek','123456','Admin');

select * from login;

create table room(
room_number varchar(20) primary key, 
availability varchar(20), 
clean_status varchar(20), 
price varchar(20), 
bed_type varchar(30)
);
 
create table customer(
id_type varchar(30), 
id_number varchar(30), 
name varchar(30), 
gender varchar(30), 
country varchar(30), 
room_number varchar(20), 
status varchar(30), 
deposit varchar(30),
primary key (id_type, id_number),
foreign key (room_number) references room(room_number)
);


create table employee(
name varchar(30), 
age varchar(10), 
gender varchar(30), 
job varchar(30), 
salary varchar(30), 
phone varchar(30), 
aadhar varchar(30) primary key, 
email varchar(40)
);
