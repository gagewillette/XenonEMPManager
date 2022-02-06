package me.GageWillette.XenonEMPManager.Utils;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

public class FireDB
{

    public static Firestore setupDB() throws IOException, ExecutionException, InterruptedException {
        FileInputStream serviceAccount = new FileInputStream("xenonempmanager-firebase-adminsdk-yvmkx-f28bd4a615.json");

        FirebaseOptions options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount)).build();

        FirebaseApp.initializeApp(options);
        Firestore db = FirestoreClient.getFirestore();

        return db;
    }

}


