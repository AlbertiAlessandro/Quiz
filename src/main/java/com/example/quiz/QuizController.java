package com.example.quiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class QuizController {
    public Button Geografia;
    public Button Sport;
    public Button Storia;
    public Button CulturaGenerale;
    public Label scrittaInizio;
    public Button Ritorna;
    public Label DomandaSport;
    public PasswordField username_field;
    public PasswordField password_field;
    public Label status_label;
    public Button login;
    public Label login_screen;
    public RadioButton btnRadio1Sport;
    public RadioButton btnRadio2Sport;
    public RadioButton btnRadio3Sport;
    public RadioButton btnRadio4Sport;
    public Button btnNext;
    public VBox sfondo;
    public Label lblPresentazione;
    public Label lblCategories;
    public ImageView imgCalcio;
    public ImageView imgBasket;
    public ImageView imgPallavolo;
    public ImageView imgCiclismo;
    public Button btnNextGeo;
    public RadioButton btnRadio1Geografia;
    public RadioButton btnRadio2Geografia;
    public RadioButton btnRadio3Geografia;
    public RadioButton btnRadio4Geografia;
    public Label DomandaGeografia;
    public Label DomandaStoria;
    public RadioButton btnRadio1Storia;
    public RadioButton btnRadio2Storia;
    public RadioButton btnRadio3Storia;
    public RadioButton btnRadio4Storia;
    public Button btnNextStoria;
    public Label DomandaCultura;
    public RadioButton btnRadio1Cultura;
    public RadioButton btnRadio2Cultura;
    public RadioButton btnRadio3Cultura;
    public RadioButton btnRadio4Cultura;
    public Button btnNextCultura;
    public ImageView imgMappamondo;
    public ImageView imgCartina;
    public ImageView imgBandiere;
    public ImageView imgMondo;
    public ImageView imgReperti;
    public ImageView imgHistory;
    public ImageView imgNavi;
    public ImageView imgVillaggio;
    public ImageView imgLibri;
    public ImageView imgCartoline;
    public ImageView imgUomoV;
    public ImageView imgCittà;
    public ImageView imgemojiPenultimo;
    public ImageView imgemojiUltimo;
    public ImageView imgemojiTerzo;
    public ImageView imgemojiSecondo;
    public ImageView imgemojiPrimo;
    public Label lblUltimo;
    public Label lblPenultimo;
    public Label lblTerzo;
    public Label lblSecondo;
    public Label lblPrimo;
    public Button btnWrongAnswer;
    private String username = "Alessandro";
    private String password = "Kalulu";

    /**
     private String questionModel[] = {"1) ",
     "2) ",
     "3) ",
     "4) ",
     "5) ",
     "6) ",
     "7) ",
     "8) ",
     "9) ",
     "10) ",
     "11) ",
     "12) ",
     "13) ",
     "14) ",
     "15) "};

     private String optionsModel[][] = {{"","","","",""},
     {"","","","",""},
     {"", "", "", "", ""},
     {"", "", "", "", ""},
     {"", "", "", "", ""},
     {"","","","",""},
     {"","","","",""},
     {"","","","",""},
     {"","","","",""},
     {"","","","",""},
     {"","","","",""},
     {"","","","",""},
     {"","","","",""},
     {"","","","",""},
     {"","","","",""}};
     **/

    private String questionSport[] = {"1) Chi ha vinto il maggior numero di palloni d'oro nella storia del calcio?",
                                 "2) Qual'è il tennista con più slam vinti in carriera?",
                                 "3) In quanto tempo Usain Bolt fece il record nei 100 metri?",
                                 "4) Chi vinse il Mondiale di calcio del 2006 in Germania?",
                                 "5) Quanti scudetti ha il Milan?",
                                 "6) Che dimensione hanno i campi da basket?",
                                 "7) Ciclismo: di che colore è la maglia del vincitore del Tour de France?",
                                 "8) Dove sono nati i giochi Olimpici?",
                                 "9) Quanti giocatori scendono in campo per una partita a pallavolo?",
                                 "10) Di quanti km è composta una maratona?",
                                 "11) La Coppa Davis è una competizione di?",
                                 "12) In quale anno l'Italia ha vinto il primo Mondiale di calcio?",
                                 "13) Quale squadra ha vinto più Champions League nella storia?",
                                 "14) Quanto dura una partita di rugby?",
                                 "15) Chi è il calciatore che ha vinto più mondiali?"};
    private String optionsSport[][] = {{"Cristiano Ronaldo","Lionel Messi","Pelè","Maradona","Lionel Messi"},
                                  {"Rafael Nadal","Novak Djokovic","Roger Federer","Pete Sampras","Rafael Nadal"},
                                  {"9.85 secondi", "10.02 secondi", "9.58 secondi", "9.42 secondi", "9.58 secondi"},
                                  {"Spagna", "Italia", "Francia", "Inghilterra", "Italia"},
                                  {"18", "17", "20", "19", "19"},
                                  {"23,77 * 10,97","15 * 28","18 * 9","17,57 * 12,78","15 * 28"},
                                  {"Rosa","Verde","Gialla","Bianca","Gialla"},
                                  {"Grecia","Sudafrica","Italia","Francia","Grecia"},
                                  {"8","7","5","6","6"},
                                  {"42.195","21.0975","48.257","Oltre 50","42.195"},
                                  {"Rugby","Basket","Tennis","Calcio","Tennis"},
                                  {"1930","1938","1982","1934","1934"},
                                  {"Milan","Real Madrid","Bayern Monaco","Barcellona","Real Madrid"},
                                  {"80 minuti","70 minuti","90 minuti","60 minuti","80 minuti"},
                                  {"Maradona","Van Basten","Baggio","Pelè","Pelè"}};


    private String questionGeografia[] = {"1) Qual è il vulcano più grande al mondo?",
            "2) Qual è la capitale dell’Egitto?",
            "3) Dove si trova Canton?",
            "4) L'Italia confina a est con...",
            "5) Qual è la montagna più alta del mondo?",
            "6) Qual'è la capitale dell'Argentina?",
            "7) Qual è il meridiano detto fondamentale?",
            "8) La Lituania si affaccia sul...",
            "9) Dove si trova l'Antartide?",
            "10) In quale stato degli Stati Uniti si trova la città Seattle?",
            "11) In che regione italiana si trova la città di Rimini?",
            "12) Di quale nazione è capitale Hanoi?",
            "13) Dove si trova lo stato di Singapore?",
            "14) Qual'è la capitale dell'Australia?",
            "15) Qual'è la capitale della Canada?"};

    private String optionsGeografia[][] = {{"Yellow Stone","Etna","Nevado Ojos del Salado","Popocatèpetl","Nevado Ojos del Salado"},
            {"Il Cairo","Alessandria","Mansura","Giza","Il Cairo"},
            {"Corea del Nord", "Corea del Sud", "Cina", "Giappone", "Cina"},
            {"Francia", "Austria", "Svizzera", "Slovenia", "Slovenia"},
            {"Monte Denali", "Kilimangiaro", "Everest", "Monte Bianco", "Everest"},
            {"La Plata","Lanus","Tigre","Buenos Aires","Buenos Aires"},
            {"Il meridiano che passa sopra il Circolo Polare Artico","Il meridiano Capricorno","Il meridiano che passa sopra l'Equatore","Il meridiano di Greenwich","Il meridiano di Greenwich"},
            {"Mar Bianco","Mar Baltico","Mar Mediterraneo","Mar Glaciale Artico","Mar Baltico"},
            {"A Sud dell'America Centrale","Al Polo Sud","Al Polo Nord","A Nord dell'Africa","Al Polo Sud"},
            {"Washington","Iowa","Wisconsin","Nessuna delle precedenti","Washington"},
            {"Veneto","Emilia Romagna","Marche","Lombardia","Emilia Romagna"},
            {"Svezia","Vietnam","Corea del Nord","Nessuna delle precedenti","Vietnam"},
            {"In Oceania","Nel sud-est Asiatico","Tra la Russia e la Mongolia","Nessuna delle precedenti","Nel sud-est Asiatico"},
            {"Tirana","Budapest","Canberra","Bucarest","Canberra"},
            {"Ottawa","Tirana","Canberra","Budapest","Ottawa"}};


    private String questionStoria[] = {"1) Con chi fu alleata la Gran Bretagna durante la 1° Guerra Mondiale?",
            "2) In quale anno cadde il muro di Berlino?",
            "3) Quale stato comprendeva l'attuale regione delle Marche?",
            "4) In quale anno ebbe inizio la Prima Guerra Mondiale?",
            "5) Di quale popolo barbaro era sovrano Pipino il Breve?",
            "6) Chi fu il primo re di Roma?",
            "7) Di quale parte dell'Europa erano originari i Normanni?",
            "8) In quale anno Carlo Magno venne incoronato re d'Italia?",
            "9) Quando venne fondata Roma?",
            "10) In che anno è iniziata la Rivoluzione Francese?",
            "11) Quante erano le colonie nella Rivoluzione Americana?",
            "12) Quale forma di governo adottava la Francia prima del 1789?",
            "13) Chi fu il primo presidente della Repubblica Italiana?",
            "14) A quando risale il periodo del risorgimento?",
            "15) Nel periodo della rivoluzione francese, Luigi XVI fu ghigliottinato?"};

    private String optionsStoria[][] = {{"Impero Austro-Ungarico","Italia","Impero Ottomano","Nessuna delle precedenti","Italia"},
            {"1990","1989","1988","Nessun delle precedenti","1989"},
            {"Regno Lombardo-veneto", "Stato della Chiesa", "Regno dellle Due Sicilie", "Nessuna delle precedenti", "Stato della Chiesa"},
            {"1915", "1914", "1916", "1918", "1914"},
            {"Franchi", "Svevi", "Ostrogoti", "Asburgo", "Franchi"},
            {"Remo","Romolo","Giulio Cesare","Tarquinio il Superbo","Romolo"},
            {"Scandinavia","Francia","Gran Bretagna","Spagna","Scandinavia"},
            {"729","937","800","826","800"},
            {"Intorno all'aprile del 753 a. C.","Nell'anno 86 d. C.","Il 12 novembre del 1065 a. C.","Nessuna delle precedenti","Intorno all'aprile del 753 a. C."},
            {"1785","1789","1765","1795","1789"},
            {"15","12","14","13","13"},
            {"Monarchia assoluta","Dittatura","Monarchia costituzionale","Repubblica","Monarchia assoluta"},
            {"Luigi Enaudi","Giovanni Gronchi","Antonio Segni","Enrico de Nicola","Enrico de Nicola"},
            {"1815","1886","1910","1930","1815"},
            {"Si","No","Fu ghigliottinata solo la moglie, Maria Antonietta","Fu ucciso ma non ghigliottinato","Si"}};



    private String questionCulturaGenerale[] = {"1) 'Siate affamati, siate folli'. Chi ha pronunciato questa frase?",
            "2) Era lo sport praticato da Borg e McEnroe:",
            "3) Il marchio automobilistico Saab è...?",
            "4) Come si chiama la più profonda depressione oceanica al mondo?",
            "5) Qual è la lingua più parlata al mondo?",
            "6) Qual è il pianeta più vicino al Sole?",
            "7) Nel 2016, ha vinto l'Oscar come Miglior Attore:",
            "8) Quale città è stata scelta come capitale della cultura italiana 2022?",
            "9) In quale anno terminò la Seconda Guerra Mondiale?",
            "10) È 'Hg' nella tavola periodica:",
            "11) Chi soffre di ceraunofobia ha la paura dei...",
            "12) Dov'è conservata la Gioconda?",
            "13) Che cos'è l'alabarda?",
            "14) Chi ha disegnato l'uomo vitruviano?",
            "15) Quali sono gli elementi costitutivi dello Stato?"};

    private String optionsCulturaGenerale[][] = {{"Martin Luther King","Steve Jobs","Wiston Churchill","Bill Gates","Steve Jobs"},
            {"Golf","Calcio","Basket","Tennis","Tennis"},
            {"Italiano","Giapponese","Svedese","Tedesco","Svedese"},
            {"Faglia di San Andrea","Triangolo delle Bermuda","Abisso nero","Fossa delle Marianne","Fossa delle Marianne"},
            {"Cinese mandarino", "Inglese", "Bengali", "Francese", "Inglese"},
            {"Venere","Terra","Marte","Mercurio","Mercurio"},
            {"Antony Hopkins","Ryan Gosgling","Leonardo Di Caprio","Bradley Cooper","Leonardo Di Caprio"},
            {"Firenze","Matera","Viterbo","Procida","Procida"},
            {"1945","1941","1952","1939","1945"},
            {"Litio","Oro","Cromo","Mercurio","Mercurio"},
            {"Pinguini","Carabinieri","Fulmini","Coltelli","Fulmini"},
            {"National Gallery","Museo del Luovre di Parigi","Galleria degli Uffizi","Museum of Modern Art","Museo del Luovre di Parigi"},
            {"Un utensile da cucina","Una navicella spaziale","Un'arma da lancio","Un libro di incantesimi","Un'arma da lancio"},
            {"Claude Monet","Leonardo Da Vinci","Vincent Van Gogh","Caravaggio","Leonardo Da Vinci"},
            {"Popolo, territorio, parlamento","Popolo, territorio","Popolo, magistratura, governo","Popolo, territorio, sovranità","Popolo, territorio, sovranità"}};
    private int indexSport = 0, correctSport = 0;
    private int indexGeografia = 0, correctGeografia = 0;
    private int indexStoria = 0, correctStoria = 0;
    private int indexCulturaGenerale = 0, correctCulturaGenerale = 0;
    private final int MAX_DOMANDE = 15;

    private String[] wrongSport = new String[MAX_DOMANDE];
    private String[] wrongGeografia = new String[MAX_DOMANDE];
    private String[] wrongStoria = new String[MAX_DOMANDE];
    private String[] wrongCulturaGenerale = new String[MAX_DOMANDE];

    private int wrongCountSport = 0, wrongCountGeografia = 0, wrongCountStoria = 0, wrongCountCulturaGenerale = 0;





    public void getSelectedOptionSport(RadioButton rbtn){
        if (rbtn.getText().equals(optionsSport[indexSport][4])){
            correctSport++;
        }
        else{
            wrongSport[wrongCountSport] = rbtn.getText();
            wrongCountSport++;
        }
        indexSport++;
        DisableRButtonsSport(true);
    }

    public void DisableRButtonsSport(boolean yes_or_no){
        btnRadio1Sport.setDisable(yes_or_no);
        btnRadio2Sport.setDisable(yes_or_no);
        btnRadio3Sport.setDisable(yes_or_no);
        btnRadio4Sport.setDisable(yes_or_no);

    }

    public void getSelectedOptionGeografia(RadioButton rbtn){
        if (rbtn.getText().equals(optionsGeografia[indexGeografia][4])){
            correctGeografia++;
        }
        else{
            wrongGeografia[wrongCountGeografia] = rbtn.getText();
            wrongCountGeografia++;
        }
        indexGeografia++;
        DisableRButtonsGeografia(true);
    }

    public void DisableRButtonsGeografia(boolean yes_or_no){
        btnRadio1Geografia.setDisable(yes_or_no);
        btnRadio2Geografia.setDisable(yes_or_no);
        btnRadio3Geografia.setDisable(yes_or_no);
        btnRadio4Geografia.setDisable(yes_or_no);

    }


    public void getSelectedOptionStoria(RadioButton rbtn){
        if (rbtn.getText().equals(optionsStoria[indexStoria][4])){
            correctStoria++;
        }
        else{
            wrongStoria[wrongCountStoria] = rbtn.getText();
            wrongCountStoria++;
        }
        indexStoria++;
        DisableRButtonsStoria(true);
    }

    public void DisableRButtonsStoria(boolean yes_or_no){
        btnRadio1Storia.setDisable(yes_or_no);
        btnRadio2Storia.setDisable(yes_or_no);
        btnRadio3Storia.setDisable(yes_or_no);
        btnRadio4Storia.setDisable(yes_or_no);

    }


    public void getSelectedOptionCultura(RadioButton rbtn){
        if (rbtn.getText().equals(optionsCulturaGenerale[indexCulturaGenerale][4])){
            correctCulturaGenerale++;
        }
        else{
            wrongCulturaGenerale[wrongCountCulturaGenerale] = rbtn.getText();
            wrongCountCulturaGenerale++;
        }
        indexCulturaGenerale++;
        DisableRButtonsCultura(true);
    }

    public void DisableRButtonsCultura(boolean yes_or_no){
        btnRadio1Cultura.setDisable(yes_or_no);
        btnRadio2Cultura.setDisable(yes_or_no);
        btnRadio3Cultura.setDisable(yes_or_no);
        btnRadio4Cultura.setDisable(yes_or_no);

    }

    public void translateBtn(){
        Sport.setTranslateY(-450);
        Geografia.setTranslateY(-450);
        Storia.setTranslateY(-450);
        CulturaGenerale.setTranslateY(-450);
    }

    /**
    public void translateRbtn(){
        btnRadio1Sport.setTranslateX(50);
        btnRadio1Sport.setTranslateY(-100);
        btnRadio2Sport.setTranslateX(50);
        btnRadio2Sport.setTranslateY(-100);
        btnRadio3Sport.setTranslateX(50);
        btnRadio3Sport.setTranslateY(-100);
        btnRadio4Sport.setTranslateX(50);
        btnRadio4Sport.setTranslateY(-100);
        btnNext.setTranslateX(230);
        btnNext.setTranslateY(-40);

        Ritorna.setTranslateY(-100);

     }
     **/

    public void translateImg(){
        imgCalcio.setTranslateY(475);
        imgBasket.setTranslateY(475);
        imgPallavolo.setTranslateY(475);
        imgCiclismo.setTranslateY(475);

    }

    @FXML
    void initialize(){
        //Traslo la schermata di blocco (login) all'inizio
        login_screen.setTranslateY(65);
        username_field.setTranslateY(65);
        password_field.setTranslateY(65);
        status_label.setTranslateY(50);
        login.setTranslateY(35);

        //Schermata di benvenuto
        Sport.setVisible(false);
        Geografia.setVisible(false);
        CulturaGenerale.setVisible(false);
        Storia.setVisible(false);
        scrittaInizio.setVisible(false);
        scrittaInizio.setTranslateY(150);
        Ritorna.setVisible(false);
        Ritorna.setTranslateY(-520);
        lblCategories.setVisible(false);
        lblPresentazione.setVisible(false);
        lblCategories.setTranslateY(490);
        lblPresentazione.setTranslateY(-85);
        //Opzioni sport
        btnNext.setText("Start The Quiz");
        DomandaSport.setVisible(false);
        btnRadio1Sport.setVisible(false);
        btnRadio2Sport.setVisible(false);
        btnRadio3Sport.setVisible(false);
        btnRadio4Sport.setVisible(false);
        btnNext.setVisible(false);
        translateBtn();

        //Opzioni geografia
        DomandaGeografia.setVisible(false);
        btnRadio1Geografia.setVisible(false);
        btnRadio2Geografia.setVisible(false);
        btnRadio3Geografia.setVisible(false);
        btnRadio4Geografia.setVisible(false);
        btnNextGeo.setVisible(false);
        btnNextGeo.setText("Start The Quiz");

        //Opzioni storia
        DomandaStoria.setVisible(false);
        btnRadio1Storia.setVisible(false);
        btnRadio2Storia.setVisible(false);
        btnRadio3Storia.setVisible(false);
        btnRadio4Storia.setVisible(false);
        btnNextStoria.setVisible(false);
        btnNextStoria.setText("Start The Quiz");

        //Opzioni cultura generale
        DomandaCultura.setVisible(false);
        btnNextCultura.setText("Start The Quiz");
        btnNextCultura.setVisible(true);
        btnRadio1Cultura.setVisible(false);
        btnRadio2Cultura.setVisible(false);
        btnRadio3Cultura.setVisible(false);
        btnRadio4Cultura.setVisible(false);
        //Punteggio
        lblUltimo.setVisible(false);
        lblPenultimo.setVisible(false);
        lblTerzo.setVisible(false);
        lblSecondo.setVisible(false);
        lblPrimo.setVisible(false);

        //img Sport
        imgCalcio.setVisible(false);
        imgBasket.setVisible(false);
        imgPallavolo.setVisible(false);
        imgCiclismo.setVisible(false);

        //img Geografia
        imgBandiere.setVisible(false);
        imgCartina.setVisible(false);
        imgMappamondo.setVisible(false);
        imgMondo.setVisible(false);

        //img Storia
        imgNavi.setVisible(false);
        imgHistory.setVisible(false);
        imgReperti.setVisible(false);
        imgVillaggio.setVisible(false);

        //img Cultura Generale
        imgLibri.setVisible(false);
        imgCartoline.setVisible(false);
        imgUomoV.setVisible(false);
        imgCittà.setVisible(false);

        //img emoji
        imgemojiUltimo.setVisible(false);
        imgemojiPenultimo.setVisible(false);
        imgemojiTerzo.setVisible(false);
        imgemojiSecondo.setVisible(false);
        imgemojiPrimo.setVisible(false);
        //Y
        imgemojiUltimo.setTranslateY(-400);
        imgemojiPenultimo.setTranslateY(-400);
        imgemojiTerzo.setTranslateY(-400);
        imgemojiSecondo.setTranslateY(-400);
        imgemojiPrimo.setTranslateY(-400);
        //X
        imgemojiUltimo.setTranslateX(200);
        imgemojiPenultimo.setTranslateX(300);
        imgemojiTerzo.setTranslateX(400);
        imgemojiSecondo.setTranslateX(500);
        imgemojiPrimo.setTranslateX(600);

        //Traslo lbl punteggio
        //Y
        lblUltimo.setTranslateY(-530);
        lblPenultimo.setTranslateY(-530);
        lblTerzo.setTranslateY(-530);
        lblSecondo.setTranslateY(-575);
        lblPrimo.setTranslateY(-575);
        //X
        lblUltimo.setTranslateX(170);
        lblPenultimo.setTranslateX(160);
        lblTerzo.setTranslateX(140);
        lblSecondo.setTranslateX(680);
        lblPrimo.setTranslateX(700);

        //Schermata risposte sbagliate
        btnWrongAnswer.setVisible(false);
        btnWrongAnswer.setTranslateY(-80);

    }




    public void onSportButtonClick(ActionEvent actionEvent) {
        //Traslo domande e bottoni
        translateImg();
        btnNext.setVisible(true);
        btnNext.setTranslateX(240);
        btnNext.setTranslateY(-300);
        DomandaSport.setTranslateY(-60);
        DomandaSport.setTranslateX(20);
        btnRadio1Sport.setTranslateY(-20);
        btnRadio2Sport.setTranslateY(-20);
        btnRadio3Sport.setTranslateY(-20);
        btnRadio4Sport.setTranslateY(-20);
        btnRadio1Sport.setTranslateX(-40);
        btnRadio2Sport.setTranslateX(-40);
        btnRadio3Sport.setTranslateX(-40);
        btnRadio4Sport.setTranslateX(-40);

        //Rendo visibile il punteggio
        lblUltimo.setVisible(true);
        lblPenultimo.setVisible(true);
        lblTerzo.setVisible(true);
        lblSecondo.setVisible(true);
        lblPrimo.setVisible(true);
        //Rendo visibilli le emoji
        imgemojiUltimo.setVisible(true);
        imgemojiPenultimo.setVisible(true);
        imgemojiTerzo.setVisible(true);
        imgemojiSecondo.setVisible(true);
        imgemojiPrimo.setVisible(true);

        //Schermata di benventuto
        Sport.setVisible(false);
        Geografia.setVisible(false);
        CulturaGenerale.setVisible(false);
        Storia.setVisible(false);
        scrittaInizio.setVisible(false);
        Ritorna.setVisible(true);
        DomandaSport.setVisible(false);
        login_screen.setVisible(false);

        lblCategories.setVisible(true);
        lblCategories.setText("SPORT");
        lblPresentazione.setVisible(true);
        lblPresentazione.setText("Questa categoria comprende 15 domande sui più famosi sport del mondo");
        //img sport
        imgCalcio.setVisible(true);
        imgBasket.setVisible(true);
        imgPallavolo.setVisible(true);
        imgCiclismo.setVisible(true);


    }

    public void onGeografiaButtonClick(ActionEvent actionEvent) {
        //Rendo visibile il punteggio
        lblUltimo.setVisible(true);
        lblPenultimo.setVisible(true);
        lblTerzo.setVisible(true);
        lblSecondo.setVisible(true);
        lblPrimo.setVisible(true);
        //Rendo visibilli le emoji
        imgemojiUltimo.setVisible(true);
        imgemojiPenultimo.setVisible(true);
        imgemojiTerzo.setVisible(true);
        imgemojiSecondo.setVisible(true);
        imgemojiPrimo.setVisible(true);
        //Opzioni geografia
        DomandaSport.setTranslateX(100);
        DomandaGeografia.setTranslateY(-100);
        btnRadio1Geografia.setTranslateY(-90);
        btnRadio2Geografia.setTranslateY(-90);
        btnRadio3Geografia.setTranslateY(-90);
        btnRadio4Geografia.setTranslateY(-90);
        btnRadio1Geografia.setTranslateX(20);
        btnRadio2Geografia.setTranslateX(20);
        btnRadio3Geografia.setTranslateX(20);
        btnRadio4Geografia.setTranslateX(20);
        btnNextGeo.setVisible(true);
        btnNextGeo.setTranslateY(-380);
        btnNextGeo.setTranslateX(250);

        Sport.setVisible(false);
        Geografia.setVisible(false);
        CulturaGenerale.setVisible(false);
        Storia.setVisible(false);
        scrittaInizio.setVisible(false);
        Ritorna.setVisible(true);
        DomandaSport.setVisible(false);
        login_screen.setVisible(false);
        btnNext.setVisible(false);
        lblCategories.setVisible(true);
        lblCategories.setText("GEOGRAFIA");
        lblPresentazione.setVisible(true);
        lblPresentazione.setText("Questa categoria comprende 15 domande sulla geografia.");

        //Rendo visibili le immagini di geografia
        imgBandiere.setVisible(true);
        imgCartina.setVisible(true);
        imgMappamondo.setVisible(true);
        imgMondo.setVisible(true);

        //Traslo immagini geografia e scritte
        //Y
        imgBandiere.setTranslateY(380);
        imgCartina.setTranslateY(380);
        imgMappamondo.setTranslateY(380);
        imgMondo.setTranslateY(380);
        //X
        imgBandiere.setTranslateX(380);
        imgCartina.setTranslateX(380);
        imgMappamondo.setTranslateX(380);
        imgMondo.setTranslateX(380);





    }

    public void onStoriaButtonClick(ActionEvent actionEvent) {
        //Rendo visibile il punteggio
        lblUltimo.setVisible(true);
        lblPenultimo.setVisible(true);
        lblTerzo.setVisible(true);
        lblSecondo.setVisible(true);
        lblPrimo.setVisible(true);
        //Rendo visibilli le emoji
        imgemojiUltimo.setVisible(true);
        imgemojiPenultimo.setVisible(true);
        imgemojiTerzo.setVisible(true);
        imgemojiSecondo.setVisible(true);
        imgemojiPrimo.setVisible(true);

        btnNextStoria.setTranslateY(-450);
        btnNextStoria.setTranslateX(320);
        DomandaStoria.setTranslateY(-280);
        DomandaStoria.setTranslateX(320);
        btnRadio1Storia.setTranslateY(-260);
        btnRadio2Storia.setTranslateY(-260);
        btnRadio3Storia.setTranslateY(-260);
        btnRadio4Storia.setTranslateY(-260);
        btnRadio1Storia.setTranslateX(320);
        btnRadio2Storia.setTranslateX(320);
        btnRadio3Storia.setTranslateX(320);
        btnRadio4Storia.setTranslateX(320);
        Sport.setVisible(false);
        Geografia.setVisible(false);
        CulturaGenerale.setVisible(false);
        Storia.setVisible(false);
        scrittaInizio.setVisible(false);
        Ritorna.setVisible(true);
        btnNextStoria.setVisible(true);
        lblCategories.setVisible(true);
        lblCategories.setText("STORIA");
        lblPresentazione.setVisible(true);
        lblPresentazione.setText("Questa categoria comprende 15 domande sulla storia.");
        //Rendo visibili le immagini
        imgNavi.setVisible(true);
        imgHistory.setVisible(true);
        imgReperti.setVisible(true);
        imgVillaggio.setVisible(true);
        //Traslo immagini
        //Y
        imgNavi.setTranslateY(290);
        imgHistory.setTranslateY(290);
        imgReperti.setTranslateY(290);
        imgVillaggio.setTranslateY(290);
        //X
        imgNavi.setTranslateX(350);
        imgHistory.setTranslateX(350);
        imgReperti.setTranslateX(350);
        imgVillaggio.setTranslateX(350);


    }

    public void onCulturaGeneraleButtonClick(ActionEvent actionEvent) {
        //Rendo visibile il punteggio
        lblUltimo.setVisible(true);
        lblPenultimo.setVisible(true);
        lblTerzo.setVisible(true);
        lblSecondo.setVisible(true);
        lblPrimo.setVisible(true);
        //Rendo visibilli le emoji
        imgemojiUltimo.setVisible(true);
        imgemojiPenultimo.setVisible(true);
        imgemojiTerzo.setVisible(true);
        imgemojiSecondo.setVisible(true);
        imgemojiPrimo.setVisible(true);

        Sport.setVisible(false);
        Geografia.setVisible(false);
        CulturaGenerale.setVisible(false);
        Storia.setVisible(false);
        scrittaInizio.setVisible(false);
        Ritorna.setVisible(true);
        lblCategories.setVisible(true);
        lblCategories.setText("CULTURA GENERALE");
        lblPresentazione.setText("Questa categoria comprende 15 domande su vari argomenti.");
        lblPresentazione.setVisible(true);
        btnNextCultura.setVisible(true);
        btnNextCultura.setTranslateY(-400);
        btnNextCultura.setTranslateX(300);
        //Traslo domanda, bottoni cultura
        DomandaCultura.setTranslateY(-560);
        DomandaCultura.setTranslateX(300);
        //Y
        btnRadio1Cultura.setTranslateY(-560);
        btnRadio2Cultura.setTranslateY(-560);
        btnRadio3Cultura.setTranslateY(-560);
        btnRadio4Cultura.setTranslateY(-560);
        //X
        btnRadio1Cultura.setTranslateX(300);
        btnRadio2Cultura.setTranslateX(300);
        btnRadio3Cultura.setTranslateX(300);
        btnRadio4Cultura.setTranslateX(300);
        //Rendo visibili le immagini
        imgLibri.setVisible(true);
        imgCartoline.setVisible(true);
        imgUomoV.setVisible(true);
        imgCittà.setVisible(true);
        //Traslo le immagini
        //Y
        imgLibri.setTranslateY(190);
        imgCartoline.setTranslateY(190);
        imgUomoV.setTranslateY(190);
        imgCittà.setTranslateY(190);
        //X
        imgLibri.setTranslateX(340);
        imgCartoline.setTranslateX(340);
        imgUomoV.setTranslateX(340);
        imgCittà.setTranslateX(340);

    }

    public void onRitornaButtonClick(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Esci dalla partita");
        alert.setHeaderText("Premere OK per uscire da questa schermata");
        alert.setContentText("Attenzione, perderai tutti i salvataggi di questa partita");
        alert.showAndWait();
        //Schermata di benvenuto
        scrittaInizio.setVisible(true);
        Sport.setVisible(true);
        Geografia.setVisible(true);
        CulturaGenerale.setVisible(true);
        Storia.setVisible(true);
        Ritorna.setVisible(false);

        lblCategories.setVisible(false);
        login_screen.setVisible(false);
        lblPresentazione.setVisible(false);

        //Sport
        DomandaSport.setVisible(false);
        btnNext.setVisible(false);
        btnNext.setText("Start The Quiz");
        btnRadio1Sport.setVisible(false);
        btnRadio2Sport.setVisible(false);
        btnRadio3Sport.setVisible(false);
        btnRadio4Sport.setVisible(false);
        imgCalcio.setVisible(false);
        imgBasket.setVisible(false);
        imgPallavolo.setVisible(false);
        imgCiclismo.setVisible(false);

        //Storia
        btnNextStoria.setVisible(false);
        btnNextStoria.setText("Start The Quiz");
        DomandaStoria.setVisible(false);
        btnRadio1Storia.setVisible(false);
        btnRadio2Storia.setVisible(false);
        btnRadio3Storia.setVisible(false);
        btnRadio4Storia.setVisible(false);
        imgNavi.setVisible(false);
        imgHistory.setVisible(false);
        imgReperti.setVisible(false);
        imgVillaggio.setVisible(false);

        //Geografia
        btnNextGeo.setVisible(false);
        btnNextGeo.setText("Start The Quiz");
        DomandaGeografia.setVisible(false);
        btnRadio1Geografia.setVisible(false);
        btnRadio2Geografia.setVisible(false);
        btnRadio3Geografia.setVisible(false);
        btnRadio4Geografia.setVisible(false);
        imgBandiere.setVisible(false);
        imgCartina.setVisible(false);
        imgMappamondo.setVisible(false);
        imgMondo.setVisible(false);

        //Cultura Generale
        DomandaCultura.setVisible(false);
        btnNextCultura.setVisible(false);
        btnNextCultura.setText("Start The Quiz");
        btnRadio1Cultura.setVisible(false);
        btnRadio2Cultura.setVisible(false);
        btnRadio3Cultura.setVisible(false);
        btnRadio4Cultura.setVisible(false);
        imgLibri.setVisible(false);
        imgCartoline.setVisible(false);
        imgUomoV.setVisible(false);
        imgCittà.setVisible(false);

        //Rendo invisibile il punteggio
        lblUltimo.setVisible(false);
        lblPenultimo.setVisible(false);
        lblTerzo.setVisible(false);
        lblSecondo.setVisible(false);
        lblPrimo.setVisible(false);
        //Rendo invisibilli le emoji
        imgemojiUltimo.setVisible(false);
        imgemojiPenultimo.setVisible(false);
        imgemojiTerzo.setVisible(false);
        imgemojiSecondo.setVisible(false);
        imgemojiPrimo.setVisible(false);

        //Azzero i contatori dei rispettivi quiz
        correctSport = 0;
        indexSport = 0;
        correctGeografia = 0;
        indexGeografia = 0;
        correctStoria = 0;
        indexStoria = 0;
        correctCulturaGenerale = 0;
        indexCulturaGenerale = 0;

        //Risposte sbagliate
        btnWrongAnswer.setVisible(false);

    }


    public void onLoginButtonClick(ActionEvent actionEvent) {
        String username_text = username_field.getText();
        String password_text = password_field.getText();
        if (username_text.compareTo(username) == 0 && password_text.compareTo(password) == 0){
            status_label.setText("login status: LOGGED IN!");
            Sport.setVisible(true);
            Geografia.setVisible(true);
            CulturaGenerale.setVisible(true);
            Storia.setVisible(true);
            scrittaInizio.setVisible(true);
            Ritorna.setVisible(false);
            DomandaSport.setVisible(false);
            status_label.setVisible(false);
            username_field.setVisible(false);
            password_field.setVisible(false);
            login.setVisible(false);
            login_screen.setVisible(false);
        }
        else if (username_text.compareTo(username) == 0){
            status_label.setText("login status: NOT LOGGED - PASSWORD INCORRECT!");
        }
        else if (password_text.compareTo(password) == 0){
            status_label.setText("login status: NOT LOGGED - USERNAME INCORRECT!");
        }
        else{
            status_label.setText("login status: NOT LOGGED - BOTH FIELDS INCORRECT!");
        }

    }


    public void onbtnNextButtonClick(ActionEvent actionEvent) {
        btnNext.setText("Next Question");
        lblPresentazione.setVisible(false);
        DomandaSport.setVisible(true);
        btnRadio1Sport.setVisible(true);
        btnRadio2Sport.setVisible(true);
        btnRadio3Sport.setVisible(true);
        btnRadio4Sport.setVisible(true);
        imgCalcio.setVisible(false);
        imgBasket.setVisible(false);
        imgPallavolo.setVisible(false);
        imgCiclismo.setVisible(false);
        //Rendo invisibili le griglie di valutazione
        imgemojiUltimo.setVisible(false);
        imgemojiPenultimo.setVisible(false);
        imgemojiTerzo.setVisible(false);
        imgemojiSecondo.setVisible(false);
        imgemojiPrimo.setVisible(false);
        lblUltimo.setVisible(false);
        lblPenultimo.setVisible(false);
        lblTerzo.setVisible(false);
        lblSecondo.setVisible(false);
        lblPrimo.setVisible(false);
        if (btnNext.getText().equals("Restart The Quiz")){
            btnNext.setText("Next");
            indexSport = 0;
            correctSport = 0;
        }
        if (indexSport == questionSport.length){
            DomandaSport.setText("You score: " + correctSport + "/" + questionSport.length);
            if (correctSport == 0){
                imgemojiUltimo.setVisible(true);
            }
            else if (correctSport > 0 && correctSport <= 5){
                imgemojiPenultimo.setVisible(true);
            }
            else if (correctSport > 5 && correctSport <= 8) {
                imgemojiTerzo.setVisible(true);
            }
            else if (correctSport > 8 && correctSport <= 12){
                imgemojiSecondo.setVisible(true);
            }
            else if (correctSport > 12){
                imgemojiPrimo.setVisible(true);
            }
            btnNext.setVisible(false);
            btnNext.setText("Restart The Quiz");
            btnWrongAnswer.setVisible(true);
        }
        else{
            DisableRButtonsSport(false);
            DomandaSport.setText(questionSport[indexSport]);
            btnRadio1Sport.setText(optionsSport[indexSport][0]);
            btnRadio2Sport.setText(optionsSport[indexSport][1]);
            btnRadio3Sport.setText(optionsSport[indexSport][2]);
            btnRadio4Sport.setText(optionsSport[indexSport][3]);
            if (indexSport == questionSport.length - 1){
                btnNext.setText("Finish and see the result!");
            }
            btnRadio1Sport.setSelected(false);
            btnRadio2Sport.setSelected(false);
            btnRadio3Sport.setSelected(false);
            btnRadio4Sport.setSelected(false);
        }
    }

    public void onbtnNextGeoButtonClick(ActionEvent actionEvent) {
        imgBandiere.setVisible(false);
        imgCartina.setVisible(false);
        imgMappamondo.setVisible(false);
        imgMondo.setVisible(false);
        btnNextGeo.setText("Next Question");
        btnNext.setVisible(false);
        lblPresentazione.setVisible(false);
        DomandaGeografia.setVisible(true);
        btnRadio1Geografia.setVisible(true);
        btnRadio2Geografia.setVisible(true);
        btnRadio3Geografia.setVisible(true);
        btnRadio4Geografia.setVisible(true);
        //Rendo invisibili le griglie di valutazione
        imgemojiUltimo.setVisible(false);
        imgemojiPenultimo.setVisible(false);
        imgemojiTerzo.setVisible(false);
        imgemojiSecondo.setVisible(false);
        imgemojiPrimo.setVisible(false);
        lblUltimo.setVisible(false);
        lblPenultimo.setVisible(false);
        lblTerzo.setVisible(false);
        lblSecondo.setVisible(false);
        lblPrimo.setVisible(false);
        if (btnNextGeo.getText().equals("Restart The Quiz")){
            btnNextGeo.setText("Next");
            indexGeografia = 0;
            correctGeografia = 0;
        }
        if (indexGeografia == questionGeografia.length){
            DomandaGeografia.setText("You score: " + correctGeografia + "/" + questionGeografia.length);
            if (correctGeografia == 0){
                imgemojiUltimo.setVisible(true);
            }
            else if (correctGeografia > 0 && correctGeografia <= 5){
                imgemojiPenultimo.setVisible(true);
            }
            else if (correctGeografia > 5 && correctGeografia <= 8) {
                imgemojiTerzo.setVisible(true);
            }
            else if (correctGeografia > 8 && correctGeografia <= 12){
                imgemojiSecondo.setVisible(true);
            }
            else if (correctGeografia > 12){
                imgemojiPrimo.setVisible(true);
            }
            btnNextGeo.setVisible(false);
            btnNextGeo.setText("Restart The Quiz");
            btnWrongAnswer.setVisible(true);
        }
        else{
            DisableRButtonsGeografia(false);
            DomandaGeografia.setText(questionGeografia[indexGeografia]);
            btnRadio1Geografia.setText(optionsGeografia[indexGeografia][0]);
            btnRadio2Geografia.setText(optionsGeografia[indexGeografia][1]);
            btnRadio3Geografia.setText(optionsGeografia[indexGeografia][2]);
            btnRadio4Geografia.setText(optionsGeografia[indexGeografia][3]);
            if (indexGeografia == questionGeografia.length - 1){
                btnNextGeo.setText("Finish and see the result!");
            }
            btnRadio1Geografia.setSelected(false);
            btnRadio2Geografia.setSelected(false);
            btnRadio3Geografia.setSelected(false);
            btnRadio4Geografia.setSelected(false);
        }

    }

    public void onbtnNextStoriaButtonClick(ActionEvent actionEvent) {
        imgNavi.setVisible(false);
        imgHistory.setVisible(false);
        imgReperti.setVisible(false);
        imgVillaggio.setVisible(false);
        lblPresentazione.setVisible(false);
        btnRadio1Storia.setVisible(true);
        btnRadio2Storia.setVisible(true);
        btnRadio3Storia.setVisible(true);
        btnRadio4Storia.setVisible(true);
        DomandaStoria.setVisible(true);
        //Rendo invisibili le griglie di valutazione
        imgemojiUltimo.setVisible(false);
        imgemojiPenultimo.setVisible(false);
        imgemojiTerzo.setVisible(false);
        imgemojiSecondo.setVisible(false);
        imgemojiPrimo.setVisible(false);
        lblUltimo.setVisible(false);
        lblPenultimo.setVisible(false);
        lblTerzo.setVisible(false);
        lblSecondo.setVisible(false);
        lblPrimo.setVisible(false);
        btnNextStoria.setText("Next Question");
        if (btnNextStoria.getText().equals("Restart The Quiz")){
            btnNextStoria.setText("Next");
            indexStoria = 0;
            correctStoria = 0;
        }
        if (indexStoria == questionStoria.length){
            DomandaStoria.setText("You score: " + correctStoria + "/" + questionStoria.length);
            if (correctStoria == 0){
                imgemojiUltimo.setVisible(true);
            }
            else if (correctStoria > 0 && correctStoria <= 5){
                imgemojiPenultimo.setVisible(true);
            }
            else if (correctStoria > 5 && correctStoria <= 8) {
                imgemojiTerzo.setVisible(true);
            }
            else if (correctStoria > 8 && correctStoria <= 12){
                imgemojiSecondo.setVisible(true);
            }
            else if (correctStoria > 12){
                imgemojiPrimo.setVisible(true);
            }
            btnNextStoria.setVisible(false);
            btnNextStoria.setText("Restart The Quiz");
            btnWrongAnswer.setVisible(true);
        }
        else{
            DisableRButtonsStoria(false);
            DomandaStoria.setText(questionStoria[indexStoria]);
            btnRadio1Storia.setText(optionsStoria[indexStoria][0]);
            btnRadio2Storia.setText(optionsStoria[indexStoria][1]);
            btnRadio3Storia.setText(optionsStoria[indexStoria][2]);
            btnRadio4Storia.setText(optionsStoria[indexStoria][3]);
            if (indexStoria == questionStoria.length - 1){
                btnNextStoria.setText("Finish and see the result!");
            }
            btnRadio1Storia.setSelected(false);
            btnRadio2Storia.setSelected(false);
            btnRadio3Storia.setSelected(false);
            btnRadio4Storia.setSelected(false);
        }
    }

    public void onbtnNextCulturaButtonClick(ActionEvent actionEvent) {
        lblPresentazione.setVisible(false);
        imgLibri.setVisible(false);
        imgCartoline.setVisible(false);
        imgUomoV.setVisible(false);
        imgCittà.setVisible(false);
        DomandaCultura.setVisible(true);
        btnRadio1Cultura.setVisible(true);
        btnRadio2Cultura.setVisible(true);
        btnRadio3Cultura.setVisible(true);
        btnRadio4Cultura.setVisible(true);
        //Rendo invisibili le griglie di valutazione
        imgemojiUltimo.setVisible(false);
        imgemojiPenultimo.setVisible(false);
        imgemojiTerzo.setVisible(false);
        imgemojiSecondo.setVisible(false);
        imgemojiPrimo.setVisible(false);
        lblUltimo.setVisible(false);
        lblPenultimo.setVisible(false);
        lblTerzo.setVisible(false);
        lblSecondo.setVisible(false);
        lblPrimo.setVisible(false);
        btnNextCultura.setText("Next Question");
        if (btnNextCultura.getText().equals("Restart The Quiz")){
            btnNextCultura.setText("Next");
            indexCulturaGenerale = 0;
            correctCulturaGenerale = 0;
        }
        if (indexCulturaGenerale == questionCulturaGenerale.length){
            DomandaCultura.setText("You score: " + correctCulturaGenerale + "/" + questionCulturaGenerale.length);
            if (correctCulturaGenerale == 0){
                imgemojiUltimo.setVisible(true);
            }
            else if (correctCulturaGenerale > 0 && correctCulturaGenerale <= 5){
                imgemojiPenultimo.setVisible(true);
            }
            else if (correctCulturaGenerale > 5 && correctCulturaGenerale <= 8) {
                imgemojiTerzo.setVisible(true);
            }
            else if (correctCulturaGenerale > 8 && correctCulturaGenerale <= 12){
                imgemojiSecondo.setVisible(true);
            }
            else if (correctCulturaGenerale > 12){
                imgemojiPrimo.setVisible(true);
            }
            btnNextCultura.setVisible(false);
            btnNextCultura.setText("Restart The Quiz");
            btnWrongAnswer.setVisible(true);
        }
        else{
            DisableRButtonsCultura(false);
            DomandaCultura.setText(questionCulturaGenerale[indexCulturaGenerale]);
            btnRadio1Cultura.setText(optionsCulturaGenerale[indexCulturaGenerale][0]);
            btnRadio2Cultura.setText(optionsCulturaGenerale[indexCulturaGenerale][1]);
            btnRadio3Cultura.setText(optionsCulturaGenerale[indexCulturaGenerale][2]);
            btnRadio4Cultura.setText(optionsCulturaGenerale[indexCulturaGenerale][3]);
            if (indexCulturaGenerale == questionCulturaGenerale.length - 1){
                btnNextCultura.setText("Finish and see the result!");
            }
            btnRadio1Cultura.setSelected(false);
            btnRadio2Cultura.setSelected(false);
            btnRadio3Cultura.setSelected(false);
            btnRadio4Cultura.setSelected(false);
        }
    }


    public void onbtnRadio1SportButtonClick(ActionEvent actionEvent) {
        getSelectedOptionSport(btnRadio1Sport);
    }

    public void onbtnRadio2SportButtonClick(ActionEvent actionEvent) {
        getSelectedOptionSport(btnRadio2Sport);
    }

    public void onbtnRadio3SportButtonClick(ActionEvent actionEvent) {
        getSelectedOptionSport(btnRadio3Sport);
    }

    public void onbtnRadio4SportButtonClick(ActionEvent actionEvent) {
        getSelectedOptionSport(btnRadio4Sport);
    }


    public void onbtnRadio1GeografiaButtonClick(ActionEvent actionEvent) {
        getSelectedOptionGeografia(btnRadio1Geografia);
    }

    public void onbtnRadio2GeografiaButtonClick(ActionEvent actionEvent) {
        getSelectedOptionGeografia(btnRadio2Geografia);
    }

    public void onbtnRadio3GeografiaButtonClick(ActionEvent actionEvent) {
        getSelectedOptionGeografia(btnRadio3Geografia);
    }

    public void onbtnRadio4GeografiaButtonClick(ActionEvent actionEvent) {
        getSelectedOptionGeografia(btnRadio4Geografia);
    }



    public void onbtnRadio1StoriaButtonClick(ActionEvent actionEvent) {
        getSelectedOptionStoria(btnRadio1Storia);
    }

    public void onbtnRadio2StoriaButtonClick(ActionEvent actionEvent) {
        getSelectedOptionStoria(btnRadio2Storia);
    }

    public void onbtnRadio3StoriaButtonClick(ActionEvent actionEvent) {
        getSelectedOptionStoria(btnRadio3Storia);
    }

    public void onbtnRadio4StoriaButtonClick(ActionEvent actionEvent) {
        getSelectedOptionStoria(btnRadio4Storia);
    }


    public void onbtnRadio1CulturaButtonClick(ActionEvent actionEvent) {
        getSelectedOptionCultura(btnRadio1Cultura);
    }

    public void onbtnRadio2CulturaButtonClick(ActionEvent actionEvent) {
        getSelectedOptionCultura(btnRadio2Cultura);
    }

    public void onbtnRadio3CulturaButtonClick(ActionEvent actionEvent) {
        getSelectedOptionCultura(btnRadio3Cultura);
    }

    public void onbtnRadio4CulturaButtonClick(ActionEvent actionEvent) {
        getSelectedOptionCultura(btnRadio4Cultura);
    }


    public void onbtnWrongAnswerClick(ActionEvent actionEvent) {
        
    }
}