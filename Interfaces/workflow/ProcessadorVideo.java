import java.util.ArrayList;

public class ProcessadorVideo {
    private ArrayList<CanalNotificacao> canais;

    public void registrarCanal(CanalNotificacao canal) {
        inicializarCanais();
        canais.add(canal);
    }

    public void processar(Video video) {
        inicializarCanais();
        canais.stream().forEach(canal -> canal.notificar(
                new Mensagem(String.format("%s - %S", video.getArquivo(), video.getFormato()),
                        TipoMensagem.LOG)));
    }

    private void inicializarCanais() {
        if (canais == null) {
            canais = new ArrayList<>();
        }
    }
}
