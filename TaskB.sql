create table university (
	id integer primary key,
	name varchar(55) not null
);

insert into university (id, name)
	values
		(1, 'Auca'),
		(2, 'Ala-Too'),
		(3, 'KGUSTA')

create table subjects (
	id integer primary key,
	name varchar(55) not null
);

insert into subjects (id, name)
	values 
		(1, 'Biology'),
		(2, 'Data structures'),
		(3, 'Economics')

create table faculties (
	id integer primary key,
	name varchar(55) not null,
	university_id integer references university(id)
);

insert into faculties(id, name, university_id)
	values 
		(1, 'Biology', 1),
		(2, 'Computer Science', 2),
		(3, 'Economics', 3)

create table groups (
	id integer primary key,
	faculty_id integer references faculties(id),
	code varchar(55) not null
);

insert into groups (id, faculty_id, code)
	values 
		(1, 1, '1A'),
		(2, 2, '2B'),
		(3, 3, '3C')

create table students (
	id integer primary key,
	full_name varchar(55) not null,
	group_id integer references groups(id),
	birth_date varchar(55) not null
);

insert into students (id, full_name, group_id, birth_date)
	values 
		(1, 'Itachi Uchiha', 1, '09/08/1998'),
		(2, 'Naruto Uzumaki', 1, '12/12/2001'),
		(3, 'Sasuke Uchiha', 2, '02/11/2001'),
		(4, 'Obito Uchiha', 2, '23/01/1994'),
		(5, 'Madara Uchiha', 3, '24/06/1990'),
		(6, 'Boruto Uzumaki', 3, '13/04/1991')

create table marks (
	student_id integer references students(id),
	mark integer not null,
	subject_id integer references subjects(id) 
);

insert into marks (student_id, mark, subject_id)
	values 
		(1, 5, 1),
		(2, 4, 1),
		(3, 3, 2),
		(4, 5, 2),
		(5, 2, 3),
		(6, 4, 3),
		(1, 5, 2),
		(2, 4, 2),
		(3, 3, 3),
		(4, 5, 3),
		(5, 2, 1),
		(6, 4, 1),
		(1, 5, 3),
		(2, 4, 3),
		(3, 3, 1),
		(4, 5, 1),
		(5, 2, 2),
		(6, 4, 2)

select stud.full_name, avg(m.mark)
from students stud
join marks m on stud.id = m.student_id
group by stud.full_name;

select stud.full_name, g.code as group, f.name as faculty, u.name as university
from students stud
join groups g on stud.group_id = g.id
join faculties f on g.faculty_id = f.id
join university u on f.university_id = u.id;

