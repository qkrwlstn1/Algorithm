select sum(g.score) as SCORE, e.emp_no, e.emp_name, e.position, e.email 
from hr_employees e join hr_grade g on e.emp_no = g.emp_no
where g.year = 2022
group by e.emp_no
order by SCORE desc
limit 1
