----------------------------
-- drop everything
----------------------------
drop table seqs;
drop function nextval;

----------------------------
-- CREATE SEQ table
----------------------------
create table seqs (
    seq_name varchar(30)
   ,start int
   ,increment int
   ,curval int
   ,flag char(1)
); 

insert into seqs values('message_id',1,1,1,'A'); 

-- flag is for multiuser enviroment 
-- flag:A means available to update 
-- flag:N means other session holding lock on sequence, not available to update/increase sequence value. 

-----------------------------
-- function return sequence
-----------------------------

DELIMITER //
CREATE FUNCTION `nextval`(v_seq_name varchar(30))
RETURNS INT
NOT DETERMINISTIC
SQL SECURITY DEFINER
COMMENT 'Procedure to get generic name-based sequence' 
begin 
    declare v_flag char(1); 
    declare v_nextval int; 
    set v_flag='N'; 
    while (v_flag='N') do 
        select flag into v_flag from seqs where seq_name=v_seq_name; 
    end while; 

    update seqs set flag='N' where seq_name=v_seq_name; 
    select curval+INCREMENT into v_nextval from seqs where seq_name=v_seq_name; 
    update seqs set flag='A',curval=v_nextval where seq_name=v_seq_name; 
    return v_nextval; 
end//
DELIMITER ;
