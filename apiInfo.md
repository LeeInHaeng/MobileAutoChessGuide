# 1������
### ��ü ���� ���� �ҷ����� : http://13.209.228.119:8080/MobileAutoChessGuide/api/unit/unitList (GET)
- return ������
  - ����Ʈ ���·� ���ֵ��� ���� ��ȯ

### �ش� ������ ��ü Ŀ��Ʈ �ҷ����� : http://13.209.228.119:8080/MobileAutoChessGuide/api/unit/comment (POST)
- POST ������ : var data = { unitNo : 1, muuid : 'this is dummy uuid1' };
- return ������
  - best3 : �ش� ������ Ŀ��Ʈ �� ��õ���� ���� ������� 3��
  - commentList : �ش� ������ ��ü Ŀ��Ʈ (�ֽ� �������)
  - goodCommentNo : �ش� ����̽��� uuid�� ��õ�� Ŀ��Ʈ�� ��ȣ
  - badCommentNo : �ش� ����̽��� uuid�� ����õ�� Ŀ��Ʈ�� ��ȣ

### Ư�� Ŀ��Ʈ ��õ�ϱ� : http://13.209.228.119:8080/MobileAutoChessGuide/api/unit/comment/good (POST)
- POST ������ : var data = { commentNo : 8, muuid : 'this is dummy uuid10' };
- return ������
  - ���������� ���� ���� true, ������ ���� ���� false

### Ư�� Ŀ��Ʈ ����õ�ϱ� : http://13.209.228.119:8080/MobileAutoChessGuide/api/unit/comment/bad (POST)
- POST ������ : var data = { commentNo : 8, muuid : 'this is dummy uuid10' };
- return ������
  - ���������� ���� ���� true, ������ ���� ���� false

### Ư�� Ŀ��Ʈ ��õ ����ϱ� : http://13.209.228.119:8080/MobileAutoChessGuide/api/unit/comment/good/cancel (POST)
- Post ������ : var data = { commentNo : 8, muuid : 'this is dummy uuid10' };
- return ������
  - ���������� ���� ���� true, ������ ���� ���� false

### Ư�� Ŀ��Ʈ ����õ ����ϱ� : http://13.209.228.119:8080/MobileAutoChessGuide/api/unit/comment/bad/cancel (POST)
- Post ������ : var data = { commentNo : 8, muuid : 'this is dummy uuid10' };
- return ������
  - ���������� ���� ���� true, ������ ���� ���� false

### �ش� ������ Ŀ��Ʈ �߰��ϱ� : http://13.209.228.119:8080/MobileAutoChessGuide/api/unit/comment/add (POST)
- Post ������ : var data = { unitNo : 1, content : '1�� ���� �������� ����������?' };
- return ������
  - ���������� ���� ���� true, ������ ���� ���� false

# 2������
### ��ü ������ ���� �ҷ����� : http://13.209.228.119:8080/MobileAutoChessGuide/api/item/itemList (GET)
- return ������
  - ����Ʈ ���·� �����۵��� ���� ��ȯ

### �������� ��ǥ�� Ư�� �����ۿ� ��︮�� ������ ��� �̾ƿ��� : http://13.209.228.119:8080/MobileAutoChessGuide/api/item/comment/�����۹�ȣ (GET)
- return ������
  - Ű �� : ������ ��ȣ
  - ���� �� : �ش� ������ ��ȣ�� �� �ۼ�Ʈ�� ��ǥ�� �޾Ҵ��� (100 % �� X %)
