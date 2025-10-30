package com.example.historyandculture;

import android.os.Bundle;
// 1. IMPORTANT: Import the correct Unity class
import com.unity3d.player.UnityPlayerGameActivity;

// 2. IMPORTANT: Extend UnityPlayerGameActivity, not AppCompatActivity
public class ARActivity extends UnityPlayerGameActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}



// 3. IMPORTANT: Do NOT call setContentView().
// The UnityPlayerGameActivity handles its own view.
// Remove any lines like:
// setContentView(R.layout.activity_aractivity);
