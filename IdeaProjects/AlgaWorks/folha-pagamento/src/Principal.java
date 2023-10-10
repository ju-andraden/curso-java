public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Juliana";
        funcionario.quantidadeFilhos = 0;

        ContratoTrabalho contrato = new ContratoTrabalho();
        contrato.funcionario = funcionario;
        contrato.valorHoraNormal = 51.8;
        contrato.valorHoraExtra = 60.5;

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        double salarioDevido = folhaPagamento.calcularSalario(160, 10, contrato);

        System.out.printf("Salário devido: R$ %.2f%n", salarioDevido);
    }
}
