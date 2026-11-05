# ☕ Cafe Order

**Java 기반 카페 주문 금액 계산 프로그램**

Java의 기본 문법을 활용해 메뉴 가격을 조회하고, 사용자가 입력한 주문 수량에 따라 총금액을 계산하는 콘솔 프로그램입니다.

GitHub의 **Issue, Projects(Kanban), Branch, Pull Request, Code Review**를 활용하여 팀 협업 과정을 실습했습니다.

## 📌 프로젝트 개요

| 항목 | 내용 |
|---|---|
| 개발 일자 | 2026.11.02 |
| 개발 언어 | Java 17+ |
| 개발 환경 | IntelliJ IDEA |
| 빌드 시스템 | IntelliJ |
| 버전 관리 | Git & GitHub |
| 협업 방식 | GitHub Flow 기반 협업 |
| 프로젝트 관리 | GitHub Projects (Kanban) |

## ✨ 주요 기능

### 1. 메뉴 가격 조회

`Menu.getPrice(String name)`

메뉴 이름에 따라 가격을 반환하며, 등록되지 않은 메뉴는 0원을 반환합니다.

| 메뉴 | 가격 |
|---|---|
| 아메리카노 | 3,000원 |
| 라테 | 4,000원 |
| 등록되지 않은 메뉴 | 0원 |

- `if-else` 조건문을 활용한 메뉴 구분
- `equals()`를 활용한 문자열 비교
- 등록되지 않은 메뉴에 대한 기본값 처리

### 2. 주문 금액 계산

`OrderCalculator.calculate(int price, int quantity)`

메뉴 가격과 주문 수량을 곱해 총금액을 계산합니다.

**총금액 = 메뉴 가격 × 주문 수량**

- 정상적인 수량은 가격과 곱하여 계산
- 수량이 0 이하인 경우 0원 반환

### 3. 대량 주문 할인

`OrderCalculator.java` · A 담당

10잔 이상 주문하면 총금액의 10%를 할인합니다.

- 10잔 미만: 정상 금액
- 10잔 이상: 총금액의 10% 할인
- 수량이 0 이하: 0원 반환

| 메뉴 | 수량 | 최종 금액 |
|---|---|---|
| 아메리카노 | 9잔 | 27,000원 |
| 아메리카노 | 10잔 | 27,000원 |
| 아메리카노 | 20잔 | 54,000원 |

### 4. 주문 직접 입력 및 결과 출력

`Main.java` · B 담당

`Scanner`를 사용하여 메뉴 이름과 주문 수량을 직접 입력받습니다.

- `nextLine()`으로 메뉴 이름 입력
- `nextInt()`로 주문 수량 입력
- 기존 메뉴 가격 조회 및 주문 금액 계산 메서드 재사용
- 주문 내역과 최종 금액을 콘솔에 출력

## 🗂 프로젝트 구조

```text
cafe-order/
├── src/
│   ├── Main.java
│   ├── Menu.java
│   └── OrderCalculator.java
├── .gitignore
└── README.md
```

| 파일 | 역할 |
|---|---|
| `Main.java` | 사용자 입력 및 주문 결과 출력 |
| `Menu.java` | 메뉴별 가격 조회 |
| `OrderCalculator.java` | 주문 금액 계산 및 대량 주문 할인 |

## 🚀 실행 방법

1. GitHub 저장소를 Clone합니다.
2. IntelliJ IDEA에서 `cafe-order` 프로젝트를 엽니다.
3. `src/Main.java`의 `main()` 메서드를 실행합니다.
4. 메뉴 이름과 주문 수량을 순서대로 입력합니다.

### 실행 예시

**입력**

```text
라테
3
```

**출력**

```text
주문
메뉴: 라테, 수량: 3
총금액: 12000원
```

## 🤝 GitHub 협업

### 역할 분담

| 팀원 | 기본 기능 | 추가 기능 |
|---|---|---|
| [서청원](https://github.com/cheongwon00) | 메뉴 가격 조회 | 10잔 이상 할인 |
| [김민진](https://github.com/LeahKim-dev) | 주문 금액 계산 | 주문 직접 입력 |

### 브랜치 전략

| 브랜치 | 담당 기능 |
|---|---|
| `main` | 최종 통합 코드 |
| `feature/menu-price` | 메뉴 가격 조회 |
| `feature/order-total` | 주문 금액 계산 |
| `feature#5` | 대량 주문 할인 |
| `feature#6` | 주문 직접 입력 |

모든 기능은 별도 브랜치에서 개발한 후 Pull Request와 코드 리뷰를 거쳐 `main`에 Merge했습니다.

### 협업 프로세스

**Issue → Project → Branch → Commit & Push → Pull Request → Code Review → Merge**

1. **Issue:** 기능별 작업의 배경과 완료 조건 정의
2. **Project:** Kanban 보드에서 작업 상태 관리 (Todo → In Progress → Done)
3. **Branch:** 담당 기능별 브랜치에서 독립적으로 개발
4. **Commit & Push:** 변경 사항 기록 및 원격 저장소 공유
5. **Pull Request:** 구현 내용과 확인한 입력 및 결과 공유
6. **Code Review & Merge:** 팀원 리뷰 후 `main` 브랜치에 통합

### 프로젝트 관리

- [GitHub Project 보드](https://github.com/LeahKim-dev/cafe-order/projects)
- [Issues](https://github.com/LeahKim-dev/cafe-order/issues)
- [Pull Requests](https://github.com/LeahKim-dev/cafe-order/pulls)

## ✅ 테스트 시나리오

| 테스트 항목 | 입력 | 기대 결과 |
|---|---|---|
| 정상 주문 | 아메리카노, 2잔 | 6,000원 |
| 정상 주문 | 라테, 3잔 | 12,000원 |
| 없는 메뉴 | 에이드, 1잔 | 0원 |
| 수량 0 | 라테, 0잔 | 0원 |
| 음수 수량 | 라테, -1잔 | 0원 |
| 할인 미적용 | 아메리카노, 9잔 | 27,000원 |
| 할인 적용 | 아메리카노, 10잔 | 27,000원 |
| 할인 적용 | 아메리카노, 20잔 | 54,000원 |

---

Java의 클래스와 정적 메서드를 활용해 기능을 분리하고, GitHub 기반 협업을 통해 하나의 프로그램으로 통합하는 과정을 학습했습니다.