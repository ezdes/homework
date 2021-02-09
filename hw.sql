create table person(
	person_id serial primary key,
	name varchar(50) not null,
	birth_date varchar(15) not null
);


insert into person(name, birth_date)
	values
		('Itachi Uchiha',  '09/08/1998'),
		('Naruto Uzumaki',  '12/12/2001'),
		('Sasuke Uchiha',  '02/11/2001'),
		('Obito Uchiha', '23/01/1994'),
		('Madara Uchiha',  '24/06/1990'),
		('Boruto Uzumaki',  '13/04/1991'),
		('Viktor Licht', '30/07/2007'),
		('Kaname Tosen', '19/09/2009'),
		('Shinra Kusakabe', '01/02/1990')

create table country(
	country_id serial primary key,
	name varchar(50) not null,
	code varchar(20) unique not null,
	population int not null,
	president int references person(person_id) not null
);

insert into country(name, code, population, president)
	values
		('Indonesia', '456', 270000000, 3),
		('Nigeria', '145', 201000000, 5)

create table city(
	city_id serial primary key,
	name varchar(50) not null,
	country integer references country(country_id) not null,
	mayor int references person(person_id) not null,
	population int not null
);

insert into city(name, country, mayor, population)
	values('Jakarta', 1, 7, 1000000),
		  ('Lagos', 2, 1, 7000000),
		  ('Kano', 2, 8, 5000000)

--Выбрать все города страны, название которой начинается на букву «К»
select country.name, city.name
from city
join country on country.country_id = city.country
where lower(city.name) like 'k%';

--Подсчитать общее количество человек в городах каждой страны.
select country.name, sum(city.population) as population
from country 
join city on country.country_id = city.country
group by country.name;

--Добавить возможность добавления понятия «Гос. Языка» к каждой стране.
alter table country
add column official_lang varchar(55);
update country set official_lang = 'Indonesian' where country_id = 1;
update country set official_lang = 'English' where country_id = 2;