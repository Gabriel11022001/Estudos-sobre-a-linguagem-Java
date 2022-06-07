create database db_estudos_servlets_sis_login;

use db_estudos_servlets_sis_login;

create table tbl_usuarios(
	usuario_id int not null primary key auto_increment,
    usuario_email varchar(255) not null,
    usuario_senha varchar(255) not null,
    usuario_nome varchar(255) not null,
    usuario_telefone varchar(255) not null,
    usuario_endereco text not null,
    usuario_bairro text not null,
    usuario_cidade text not null,
    usuario_estado varchar(2) not null,
    usuario_complemento text not null,
    usuario_numero_casa varchar(255) not null,
    usuario_data_nascimento datetime not null,
    usuario_sexo varchar(255) not null,
    usuario_estado_civil int not null
);

select * from tbl_usuarios;