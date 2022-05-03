package estudo.com.aulanivelamentojavacolecoes;

public class Cliente {

        private static final String TAG = "Crud";
        private int id;//Chave primaria
        private String nome;
        private String email;
        private Float preco;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }
}
