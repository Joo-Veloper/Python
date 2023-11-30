# DI 의존성 주입
<div>
의존성 주입(Dependency Injection)은 소프트웨어 공학에서 중요한 디자인 패턴 중 하나입니다. 이는 객체 간의 의존 관계를 느슨하게 만들고, 코드의 유연성과 재사용성을 향상시키는 데 사용됩니다.

일반적으로 객체지향 프로그래밍에서는 클래스들 간에 서로 의존 관계가 있습니다. 예를 들어, 클래스 A가 클래스 B를 사용한다면, 클래스 A는 클래스 B에 의존하고 있는 것입니다. 이 때, 의존성 주입은 이 의존 관계를 코드 내에서 명시적으로 정의하지 않고, 외부에서 해당 의존성을 주입하는 방식을 채택합니다.

의존성 주입은 주로 세 가지 방식으로 이루어집니다:

1. 생성자 주입(Constructor Injection): 의존성을 객체의 생성자를 통해 주입하는 방식입니다. 객체가 생성될 때 필요한 의존성을 외부에서 주입받아 사용합니다.

2. 메서드 주입(Method Injection): 의존성을 객체의 메서드를 통해 주입하는 방식입니다. 메서드를 호출할 때 필요한 의존성을 외부에서 주입받아 사용합니다.

3. 속성 주입(Property Injection): 의존성을 객체의 속성을 통해 주입하는 방식입니다. 객체의 속성에 외부에서 의존성을 할당하여 사용합니다.

의존성 주입은 코드의 유연성과 테스트 용이성을 높여주며, 객체들 간의 결합도를 줄여줍니다. 또한, 의존성을 외부에서 주입받기 때문에 코드 변경 시에도 해당 객체 자체를 수정하지 않고 외부에서 쉽게 의존성을 변경할 수 있는 장점이 있습니다.
</div>