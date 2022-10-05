# Android Clean Architecture 연습
## 🤔 기능 요구사항
통신 모듈을 구현합니다. 
- presentation, domain, data 레이어로 구분하여 각 레이어에 맞는 역할을 합니다.
- 멀티 모듈로 구현합니다.
- 코루틴을 사용하여 더욱 더 유연하게 구현합니다.
- 로컬 캐시를 사용합니다.
- Jetpack DefaultLifecycleObserver를 사용하여 각 라이프사이클에 맞는 행동을 구현합니다.
- Retrofit2 Exception 핸들링을 신경써서 구현합니다.  
- ...
</br>

## 🥸 고민해야 할 것들
- 멀티 모듈 관리는 어떻게 하는게 좋을지
- 멀티 모듈 dependency는 어떻게 하는게 좋을지 
- ViewModel내에서 DefaultLifecycleObserver를 사용할 경우 viewModelScope를 사용할 수 없는건지 찾아보기 
- LiveData, StateFlow의 적절한 사용처 및 사용방법에 대해 찾아보기
- 멀티 모듈로 구현시 단위 테스트 구현방법에도 영향이 가는지 찾아보기
- ...
</br>

## ✅ 프로그래밍 요구사항
- 모든 로직에 단위 테스트를 구현합니다. 단, UI(print, readLine) 로직은 제외합니다. 
  - 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분합니다. 
  - UI 로직을 InputView, ResultView와 같은 별도의 타입으로 분리하여 구현합니다. 
  - Code Coverage를 통해 모든 로직을 테스트했는지 확인할 수 있습니다.
- indent(인덴트, 들여쓰기) depth가 2를 넘지 않도록 구현합니다. 1까지만 허용합니다. 
  - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2입니다. 
  - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하는 것입니다. 
- 함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현합니다. 
  - 함수(또는 메소드)가 한 가지 일만 잘 하도록 구현합니다. 
- 기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리해 추가합니다. 
- git의 commit 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위로 추가합니다.
