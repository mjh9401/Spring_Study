package com.example.ex00.dependency;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Component
@Data
//@AllArgsConstructor
//@RequiredArgsConstructor은 final이 붙거나 @NotNull 이 붙은 필드의 생성자를 자동 생성해주는 롬복 어노테이션
@RequiredArgsConstructor
public class Coding {
	
	// 필드 주입
	// 굉장히 편하게 주입할 수 있으나 순환 참조(무한루프)시 오류가 발생하지 않기 때문에 StackOverFlow 발생.
	// final을 붙일 수 없기 때문에 다른 곳에서 변형 가능
	// => 생성자가 있으면 final을 붙여도 에러 안남
//	@Autowired
//	@NonNull
	private final Computer computer;

	
	// 생성자 주입
	// 순환 참조시 컴파일러가 인지 가능, 오류 발생
	// 메모리에 할당하면서 초기값으로 주입되므로 final 키워드 사용가능, 다른 곳에서 변형 불가능
	// 의존성 주입이 되지 않으면 객체가 생성되지 않으므로 
//	@Autowired
//	public Coding(Computer computer) {
//		super();
//		this.computer = computer;
//	}
	
	
	// Setter주입
	// 굉장히 편하게 주입할 수 있으나 순환 참조(무한루프)시 오류가 발생하지 않기 때문에 StackOverFlow 발생.
	// final을 붙일 수 없기 때문에 다른 곳에서 변형 가능 
	// 외부에서 직접 주입 가능함.
//	@Autowired
//	public void setComputer(Computer computer) {
//		this.computer = computer;
//	}
	
	
	
}
