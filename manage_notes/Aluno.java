package manage_notes;

class Aluno {
    private String nome;
    private String matricula;
    private double mediaFinal;

    public Aluno(String nome, String matricula, double mediaFinal){
        this.nome = nome;
        this.matricula = matricula;
        this.mediaFinal = mediaFinal;
    }

    public String getNome(){
        return nome;
    }
    public String getMatricula(){
        return matricula;
    }
    public double getMedia(){
        return mediaFinal;
    }

    public void exibirDados(){
        System.out.println("Nome: "+ nome);
        System.out.println("Matricula: "+matricula);
        System.out.println("Media FInal: "+mediaFinal);
    }
}
