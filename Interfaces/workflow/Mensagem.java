public class Mensagem {
    private String texto;
    private TipoMensagem tipoMensagem;

    public Mensagem(String texto, TipoMensagem tipo) {
        this.texto = texto;
        this.tipoMensagem = tipo;
    }

    public String getTexto() {
        return texto;
    }

    public TipoMensagem getTipoMensagem() {
        return tipoMensagem;
    }
}
