select now(), sysdate(), curdate(), curtime();

select year(now()), month(now()), day(now()); 	
select dayofyear(now()), dayofmonth(now()), dayofweek(now());
/*
dayofweek
일 월 화 수 목 금 토
1  2 3  4 5 6  7 
*/
select week(now()),weekday(now()), weekofyear(now());
/*
weekday
일 월 화 수 목 금 토
0  1 2  3 4 5 6 
*/

select monthname(now()), dayname(now());
select hour(now()),minute(now()),second(now());

select now(), date_add(now(), interval 3 month) , date_add(now(), interval -3 month) , date_add(now(), interval 3 day); -- 영화 예매 시 얼마 전부터 가능하게 할지  
select now(), date_sub(now(), interval 3 month) , date_sub(now(), interval -3 month) , date_sub(now(), interval 3 day);

select now(), adddate(now(), interval 3 month) , adddate(now(), interval -3 month) , adddate(now(), interval 3 day);
select now(), subdate(now(), interval 3 month) , subdate(now(), interval -3 month) , subdate(now(), interval 3 day);

-- select time_add();
select now(), addtime(now(),'00:05:00'), addtime(now(),'-00:05:00');
select now(), subtime(now(),'00:05:00'), subtime(now(),'-00:05:00');

select datediff(now(),'2024-05-06'), datediff(now(),'2025-08-28'); -- 예약일 몇일 전입니다.

select period_add(202510,05);  -- 2025년 10월 + 5개월
select period_diff(202510,202709);  -- 2025년 10월 ,2027년09월의 개월 차

-- timestamp(초단위) : 1970,01,01 기준
select now(), unix_timestamp(), unix_timestamp('1970-01-01 09:00:00'),unix_timestamp('1970-01-01 09:00:10');
-- 1752023436
select from_unixtime(0),from_unixtime(100),from_unixtime(1752023436);

-- 일단위 날짜-> 일 숫자
select  to_days('0000-01-01'), to_days('0000-02-15') , to_days('0001-02-15'), to_days(now());

-- 일 숫자 -> 날짜 365 보다 큰 값에서 유효
select  from_days(1), from_days(46), from_days(411);

-- 시간 -> 초
select time_to_sec('00:23:45'), time_to_sec('01:01:01'), time_to_sec('2505-07-09 01:01:01');

select sec_to_time(100), sec_to_time(300), sec_to_time(4800), sec_to_time(24*60*60), sec_to_time(60*60*60);

-- 중요 (simpledateformat과 흡사)
select str_to_date('2022년 03월 20일','%Y년 %m월 %d일');


select date_format(now(), '%Y')
, date_format(now(), '%y')
, date_format(now(), '%M')
, date_format(now(), '%m')
, date_format(now(), '%c')
, date_format(now(), '%D')
, date_format(now(), '%d')
, date_format(now(), '%e')
, date_format(now(), '%w')	-- 일요일 : 0
, date_format(now(), '%W')
, date_format(now(), '%a')
, date_format(now(), '%p')
, date_format(now(), '%H') -- 24시간 두자리 표기
, date_format(now(), '%k') -- 24시간 한자리 표기
, date_format(now(), '%h') -- 12시간 표기
, date_format(now(), '%l')
, date_format(now(), '%i')
, date_format(now(), '%s')
, date_format(now(), '%j')
, date_format(now(), '%r')
, date_format(now(), '%T') -- 24시간 기준
;

-- 위험해서 비 추천
select now(), now()+10;

-- mem2 성년인 사람의 올해 생일을 출력하세요
select * from mem2;
select * from mem2 where birth > year(now())-19;

-- select *, adddate(birth, interval 19 year) from mem2
-- select *, date_format(now(),'%Y'), date_format(now(),'%m-%d'), str_to_date('2025-06-02','%Y-%m-%d') from mem2
-- select *, concat(date_format(now(),'%Y-'), date_format(now(),'%m-%d')), str_to_date('2025-06-02','%Y-%m-%d') from mem2
-- select *, str_to_date(concat(date_format(now(),'%Y-'), date_format(birth,'%m-%d')),'%Y-%m-%d') from mem2
select *, str_to_date(concat(date_format(now(),'%Y-'), date_format(birth,'%m-%d')),'%Y-%m-%d') as now_burth
from mem2
where adddate(birth, interval 19 year) < now();




