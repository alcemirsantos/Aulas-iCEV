package br.com.somosicev.tp.agenda.controle.validadores;

public class ValidadorPessoaFisica extends Validador<PessoaFisica> {

  public ValidadorPessoaFisica(PessoaFisica pf){
    alvo = pf;
  }

  private void validarCPF(){
    Documento docDaPessoaAlvo = alvo.getDocumento();
    if (docDaPessoaAlvo.length == 11){
      String cpf_formatado = cpfPessoa.substring(0,3)+"."+cpfPessoa.substring(3,6)+"."cpfPessoa.substring(6,9)+"-"+cpfPessoa.substring(9,11);
      
      // TODO buscar como validar CPF 

    }
  }

  @Override
  public boolean validar(){
    //validar nome
    // validar telefone
    if(validarCPF()) 
      return true;
    return false;
  }

}