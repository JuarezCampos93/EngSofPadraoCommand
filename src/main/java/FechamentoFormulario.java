public class FechamentoFormulario implements Tarefa {

    private Formulario formulario;

    public FechamentoFormulario(Formulario formulario) {
        this.formulario = formulario;
    }

    public void executar() {
        this.formulario.fecharSituacao();
    }

    public void cancelar() {
        this.formulario.abrirSituacao();
    }
}