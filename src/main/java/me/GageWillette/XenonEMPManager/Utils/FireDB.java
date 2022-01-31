package me.GageWillette.XenonEMPManager.Utils;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

public class FireDB
{

    HashMap<String , String> quote = null;

    private static void setupDB() throws IOException
    {
        FileInputStream serviceAccount = new FileInputStream("studious-plate-339823-firebase-adminsdk-asesg-7dd10c1266.json");

        FirebaseOptions options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount)).build();

        FirebaseApp.initializeApp(options);
        Firestore db = FirestoreClient.getFirestore();


    }

}


