# 1페이지
### 전체 유닛 정보 불러오기 : http://13.209.228.119:8080/MobileAutoChessGuide/api/unit/unitList (GET)
- return 데이터
  - 리스트 형태로 유닛들의 정보 반환

### 해당 유닛의 전체 커멘트 불러오기 : http://13.209.228.119:8080/MobileAutoChessGuide/api/unit/comment (POST)
- POST 데이터 : var data = { unitNo : 1, muuid : 'this is dummy uuid1' };
- return 데이터
  - best3 : 해당 유닛의 커멘트 중 추천수가 높은 순서대로 3개
  - commentList : 해당 유닛의 전체 커멘트 (최신 순서대로)
  - goodCommentNo : 해당 디바이스의 uuid가 추천한 커멘트의 번호
  - badCommentNo : 해당 디바이스의 uuid가 비추천한 커멘트의 번호

### 특정 커멘트 추천하기 : http://13.209.228.119:8080/MobileAutoChessGuide/api/unit/comment/good (POST)
- POST 데이터 : var data = { commentNo : 8, muuid : 'this is dummy uuid10' };
- return 데이터
  - 정상적으로 쿼리 수행 true, 비정상 쿼리 수행 false

### 특정 커멘트 비추천하기 : http://13.209.228.119:8080/MobileAutoChessGuide/api/unit/comment/bad (POST)
- POST 데이터 : var data = { commentNo : 8, muuid : 'this is dummy uuid10' };
- return 데이터
  - 정상적으로 쿼리 수행 true, 비정상 쿼리 수행 false

### 특정 커멘트 추천 취소하기 : http://13.209.228.119:8080/MobileAutoChessGuide/api/unit/comment/good/cancel (POST)
- Post 데이터 : var data = { commentNo : 8, muuid : 'this is dummy uuid10' };
- return 데이터
  - 정상적으로 쿼리 수행 true, 비정상 쿼리 수행 false

### 특정 커멘트 비추천 취소하기 : http://13.209.228.119:8080/MobileAutoChessGuide/api/unit/comment/bad/cancel (POST)
- Post 데이터 : var data = { commentNo : 8, muuid : 'this is dummy uuid10' };
- return 데이터
  - 정상적으로 쿼리 수행 true, 비정상 쿼리 수행 false

### 해당 유닛의 커멘트 추가하기 : http://13.209.228.119:8080/MobileAutoChessGuide/api/unit/comment/add (POST)
- Post 데이터 : var data = { unitNo : 1, content : '1번 유닛 좋은가요 안좋은가요?' };
- return 데이터
  - 정상적으로 쿼리 수행 true, 비정상 쿼리 수행 false

# 2페이지
### 전체 아이템 정보 불러오기 : http://13.209.228.119:8080/MobileAutoChessGuide/api/item/itemList (GET)
- return 데이터
  - 리스트 형태로 아이템들의 정보 반환

### 유저들이 투표한 특정 아이템에 어울리는 유닛의 목록 뽑아오기 : http://13.209.228.119:8080/MobileAutoChessGuide/api/item/comment/아이템번호 (GET)
- return 데이터
  - 키 값 : 유닛의 번호
  - 벨류 값 : 해당 유닛의 번호가 몇 퍼센트의 투표를 받았는지 (100 % 중 X %)

### 투표하기 버튼을 눌렀을 때 사용자가 이전에 해당 아이템에 투표했는지 여부를 검사 : http://13.209.228.119:8080/MobileAutoChessGuide/api/item/comment/votedUnitTest (POST)
- POST 데이터 : var data = { itemNo : 1, muuid : 'this is dummy uuid10' };
- return 데이터
  - length가 0 또는 1의 길이를 가짐
  - length가 0일 경우 해당 사용자는 이 아이템에 투표를 하지 않았음
  - length가 1일 경우 몇번의 유닛 번호가 해당 아이템에 어울리는지 사용자가 투표한 정보를 반환
  
### 해당 아이템에 가장 어울리는 유닛 투표하기 (1~5 마리의 유닛 선택) : http://13.209.228.119:8080/MobileAutoChessGuide/api/item/comment/vote (POST)
- POST 데이터 (투표하지 않은 유닛은 0으로 셋팅)
  - 예를 들어 1번 아이템은 1, 5, 9번 유닛이 가장 어울린다고 투표하는 경우
```js
var data = {
    itemNo : 1,
    muuid : 'this is dummy uuid10',
	goodUnitNo1 : 1,
	goodUnitNo2 : 5,
	goodUnitNo3 : 9,
	goodUnitNo4 : 0,
	goodUnitNo5 : 0
};
```
- return 데이터
  - 정상적으로 쿼리 수행 true, 비정상 쿼리 수행 false
  
# 3페이지
### 전체 직업 효과와 종족 효과 정보 얻기 : http://13.209.228.119:8080/MobileAutoChessGuide/api/effect/effectList (GET)
- return 데이터
  - jobEffect : 각 조건에 따른 직업 효과
  - speciesEffect : 각 조건에 따른 종족 효과