
package models;


import java.util.Date;


public final class Cliente extends Pessoa {
	
    public Cliente( ) {
            setCriadoEm(new Date());
    }

   
    private Date criadoEm;

    
    public Date getCriadoEm() {
            return criadoEm;
    }
    public void setCriadoEm(Date criadoEm) {
            this.criadoEm = criadoEm;
    }

    @Override
    public String toString() {
            return super.toString() + 
                    "\nCriado em: " + getCriadoEm();
    }

   

  
	
}


