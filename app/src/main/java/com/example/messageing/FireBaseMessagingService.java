package com.example.messageing;

import android.util.Log;

import androidx.annotation.NonNull;

// [Modified By HMSConvertor] import com.google.firebase.messaging.FirebaseMessaging;
import org.xms.f.messaging.ExtensionMessaging;
// [Modified By HMSConvertor] import com.google.firebase.messaging.FirebaseMessagingService;
import org.xms.f.messaging.ExtensionMessagingService;
// [Modified By HMSConvertor] import com.google.firebase.messaging.RemoteMessage;
import org.xms.f.messaging.RemoteMessage;

// [Modified By HMSConvertor] public class FireBaseMessagingService extends FirebaseMessagingService {
public class FireBaseMessagingService extends ExtensionMessagingService {
    private static final String TAG = "FireBaseMessagingServic";
    public FireBaseMessagingService() {
        super();
    }

    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        String title = remoteMessage.getData().get("title") == null ? "Ambitwiz" : remoteMessage.getData().get("title");
        String message = remoteMessage.getData().get("message") == null ? "Ambitwiz Description" : remoteMessage.getData().get("message");
        Log.e(TAG, title);
        Log.e(TAG, message);
    }

    @Override
    public void onNewToken(@NonNull String s) {
        super.onNewToken(s);
    }
}
