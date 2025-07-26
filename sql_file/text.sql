SELECT * FROM mem2;

insert into mem2 
(id, birth, height) value
('aaa','2002-06-02','184');

insert into mem2 
(id, mail,  birth) value
('bbb', '1234', '2002-06-02'),
('ccc', '2234', '2012-08-02'),
('ddd', '3234', '2009-11-17')
;

-- 전체 변경
update mem2 set
name = '단백이';

-- 문자열 표현  : '' , "" , `
update mem2 set
name = '쓴백이'
where id = 'aaa'
;

-- 문자열 표현  : '' , "" , `
update mem2 set
name = '짠백이',
height = 175
where id = 'bbb'	/* where = 조건절 if문과 비슷 */
;

-- 삭제
delete from mem2
where id = 'fff';

-- 검색
select id, name, height from mem2;

-- 연산자 사용 가능
-- as : 별칭 넣기 가능
select id, name, height , height + 20 as hh20 from mem2;

select id, name, height , height + 20 as hh20 from mem2
where height > 180;


