package zvendelivery.tests;

import zvendelivery.entites.Produits;
import zvendelivery.entites.Restaurant;
import zvendelivery.services.ServiceProduit;
import zvendelivery.services.ServiceRestaurant;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import t2s.son.LecteurTexte;
import zvendelivery.entites.Reclamation;
import zvendelivery.entites.Utilisateur;
import zvendelivery.services.ServiceReclamation;
import zvendelivery.services.ServiceUser;

public class Zvendelivery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
       
            // TODO code application logic here
            ServiceRestaurant rs = new ServiceRestaurant();
            ServiceProduit p = new ServiceProduit();
            ServiceReclamation rec = new ServiceReclamation();
            ServiceUser user = new ServiceUser();
            
            java.sql.Timestamp date_sql = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
            
            Restaurant r = new Restaurant(31,"xx","a jkjk","ariana","cite wahat","12:00","fast food","21:00","tunis",2045,"","imagekfc","imagekfc.jpg","verified");
            Restaurant restaurant = new Restaurant(31,136,"bdssdddd","BOOdM","TUNIS","WAHHAAAT","13:00","fast ","21:00","tunis",2055,"2022-03-24 14:46:03","imagekfc","imagekfc.jpg","verified");
            
            Produits pr = new Produits(136,3,"sandwich","sandiwch thon","","sandwichimage","ss");
            
            Produits pr1 = new Produits(60,restaurant,8,"pizzaaa","pizza 4 fromages","","pizzaimage","pizzaimage.jpg");
            
            
            Reclamation recc= new Reclamation(69,1, "String titre", "String ","String nomimage",5, 5, 5);
           // Reclamation etat=new Reclamation(91,"traité");
//rec.modifieretat(etat);
Utilisateur k = new Utilisateur(19,0,22222222,0,"[\"ROLE_USER\"]","32222","2022-03-24 14:46:03","2022-03-24","image.jpg","image.jpg","aaa@esprit.tn","aaaaa","ghoul","prenomm","adresses","sexee","pseudoo");

//RESTAUUUUURANT
// rs.ajouter(r);
//rs.modifer(restaurant);
//  System.out.println(rs.afficher());

// rs.supprimer(restaurant.getId());
//user.ajouter(k);
//user.login("aaa@esprit.tn", "aaaa");
//PRODUIIIT
// p.ajouter(pr);
// p.modifer( pr1);
// p.supprimer(57);
// System.out.println(p.afficher());
//  System.out.println(rs.afficherbyrestaurant(restaurant));
     LecteurTexte lecteur = new LecteurTexte("hiiiiiiiiiiiiiiiiii");
     lecteur.playAll();

    }
}
