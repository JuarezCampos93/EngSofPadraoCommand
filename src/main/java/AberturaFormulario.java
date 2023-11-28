public class AberturaFormulario  implements Tarefa{

    private Formulario formulario;

    public AberturaFormulario(Formulario formulario){
        this.formulario = formulario;
    }

    public void executar(){
        this.formulario.abrirSituacao();
    }

    public void cancelar(){
        this.formulario.fecharSituacao();
    }
}
