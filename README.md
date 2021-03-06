# MidPoint


## 중간지점 알고리즘 ## 
1. 유저들의 주소지를 이용해서 같은 도끼리 클러스터로 묶는다. (경기도, 강원도, 충청도..)
2. 각 클러스터의 센트로이드를 무게중심으로 구한다.
3. 클러스터의 센트로이드들의 중심을 시간가중치를 이용해서 구한다.(사용자들의 중간지점까지의 평균 이동시간을 줄이도록 하였다.)<br/>  
   ** 이때 시간가중치는 이동시간을 사용하였고 이동시간은 구글 direction api를 이용해 parsing하여 가져왔다.
<br/>  
** 중간지점을 찾는데 걸리는 시간이 있기 때문에 로딩화면을 추가하였다. (Task 사용)
<br/>  
<img src="https://user-images.githubusercontent.com/48446896/100689359-a8e4af80-33c7-11eb-8d9a-5383018d232a.jpeg" width="30%" height="20%"></img>
<img src = "https://user-images.githubusercontent.com/48446896/100689365-abdfa000-33c7-11eb-945f-7f4f7c5c8f2d.jpeg" width="30%" height="20%"></img>

<br/><br/>

<br/><br/>
* 은아,윤지언니 코드 합침<br/>  
* 아직 그라함에서 무게중심 구하는 건 안들어가있음

<br/><br/>

## 할일 ##
- 중간지점 초기값 => 무게중심으로 지정
- 최적의 경로를 판단하는 기준 정확히 세우기
- 다각형 안에 중간지점이 안들어갔을 때 어떻게 다시 지정할지 생각해보기



## 실행
#### __사용된 임의의 지점들 (5개)__
  + 서울시립대 : 37.58410374069874, 127.0587985551473
  + 포천(우리집) : 37.82172487893991, 127.13050335515426
  + 신길동(영등포구):37.50839652592737, 126.91826738212885
  + 홍대입구역 : 37.55768857834483, 126.92444543977771
  + 강남역 : 37.50209960522367, 127.02698624767761
  
#### __임의의 중간지점 (나중에 무게중심으로 설정)__
  + 시청역 : 37.56593052663891, 126.97680764976288
<br/>

### __결과__
* 중간지점 : 37.57243738262421,127.00038265832427
<br/>
<img src="https://user-images.githubusercontent.com/48446896/97246617-19d0fe80-1841-11eb-96f2-096ab9fbb35f.png" width="70%" height="70%"></img>
<img src = "https://user-images.githubusercontent.com/48446896/97246622-1b9ac200-1841-11eb-8f28-4d9c74956a80.jpeg" width="30%" height="20%"></img>

------------
### __참고__
<br/><br/>
<img src = "https://user-images.githubusercontent.com/48446896/97247599-54d43180-1843-11eb-9144-a1bf56a053af.png" width="50%" height="50%"></img>




