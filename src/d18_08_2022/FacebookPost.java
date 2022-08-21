package d18_08_2022;

public class FacebookPost {
    public String imeKoJeObjavio;
    public String imeKodKogaJeObjavljeno;
    public String text;
    public int brojLajkova;
    public int brojDeljenja;
    
    public void like () {
    this.brojLajkova++;
    }
    
    public void dislike () {
    this.brojLajkova --;
    if (this.brojLajkova < 0) {
    this.brojLajkova = 0;
    }
    }
    public void share () {
    this.brojDeljenja++;
    }
    public void print () {
    System.out.println(this.imeKoJeObjavio + " >>> " + this.imeKodKogaJeObjavljeno);
    System.out.println(this.text);
    System.out.println("Likes " + this.brojLajkova + " | Shares " + this.brojDeljenja);
    }
}
   
