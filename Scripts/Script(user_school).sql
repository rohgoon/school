-- �б�
DROP SCHEMA IF EXISTS school;

-- �б�
CREATE SCHEMA school;

-- �л�
CREATE TABLE student (
	stud_id INTEGER     NOT NULL COMMENT '�й�', -- �й�
	name    VARCHAR(50) NOT NULL COMMENT '����', -- ����
	email   VARCHAR(50) NOT NULL COMMENT '����', -- ����
	dob     DATE        NULL     COMMENT '����' -- ����
)
COMMENT '�л�';

-- �л�
ALTER TABLE student
	ADD CONSTRAINT PK_student -- �л� �⺻Ű
		PRIMARY KEY (
			stud_id -- �й�
		);


insert into student values(1, '김사부', 'ksb@test.co.kr', '1970-1-1'),
(2, '도깨비', 'dkb@test.co.kr', '2000-12-12'),
(3, '김고은', 'kky@test.co.kr', '1999-12-06');

insert into student values(3, '김고은', 'kky@test.co.kr', '1999-12-06');

select * from student;

select stud_id as studid, name, email, dob
from student
where stud_id = 2;

update student
set name = '공유', email ='ky@test.co.kr', dob = '1977-09-07'
where stud_id = 2;

delete from student where stud_id = 3; 

select stud_id, name, email, dob from student;
