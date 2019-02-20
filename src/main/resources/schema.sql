create table publıc.t_doctor(
id bigint not null ,
fırst_name varchar (255),
last_name varchar (255),
profession varchar (255)
);

create table publıc.t_person(
id bigint not null ,
name_person varchar (255),
birth_date date ,
doctor_id bigint
);

alter table publıc.t_doctor add constraınt publıc.constraint_1 prımary key (id);
alter table publıc.t_person add constraınt publıc.constraint_2 prımary key (id);
alter table publıc.t_person add constraınt publıc.constraint_3  foreıgn key (doctor_id) references publıc.t_doctor(id);
create sequence publıc.hospital_sequence start wıth 100;


