create table sport_type(
	id integer primary key,
	sport_type varchar(30) not null,
	salary integer not null
);

create table trainers(
	id integer primary key,
	sport_type integer references sport_type(id) not null,
	full_name varchar(30) not null,
	phone_number varchar(30),
	inn varchar(50) not null unique
);

insert into sport_type(id, sport_type, salary)
	values    
		(1, 'Football', 500),
		(2, 'Basketball', 400),
		(3, 'Volleyball', 1000);
	

insert into trainers(id, sport_type, full_name, phone_number, inn)
	values
		(1, 1, 'Arthur Morgan', '+996555555555', '24131234133223'),
		(2, 2, 'Dutch van der Linde', '996777777777', '4343224232411'),
		(3, 3, 'Javier Escuella', '996700700700', '34532242352432');

create table visitors(
	id integer primary key,
	full_name varchar(30) not null,
	birth_date varchar(30) not null,
	gender varchar(30) not null
);


create table visits(
	id integer primary key,
	visitor integer references visitors(id) not null, 
	visiting_time timestamp not null,
	trainer integer references trainers(id) not null
);



insert into visitors(id, full_name, birth_date, gender)
	values(1, 'Trevor Phillips', '01/09/1990', 'male'),
		  (2, 'Franklin Clinton', '08/02/1995', 'male'),
		  (3, 'Lamar Davis', '22/07/1993', 'male');
		 
insert into visits(id, visitor, visiting_time, trainer)
	values(1, 1, '2021-02-01 15:00:22', 1),
		  (2, 2, '2021-02-02 14:28:22', 2),
		  (3, 3, '2021-02-03 13:33:22', 3);