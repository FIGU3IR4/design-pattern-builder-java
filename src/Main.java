public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido.Builder("Victor", "Recife - PE")
                .cupom("DESCONTO10")
                .frete(20.0)
                .observacao("Entregar após as 18h")
                .build();

        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Endereço: " + pedido.getEndereco());
        System.out.println("Cupom: " + pedido.getCupom());
        System.out.println("Frete: " + pedido.getFrete());
        System.out.println("Observação: " + pedido.getObservacao());
    }
}