-- a linha abaixo cria um banco de dados
create database dbpettis;
-- a linha abaixo escolhe o banco de dados
use dbpettis;
-- a linha abaixob cria uma tabela
create table tbusuarios(
iduser int primary key,
usuario varchar (50) not null,
telefone varchar(15),
login varchar(15) not null unique,
senha varchar(15) not null
);
-- o comando abaixo descreve a tabela
describe tbusuarios;
-- a linha abaixo insere dados a tabela(CRUD)
insert into tbusuarios(iduser,usuario, telefone,login,senha)
values(1,'Hercio Emerson','865285240','herciozita','1234');
-- a linha abaixo exibe os dados da tabela
select * from tbusuarios;

insert into tbusuarios(iduser,usuario, telefone,login,senha)
values(2,'Bavna sitoe','841234573','bavnasitoe','1234');
insert into tbusuarios(iduser,usuario, telefone,login,senha)
values(3,'Clayton Bazar','865303123','claytonbazar','12345');

-- a linha abaixo modifica os dados da tabela
update tbusuarios set telefone = '872312111' where iduser = 2;
select * from tbusuarios;
-- a linha abaixo apaga um registro da tabela
delete from tbusuarios where iduser=3;

create table tbclientes(
idcli int primary key auto_increment,
nomecli varchar(50) not null,
enderecocli varchar(100),
telefonecli varchar(50) not null,
emailcli varchar(50),
idadecli varchar(50)
);

describe tbclientes;

insert into tbclientes (nomecli, enderecocli,telefonecli ,emailcli, idadecli)
values('Hercio Zita', 'Alabazine','861223454','hercio@gmail.com','18');
select * from tbclientes;

use dbpettis;
create table tblivro(
idlivro int primary key auto_increment,
data_livro timestamp default current_timestamp,
titulo varchar(50) not null,
genero varchar(50) not null,
anoPublicacao varchar(25) not null,
autor varchar(50) not null,
precoEmprestimo decimal(10,2) not null,
quantEstoque varchar(50)not null,
idcli int not null,
foreign key(idcli) references tbclientes(idcli)
);

describe tblivro;
insert into tblivro (titulo, genero, anoPublicacao, autor, precoEmprestimo, quantEstoque, idcli)
values('Os pettis','romance','2020','Monkey the luffy',80.50,'200',1);

select * from tblivro;

-- o codigo abaixo traz informacoes de duas tabelas
select
O.idlivro,titulo,genero,anoPublicacao,precoEmprestimo,quantEstoque,
C.nomecli,telefonecli,enderecocli
from tblivro as O
inner join tbclientes as C
on(O.idcli=C.idcli);









