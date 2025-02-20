import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.util.Locale;

public class Funcionario extends Pessoa{
    private BigDecimal salario;
    private String funcao;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao){
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario() { return salario; }
    public String getFuncao() { return funcao; }

    @Override
    public String toString(){
        return super.toString() +
                " | Salário: " + new DecimalFormat("#,##0.00", new DecimalFormatSymbols() {{setGroupingSeparator('.'); setDecimalSeparator(',');}}).format(salario) +
                " | Função: " + funcao;
    }
}
