drop schema if exists ProjectPlaner;
create schema if not exists ProjectPlaner default character set utf8 default collate utf8_unicode_ci;
use ProjectPlaner;

create table NALOG(  
	Username	   varchar(30) binary primary key not null,
    Password 	   varchar(30) binary not null,
    Ime  		   varchar(30) not null,
    Prezime			varchar(30) not null,
    Aktivan			boolean not null default true,
    RadnoMjesto		varchar(30) not null
    
    );


create table ADMIN(  
	Username    varchar(30) binary not null primary key,     
    constraint FK_Nalog_Admin     
    foreign key (Username)     
    references Nalog (Username)
    );


create table SEF(  
	Username    varchar(30) binary not null primary key,
    constraint FK_Nalog_Sef 
    foreign key (Username)     
    references Nalog (Username)
    ON DELETE CASCADE
	ON UPDATE CASCADE
    );

create table NADZOR(  
	Username    varchar(30) binary not null primary key,
    constraint FK_Nalog_Nadzor 
    foreign key (Username)     
    references Nalog (Username)
    ON DELETE CASCADE
	ON UPDATE CASCADE
    );
    
create table RADNIK(  
	Username    varchar(30) binary not null primary key,
    constraint FK_Nalog_Radnik 
    foreign key (Username)     
    references Nalog (Username)
    ON DELETE CASCADE
	ON UPDATE CASCADE
    );
    
delimiter $$
create trigger nalog_novi after insert
on nalog
for each row
begin
	insert into radnik
	set username = new.username;
  
end$$
delimiter ;

    
create table PROJEKAT(
	IdProjekta			  int not null auto_increment primary key,
    NazivProjekta		  Text not null,
	Username              VARCHAR(30) binary NOT NULL,
    UsernameSef			  VARCHAR(30) binary null,
	UsernameNadzor        VARCHAR(30) binary NULL,
	Opis				  Text not null,
    constraint FK_Admin_Projekat
    foreign key (Username)
    references Admin (Username),
    constraint FK_Sef_Projekat
    foreign key (UsernameSef)
    references SEF (Username),
    constraint FK_Nadzor_Projekat
    foreign key (UsernameNadzor)
    references NADZOR (Username)
);

delimiter $$
create trigger projekat_novi before insert
on projekat
for each row
begin
	if new.UsernameSef not in(select s.username from sef s) then
	insert into sef
    set username = new.UsernameSef;
    end if;
    if new.UsernameNadzor not in (select n.username from nadzor n) then
	insert into nadzor
    set username = new.usernameNadzor;
    end if;
  
end$$
delimiter ;

create table PRIHOD(
	IdPrihoda			int not null auto_increment primary key,
	IdProjekta			int not null,
    Naziv				varchar(50) not null,
    Opis				text not null,
    Iznos				decimal not null,
    DatumKreiranja		Date not null,
    check(Iznos > 0),
    constraint FK_Projekat_Prihod
    foreign key (IdProjekta)
    references PROJEKAT (IdProjekta)
    on delete cascade
);



create table RASHOD(
	IdRashoda			int not null auto_increment primary key,
	IdProjekta			int not null,
    Naziv				varchar(50) not null,
    Opis				text not null,
    Iznos				double not null,
    DatumKreiranja		Date not null,
    check(Iznos > 0),
    constraint FK_Projekat_Rashod
    foreign key (IdProjekta)
    references PROJEKAT (IdProjekta)
    on delete cascade
);

create table CJELINA(
	IdCjeline             INT NOT NULL,
    Username              VARCHAR(30) binary  NOT NULL,
    Naziv 				  varchar(50) not null,
	IdNadcjeline          INT NULL default null,
	IdProjekta            INT NOT NULL,
    VremenskiRok 		  DATE not null,
    BrojRadnihCasova	  int not null,
    BrojOdradjenihCasova  int not null default 0,
    check (brojRadnihCasova >=brojOdradjenihCasova),
    primary key (IdCjeline,Username),
    constraint FK_Projekat_Cjelina
    foreign key (IdProjekta)
    references PROJEKAT(IdProjekta)
    on delete cascade,
    constraint FK_Cjelina_Cjelina
    foreign key (IdNadcjeline)
    references CJELINA (IdCjeline)
    on delete cascade
);

CREATE TABLE AKTIVNOST
(
	IdAktivnosti		  int not null auto_increment primary key,
    NazivAktivnosti		  VARCHAR(50) not null,
    IdCjeline             INT NOT NULL,
    Username              VARCHAR(30) binary  NOT NULL,
    constraint FK_Cjelina_Aktivnost
    foreign key (IdCjeline,Username)
    references CJELINA(IdCjeline,Username)
    on delete cascade
);

CREATE TABLE PORUKA(
	IdPoruke			int not null auto_increment primary key,
    TekstPoruke			text not null,
    IdAktivnosti		int not null,
    Username			varchar(30) binary  not null,
    Procitana			boolean not null default false,
    PoslaoSef			boolean not null,
    constraint FK_Aktivnost_Poruka
    foreign key (IdAktivnosti)
    references AKTIVNOST (IdAktivnosti)
    on delete cascade,
    constraint FK_Aktivnost_Radnik
    foreign key (Username)
    references Radnik (Username)
);


insert into NALOG (Username,Password,Ime,Prezime,RadnoMjesto) values ('MarkoMarkovic','11111', 'Marko', 'Markovic','Programer');
insert into NALOG (Username,Password,Ime,Prezime,RadnoMjesto) values ('MilanMarkovic','11111', 'Milan', 'Markovic','Menadzer');
insert into NALOG (Username,Password,Ime,Prezime,RadnoMjesto) values ('NikolaNikolic','11111', 'Nikola', 'Nikolic','Programer');
insert into NALOG (Username,Password,Ime,Prezime,RadnoMjesto) values ('JankoJankovic','11111', 'Janko', 'Jankovic','Programer');
insert into NALOG (Username,Password,Ime,Prezime,RadnoMjesto) values ('radnikbr1','11111', 'Radnik1', 'Prezime1','Programer');
insert into NALOG (Username,Password,Ime,Prezime,RadnoMjesto) values ('radnikbr2','11111', 'Radnik2', 'Prezime2','Programer');
insert into NALOG (Username,Password,Ime,Prezime,RadnoMjesto) values ('radnikbr3','11111', 'Radnik3', 'Prezime3','Programer');
insert into NALOG (Username,Password,Ime,Prezime,RadnoMjesto) values ('radnikbr4','11111', 'Radnik4', 'Prezime4','Programer');
insert into NALOG (Username,Password,Ime,Prezime,RadnoMjesto) values ('admin','admin', 'Milos', 'Milosevic','admin');

insert into ADMIN (Username) values ('admin');
delete from RADNIK where username = 'admin';

INSERT INTO PROJEKAT (NazivProjekta,Username, UsernameSef, UsernameNadzor, Opis) VALUES ('Prvi projekat', 'admin', 'MarkoMarkovic', 'JankoJankovic', 'Ovde treba da stoji opis projekta. Nesto, bilo sta.');
#INSERT INTO PROJEKAT (NazivProjekta,Username, UsernameSef, UsernameNadzor, Opis) VALUES ('Drugi projekat', 'admin', 'NikolaNikolic', 'MarkoMarkovic', 'Opisa bez');
#INSERT INTO PROJEKAT (NazivProjekta,Username, UsernameSef, UsernameNadzor, Opis) VALUES ('Klik i postavka kursora na ime projekta treba da ispise pun naziv ovoga projekta', 'admin', 'NikolaNikolic', 'MarkoMarkovic', 'Opisa bez');

#insert into cjelina (IdCjeline,Username,Naziv,IdProjekta,VremenskiRok,BrojRadnihCasova) values(1,'MarkoMarkovic','Cjelina br 1',1,'2020-01-02',10);
#insert into cjelina (IdCjeline,Username,Naziv,IdProjekta,VremenskiRok,BrojRadnihCasova) values(1,'JankoJankovic','Cjelina br 1',1,'2020-01-02',10);

#insert into AKTIVNOST (Username,IdCjeline,NazivAktivnosti) values ('MarkoMarkovic','1','aktivnost broj 1');
#insert into AKTIVNOST (Username,IdCjeline,NazivAktivnosti) values ('MarkoMarkovic','1','aktivnost broj 2');

#insert into Prihod (IdProjekta,Naziv,Opis,Iznos,DatumKreiranja) values (1,'prihod 1','kupovina opreme',102,'2014-01-02');
#insert into Rashod (IdProjekta,Naziv,Opis,Iznos,DatumKreiranja) values (1,'rashod 1','kupovina opreme',102,'2014-01-02');

#delete from Projekat where idProjekta =1;

#create user  'student'@'localhost' identified by 'student';
grant all on projectplaner.* to 'student'@'localhost' identified by 'student';
flush privileges;



