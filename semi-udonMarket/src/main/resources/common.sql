drop sequence udon_commentNo_seq;
drop sequence udon_boardNo_seq;

create table udon_member (
	id varchar2(100) primary key,
	password varchar2(100) not null,
	name varchar2(100) not null,
	member_no varchar2(100) not null,
	address varchar2(100) not null,
	tel varchar2(100) not null,
	member_type number default 0
)
create sequence udon_boardNo_seq;

insert into udon_member (id,member_type,password,name,member_no,address,tel)
values('1',0,'1234','박채은','950114-216','용인수지','010-1234-1234') ;

select * from udon_member;
delete  from udon_member;

create table udon_market (	
	id varchar2(100) primary key,
	market_no varchar2(100) ,
	market_name varchar2(100) not null,
	market_tel varchar2(100) not null,
	info varchar2(100) not null,
	item varchar2(100) check(item in('과일','채소','수산물')) not null, 
	constraint market_fk foreign key(id) references udon_member(id),
	constraint market_no_uq unique(market_no)
)

insert into udon_market (id,market_name,info,market_tel,item,market_no)
values('1','박채은우동마켓','수산물을판매해요~','031-252-1121','수산물','1234-5678-910'); 

select * from udon_market;

create table market_board (
	board_no number primary key,
	title varchar2(100) not null,
	content clob not null,
	time_posted date not null,
	hits number default 0,
	id varchar2(100) not null,
	constraint market_board_fk foreign key(id) references udon_member(id)
)
insert into market_board (board_no,title,content,time_posted,id)
values(udon_boardNo_seq.nextval,'제목','내용',sysdate,'1') ;

select * from market_board;

create table udon_comment (
	comment_no number primary key,
	comment_content varchar2(100) not null ,
	comment_time_posted date ,
	board_no number not null,
	id varchar2(100) not null,
	constraint comment_board_fk foreign key(board_no) references market_board(board_no) , 
	constraint comment_member_fk foreign key(id) references udon_member(id)
)
create sequence udon_commentNo_seq;

insert into udon_comment (comment_no,comment_content,comment_time_posted,board_no,id)
values(udon_commentNo_seq.nextval,'댓글내용',sysdate,1,'1') ;

select * from udon_comment;

select * from market_board;
select * from udon_member;
select * from udon_market;
select * from udon_comment;

drop table udon_member;
drop table udon_market;
drop table market_board;
drop table udon_comment;






