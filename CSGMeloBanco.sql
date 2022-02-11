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

insert into Carro (placa,modelo,ano,marca) values ("aaa","aaaa",2020,"aaaa"); 
select * from Carro; 
delete from Carro where id = 4;



drop table Carro;
select * from Carro;
show tables;