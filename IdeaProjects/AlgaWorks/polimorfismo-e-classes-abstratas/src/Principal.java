import com.algaworks.impostos.EmpresaLucroReal;
import com.algaworks.impostos.EmpresaSimples;
import com.algaworks.impostos.GestorDeImpostos;
import com.algaworks.impostos.PessoaFisica;

public class Principal {
    public static void main(String[] args) {
        var gestorImpostos = new GestorDeImpostos();

        var ju = new PessoaFisica("Ju Andrade", 45_500);
        var caio = new PessoaFisica("Caio Bastos", 180_000);

        var petShop = new EmpresaSimples("PetShop Lua e Estrela", 250_000, 160_000);
        var desenv = new EmpresaLucroReal("Desenv Consultoria", 8_000_000, 6_000_000);

        gestorImpostos.adicionar(ju);
        gestorImpostos.adicionar(caio);
        gestorImpostos.adicionar(petShop);
        gestorImpostos.adicionar(desenv);

        System.out.printf("Total de impostos: %.2f", gestorImpostos.getValorTotalImpostos());
    }
}
