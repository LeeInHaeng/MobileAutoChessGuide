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
