package ifpr.pgua.eic.leitura;

import ifpr.pgua.eic.leitura.controllers.JanelaCadastro;
import ifpr.pgua.eic.leitura.controllers.JanelaLista;
import ifpr.pgua.eic.leitura.controllers.JanelaPrincipal;
import ifpr.pgua.eic.leitura.models.GerenciadorLeituras;
import ifpr.pgua.eic.leitura.utils.BaseAppNavigator;
import ifpr.pgua.eic.leitura.utils.ScreenRegistryFXML;
import ifpr.pgua.eic.leitura.utils.ScreenRegistryNoFXML;

/**
 * JavaFX App
 */
public class App extends BaseAppNavigator {

    private GerenciadorLeituras gerenciador;

    @Override
    public void init() throws Exception {
        // TODO Auto-generated method stub
        super.init();

        gerenciador = new GerenciadorLeituras();
    }

    @Override
    public String getHome() {
        return "PRINCIPAL";
    }

    @Override
    public String getAppTitle() {
        return "leitura";
    }

    @Override
    public void registrarTelas() {
        registraTela("PRINCIPAL", new ScreenRegistryNoFXML(o->new JanelaPrincipal().getRoot()));
        registraTela("CADASTRO",new ScreenRegistryFXML(App.class, "cadastro.fxml", o->new JanelaCadastro(gerenciador)));
        registraTela("LISTA",new ScreenRegistryFXML(App.class, "lista.fxml", o->new JanelaLista(gerenciador)));
    }
}