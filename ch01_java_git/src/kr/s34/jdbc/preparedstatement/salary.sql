CREATE TABLE salary (
name VARCHAR2(10) PRIMARY KEY,
pay NUMBER NOT NULL
);

INSERT INTO salary VALUES('SMITH',1000);
INSERT INTO salary VALUES('PETER',2000);
INSERT INTO salary VALUES('JOHN',3000);
COMMIT;

CREATE OR REPLACE PROCEDURE adjust (n IN VARCHAR2, rate IN FLOAT)
IS
newpay FLOAT;
BEGIN
	SELECT pay
	INTO newpay
	FROM salary
	WHERE name = n;
	newpay := newpay + newpay * rate;
	UPDATE salary SET pay = newpay WHERE name = n;
	COMMIT;
	EXCEPTION WHEN OTHERS THEN
		DBMS_OUTPUT.PUT_LINE('Error Occurred!');
	ROLLBACK;
END; 
