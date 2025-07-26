-- 이퀄 조인 (자료형이 같은게 좋다)
select * from exam, mem2
where mem2.id = pid;

select exam.* , mem2.name as m_name, birth from exam, mem2
where mem2.id = pid;

-- left outer 조인 : exam은 모두 선택, 조건이 맞지 않는 mem2는 null로 처리
select * from exam
left outer join mem2
on mem2.id = pid;

-- right outer 조인 : mem2는 모두 선택, 조건이 맞지 않는 exam은 null로 처리
select * from exam
right outer join mem2
on mem2.id = pid;

-- inner 조인 : 이퀄조인과 동일
select * from exam -- 첫번쨰 테이블
inner join mem2 --  두번째 테이블
on mem2.id = pid; -- 조인 조건

select * from mem2
where friend = id;

-- self 조인 : 동일 테이블을 다중으로 사용하여 조인 / 테이블 별칭을 제공해야 한다.
-- 이퀄 조인
select me.*, fr.id as fid, fr.name as fname 
from mem2 me, mem2 fr
where me.friend = fr.id;
-- select * from mem2 , mem2 ;

select me.*, fr.id as fid, fr.name as fname 
from mem2 me
left outer join mem2 fr
on me.friend = fr.id;

select me.*, fr.id as fid, fr.name as fname 
from mem2 me
right outer join mem2 fr
on me.friend = fr.id;
