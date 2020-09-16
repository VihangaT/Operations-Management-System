/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseCon;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseCredentials;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



/**
 *
 * @author Yasiru
 */
public class Database {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
        // TODO code application logic here
        FileInputStream serviceAccount = new FileInputStream("E:\\packages combine krapu eka\\oms19_2\\oms19_2\\omssystem9798-firebase-adminsdk-938j3-6beddaf76c.json");

        FirebaseOptions options;
        options= new FirebaseOptions.Builder()
                .setCredential(FirebaseCredentials.fromCertificate(serviceAccount))
                .setDatabaseUrl("https://omssystem9798.firebaseio.com/")
                .build();

        FirebaseApp.initializeApp(options);
    }
}
