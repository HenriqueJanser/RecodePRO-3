
create database agenciaviagens;

use agenciaviagens;

create table cliente (
id_cliente INTEGER auto_increment primary key,
nome_cliente varchar (20),
email_cliente varchar (40),
cpf varchar (11)
);


create table passagem (
id_passagem integer auto_increment primary key,
nome_passageiro varchar (20),
agencia varchar (20),
data_passagem date,
id_cliente integer,
FOREIGN KEY (id_cliente) references cliente (id_cliente)
); 

create table destino (
id_destino int auto_increment primary key,
cidade_destino varchar(25),
id_cliente integer,
foreign key (id_cliente) references cliente (id_cliente),
id_passagem integer,
foreign key (id_passagem) references passagem (id_passagem)
); 