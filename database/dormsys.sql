
drop table if exists user;
create table user(
    user_id varchar(255) not null,
    user_name varchar(50) not null,
    user_pw varchar(255) not null,
    PRIMARY KEY (user_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8; 

drop table if exists admin;
create table admin(
    admin_id varchar(255) not null,
    admin_name varchar(50) not null,
    admin_pw varchar(255) not null,
    PRIMARY KEY (admin_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8; 

drop table if exists emp;
create table emp(
    emp_id varchar(255) not null,
    emp_name varchar(50) not null,
    emp_tel varchar(255) not null,
    PRIMARY KEY (emp_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8; 

drop table if exists bldg;
create table bldg(
    bldg_id varchar(255) not null,
    bldg_floor varchar(50) not null,
    bldg_pos varchar(50) not null,
    PRIMARY KEY (bldg_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8; 

drop table if exists dorm;
create table dorm(
    dorm_id varchar(255) not null,
    dorm_size varchar(50) not null,
    bldg_id varchar(255) not null,
    PRIMARY KEY (dorm_id),
    FOREIGN KEY(bldg_id) REFERENCES bldg(bldg_id) 
)ENGINE=InnoDB DEFAULT CHARSET=utf8; 

drop table if exists stu;
create table stu(
    stu_id varchar(255) not null,
    stu_name varchar(50) not null,
    stu_class varchar(255) not null,
    dorm_id varchar(255) not null,
    PRIMARY KEY (stu_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8; 



drop table if exists rec;
create table rec(
    rec_id varchar(255) not null,
    bldg_id varchar(50) not null,
    PRIMARY KEY (rec_id),
    FOREIGN KEY(bldg_id) REFERENCES bldg(bldg_id) 
)ENGINE=InnoDB DEFAULT CHARSET=utf8; 

drop table if exists rec_stu;
create table rec_stu(
    rec_id varchar(255) not null,
    stu_id varchar(255) not null,
    stu_name varchar(50) not null,
    rec_stu_sta varchar(50) not null,
    rec_stu_time varchar(255) not null,
    FOREIGN KEY(rec_id) REFERENCES rec(rec_id), 
    FOREIGN KEY(stu_id) REFERENCES stu(stu_id) 
)ENGINE=InnoDB DEFAULT CHARSET=utf8; 

drop table if exists rec_per;
create table rec_per(
    rec_id varchar(255) not null,
    per_name varchar(50) not null,
    per_tel varchar(255) not null,
    rec_per_sta varchar(50) not null,
    rec_per_time varchar(255) not null,
    FOREIGN KEY(rec_id) REFERENCES rec(rec_id) 
)ENGINE=InnoDB DEFAULT CHARSET=utf8; 


