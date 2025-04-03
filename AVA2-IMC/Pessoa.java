public class Pessoa {

    private String nomePessoa;
    private double pesoPessoa;
    private double alturaPessoa;
    private double imcPessoa;
    private String analiseImcPessoa;

    public Pessoa(String nomePessoa, double pesoPessoa, double alturaPessoa) {
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
        this.alturaPessoa = alturaPessoa;
        this.imcPessoa = calcularImcPessoa(); 
        this.analiseImcPessoa = analisarImcPessoa();
    }

    private double calcularImcPessoa() {
        return this.pesoPessoa / (Math.pow(this.alturaPessoa, 2));
    }

    private String analisarImcPessoa() {
        if (imcPessoa < 18.5) {
            return "Baixo peso. É recomendado procurar um médico.";
        } else if (imcPessoa < 25) {
            return "Peso adequado. Avalie outros parâmetros corporais.";
        } else if (imcPessoa < 30) {
            return "Sobrepeso. Consulte um médico e reveja hábitos.";
        } else if (imcPessoa < 35) {
            return "Obesidade Grau I. Busque orientação médica e nutricional.";
        } else if (imcPessoa < 40) {
            return "Obesidade Grau II. Não atrase a busca por orientação médica.";
        } else {
            return "Obesidade Grau III. A chance de doenças associadas é alta. Busque orientação médica.";
        }
    }

    public void mostrarImcAnalisePessoa() {
        System.out.println("Nome: " + this.nomePessoa);
        System.out.println("Peso: " + this.pesoPessoa);
        System.out.println("Altura: " + this.alturaPessoa);
        System.out.println("IMC: " + this.imcPessoa);
        System.out.println("Análise do IMC: " + this.analiseImcPessoa);
    }
}