import javax.print.Doc;

public class MinhaAplicacao {
  public static void main(String[] args) {
    BancoDeDados bd = new BancoDeDados("servidor", "usr", "senha");
    ArquivoDeDividas arquivo = new ArquivoDeDividas("dividas.txt");



    BalancoEmpresa balanco = new BalancoEmpresa(bd );
    registraDividas(balanco);
    realizaPagamentos(balanco);
    bd.desconecta();
  }
  private static void registraDividas(BalancoEmpresa balanco) {

    Divida d1 = new Divida();
    d1.setDocumentoCredor(new Cnpj("00.000.000/0001-01") );

    Divida d2 = new Divida();
    d2.setDocumentoCredor(new Cnpj("00.000.000/0001-01"));

       // preenche dados das dividas
    balanco.registraDivida(d1);
    balanco.registraDivida(d2);
  }
  private static void realizaPagamentos(BalancoEmpresa balanco) {
    Documento credor =  new Cnpj("00.000.000/0001-01");

    Pagamento p1 = new Pagamento();
    p1.setCnpjPagador (credor );

    Pagamento p2 = new Pagamento();
    p2.setCnpjPagador( credor );

    // preenche dados dos pagamentos
    balanco.pagaDivida(credor, p1);
    balanco.pagaDivida(credor, p2);
  }
}
