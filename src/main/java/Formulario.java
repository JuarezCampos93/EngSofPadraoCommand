public class Formulario {

    private String nome;
    private String situacao;
    public Formulario(String nome){
        this.nome = nome;
    }

    public String getSituacao(){
        return this.situacao;
    }


    public void abrirSituacao(){
        this.situacao = "Formulário aberto";
    }

    public void fecharSituacao(){
        this.situacao = "Formulário fechado";
    }
}
