package d19_08_2022;

public class FacebookPost {
	private String imeKoJeObjavio;
    private String imeKodKogaJeObjavljeno;
    private String text;
    private int brojLajkova;
    private int brojDeljenja;
    
    public FacebookPost() {
    }
    public FacebookPost (String imeObjavio, String imeObjavljeno, String tekstObjave) {
    this.imeKoJeObjavio = imeObjavio;
    this.imeKodKogaJeObjavljeno = imeObjavljeno;
    this.text = tekstObjave;
    
    }
    public String getimeKoJeObjavio() {
    return imeKoJeObjavio;
    }
    public String getimeKodKogaJeObjavljeno() {
    return imeKodKogaJeObjavljeno;
    }
    public String gettext() {
    return text;
    }
    public int getbrojLajkova() {
    return brojLajkova;
    }
    
    public void setimeKoJeObjavio (String ime1) {
    imeKoJeObjavio = ime1;
    }
    public void setimeKodKogaJeObjavljeno (String ime2) {
    imeKodKogaJeObjavljeno = ime2;
    }
    public void settext (String textObj) {
    text = textObj;
    }
    public void setbrojLajkova (int lajkovi) {
    brojLajkova = lajkovi;
    }
    public void setbrojDeljenja (int deljenja) {
    brojDeljenja = deljenja;
    }
    public void like () {
    brojLajkova++;
    }
    public void dislike () {
    brojLajkova--;
    }
    public void share () {
    brojDeljenja++;
    }
    public void print () {
    System.out.println(imeKoJeObjavio + " >>> " + imeKodKogaJeObjavljeno);
    System.out.println(text);
    System.out.println("Likes " + brojLajkova + " | " + brojDeljenja);
    }
}
