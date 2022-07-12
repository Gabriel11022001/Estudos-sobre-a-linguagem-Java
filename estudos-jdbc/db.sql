create database db_loja_virtual;

use db_loja_virtual;

create table tbl_produtos(
	produto_id int not null primary key auto_increment,
    produto_nome varchar(255) not null,
    produto_descricao text not null,
    produto_preco double not null
) Engine = InnoDB;

insert into tbl_produtos(produto_nome, produto_descricao, produto_preco)
values('Notebook Lenovo', 'Notebook Lenovo Ideapad 3i Intel Celeron-N4020 4GB 128GB SSD Tela 15,6" Windows 11 - Prata', 3400);

select * from tbl_produtos;