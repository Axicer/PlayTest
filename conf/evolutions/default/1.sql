# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table product (
  id                            integer auto_increment not null,
  name                          varchar(255),
  description                   varchar(255),
  price                         integer not null,
  constraint pk_product primary key (id)
);


# --- !Downs

drop table if exists product;

