
package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class reserva {
    private int numeroreserva;
    private Date checkin;
    private Date checkout;
    
    private static SimpleDateFormat dsf = new SimpleDateFormat("dd/mm/yyyy");

    public reserva(int numeroreserva, Date checkin, Date checkout) {
        this.numeroreserva = numeroreserva;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public int getNumeroreserva() {
        return numeroreserva;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setNumeroreserva(int numeroreserva) {
        this.numeroreserva = numeroreserva;
    }

    public long duracao(){
        long diff = checkout.getTime() - checkin.getTime();
    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void atulizareserva(Date checkin, Date checkout){
        this.checkin=checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "reserva{" + "numero reserva=" + numeroreserva + ", checkin=" + dsf.format(checkin) + ", checkout=" + dsf.format(checkout) + ", quantidade de noites: "+duracao() +'}';
    }

    public void atualizareserva(Date checkin, Date checkout) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
