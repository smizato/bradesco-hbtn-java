public interface CanalNotificacao {
   public static final String FORMATO_MENSAGEM = "[%S] {%S} - %s\n";
   public void notificar(Mensagem mensagem);
}
