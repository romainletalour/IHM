package sample.address.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;



public class PersonOverviewController extends Controller implements Initializable  {

    ObservableList list = FXCollections.observableArrayList();

    @FXML
    private ImageView logo;

    @FXML
    private Label adviceLabel;

    @FXML
    private ChoiceBox<String> sortBy;

    /**
     * Citadines
     */
    // 208
    @FXML
    private ImageView peugeot208View;
    @FXML
    private TextArea text208;
    // Yaris
    @FXML
    private ImageView toyotaYarisView;
    @FXML
    private TextArea textYaris;
    // Clio
    @FXML
    private ImageView renaultClioView;
    @FXML
    private TextArea textClio;
    // C3
    @FXML
    private ImageView citroenC3View;
    @FXML
    private TextArea textC3;

    /**
     * Berlines
     */
    // A6
    @FXML
    private ImageView audiA6View;
    @FXML
    private TextArea textA6;
    // Classe E
    @FXML
    private ImageView mercedesClasseEView;
    @FXML
    private TextArea textClasseE;
    // 508
    @FXML
    private ImageView peugeot508View;
    @FXML
    private TextArea text508;
    // Model 3
    @FXML
    private ImageView teslaModel3View;
    @FXML
    private TextArea textModel3;
    // Talisman
    @FXML
    private ImageView renaultTalismanView;
    @FXML
    private TextArea textTalisman;
    // RS E-Tron
    @FXML
    private ImageView audiRsEtronView;
    @FXML
    private TextArea textRsEtron;



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //loading the logo in the scene
        File logo1 = new File("src/resources/icons/wmc_ico.png");
        Image setLogo = new Image(logo1.toURI().toString());
        logo.setImage(setLogo);

        adviceLabel.setText("Nous vous conseillons de vous diriger vers l'achat d'une citadine qui conviendrait à vos besoins et caractéristiques");

        // Loading the ChoiceBox
        loadData();

        // Putting the popups backward
        panesOnBack();

        // Loading the cars in the scene
        try {
            setPeugeot208View();
            setToyotaYarisView();
            setRenaultClioView();
            setCitroenC3View();
            /*setAudiA6View();
            setMercedesClasseEView();
            setPeugeot508View();
            setRenaultTalismanView();
            setTeslaModel3View();
            setAudiRsEtronView();
             */
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void loadData(){
        list.removeAll(list);
        String ascending = "Prix croissant";
        String descending = "Prix décroissant";
        String AtoZ = "A-Z";
        String ZtoA = "Z-A";
        list.addAll(ascending,descending,AtoZ,ZtoA);
        sortBy.getItems().addAll(list);
    }


    /**
     * Part dedicated for the loading of 'citadines' cars
     * @throws IOException
     */
    @FXML
    public void setPeugeot208View() throws IOException {
        File car1 = new File("src/resources/media/citadines/208.jpeg");
        Image peugeot208 = new Image(car1.toURI().toString());
        peugeot208View.setImage(peugeot208);

        File file = new File("src/resources/media/citadines/208.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String description;
        while ((description = br.readLine()) != null){
            text208.setText(description);
        }
    }

    @FXML
    public void setToyotaYarisView() throws IOException {
        File car = new File("src/resources/media/citadines/yaris.jpeg");
        Image yaris = new Image(car.toURI().toString());
        toyotaYarisView.setImage(yaris);

        File file = new File("src/resources/media/citadines/yaris.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String description;
        while ((description = br.readLine()) != null){
            textYaris.setText(description);
        }
    }

    @FXML
    public void setRenaultClioView() throws IOException {
        File car = new File("src/resources/media/citadines/clio.jpeg");
        Image clio = new Image(car.toURI().toString());
        renaultClioView.setImage(clio);

        File file = new File("src/resources/media/citadines/clio.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String description;
        while ((description = br.readLine()) != null){
            textClio.setText(description);
        }
    }

    @FXML
    public void setCitroenC3View() throws IOException {
        File car = new File("src/resources/media/citadines/c3.jpeg");
        Image c3 = new Image(car.toURI().toString());
        citroenC3View.setImage(c3);

        File file = new File("src/resources/media/citadines/c3.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String description;
        while ((description = br.readLine()) != null){
            textC3.setText(description);
        }
    }

    /**
     * This part is dedicated of the loading of 'routieres' cars
     */
    @FXML
    public void setAudiA6View() throws IOException {
        File car = new File("src/resources/media/routieres/a6.jpeg");
        Image audiA6 = new Image(car.toURI().toString());
        audiA6View.setImage(audiA6);

        File file = new File("src/resources/media/routieres/a6.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String description;
        while ((description = br.readLine()) != null){
            textA6.setText(description);
        }
    }

    @FXML
    public void setMercedesClasseEView() throws IOException {
        File car = new File("src/resources/media/routieres/classe_e.jpeg");
        Image classeE = new Image(car.toURI().toString());
        mercedesClasseEView.setImage(classeE);

        File file = new File("src/resources/media/routieres/classe_e.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String description;
        while ((description = br.readLine()) != null){
            textClasseE.setText(description);
        }
    }

    @FXML
    public void setPeugeot508View() throws IOException {
        File car = new File("src/resources/media/routieres/508.jpeg");
        Image peugeot508 = new Image(car.toURI().toString());
        peugeot508View.setImage(peugeot508);

        File file = new File("src/resources/media/routieres/508.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String description;
        while ((description = br.readLine()) != null){
            text508.setText(description);
        }
    }

    @FXML
    public void setTeslaModel3View() throws IOException {
        File car = new File("src/resources/media/routieres/model_3.jpeg");
        Image model3 = new Image(car.toURI().toString());
        teslaModel3View.setImage(model3);

        File file = new File("src/resources/media/routieres/model_3.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String description;
        while ((description = br.readLine()) != null){
            textModel3.setText(description);
        }
    }

    @FXML
    public void setRenaultTalismanView() throws IOException {
        File car = new File("src/resources/media/routieres/talisman.jpeg");
        Image talisman = new Image(car.toURI().toString());
        renaultTalismanView.setImage(talisman);

        File file = new File("src/resources/media/routieres/talisman.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String description;
        while ((description = br.readLine()) != null){
            textTalisman.setText(description);
        }
    }

    @FXML
    public void setAudiRsEtronView() throws IOException {
        File car = new File("src/resources/media/routieres/rs_etron.jpeg");
        Image rs_etron = new Image(car.toURI().toString());
        audiRsEtronView.setImage(rs_etron);

        File file = new File("src/resources/media/routieres/rs_etron.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String description;
        while ((description = br.readLine()) != null){
            textRsEtron.setText(description);
        }
    }



    /**
        Here is the part only dedicated to the popups with the '?' button.
     */
    @FXML
    private Pane espacePane;
    @FXML
    private Label labelEspacePane;

    @FXML
    private Pane motorPane;
    @FXML
    private Label labelMotorPane;

    @FXML
    private Pane tastePane;
    @FXML
    private Label tasteLabel;

    @FXML
    private Pane drivePane;
    @FXML
    private Label driveLabel;

    @FXML
    void espaceQuery(MouseEvent event) {
        espacePane.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii (5), Insets.EMPTY)));
        labelEspacePane.setText("Nécessité d'espace de coffre. Pour vos affaires, matériel, courses...");
    }

    @FXML
    void espaceHide(MouseEvent event) {
        espacePane.setBackground(Background.EMPTY);
        labelEspacePane.setText("");
    }

    @FXML
    void motorisationQuery(MouseEvent event) {
        motorPane.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii (5), Insets.EMPTY)));
        labelMotorPane.setText("Conseils : \n Essence : Ville ou mix \n Diesel : Route/Autoroute ou Tout Terrain \n Hybride : Ville \n Electrique : Ville");
        motorPane.toFront();
        labelMotorPane.toFront();
    }

    @FXML
    void motorisationHide(MouseEvent event) {
        motorPane.setBackground(Background.EMPTY);
        labelMotorPane.setText("");
        motorPane.toBack();
        labelMotorPane.toBack();
    }

    @FXML
    void tasteQuery(MouseEvent event) {
        tastePane.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii (5), Insets.EMPTY)));
        tasteLabel.setText("Nous prendrons en compte vos goûts en terme d'automobile");
        tastePane.toFront();
        tasteLabel.toFront();
    }

    @FXML
    void driveQuery(MouseEvent event) {
        drivePane.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii (5), Insets.EMPTY)));
        driveLabel.setText("Si pour vous conduire est plus que d'aller d'un point A à un point B, alors cochez oui");
        drivePane.toFront();
        driveLabel.toFront();
    }

    @FXML
    void tasteHide(MouseEvent event) {
        tastePane.setBackground(Background.EMPTY);
        tasteLabel.setText("");
        tastePane.toBack();
        tasteLabel.toBack();
    }

    @FXML
    void driveHide(MouseEvent event) {
        drivePane.setBackground(Background.EMPTY);
        driveLabel.setText("");
        drivePane.toBack();
        driveLabel.toBack();
    }

    @FXML
    void panesOnBack() {
        espacePane.toBack();
        labelEspacePane.toBack();
        motorPane.toBack();
        labelMotorPane.toBack();
        tastePane.toBack();
        tasteLabel.toBack();
        drivePane.toBack();
        driveLabel.toBack();
    }

}
