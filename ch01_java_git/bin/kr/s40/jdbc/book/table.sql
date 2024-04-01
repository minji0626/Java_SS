CREATE TABLE member (
me_id VARCHAR2(10) PRIMARY KEY, -- 회원 ID
me_passwd VARCHAR2(10) NOT NULL, -- 회원 비밀번호
me_name VARCHAR2(30) NOT NULL, --회원명
me_phone VARCHAR2(13) NOT NULL, --전화번호
me_regdate DATE DEFAULT SYSDATE NOT NULL -- 가입날짜
);

CREATE TABLE sbook(
bk_num NUMBER PRIMARY KEY, -- 도서 번호
bk_name VARCHAR2(20) NOT NULL, --도서명
bk_category VARCHAR2(30) NOT NULL, --분류
bk_regdate DATE DEFAULT SYSDATE NOT NULL -- 등록날짜
);

CREATE SEQUENCE sbook_seq;

CREATE TABLE reservation(
re_num NUMBER PRIMARY KEY,
re_status NUMBER(1) NOT NULL, -- 0이면 반납, 1은 대출 대출 정보를 업데이트 시켜주는 것임 지워버리면 대출 이력이 사라지기 때문에
bk_num NUMBER REFERENCES sbook(bk_num), -- 도서 번호
me_id VARCHAR2(10) REFERENCES member(me_id), -- 회원 ID
re_date DATE DEFAULT SYSDATE NOT NULL, -- 대출일
re_modifydate DATE --반납일
);

CREATE SEQUENCE reservation_seq;
