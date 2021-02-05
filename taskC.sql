create table course (
	id integer primary key,
	title varchar(55) not null
)

insert into course (id, title)
	values 
		(1, 'Java'),
		(2, 'Python'),
		(3, 'C#'),
		(4, 'Front end'),
		(5, 'PHP')

create table team (
	id integer primary key,
	title varchar(55) not null
)

insert into team (id, title)
	values 
		(1, 'Java1'),
		(2, 'Python1'),
		(3, 'C#1'),
		(4, 'Front end1'),
		(5, 'Php1'),
		(6, 'Java2'),
		(7, 'Python2'),
		(8, 'C#2'),
		(9, 'Front end2'),
		(10, 'Php2')

create table student (
	id integer primary key,
	full_name varchar(55) not null,
	phone_number varchar(55) not null,
	email varchar(55) not null,
	team_id integer references team(id),
	course_id integer references course(id)
)

insert into student (id, full_name, phone_number, email, team_id, course_id)
	values 
		(1, 'Ichigo Kurosaki', '+996555123456', 'ichigo@it.academy.com', 1, 1),
		(2, 'Karin Kurosaki', '+996555098765', 'karin@it.academy.com', 1, 1),
		(3, 'Sosuke Aizen', '+996550124576', 'aizen@it.academy.com', 1, 1),
		(4, 'Gin Ichimaru', '+996777123876', 'gin@it.academy.com', 6, 1),
		(5, 'Rukia Kuchiki', '+996550987241', 'rukia@it.academy.com', 6, 1),
		(6, 'Kisuke Urahara', '+996770123098', 'kisuke@it.academy.com', 6, 1),
		(7, 'Kenpachi Zaraki', '+996555890124', 'kenpachi@it.academy.com', 2, 2),
		(8, 'Kaname Tosen', '+996777145675', 'tosen@it.academy.com', 2, 2),
		(9, 'Shinra Kusakabe', '+996555789123', 'shinra@it.academy.com', 2, 2),
		(10, 'Benimaru Shinmon', '+996550123765', 'shinmon@it.academy.com', 7, 2),
		(11, 'Sho Kusakabe', '+996550124765', 'sho@it.academy.com', 7, 2),
		(12, 'Maki Oze', '+996777145764', 'maki@it.academy.com', 7, 2),
		(13, 'Takeru Noto', '+996555134141', 'noto@it.academy.com', 3, 3),
		(14, 'Viktor Licht', '+996778123567', 'licht@it.academy.com', 3, 3),
		(15, 'Leonard Burns', '+996775123654', 'burns@it.academy.com', 3, 3),
		(16, 'Karim Flam', '+996554123456', 'karim@it.academy.com', 8, 3),
		(17, 'Vulcan Joseph', '+996779123456', 'vulcan@it.academy.com', 8, 3),
		(18, 'Karin Sasaki', '+996775123987', 'sasaki@it.academy.com', 8, 3),
		(19, 'Rias Gremory', '+996773987345', 'rias@it.academy.com', 4, 4),
		(20, 'Akeno Himejima', '+996553768234', 'akeno@it.academy.com', 4, 4),
		(21, 'Issei Hyoudou', '+996702897237', 'issei@it.academy.com', 4, 4),
		(22, 'Yuuto Kiba', '+996708879512', 'kiba@it.academy.com', 9, 4),
		(23, 'Tsubasa Yura', '+996703098120', 'yura@it.academy.com', 9, 4),
		(24, 'Diodora Astaroth', '+996706987123', 'diadora@it.academy.com', 9, 4),
		(25, 'Mai Sakurajima', '+99655698713', 'mai@it.academy.com', 5, 5),
		(26, 'Sakuta Azusagawa', '+996709123678', 'sakuta@it.academy.com', 5, 5),
		(27, 'Rio Futaba', '+996778322191', 'rio@it.academy.com', 5, 5),
		(28, 'Shoko Makinohara', '+996779567390', 'shoko@it.academy.com', 10, 5),
		(29, 'Yuuma Kunimi', '+996778123456', 'kunimi@it.academy.com', 10, 5),
		(30, 'Tomoe Koga', '+996709123654', 'koga@it.academy.com', 10, 5)

create table team_lead(
	student_id integer references student(id),
	team_id integer references team(id)
)

insert into team_lead(student_id, team_id)
	values 
		(3, 1),
		(6, 6),
		(7, 2),
		(10, 7),
		(15, 3),
		(17, 8),
		(19, 4),
		(24, 9),
		(25, 5),
		(30, 10)

create table head(
	id integer primary key,
	full_name varchar(55) not null,
	phone_number varchar(55) not null,
	email varchar(55) not null,
	course_id integer references course(id)
)

insert into head(id, full_name, phone_number, email, course_id)
	values 
		(1, 'Askhat Serikov', '+996779123456', 'askhat@it.academy.com', 1),
		(2, 'Israel Adesanya', '+996775123098', 'izzy@it.academy.com', 2),
		(3, 'Dustin Poirier', '+996554128976', 'diamond@it.academy.com', 3),
		(4, 'Tony Ferguson', '+996558126789', 'tony@it.academy.com', 4),
		(5, 'Kakashi Hatake', '+996705987123', 'kakashi@it.academy.com', 5)

create table reviewer(
 	id integer primary key,
 	full_name varchar(55) not null,
	phone_number varchar(55) not null,
	email varchar(55) not null,
	course_id integer references course(id),
	head_id integer references head(id)
);

insert into reviewer(id, full_name, phone_number, email, course_id, head_id)
	values 
		(1, 'Shamil Satarov', '+996778123456', 'shamil@it.academy.com', 1, 1),
		(2, 'Sadyr Japarov', '+996775123098', 'sadyr@it.academy.com', 2, 2),
		(3, 'Sooronbay Jeenbekov', '+996702987234', 'jeenbekov@it.academy.com', 3, 3),
		(4, 'Jon Jones', '+996779123456', 'jon@it.academy.com', 4, 4),
		(5, 'Zara Larsson', '+996709123456', 'zara@it.academy.com', 5, 5)

create table mentor (
	id integer primary key,
	full_name varchar(55) not null,
	phone_number varchar(55) not null,
	email varchar(55) not null,
	head_id integer references head(id),
	course_id integer references course(id)
)

insert into mentor (id, full_name, phone_number, email, head_id, course_id)
	 values 
	 	(1, 'Sabina Temirbekova', '+996705123456', 'sabina@it.academy.com', 1, 1),
	 	(2, 'Francis Ngannou', '+996554123456', 'francis@it.academy.com', 2, 2),
	 	(3, 'Calvin Harris', '+996709876126', 'calvin@it.academy.com', 3, 3),
	 	(4, 'John Newman', '+996702980534', 'john@it.academy.com', 4, 4),
	 	(5, 'Sam Smith', '+996772234567', 'sam@it.academy.com', 5, 5)

