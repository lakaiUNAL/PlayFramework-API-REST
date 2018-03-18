# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table prestamo (
  id                            bigint auto_increment not null,
  student_id                    bigint,
  bici_id                       bigint,
  solicitud                     varchar(255),
  constraint pk_prestamo primary key (id)
);


# --- !Downs

drop table if exists prestamo;

