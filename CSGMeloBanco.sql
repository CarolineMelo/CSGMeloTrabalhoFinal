create database Veiculo;
use Veiculo; 

create table Carro(
id int(3) not null auto_increment, 
placa varchar (9) not null,
modelo varchar(20) not null, 
marca varchar(20) not null, 
ano int not null,

primary key (id) 
); 

create table ipva(
codigo_ipva int(4) not null auto_increment, 
ano int(4) not null,
primary key (codigo_ipva)
);

INSERT INTO ipva VALUES(1,2000);

insert into Carro (placa,modelo,ano,marca) values ("aaa","aaaa",2020,"aaaa"); 
select * from ipva;
delete from Carro where id = 4;



drop table Carro;
select * from Carro;
show tables;
select * from ipva;

