 -- exam 테이블에서 총점, 평균을 계산하고 평균을 이용하여 수우미양가를 출력하세요
 -- 각 과목의 null값은 0으로 대체하여 계산하세요
 -- 평균은 소숫점 2자리에서 반올림하세요.
 
 
 select * , 
ifnull(kor,0)+ifnull(eng,0)+ifnull(mat,0) as tot ,
round((ifnull(kor,0)+ifnull(eng,0)+ifnull(mat,0))/3,2) as avg,
mid('가양미우수', 
   interval((ifnull(kor,0)+ifnull(eng,0)+ifnull(mat,0))/3,0,60,70,80,90) , 1) 
      as grade
from exam;
 
 
 select *, kor , eng, mat, 	
 ifnull(kor,0) as kor_m,
 ifnull(eng,0) as eng_m,
 ifnull(mat,0) as mat_m,
 kor+eng+mat as total_score,
round(kor+eng+mat/3, 2) as avg_total,
 
	case
	when kor>=90 then '수'
    when kor>=80 then '우'
    when kor>=70 then '미'
    when kor>=60 then '양'
	when eng>=90 then '수'
    when eng>=80 then '우'
    when eng>=70 then '미'
    when eng>=60 then '양'
	when mat>=90 then '수'
    when mat>=80 then '우'
    when mat>=70 then '미'
    when mat>=60 then '양'
    else '가'

 end
 from exam
 group by kor,eng,mat;
 


 