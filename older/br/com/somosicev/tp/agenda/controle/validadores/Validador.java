
package br.com.somosicev.tp.agenda.controle;

import br.com.somosicev.tp.agenda.modelo.db.BD;

public abstract class Validador<O>{
    protected O alvo;
  
    public abstract boolean validar(); 

}
