create table if not exists user_info
(
    id       serial primary key,
    username varchar(11) not null,
    password varchar(11) not null
);
alter table user_info
    add constraint user_info_username_pk
        unique (username);
