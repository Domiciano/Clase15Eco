package co.domi.guiaclase15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.UUID;

public class LoginActivity extends AppCompatActivity {

    private ListView storeList;
    private StoreAdapter adapter;
    LinearLayout container;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        storeList = findViewById(R.id.storeList);
        container = findViewById(R.id.container);

        adapter = new StoreAdapter();
        storeList.setAdapter(adapter);

    }


}