public class Teams implements CanalNotificacao {
    @Override
    public void notificar(Mensagem mensagem) {
        System.out.printf(FORMATO_MENSAGEM,
                          this.getClass().getSimpleName(),
                          mensagem.getTipoMensagem(), 
                          mensagem.getTexto());
    }
}
