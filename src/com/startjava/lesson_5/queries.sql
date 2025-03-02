SELECT * FROM jaegers ORDER BY model_name ASC;


SELECT * FROM jaegers WHERE status != 'Destroyed';


SELECT * FROM jaegers WHERE mark IN ('Mark-1', 'Mark-4');


SELECT * FROM jaegers WHERE mark NOT IN ('Mark-1', 'Mark-4') ORDER BY mark DESC;


SELECT * FROM jaegers ORDER BY launch ASC LIMIT 1;


SELECT model_name, mark, launch, kaiju_kill FROM jaegers ORDER BY kaiju_kill DESC LIMIT 1;


SELECT ROUND(AVG(weight), 3) AS avg_weight FROM jaegers;


UPDATE jaegers SET kaiju_kill = kaiju_kill + 1 WHERE status != 'Destroyed';


SELECT * FROM jaegers;


DELETE FROM jaegers WHERE status = 'Destroyed';


SELECT * FROM jaegers;