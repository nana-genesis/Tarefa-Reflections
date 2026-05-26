import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Anotação personalizada para nomear tabelas.
 *
 * @author Natalia
 * @version 1.0
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)  // IMPORTANTE: precisa ser RUNTIME para funcionar com Reflection!

public @interface Tabela {
    String nome();
}