SELECT employee_id, first_name || '   ' || last_name 풀네임, email || ' @company.com ' 이메일 
FROM employees;

SELECT *
FROM employees
WHERE salary > 14000;

SELECT *
FROM employees
WHERE last_name = 'King';

SELECT *
FROM employees
WHERE hire_date < '02/06/10';

SELECT *
FROM employees
WHERE employee_id = 100;

SELECT *
FROM employees
WHERE first_name = 'David';

SELECT *
FROM employees
WHERE employee_id >= 105;

SELECT *
FROM job_history
WHERE start_date < '03/03/06';

SELECT last_name, department_id, salary
FROM employees
WHERE department_id = 60
OR (department_id = 80 AND salary > 7000);

SELECT last_name, department_id, salary
FROM employees
WHERE (department_id = 60 OR department_id = 80) 
AND salary > 7000;

SELECT *
FROM employees
WHERE hire_date > '08/04/04' OR salary > 13000 AND job_id = 'AD_VP';

SELECT *
FROM employees
WHERE hire_date > '08/04/04' OR (salary > 13000 AND job_id = 'AD_VP');

SELECT *
FROM employees
WHERE hire_date > '04/01/01' OR salary > 5000;

SELECT *
FROM employees
WHERE NOT(hire_date > '04/01/01' OR salary > 5000);

SELECT *
FROM employees
WHERE NOT(hire_date <= '04/01/01' OR salary > 5000)
WHERE NOT(hire_date > '04/01/01' AND salary > 5000)
WHERE NOT(hire_date > '04/01/01' AND salary <= 5000)
WHERE (hire_date > '04/01/01' AND salary <= 5000);

SELECT *
FROM employees
WHERE salary > 4000 AND job_id = 'IT_PROG';

SELECT *
FROM employees
WHERE salary > 4000 AND (job_id = 'IT_PROG' OR job_id = 'FI_ACCOUNT');

SELECT *
FROM employees
WHERE salary = 4000
OR salary = 3000
OR salary = 2700;

SELECT * 
FROM employees
WHERE salary IN (4000,3000,2700);

SELECT * 
FROM employees
WHERE salary IN (10000,17000,24000);

SELECT * 
FROM employees
WHERE department_id NOT IN (30,50,80,100,110);

SELECT * 
FROM employees
WHERE salary >= 9000 AND salary <= 10000;

SELECT * 
FROM employees
WHERE salary BETWEEN 9000 AND 10000;

SELECT * 
FROM employees
WHERE salary >= 10000 AND salary <= 20000;

SELECT * 
FROM employees
WHERE hire_date BETWEEN '04/01/01' AND '04/12/30'
ORDER BY hire_date;

SELECT * 
FROM employees
WHERE last_name LIKE 'B%';

SELECT * 
FROM employees
WHERE last_name LIKE '%b%';

SELECT * 
FROM employees
WHERE last_name LIKE '____y';

SELECT * 
FROM employees
WHERE last_name LIKE '%y';

SELECT * 
FROM employees
WHERE job_id LIKE '%AD%';

SELECT * 
FROM employees
WHERE job_id LIKE '%AD___';

SELECT * 
FROM employees
WHERE phone_number LIKE '___.___.1234';

SELECT * 
FROM employees
WHERE job_id LIKE '%MGR' OR job_id LIKE '%ASST';

SELECT * 
FROM employees
WHERE commission_pct IS NULL;

SELECT * 
FROM employees
WHERE commission_pct IS NOT NULL;

SELECT * 
FROM employees
WHERE manager_id IS NULL;

SELECT * 
FROM employees
ORDER BY last_name DESC;

SELECT department_id, employee_id, first_name, last_name
FROM employees
ORDER BY department_id, employee_id;
-- 부서번호로 정렬(sorting) 한 후 사원번호로 정렬

SELECT department_id, last_name, salary*12연봉
FROM employees
ORDER BY 연봉 DESC;

SELECT department_id, last_name, salary*12연봉
FROM employees
ORDER BY 3 DESC;

SELECT employee_id, first_name, last_name
FROM employees
ORDER BY employee_id DESC;

SELECT *
FROM employees
WHERE job_id LIKE '%CLERK%'
ORDER BY salary DESC;

SELECT department_id, last_name, department_id
FROM employees
WHERE UPPER(last_name) = 'HIGGINS';

SELECT department_id, last_name, department_id
FROM employees
WHERE lower(last_name) = 'HIGGINS'; --왜안나옴?

SELECT department_id, last_name, email
FROM employees
WHERE INITCAP(email) = 'Sking'; -- 전부 대문자로 바뀜

SELECT last_name, CONCAT('job category is ', job_id) "Job"
FROM employees
WHERE SUBSTR(job_id, 4) = 'REP'; -- 4번째에 REP 들어가는거 다 겁색됨

SELECT last_name, CONCAT('직업명은 ', job_id) 직업
FROM employees
WHERE SUBSTR(job_id, 4) = 'REP'; -- 오류

SELECT last_name, SUBSTR(last_name, 1, 1)
FROM employees;

SELECT employee_id,
CONCAT(first_name, last_name) 전체이름,
last_name,
LENGTH(last_name) 길이,
INSTR(last_name, 'a') "'a'가 몇번째?"
FROM employees;

SELECT first_name, last_name,
UPPER(CONCAT(first_name, SUBSTR(last_name, 1, 3))) 이름합성
FROM employees
WHERE department_id = 60;

SELECT job_id, REPLACE(job_id, 'ACCOUNT', 'ACCNT') 적용결과 -- ACCOUNT 를 ACCNT로 바꿈
FROM employees;

SELECT last_name 이름,
lower(last_name) "lower 적용",
upper(last_name) "upper 적용",
email 이메일,
INITCAP(email)  "INITCAT 적용"
FROM employees;

SELECT job_id 직업명, SUBSTR(job_id, 1,2) "앞의 2개"
FROM employees;

SELECT ROUND(15.193, 1) 소수첫째,
ROUND(15.193, 0)정수,
ROUND(15.193, -1) "10의자리",
ROUND(15.193, -2) "100의자리"
FROM dual;

SELECT ROUND(15.193, 1) 소수첫째,
ROUND(15.193, 0)정수,
ROUND(15.193, -1) "10의자리",
FROM dual;

SELECT employee_id 홀수, last_name
FROM employees
WHERE MOD(employee_id, 2) = 1
ORDER BY 1; -- 홀수로 출력됨

SELECT salary, salary/30,
ROUND(salary/30, 0) 정수,
ROUND(salary/30, 1) 소수한자리,
ROUND(salary/30, -1) "10의 자리"
FROM employees;

SELECT SYSDATE FROM dual;

SELECT SYSDATE-1 어제, SYSDATE 오늘, SYSDATE+1 내일
FROM DUAL;

SELECT last_name, FLOOR(SYSDATE - hire_date) 근무일수
FROM employees
WHERE department_id = 90;

SELECT last_name, TRUNC(SYSDATE - hire_date, 0) 근무일수
FROM employees
WHERE department_id = 90;

SELECT employee_id, hire_date,
MONTHS_BETWEEN(SYSDATE, hire_date) 근무월수,
ADD_MONTHS(hire_date, 6) "6개월 추가",
NEXT_DAY(hire_date, '금요일') Next_day, --1일2월3화4수5목6금7토
LAST_DAY(hire_date) Last_day --달의 마지막날
FROM employees
WHERE MONTHS_BETWEEN(SYSDATE,hire_date) < 150;

SELECT employee_id, hire_date,
ROUND(hire_date, 'MONTH') 월, --날짜를 반올림하고 1일로 반환
ROUND(hire_date, 'YEAR') 년, --달을 반올림하고 1월 1일로
ROUND(hire_date, 'MONTH') month, --날짜를 1일로
TRUNC(hire_date, 'YEAR') year --1월 1일로
FROM employees
WHERE MONTHS_BETWEEN(SYSDATE,hire_date) < 150;

SELECT SYSDATE, hire_date,
TRUNC(MONTHS_BETWEEN(SYSDATE,hire_date)) 근무월수
FROM employees
WHERE department_id = 100;

SELECT hire_date, ADD_MONTHS(hire_date, 3) "더하기3",
ADD_MONTHS(hire_date, -3) "빼기3"
FROM employees;

