create table person(
	person_id serial primary key,
	person_name varchar(50) not null,
	birth_date varchar(15) not null
);

create table country(
	country_id serial primary key,
	country_name varchar(50) not null,
	code varchar(20) unique not null,
	country_population int not null,
	president_id int references person(person_id) not null
);

create table city(
	city_id serial primary key,
	city_name varchar(50) not null,
	country_id integer references country(country_id) not null,
	mayor_id int references person(person_id) not null,
	city_population int not null
);

create table city2(
	city_id int primary key,
	city_name varchar(55) not null
);
