create table user_data (
    username varchar(100) NOT NULL PRIMARY KEY,
    email varchar(50) not null,
    role varchar(50) not null,
    password varchar(1000) not null,
    token_expiration datetime,
    token varchar(1000)
);
