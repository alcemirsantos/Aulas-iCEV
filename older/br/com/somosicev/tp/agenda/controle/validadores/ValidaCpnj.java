package br.com.somosicev.tp.agenda.controle.validadores;

public class ValidaCnpj extends Validador {

  protected validaCNPJ(Object O){
    cnpjPessoa = (Pessoa) o.getDocumento();
    if (cnpjPessoa.lenght == 14) {
      String cnpj_formatado = cnpjPessoa.substring(0,3)+"."+cnpjPessoa.substring(3,6)+"."cnpjPessoa.substring(6,9)+"-"+cnpjPessoa.substring(9,11);
      (Pessoa )
    }


  }