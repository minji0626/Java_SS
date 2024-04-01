-- 상품 정보를 담고있는 테이블 
CREATE TABLE sitem (
item_num NUMBER PRIMARY KEY, -- 상품 번호
item_name VARCHAR2(30) NOT NULL, -- 상품명
item_price NUMBER(9) NOT NULL, -- 상품 가격
item_date DATE DEFAULT SYSDATE NOT NULL -- 등록일
);

CREATE SEQUENCE sitem_seq;

--회원 정보
CREATE TABLE customer(
cust_id VARCHAR2(30) PRIMARY KEY, -- 회원 아이디
cust_name VARCHAR2(30) NOT NULL, -- 회원명
cust_address VARCHAR2(90) NOT NULL, -- 회원 주소
cust_tel VARCHAR2(20) NOT NULL, -- 회원 주소
cust_date DATE DEFAULT SYSDATE NOT NULL --가입일
);

-- 주문 정보
CREATE TABLE sorder (
order_num NUMBER PRIMARY KEY, --  주문번호
cust_id VARCHAR2(30) REFERENCES customer(cust_id), --회원 아이디(구매한 사람)
item_num NUMBER REFERENCES sitem(item_num), --상품 번호(구매한 상품)
order_date DATE DEFAULT SYSDATE NOT NULL -- 주문일자
);

CREATE SEQUENCE sorder_seq;