public class Pedido {

    // 🔒 Atributos finais (imutável)
    private final String cliente;
    private final String endereco;
    private final String cupom;
    private final Double frete;
    private final String observacao;


    private Pedido(Builder builder) {
        this.cliente = builder.cliente;
        this.endereco = builder.endereco;
        this.cupom = builder.cupom;
        this.frete = builder.frete;
        this.observacao = builder.observacao;
    }


    public String getCliente() { return cliente; }
    public String getEndereco() { return endereco; }
    public String getCupom() { return cupom; }
    public Double getFrete() { return frete; }
    public String getObservacao() { return observacao; }


    public static class Builder {


        private final String cliente;
        private final String endereco;


        private String cupom;
        private Double frete;
        private String observacao;


        public Builder(String cliente, String endereco) {
            this.cliente = cliente;
            this.endereco = endereco;
        }

        public Builder cupom(String cupom) {
            this.cupom = cupom;
            return this;
        }

        public Builder frete(Double frete) {
            this.frete = frete;
            return this;
        }

        public Builder observacao(String observacao) {
            this.observacao = observacao;
            return this;
        }


        public Pedido build() {
            return new Pedido(this);
        }
    }
}