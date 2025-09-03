SELECT COUNT(*) AS COUNT  -- COUNT(ID) 가 더 깔끔해보이나?
FROM ECOLI_DATA
WHERE (GENOTYPE & 2) = 0
    AND ((GENOTYPE & 1) > 0 OR (GENOTYPE & 4) > 0);
    
-- & 와 같은 비트 연산자를 이용하면 굳이 2진수로 직접 변환할 필요 없음
-- 포함되지 않으면 & 했을 때 0, 포함되면 & 했을 때 0보다 크다