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

create index userID
    on board (userID);

