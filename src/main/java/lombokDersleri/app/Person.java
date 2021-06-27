package lombokDersleri.app;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.NonFinal;



@Getter
@Setter
@ToString(of = "name")
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder

//bu sınıfnın instancelarının  birbirne eşit olması
public class Person {
	
	@Setter(value = AccessLevel.PRIVATE)
	private Long id;
	private String name;
	private String surname;
	
	
	
}
