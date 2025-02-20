import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){

        // Item 3.1 - Inserindo funcionários na mesma ordem da tabela:
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"));
        funcionarios.add(new Funcionario("João", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador"));
        funcionarios.add(new Funcionario("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14"), "Coordenador"));
        funcionarios.add(new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"));
        funcionarios.add(new Funcionario("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68"), "Recepcionista"));
        funcionarios.add(new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"));
        funcionarios.add(new Funcionario("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("4071.84"), "Contador"));
        funcionarios.add(new Funcionario("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Gerente"));
        funcionarios.add(new Funcionario("Heloísa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Eletricista"));
        funcionarios.add(new Funcionario("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente"));

        // Item 3.2 - Removendo João da lista de funcionários:
        funcionarios.removeIf(f -> f.getNome().equals("João"));


        // Item 3.3 - Imprimindo todos os funcionários e suas respectivas informações no formato exigido:
        System.out.println("Lista de Funcionários:");
        funcionarios.forEach(System.out::println);


        // Item 3.4 - Atualizando salário dos funcionários com 10% de aumento:
        funcionarios.forEach(f -> f.setSalario(f.getSalario().multiply( new BigDecimal("1.10"))));


        // Item 3.5 - Agrupando os funcionários por função em um MAP, sendo a chave a “função” e o valor a “lista de funcionários”:
        Map<String, List<Funcionario>> funcionariosPorFuncao = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getFuncao));


        // Item 3.6 - Imprimindo funcionários agrupados por função:
        System.out.println("\nFuncionários Agrupados por Função:");
        funcionariosPorFuncao.forEach((funcao, lista) -> {
            System.out.println(funcao + ":");
            lista.forEach(System.out::println);
        });


        // Item 3.8 - Imprimindo funcionários nascidos nos meses 10 e 12:
        System.out.println("\nFuncionários Nascidos em Outubro e Dezembro:");
        funcionarios.stream()
                .filter(f -> f.getDataNascimento().getMonthValue() == 10 || f.getDataNascimento().getMonthValue() == 12)
                .forEach(System.out::println);


        // Item 3.9 - Imprimindo o funcionário mais velho:
        Funcionario funcionarioMaisVelho = funcionarios.stream()
                .min(Comparator.comparing(Pessoa::getDataNascimento))
                .get();

        System.out.println("\nFuncionário Mais Velho:\n - Nome: " + funcionarioMaisVelho.getNome() +
                "\n - Idade: " + funcionarioMaisVelho.getIdade() + " anos");


        // Item 3.10 - Imprimindo a lista de funcionários por ordem alfabética:
        System.out.println("\nLista de Funcionários em Ordem Alfabética:");
        funcionarios.stream()
                .sorted(Comparator.comparing(Pessoa::getNome))
                .forEach(System.out::println);


        // Item 3.11 - Imprimindo a soma total do salário dos funcionários:
        BigDecimal somaTotalSalarios = funcionarios.stream()
                .map(Funcionario::getSalario).reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("\nSoma Total do Salário de Todos os Funcionários: " + formatarValor(somaTotalSalarios));


        // Item 3.12 - Imprimindo a quantidade de salários mínimos que cada funcionário recebe:
        BigDecimal salarioMinimo = new BigDecimal("1212.00");

        System.out.println("\nQuantidade de Salários Mínimos por Funcionário:");
        funcionarios.forEach(f -> {
            BigDecimal quantidadeSalariosMinimos = f.getSalario().divide(salarioMinimo, 2, RoundingMode.DOWN);
            System.out.println(" - " + f.getNome() + ": " + quantidadeSalariosMinimos);
        });
    }

    private static String formatarValor(BigDecimal valor) {
        return new DecimalFormat("#,##0.00", new DecimalFormatSymbols() {{
            setGroupingSeparator('.');
            setDecimalSeparator(',');
        }}).format(valor);
    }
}