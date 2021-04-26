create database hms;


use hms;


create table login(username varchar(40), password varchar(40));


insert into login values('admin','12345');

 

create table room(room_number varchar(20), availability varchar(20), clean_status varchar(20), price varchar(20), bed_type varchar(30));


create table employee(name varchar(30), age varchar(10), gender varchar(30), job varchar(30), salary varchar(30), phone varchar(30), aadhar varchar(30), email varchar(40));


create table driver(name varchar(30), age varchar(10), gender varchar(20), company varchar(30), brand varchar(30), available varchar(10), location varchar(50));


create table department(department varchar(30), budget varchar(30));

create table customer(id_type varchar(30), id_number varchar(10), name varchar(30), gender varchar(10), address varchar(60), room_number varchar(20), status varchar(10), deposit varchar(20));


select * from room;
