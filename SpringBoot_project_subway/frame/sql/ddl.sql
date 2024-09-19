-- auto-generated definition
create table USER
(
    userID      varchar(15) not null
        primary key,
    password    varchar(20) not null,
    nickname    varchar(10) not null,
    userImgPath text        not null,
    userEmail   varchar(50) not null,
    userRole    varchar(5)  not null
);

-- auto-generated definition
create table user_role
(
    user_id   varchar(15) not null,
    user_role varchar(5)  null,
    constraint FK859n2jvi8ivhui0rl0esws6o
        foreign key (user_id) references user (user_id)
);



-- auto-generated definition
create table board
(
    boardNO   bigint auto_increment
        primary key,
    userID    varchar(15) not null,
    boardText text        not null,
#     board_ibfk_1 : 외래키 제약조건 명
    constraint board_ibfk_1
        foreign key (userID) references user (userID)
);

create table station
(
    station_id   bigint auto_increment
        primary key,
    station_name varchar(15) not null,
    station_line varchar(1)  not null
);

create table time
(
    type_id bigint auto_increment
        primary key,
    h0530   varchar(3) null,
    h0600   varchar(3) null,
    h0630   varchar(3) null,
    h0700   varchar(3) null,
    h0730   varchar(3) null,
    h0800   varchar(3) null,
    h0830   varchar(3) null,
    h0900   varchar(3) null,
    h0930   varchar(3) null,
    h1000   varchar(3) null,
    h1030   varchar(3) null,
    h1100   varchar(3) null,
    h1130   varchar(3) null,
    h1200   varchar(3) null,
    h1230   varchar(3) null,
    h1300   varchar(3) null,
    h1330   varchar(3) null,
    h1400   varchar(3) null,
    h1430   varchar(3) null,
    h1500   varchar(3) null,
    h1530   varchar(3) null,
    h1600   varchar(3) null,
    h1630   varchar(3) null,
    h1700   varchar(3) null,
    h1730   varchar(3) null,
    h1800   varchar(3) null,
    h1830   varchar(3) null,
    h1900   varchar(3) null,
    h1930   varchar(3) null,
    h2000   varchar(3) null,
    h2030   varchar(3) null,
    h2100   varchar(3) null,
    h2130   varchar(3) null,
    h2200   varchar(3) null,
    h2230   varchar(3) null,
    h2300   varchar(3) null,
    h2330   varchar(3) null,
    h0000   varchar(3) null,
    h0030   varchar(3) null,
    constraint time_ibfk_1
        foreign key (type_id) references type (type_id)
            on delete cascade
);

create table type
(
    type_id        bigint auto_increment
        primary key,
    station_id     bigint     not null,
    direction_type varchar(2) not null,
    day_type       varchar(2) not null,
    constraint type_ibfk_1
        foreign key (station_id) references station (station_id)
            on delete cascade
);

create index station_id
    on type (station_id);


create index userID
    on board (userID);

