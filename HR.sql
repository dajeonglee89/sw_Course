SELECT employee_id, first_name || '   ' || last_name Ǯ����, email || ' @company.com ' �̸��� 
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
-- �μ���ȣ�� ����(sorting) �� �� �����ȣ�� ����

SELECT department_id, last_name, salary*12����
FROM employees
ORDER BY ���� DESC;

SELECT department_id, last_name, salary*12����
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
WHERE lower(last_name) = 'HIGGINS'; --�־ȳ���?

SELECT department_id, last_name, email
FROM employees
WHERE INITCAP(email) = 'Sking'; -- ���� �빮�ڷ� �ٲ�

SELECT last_name, CONCAT('job category is ', job_id) "Job"
FROM employees
WHERE SUBSTR(job_id, 4) = 'REP'; -- 4��°�� REP ���°� �� �̻���

SELECT last_name, CONCAT('�������� ', job_id) ����
FROM employees
WHERE SUBSTR(job_id, 4) = 'REP'; -- ����

SELECT last_name, SUBSTR(last_name, 1, 1)
FROM employees;

SELECT employee_id,
CONCAT(first_name, last_name) ��ü�̸�,
last_name,
LENGTH(last_name) ����,
INSTR(last_name, 'a') "'a'�� ���°?"
FROM employees;

SELECT first_name, last_name,
UPPER(CONCAT(first_name, SUBSTR(last_name, 1, 3))) �̸��ռ�
FROM employees
WHERE department_id = 60;

SELECT job_id, REPLACE(job_id, 'ACCOUNT', 'ACCNT') ������ -- ACCOUNT �� ACCNT�� �ٲ�
FROM employees;

SELECT last_name �̸�,
lower(last_name) "lower ����",
upper(last_name) "upper ����",
email �̸���,
INITCAP(email)  "INITCAT ����"
FROM employees;

SELECT job_id ������, SUBSTR(job_id, 1,2) "���� 2��"
FROM employees;

SELECT ROUND(15.193, 1) �Ҽ�ù°,
ROUND(15.193, 0)����,
ROUND(15.193, -1) "10���ڸ�",
ROUND(15.193, -2) "100���ڸ�"
FROM dual;

SELECT ROUND(15.193, 1) �Ҽ�ù°,
ROUND(15.193, 0)����,
ROUND(15.193, -1) "10���ڸ�",
FROM dual;

SELECT employee_id Ȧ��, last_name
FROM employees
WHERE MOD(employee_id, 2) = 1
ORDER BY 1; -- Ȧ���� ��µ�

SELECT salary, salary/30,
ROUND(salary/30, 0) ����,
ROUND(salary/30, 1) �Ҽ����ڸ�,
ROUND(salary/30, -1) "10�� �ڸ�"
FROM employees;

SELECT SYSDATE FROM dual;

SELECT SYSDATE-1 ����, SYSDATE ����, SYSDATE+1 ����
FROM DUAL;

SELECT last_name, FLOOR(SYSDATE - hire_date) �ٹ��ϼ�
FROM employees
WHERE department_id = 90;

SELECT last_name, TRUNC(SYSDATE - hire_date, 0) �ٹ��ϼ�
FROM employees
WHERE department_id = 90;

SELECT employee_id, hire_date,
MONTHS_BETWEEN(SYSDATE, hire_date) �ٹ�����,
ADD_MONTHS(hire_date, 6) "6���� �߰�",
NEXT_DAY(hire_date, '�ݿ���') Next_day, --1��2��3ȭ4��5��6��7��
LAST_DAY(hire_date) Last_day --���� ��������
FROM employees
WHERE MONTHS_BETWEEN(SYSDATE,hire_date) < 150;

SELECT employee_id, hire_date,
ROUND(hire_date, 'MONTH') ��, --��¥�� �ݿø��ϰ� 1�Ϸ� ��ȯ
ROUND(hire_date, 'YEAR') ��, --���� �ݿø��ϰ� 1�� 1�Ϸ�
ROUND(hire_date, 'MONTH') month, --��¥�� 1�Ϸ�
TRUNC(hire_date, 'YEAR') year --1�� 1�Ϸ�
FROM employees
WHERE MONTHS_BETWEEN(SYSDATE,hire_date) < 150;

SELECT SYSDATE, hire_date,
TRUNC(MONTHS_BETWEEN(SYSDATE,hire_date)) �ٹ�����
FROM employees
WHERE department_id = 100;

SELECT hire_date, ADD_MONTHS(hire_date, 3) "���ϱ�3",
ADD_MONTHS(hire_date, -3) "����3"
FROM employees;

