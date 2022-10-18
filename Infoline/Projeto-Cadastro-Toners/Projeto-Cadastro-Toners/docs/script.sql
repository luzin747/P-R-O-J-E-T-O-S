drop database if exists toners;
create database toners charset=UTF8 collate utf8_general_ci;
use toners;

create table toner(
    id_toner integer not null primary key auto_increment,
    nome_toner varchar(30) not null,
    qtd integer not null,
    tipo varchar(15) not null,
    datas varchar(20) not null,
    empresa varchar(20) not null,
    img varchar(200) default 'default.png'

);

insert into toner values(NULL, 'TN660', 1, 'Original','Fausto ME','01/01/2001','default.png'); 