
public class Iphone {
    public static void main(String[] args) {

    }

    public interface ReprodutorMusical {
        void trocar();

        void pausar();

        void selecionarMusica(String musica);
    }

    public interface AparelhoTelefonico {
        void ligar(String numero);

        void atender();

        void iniciarCorreioVoz();
    }

    public interface NavegadorInternet {
        void exibirPagina(String url);

        void adicionarNovaAba();

        void atualizarPagina();
    }

    // iPhone.java
    public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
        @Override
        public void ligar(String numero) {

        }

        @Override
        public void atender() {

        }

        @Override
        public void iniciarCorreioVoz() {

        }

        @Override
        public void exibirPagina(String url) {

        }

        @Override
        public void adicionarNovaAba() {

        }

        @Override
        public void atualizarPagina() {

        }

        @Override
        public void trocar() {

        }

        @Override
        public void pausar() {

        }

        @Override
        public void selecionarMusica(String musica) {

        }
        // Implementações dos métodos de Reprodutor     Musical, AparelhoTelefonico e NavegadorInternet
    }
}
