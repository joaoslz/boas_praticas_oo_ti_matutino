public class TestePagamentos {

    public static void main(String[] args) {
        Pagamentos pagamentos = new Pagamentos();

        Pagamento pagamento = new Pagamento();
        pagamento.setValor(300);
        pagamento.setPagador("Joao");
        pagamento.setCnpjPagador(new Cnpj("1212121000145") );

        pagamentos.registra(pagamento );

        //pagamentos.add(pagamento );
    }
}
