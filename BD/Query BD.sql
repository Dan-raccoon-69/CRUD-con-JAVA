show databases;
create database escuela;

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

-- Consultas para ingresar datos en la tabla "escuela"
INSERT INTO escuela (idPersona, clave, nombre, domicilio, celular, correo_electronico, fecha_nacimiento, genero) VALUES
(1, 1, 'Juan Perez', 'Alcaldía Cuauhtémoc', '5512345678', 'juanperez@example.com', '1990-01-01', 'Masculino'),
(2, 2, 'María López', 'Alcaldía Benito Juárez', '5523456789', 'marialopez@example.com', '1992-05-10', 'Femenino'),
(3, 3, 'Pedro García', 'Alcaldía Coyoacán', '5534567890', 'pedrogarcia@example.com', '1988-11-20', 'Masculino'),
(4, 4, 'Ana Torres', 'Alcaldía Gustavo A. Madero', '5545678901', 'anatorres@example.com', '1995-07-15', 'Femenino'),
(5, 5, 'Carlos Rodríguez', 'Alcaldía Iztacalco', '5556789012', 'carlosrodriguez@example.com', '1993-03-05', 'Masculino'),
(6, 6, 'Laura Sánchez', 'Alcaldía Iztapalapa', '5567890123', 'laurasanchez@example.com', '1991-09-30', 'Femenino'),
(7, 7, 'Miguel González', 'Alcaldía Miguel Hidalgo', '5578901234', 'miguelgonzalez@example.com', '1989-12-25', 'Masculino'),
(8, 8, 'Fernanda Vargas', 'Alcaldía Tláhuac', '5589012345', 'fernandavargas@example.com', '1994-08-12', 'Femenino'),
(9, 9, 'Ricardo Ríos', 'Alcaldía Tlalpan', '5590123456', 'ricardorios@example.com', '1987-04-18', 'Masculino'),
(10, 10, 'Alejandra Méndez', 'Alcaldía Venustiano Carranza', '5512345678', 'alejandramendez@example.com', '1996-02-14', 'Femenino'),
(11, 11, 'Sergio Romero', 'Alcaldía Álvaro Obregón', '5523456789', 'sergioromero@example.com', '1998-10-29', 'Masculino'),
(12, 12, 'Gabriela Herrera', 'Alcaldía Azcapotzalco', '5534567890', 'gabrielaherrera@example.com', '1997-06-08', 'Femenino'),
(13, 13, 'Javier Castro', 'Alcaldía Coyoacán', '5545678901', 'javiercastro@example.com', '1993-01-22', 'Masculino'),
(14, 14, 'Daniela Méndez', 'Alcaldía Cuajimalpa', '5556789012', 'danielamendez@example.com', '1991-07-11', 'Femenino'),
(15, 15, 'Roberto Soto', 'Alcaldía Gustavo A. Madero', '5567890123', 'robertosoto@example.com', '1990-03-27', 'Masculino'),
(16, 16, 'Laura Torres', 'Alcaldía Iztacalco', '5578901234', 'lauratorres@example.com', '1988-09-02', 'Femenino'),
(17, 17, 'Raúl Mendoza', 'Alcaldía Iztapalapa', '5589012345', 'raulmendoza@example.com', '1986-05-19', 'Masculino'),
(18, 18, 'Verónica Pineda', 'Alcaldía Miguel Hidalgo', '5590123456', 'veronicapineda@example.com', '1995-12-14', 'Femenino'),
(19, 19, 'Luis Gómez', 'Alcaldía Tláhuac', '5512345678', 'luisgomez@example.com', '1992-08-09', 'Masculino'),
(20, 20, 'Ana Ramos', 'Alcaldía Tlalpan', '5523456789', 'anaramos@example.com', '1990-04-24', 'Femenino'),
(21, 21, 'Carlos Vargas', 'Alcaldía Venustiano Carranza', '5534567890', 'carlosvargas@example.com', '1989-01-08', 'Masculino'),
(22, 22, 'María Sánchez', 'Alcaldía Álvaro Obregón', '5545678901', 'mariasanchez@example.com', '1996-07-23', 'Femenino'),
(23, 23, 'Daniel Ríos', 'Alcaldía Azcapotzalco', '5556789012', 'danielrios@example.com', '1994-02-06', 'Masculino'),
(24, 24, 'Fernanda López', 'Alcaldía Coyoacán', '5567890123', 'fernandalopez@example.com', '1992-08-21', 'Femenino'),
(25, 25, 'Alejandro Castro', 'Alcaldía Cuajimalpa', '5578901234', 'alejandrocastro@example.com', '1990-03-04', 'Masculino'),
(26, 26, 'Sofía Méndez', 'Alcaldía Gustavo A. Madero', '5589012345', 'sofiamendez@example.com', '1988-09-19', 'Femenino'),
(27, 27, 'Jorge Soto', 'Alcaldía Iztacalco', '5590123456', 'jorgesoto@example.com', '1987-04-03', 'Masculino'),
(28, 28, 'Laura Torres', 'Alcaldía Iztapalapa', '5512345678', 'lauratorres@example.com', '1995-11-18', 'Femenino'),
(29, 29, 'Roberto Mendoza', 'Alcaldía Miguel Hidalgo', '5523456789', 'robertomendoza@example.com', '1993-05-03', 'Masculino'),
(30, 30, 'Carolina Pineda', 'Alcaldía Tláhuac', '5534567890', 'carolinapineda@example.com', '1991-12-28', 'Femenino'),
(31, 31, 'Luisa Gómez', 'Alcaldía Tlalpan', '5545678901', 'luisagomez@example.com', '1998-10-13', 'Masculino'),
(32, 32, 'Andrés Ramos', 'Alcaldía Venustiano Carranza', '5556789012', 'andresramos@example.com', '1996-04-28', 'Femenino'),
(33, 33, 'Diana Vargas', 'Alcaldía Álvaro Obregón', '5567890123', 'dianavargas@example.com', '1994-11-12', 'Masculino'),
(34, 34, 'Roberto Sánchez', 'Alcaldía Azcapotzalco', '5578901234', 'robertosanchez@example.com', '1992-07-27', 'Femenino'),
(35, 35, 'María Ríos', 'Alcaldía Coyoacán', '5589012345', 'mariarios@example.com', '1990-03-11', 'Masculino'),
(36, 36, 'Carlos López', 'Alcaldía Cuajimalpa', '5590123456', 'carloslopez@example.com', '1989-09-26', 'Femenino'),
(37, 37, 'Ana Castro', 'Alcaldía Gustavo A. Madero', '5512345678', 'anacastro@example.com', '1987-06-09', 'Masculino'),
(38, 38, 'Fernando Méndez', 'Alcaldía Iztacalco', '5523456789', 'fernandomendez@example.com', '1986-01-24', 'Femenino'),
(39, 39, 'Gabriela Mendoza', 'Alcaldía Iztapalapa', '5534567890', 'gabrielamendoza@example.com', '1993-08-08', 'Masculino'),
(40, 40, 'Javier Pineda', 'Alcaldía Miguel Hidalgo', '5545678901', 'javierpineda@example.com', '1991-03-25', 'Femenino'),
(41, 41, 'Sara Gómez', 'Alcaldía Tláhuac', '5556789012', 'saragomez@example.com', '1989-09-09', 'Masculino'),
(42, 42, 'Ricardo Ramos', 'Alcaldía Tlalpan', '5567890123', 'ricardoramos@example.com', '1987-04-24', 'Femenino'),
(43, 43, 'Laura Vargas', 'Alcaldía Venustiano Carranza', '5578901234', 'lauravargas@example.com', '1994-12-09', 'Masculino'),
(44, 44, 'Carlos Sánchez', 'Alcaldía Álvaro Obregón', '5589012345', 'carlossanchez@example.com', '1992-06-24', 'Femenino'),
(45, 45, 'María Ríos', 'Alcaldía Azcapotzalco', '5590123456', 'mariarios@example.com', '1990-01-08', 'Masculino'),
(46, 46, 'Roberto López', 'Alcaldía Coyoacán', '5512345678', 'robertolopez@example.com', '1988-07-23', 'Femenino'),
(47, 47, 'Ana Castro', 'Alcaldía Cuajimalpa', '5523456789', 'anacastro@example.com', '1986-02-05', 'Masculino'),
(48, 48, 'Fernando Méndez', 'Alcaldía Gustavo A. Madero', '5534567890', 'fernandomendez@example.com', '1993-09-20', 'Femenino'),
(49, 49, 'Gabriela Mendoza', 'Alcaldía Iztacalco', '5545678901', 'gabrielamendoza@example.com', '1991-05-05', 'Masculino'),
(50, 50, 'Javier Pineda', 'Alcaldía Iztapalapa', '5556789012', 'javierpineda@example.com', '1989-11-20', 'Femenino');

UPDATE escuela SET nombre = "Martin Romero", correo_electronico = "martinromero@example.com", celular = "5546197322",
fecha_nacimiento = "2003-05-10", genero = "Masculino" WHERE idPersona = 4;

-- delete from escuela where idPersona = 5;
