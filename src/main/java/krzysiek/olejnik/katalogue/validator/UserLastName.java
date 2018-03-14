package krzysiek.olejnik.katalogue.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = UserLastNameValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface UserLastName {

	String message() default "{UserLastName.error.message}";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
	
}