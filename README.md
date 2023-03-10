# weather-diary
날씨 일기를 작성/조회/수정/삭제 하는 백엔드를 구현

### 최종 구현 API 리스트

✅ POST / create / diary
- date parameter 로 받아주세요. (date 형식 : yyyy-MM-dd)
- text parameter 로 일기 글을 받아주세요.
- 외부 API 에서 받아온 날씨 데이터와 함께 DB에 저장해주세요.

✅ GET / read / diary
- date parameter 로 조회할 날짜를 받아주세요.
- 해당 날짜의 일기를 List 형태로 반환해주세요.

✅ GET / read / diaries
- startDate, ednDate parameter 로 조회할 날짜 기간의 시작일/종료일을 받아주세요.
- 해당 기간의 일기를 List 형태로 반환해주세요.

✅ PUT / update / diary
- date parameter 로 수정할 날짜를 받아주세요.
- text parameter 로 수정할 새 일기 글을 받아주세요.
- 해당 날짜의 첫번째 일기 글을 새로 받아온 일기글로 수정해주세요.

✅ DELETE / delete / diary
- date parameter 로 삭제할 날짜를 받아주세요.
- 해당 날짜의 모든 일기를 지워주세요.

### 프로젝트 완성도 높이기

✅ DB와 관련된 함수들을 트랜잭션 처리 해주세요.

✅ 매일 새벽 1시에 날씨 데이터를 외부 API 에서 받아다 DB에 저장해두는 로직을 구현해주세요.

✅ logback 을 이용하여 프로젝트에 로그를 남겨주세요.

✅ ExceptionHandler 을 이용한 예외처리를 해주세요.

✅ swagger 을 이용하여 API documentation 을 해주세요.

### 코드 리뷰 개선한 사항
- 예외처리 부분이 구현이 안된듯 합니다. 예외 핸드러 처리 및 예외 발생 부분 처리가 필요해 보입니다.
- openapi를 통해서 날씨를 가져오는 부분은 DiaryService에 있기 보다는, 따로 서비스 클래스를 만들어서 처리해 주시면 좋을 듯 합니다.
- 서비스 부분은 인터페이스와 구현체를 따로 작성해 주시면 좋을 듯 합니다.
- 스케쥴을 통한 호출 부분 역시 구현이 미비한 듯 합니다. 이부분도 역시, 구현이 필요해 보입니다.
- DiaryService 클래스의 parseWeather 함수 구현에 있어서, get으로 특정 값을 가져오기 전에 키가 존재하는지를 체크하던지, 아니면 가져온 값이 널이 아닌지를 체크하는 방어 로직이 있으면 좋을 듯 합니다.
- swagger에 대한 설명문구 작성이 미흡해 보입니다. 이부분 역시 구현이 필요해 보입니다.