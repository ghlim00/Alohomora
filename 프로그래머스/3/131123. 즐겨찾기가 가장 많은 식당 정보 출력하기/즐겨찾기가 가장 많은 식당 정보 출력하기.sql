-- GROUP BY + MAX로 안됨
SELECT R.FOOD_TYPE, R.REST_ID, R.REST_NAME, R.FAVORITES
FROM REST_INFO R
WHERE R.FAVORITES = (
    SELECT MAX(R2.FAVORITES)
    FROM REST_INFO R2
    WHERE R.FOOD_TYPE = R2.FOOD_TYPE
)
ORDER BY FOOD_TYPE DESC;

# 바깥 쿼리가 한 줄씩 "지나가면서" 물어봐! (FROM REST_INFO R) 테이블에 식당들이 쭉~ 늘어서 있다고 생각해 봐. 바깥 쿼리(SELECT R.FOOD_TYPE...)가 첫 번째 식당을 보면서 이렇게 말하는 거야. "음... 너는 '한식'이네? 그럼 '한식' 식당들 중에서 가장 즐겨찾기수가 많은 곳이 어디지?"