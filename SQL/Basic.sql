create schema College;

create table details(id int primary key not null, c_name varchar(44), c_usn varchar(20));

select * from details;

insert into details values (4, "pooja", "4mc17ec027");

update details set c_name= "danya" where id = 2;

delete from details where c_name = "thanu";

select id, c_usn from details;

select * from details group by c_name;

create table staff(s_id int primary key not null, s_no_workers int, s_subject varchar(30), c_id int,constraint foreign key(c_id) references details(id));

select * from staff;

insert into staff values (8, 43, "english", 1);

select * from staff left join details on c_id = id;
