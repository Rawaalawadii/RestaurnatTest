
package resturanttest;
public class Date {
    private int dd;
    private int mm;
    private int yyyy;
    final int month_in_year=1;
    public Date(int dd, int mm, int yyyy) {
        setMm(mm);
        setDd(dd);
        this.yyyy = yyyy;
    }
    public int getYyyy() {
        return yyyy;
    }
    public void setYyyy(int yyyy) {
        this.yyyy = yyyy;
    }
    public int getDd() {
        return dd;
    }
    public void setDd(int dd) {
        int[] days = {0,31,28,31,31,30,31,30,30,31,31,30,31};
        this.dd = (dd>=1 && dd<=days[mm])?dd : 1;
    }
    public int getMm() {
        return mm;
    }
    public void setMm(int mm) {
        this.mm = (mm>=1 && mm<=12)?mm : 1;
    }   
    @Override
    public String toString() {
        return String.format("%d/%d/%d\n", dd,mm,yyyy);
    }
}
