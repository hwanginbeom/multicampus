학습내용
***
1. 데이터를 어떤 구조로 관리 할 것 인가?
	절대적인 제약 조건 
		-java.utill package의 자료구조 클래스를 기반으로 생성한 
		데이터 저장 및 관리 객체는 Object 타입만 저장가능
2. 예시
	1. 학번으로 학생 들 관리
		1. 학생 데이터를 학번이 구분
		2. key(중복 불허 , Set 구조) 와 value(중복 가능) 구조
		3. Map 계열
		
	2. 주민번호 관리하는 데이터 관리
		1. 중복 데이터 절대 불허
		2. Set 계열 
		
	3. 동명이인? 학번이고 무작위로 데이터 저장 및 관리
		-데이터 동일 여부 등 구분 없이 저장
		- 데이터 구분은 고유한 index
		1. index로 데이터 구분 
		2. 중복 데이터 저장 허용
		3. List 계열 