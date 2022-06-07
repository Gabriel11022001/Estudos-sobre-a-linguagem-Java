create database db_estudos_jdbc_produtos;

use db_estudos_jdbc_produtos;

create table tbl_produtos(
	id int not null primary key auto_increment,
    nome varchar(255) not null,
    preco decimal not null,
    qtdUnidadesEmEstoque int not null,
    estaAtivo int not null,
    descricaoResumida text not null,
    descricaoCompleta text not null
);
select * from tbl_produtos;
-- delete from tbl_produtos where id = 1 or id = 2;