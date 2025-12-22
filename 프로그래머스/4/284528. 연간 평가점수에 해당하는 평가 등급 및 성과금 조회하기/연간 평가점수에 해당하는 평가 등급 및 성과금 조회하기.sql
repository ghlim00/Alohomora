WITH GRADE_TABLE AS(
    SELECT E.EMP_NO,
            E.EMP_NAME,
            E.SAL,
            CASE WHEN AVG(G.SCORE) >= 96 THEN 'S'
                WHEN AVG(G.SCORE) >= 90 THEN 'A'
                WHEN AVG(G.SCORE) >= 80 THEN 'B'
                ELSE 'C'
            END AS GRADE
    FROM HR_EMPLOYEES E
    JOIN HR_GRADE G
    ON E.EMP_NO = G.EMP_NO
    GROUP BY G.EMP_NO
)

SELECT EMP_NO, -- E.EMP_NO 아니고 EMP_NO
        EMP_NAME, 
        GRADE, 
        CASE  -- GRADE를 바로 쓸 수 없어서 WITH AS 사용
            WHEN GRADE='S' THEN SAL * 0.2
            WHEN GRADE='A' THEN SAL * 0.15
            WHEN GRADE='B' THEN SAL * 0.10
            ELSE 0
        END AS BONUS
FROM GRADE_TABLE
ORDER BY EMP_NO;