create database db_sistema_login;

use db_sistema_login;

create table tbl_usuarios(
	usuario_id int not null primary key auto_increment,
    usuario_nome varchar(255) not null,
    usuario_sobrenome varchar(255) not null,
    usuario_email varchar(255) not null,
    usuario_senha varchar(255) not null,
    usuario_telefone varchar(255) not null
);
select * from tbl_usuarios;
insert into tbl_usuarios(usuario_nome, usuario_sobrenome, usuario_email, usuario_senha, usuario_telefone) values('Gabriel', 'Rodrigues', 'gabriel996567521@gmail.com', md5('Gabriel@11022001'), '(14)99766-4567');
delete from tbl_usuarios where usuario_id = 2;