-- Вывод всех роботов в порядке возрастания по model_name
SELECT *
  FROM jaegers
 ORDER BY model_name ASC;

-- Вывод всех роботов, которые не уничтожены
SELECT *
  FROM jaegers
 WHERE status != 'Destroyed';

-- Вывод всех роботов серий Mark-1 и Mark-4
SELECT *
  FROM jaegers
 WHERE mark IN ('Mark-1', 'Mark-4');

-- Вывод всех роботов, кроме Mark-1 и Mark-4, в порядке убывания по mark
SELECT *
  FROM jaegers
 WHERE mark NOT IN ('Mark-1', 'Mark-4')
 ORDER BY mark DESC;

-- Вывод самого старого робота
SELECT *
  FROM jaegers
 ORDER BY launch ASC
 LIMIT 1;

-- Вывод роботов, которые уничтожили больше всех Kaiju
SELECT model_name, mark, launch, kaiju_kill
  FROM jaegers
 WHERE kaiju_kill = (SELECT MAX(kaiju_kill) FROM jaegers);

-- Вывод среднего веса роботов
SELECT ROUND(AVG(weight), 3) AS avg_weight
  FROM jaegers;

-- Увеличение количества убитых Kaiju на 1 для всех активных роботов
UPDATE jaegers
   SET kaiju_kill = kaiju_kill + 1
 WHERE status != 'Destroyed';

-- Вывод всех роботов после обновления
SELECT *
  FROM jaegers;

-- Удаление уничтоженных роботов
DELETE FROM jaegers
 WHERE status = 'Destroyed';

-- Вывод всех роботов после удаления
SELECT *
  FROM jaegers;