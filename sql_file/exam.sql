create table exam (
	id int,
    hakgi int,
    name varchar(100),
    pid varchar(100),
    reg_date date,
    kor int,
    eng int,
    mat int
);


select * from exam ;

insert into exam
(id,  hakgi, name,  pid, reg_date, kor, eng,  mat)
values
(1,1 , "semi","ddd", '2019-5-4', 77, 78, 71),
(2,1 , "semi","eee", '2019-5-4', 87, 88, 81),
(3,1 , "final","ddd", '2019-7-4', 56, 65, 71),
(4,1 , "final","fff", '2019-7-4', 76, 65, 41),
(5,2 , "semi","fff", '2019-10-4', 97, 98, 91),
(6,2 , "semi","mmm", '2019-10-4', 67, 68, 61),
(7,2 , "final","rrr", '2019-12-4', 76, 85, 91),
(8,2 , "final","ttt", '2019-12-4', 66, 85, 21);