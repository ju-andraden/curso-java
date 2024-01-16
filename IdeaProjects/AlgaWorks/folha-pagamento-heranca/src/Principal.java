import com.algaworks.rh.Funcionario;
import com.algaworks.rh.Holerite;
import com.algaworks.rh.Programador;

public class Principal {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Juliana", 80);
        System.out.println(funcionario1);
        Holerite holerite1 = funcionario1.gerarHolerite(180, "dez/2023");
        holerite1.imprimir();

        System.out.println();

        Programador programador1 = new Programador("Caio", 40);
        programador1.setValorBonus(500);
        System.out.println(programador1);
        Holerite holerite2 = programador1.gerarHolerite(180, "dez/2023");
        holerite2.imprimir();
    }
}
