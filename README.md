# MovieReview
코드로 배우는 스프링 부트 웹 프로젝트 Part4 실습

</br></br></br>

# 요구사항
* 사용자는 목록에서 등록된 영화의 썸네일, 리뷰 수, 평균 평점, 수정 날짜를 확인할 수 있다.
* 사용자는 목록에서 등록된 영화를 10개 씩 페이지별로 확인할 수 있다.
* 사용자는 영화를 이미지와 함께 등록할 수 있다.
* 사용자는 등록된 영화를 조회할 수 있다.
* 사용자는 등록된 영화의 이미지를 클릭하여 원본 이미지를 볼 수 있다.
* 사용자는 등록된 글에 리뷰를 남길 수 있다.
* 사용자는 등록된 글의 리뷰를 조회할 수 있다.
* 사용자는 리뷰를 수정, 삭제할 수 있다.

</br></br></br>

# API 규격서
| URL | 방식 | 기능 | 파라미터 | Redirect URL | 설명 |
| ------------- | ------------- | ------------- | ------------- | ------------- | -------------- |
| /movie/list | GET  | 목록/페이징  | PageRequestDTO (page, size, type, keyword) | | 파라미터 값에 맞는 페이지 목록 출력 |
| /movie/register | GET | 입력 화면 | | | 화면 등록 페이지 출력 |
| /movie/register | POST | 등록 | MovieDTO (mno, title, imageDTOList, avg, reviewCnt, regDate, modDate) | /movie/list | 파라미터 값으로 게시글 등록 |
| /movie/read | GET | 조회 화면 | Long (mno), PageRequestDTO (page, size, type, keyword) | | 파라미터 값에 맞는 게시글 내용 출력 |
| /board/modify | GET | 수정 화면 | Long (mno), PageRequestDTO (page, size, type, keyword)  | | 파라미터 값에 맞는 게시글 수정 화면 출력 |
| /uploadAjax | POST | 이미지 업로드 | MultipartFile[] | | 파라미터 값으로 이미지 저장 |
| /display | GET | 이미지 화면 | fileName, size (fileSize) | | 파라미터 값에 맞는 이미지 출력 |
| /removeFile | POST | 이미지 삭제 | String (fileName) | | 파라미터 값에 맞는 이미지 삭제 |
| /reviews/{mno}/all | GET | 목록 | Long (mno) | | 파라미터 값에 맞는 전체 리뷰 출력 |
| /reviews/{mno} | POST | 등록 | ReviewDTO (reviewnum, mno, mid, nickname, email, grade, text, regDate, modDate) | | 파라미터 값으로 리뷰 등록 |
| /reviews/{mno}/{reviewnum} | PUT | 수정 | Long (reviewnum), ReviewDTO (reviewnum, mno, mid, nickname, email, grade, text, regDate, modDate) | | 파라미터 값으로 리뷰 수정 |
| /reviews/{mno}/{reviewnum} | DELETE | 삭제 | Long (reviewnum) | | 파라미터 값에 맞는 리뷰 삭제 |

</br></br></br>

# ER Diagram
![image](https://user-images.githubusercontent.com/74942574/183561889-8d6ec328-ebb4-4628-ac0d-83855e869597.png)
Movie == 1 : N == MovieImage
Movie == 1 : N == review
review == 1 : N == MovieMember

</br></br></br>

# Git Model
* main
  * 최종 릴리즈 브랜치
* develop
  * 개발 브랜치
  * 기능 구현을 테스트
* feature
  * 기능 구현 브랜치
  
</br></br>

## Git Flow 캡처 화면
![image](https://user-images.githubusercontent.com/74942574/183568420-0b4aeebf-d3dd-4c8b-9289-96e7faa81ec1.png)
