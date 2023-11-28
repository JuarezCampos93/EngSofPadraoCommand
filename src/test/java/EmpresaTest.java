import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {
    Empresa empresa;
    Formulario formulario;

    @BeforeEach
    void setUp() {
        empresa = new Empresa();
        formulario = new Formulario ("Formulário1");
    }

    @Test
    void deveAbrirFormulario() {
        Tarefa aberturaFormulario = new AberturaFormulario(formulario);
        empresa.executarTarefa(aberturaFormulario);

        assertEquals("Formulário aberto", formulario.getSituacao());
    }

    @Test
    void deveFecharFormulario() {
        Tarefa fechamentoFormulario = new FechamentoFormulario(formulario);
        empresa.executarTarefa(fechamentoFormulario);

        assertEquals("Formulário fechado", formulario.getSituacao());
    }

    @Test
    void deveCancelarFechamentoFormulario() {
        Tarefa aberturaFormulario = new AberturaFormulario(formulario);
        Tarefa fechamentoFormulario = new FechamentoFormulario(formulario);

        empresa.executarTarefa(aberturaFormulario);
        empresa.executarTarefa(fechamentoFormulario);

        empresa.cancelarUltimaTarefa();

        assertEquals("Formulário aberto", formulario.getSituacao());
    }
}