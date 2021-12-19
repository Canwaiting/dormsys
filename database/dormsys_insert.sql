INSERT INTO user(user_id,user_name,user_pw)
    VALUES
('0001','张三','12345');
INSERT INTO user(user_id,user_name,user_pw)
    VALUES
('0002','李四','12345');
INSERT INTO user(user_id,user_name,user_pw)
    VALUES
('0003','李斯','12345');
INSERT INTO user(user_id,user_name,user_pw)
    VALUES
('0004','豆腐','12345');
INSERT INTO user(user_id,user_name,user_pw)
    VALUES
('0005','杜甫','12345');
INSERT INTO user(user_id,user_name,user_pw)
    VALUES
('0006','范德萨','12345');



INSERT INTO admin(admin_id,admin_name,admin_pw)
    VALUES
('1001','甲方','54321');
INSERT INTO admin(admin_id,admin_name,admin_pw)
    VALUES
('1002','大鼠','54321');
INSERT INTO admin(admin_id,admin_name,admin_pw)
    VALUES
('1003','狂风','54321');
INSERT INTO admin(admin_id,admin_name,admin_pw)
    VALUES
('1004','小明','54321');
INSERT INTO admin(admin_id,admin_name,admin_pw)
    VALUES
('1005','小芳','54321');
INSERT INTO admin(admin_id,admin_name,admin_pw)
    VALUES
('1006','小龙','54321');



INSERT INTO emp(emp_id,emp_name,emp_tel)
    VALUES
('2001','傅学真','4327847');
INSERT INTO admin(admin_id,admin_name,admin_pw)
    VALUES
('2002','幸智志','43874781');
INSERT INTO admin(admin_id,admin_name,admin_pw)
    VALUES
('2003','宁明远','547548');
INSERT INTO admin(admin_id,admin_name,admin_pw)
    VALUES
('2004','顾文昌','578759');
INSERT INTO admin(admin_id,admin_name,admin_pw)
    VALUES
('2005','乜懿轩','357280');
INSERT INTO admin(admin_id,admin_name,admin_pw)
    VALUES
('2006','张小龙','5794430');

INSERT INTO bldg(bldg_id,bldg_floor,bldg_pos)
    VALUES
('001','7','北区');
INSERT INTO bldg(bldg_id,bldg_floor,bldg_pos)
    VALUES
('002','8','东区');
INSERT INTO bldg(bldg_id,bldg_floor,bldg_pos)
    VALUES
('003','9','南区');
INSERT INTO bldg(bldg_id,bldg_floor,bldg_pos)
    VALUES
('004','7','西区');
INSERT INTO bldg(bldg_id,bldg_floor,bldg_pos)
    VALUES
('005','9','北区');
INSERT INTO bldg(bldg_id,bldg_floor,bldg_pos)
    VALUES
('006','8','北区');


INSERT INTO dorm(dorm_id,dorm_size,bldg_id)
    VALUES
('001101','10','001');
INSERT INTO dorm(dorm_id,dorm_size,bldg_id)
    VALUES
('001102','10','001');
INSERT INTO dorm(dorm_id,dorm_size,bldg_id)
    VALUES
('002101','10','002');
INSERT INTO dorm(dorm_id,dorm_size,bldg_id)
    VALUES
('002102','10','002');
INSERT INTO dorm(dorm_id,dorm_size,bldg_id)
    VALUES
('003101','10','003');
INSERT INTO dorm(dorm_id,dorm_size,bldg_id)
    VALUES
('003102','10','003');
INSERT INTO dorm(dorm_id,dorm_size,bldg_id)
    VALUES
('003103','10','003');
INSERT INTO dorm(dorm_id,dorm_size,bldg_id)
    VALUES
('003201','10','003');

INSERT INTO stu(stu_id,stu_name,dorm_id,stu_class)
    VALUES
('1901001','邓天翰','001101','计算机19-1');
INSERT INTO stu(stu_id,stu_name,dorm_id,stu_class)
    VALUES
('1901002','温俊力','001101','计算机19-1');
INSERT INTO stu(stu_id,stu_name,dorm_id,stu_class)
    VALUES
('1901003','贺才良','001101','计算机19-1');
INSERT INTO stu(stu_id,stu_name,dorm_id,stu_class)
    VALUES
('1901004','詹星文','001101','计算机19-1');
INSERT INTO stu(stu_id,stu_name,dorm_id,stu_class)
    VALUES
('1902001','邓天骄','001102','体育19-1');
INSERT INTO stu(stu_id,stu_name,dorm_id,stu_class)
    VALUES
('1903001','邓威力','001103','化学19-1');

INSERT INTO rec(rec_id,bldg_id)
    VALUES
('003001','003');
INSERT INTO rec(rec_id,bldg_id)
    VALUES
('001002','001');
INSERT INTO rec(rec_id,bldg_id)
    VALUES
('002001','002');
INSERT INTO rec(rec_id,bldg_id)
    VALUES
('001001','001');

INSERT INTO rec_stu(rec_id,stu_id,stu_name,rec_stu_sta,rec_stu_time)
    VALUES
('003001','1901001','邓天翰','进','2022-10-1');
INSERT INTO rec_stu(rec_id,stu_id,stu_name,rec_stu_sta,rec_stu_time)
    VALUES
('001001','1901002','温俊力','进','2022-10-1');
INSERT INTO rec_stu(rec_id,stu_id,stu_name,rec_stu_sta,rec_stu_time)
    VALUES
('003001','1901003','贺才良','进','2022-10-1');
INSERT INTO rec_stu(rec_id,stu_id,stu_name,rec_stu_sta,rec_stu_time)
    VALUES
('003001','1901003','贺才良','出','2022-10-2');


INSERT INTO rec_per(rec_id,per_name,per_tel,rec_per_sta,rec_per_time)
    VALUES
('002001','周绍祺','34821784','进','2022-12-1');
INSERT INTO rec_per(rec_id,per_name,per_tel,rec_per_sta,rec_per_time)
    VALUES
('001001','郜飞文','321784','进','2022-12-2');
INSERT INTO rec_per(rec_id,per_name,per_tel,rec_per_sta,rec_per_time)
    VALUES
('001001','郜飞文','321784','出','2022-12-2');
INSERT INTO rec_per(rec_id,per_name,per_tel,rec_per_sta,rec_per_time)
    VALUES
('002001','郭涵蓄','53785723','进','2022-12-2');
INSERT INTO rec_per(rec_id,per_name,per_tel,rec_per_sta,rec_per_time)
    VALUES
('001001','阚兴为','38758573','进','2022-12-2');
INSERT INTO rec_per(rec_id,per_name,per_tel,rec_per_sta,rec_per_time)
    VALUES
('001001','詹嘉谊','577773534','进','2022-12-3');
