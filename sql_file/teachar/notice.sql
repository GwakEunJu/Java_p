create table notice(
	id int auto_increment primary key,
    gid int,
    seq int,
    lev int,
    cnt int,
    title varchar(100),
    content varchar(999),
    pname varchar(100),
    pw varchar(100),
    upfile varchar(100),
	reg_date datetime   
);

insert into notice
(id,gid,seq,lev,cnt,title,content,pname,pw,upfile,reg_date) values
(1,1,0,0,0,'첫번째공지','첫번쨰내용','도라','1111','1.gif','2025-07-13'),
(2,2,0,0,0,'두번째공지','두번쨰내용','왕도라','2222','2.gif','2025-07-12'),
(3,3,0,0,0,'세번째공지','세번쨰내용','짱도라','3333','3.gif','2025-06-13'),
(4,4,0,0,0,'네번째공지','네번쨰내용','찐도라','4444','4.gif','2025-05-13'),
(5,5,0,0,0,'다섯번째공지','다섯번쨰내용','돈다도라','5555','5.gif','2024-07-13');

select * from notice where id = 2;

-- 수정
