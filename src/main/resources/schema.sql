create table department(id serial primary key, name varchar(255) not null);
create table employee(id serial primary key, name varchar(255) not null, salary varchar(255) not null, department_id smallint not null)