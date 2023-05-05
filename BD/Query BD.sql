show databases;
create database escuela;
use escuela;

create table escuela(
idPersona int not null auto_increment,
clave int not null,
nombre varchar(50) not null,
domicilio varchar(200) null,
celular varchar(50) null,
correo_electronico varchar(50) null,
fecha_nacimiento date null,
genero varchar(10) not null,
primary key(idPersona));

select * from escuela;

insert into escuela(clave,nombre, domicilio, celular, correo_electronico, fecha_nacimiento, genero) values
(001,"Daniel", "Ecatepec", "5570476934", "gustavodelacruz2010@gmail.com", "2002-10-14", "Masculino");

UPDATE escuela SET nombre = "Martin", correo_electronico = "martin145@gmail.com", celular = "5546197322",
domicilio = "CDMX", fecha_nacimiento = "2003-05-10", genero = "Masculino" WHERE idPersona = 4;
delete from escuela where idPersona = 5;
insert into escuela(clave,nombre, domicilio, celular, correo_electronico, fecha_nacimiento, genero) values
(005,"Gustavo", "Ecatepec", "5510532715", "gustavob69@gmail.com", "2002-10-14", "Masculino");