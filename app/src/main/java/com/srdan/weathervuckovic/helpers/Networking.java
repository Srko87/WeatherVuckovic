package com.srdan.weathervuckovic.helpers;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class Networking {
    private Activity activity;

    public Networking(Activity activity) {
        this.activity = activity;
    }

    public boolean isConnectedToInternet() {
        ConnectivityManager connectivityManager = (ConnectivityManager) activity.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
        return activeNetwork != null && activeNetwork.isConnected();
    }

    public void displayDisconnectedToast() {
        Toast.makeText(activity, "Please connect to internet to use app.",
                Toast.LENGTH_SHORT).show();
    }
}
