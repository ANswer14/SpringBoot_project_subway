create schema `spring` default character set utf8mb4
    default collate utf8mb4_general_ci;
use spring;
# 스키마 생성


# 유저 테이블 생성
create table USER_TB(
    userID varchar(25),
    password varchar(25) not null,
    nickname varchar(25) not null unique ,
    userImgPath TEXT not null,
    primary key (userID)
);

