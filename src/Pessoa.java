import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() { return nome; }
    public LocalDate getDataNascimento() { return dataNascimento; }

    @Override
    public String toString() {
        return " - Nome do funcionário: " + nome +
               " | Data de nascimento: " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dataNascimento);
    }
}
