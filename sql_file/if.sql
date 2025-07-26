select 123.456, -123.456, abs(123.456), abs(-123.456);
select 123.456, -123.456, ceiling(123.456), ceiling(-123.456);
select 123.456, -123.456, floor(123.456), floor(-123.456); -- 올림
select 123.456, -123.456, truncate(123.456,2), truncate(-123.456,2); -- 소수점 자리 수 맞춰야한다/ 잘라내기
select round(123.456), round(-123.456), round(123.456,2), round(-123.456,2); -- 반올림

select pow(2,4), mod(15,7); -- 
select greatest(12,7,91,45,23), least(12,7,91,45,23); -- 가장 큰 값, 가장 작은 값

select interval(76, 0,60,70,80,90);
--                  1  2  3  4  5  맨 앞의 값에서 순차적으로 비교하여 큰 값이 나오는 위치 
select interval(76, 0,90,70,60,80);
--                  1  2  3  4  5 
select interval(76, 90,70,60,80);
--                  1  2  3  4  
select interval(80, 0,60,70,80,90);
--                  1  2  3  4  5

select pi();

select *, ifnull(height, 0) from mem2; -- null값을 찾아서 변경

select kor, if(kor>=70,'합격','불합격') from exam; -- 삼항연산자와 유사 

select kor,
 if(kor>=90,'수',if(kor>=80,'우',if(kor>=70,'미',if(kor>=60,'양','가')))) 
 from exam; -- 삼항 연산자의 중첩
 
 
 select kor ,
 case
	when kor >=90 then '수'
    when kor >=80 then '우'
    when kor >=70 then '미'
    when kor >=60 then '양'
	else '가'

 end
 from exam;
 
 -- 암호화
 -- select '1234', password('1234');
 select
 aes_encrypt('내용','qwer'), hex(aes_encrypt('내용','qwer')); 
 
 -- 7D5C7A40009B3836A6C35D2ED353DCA0
 select unhex('7D5C7A40009B3836A6C35D2ED353DCA0'),
 aes_decrypt(unhex('7D5C7A40009B3836A6C35D2ED353DCA0'),'qwer');
 -- %eb%82%b4%ec%9a%a9 (내용)
 

 
