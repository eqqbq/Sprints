package Sprint1.Tasca_S1_07_Nivell2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Serializer
public @interface Serializer{
   String addedPath() default "src/main/java/Sprint1/Tasca_S1_07_Nivell2/MovilJSON.json";
}

