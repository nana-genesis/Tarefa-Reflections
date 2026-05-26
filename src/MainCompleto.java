/**
 * Classe para ler anotações @Tabela de várias classes usando Reflection.
 *
 * @author Natalia
 * @version 1.0
 */
public class MainCompleto {

    public static void main(String[] args) {

        System.out.println("=== LEITURA DE ANOTAÇÕES @TABELA COM REFLECTION ===\n");

        // Lista de classes para verificar
        Class<?>[] classes = {
                Usuario.class,
                Produto.class,  // Exemplo extra
                Cliente.class   // Exemplo extra
        };

        for (Class<?> classe : classes) {
            lerAnotacaoTabela(classe);
            System.out.println();
        }
    }

    public static void lerAnotacaoTabela(Class<?> classe) {

        System.out.println("Analisando classe: " + classe.getSimpleName());

        // Verificar se a classe tem a anotação @Tabela
        if (classe.isAnnotationPresent(Tabela.class)) {

            // Pegar a anotação
            Tabela tabela = classe.getAnnotation(Tabela.class);

            // Ler o valor
            String nomeTabela = tabela.nome();

            // Imprimir no console
            System.out.println("  ✅ Anotação @Tabela encontrada!");
            System.out.println("  📋 Nome da tabela: " + nomeTabela);

        } else {
            System.out.println("  ❌ Classe NÃO possui anotação @Tabela");
        }
    }
}
