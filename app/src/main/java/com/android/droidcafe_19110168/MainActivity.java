package com.android.droidcafe_19110168;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView iDonut;
    private ImageView iCream;
    private ImageView iFroyo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iDonut = findViewById(R.id.donut);
        iCream = findViewById(R.id.ice_cream);
        iFroyo = findViewById(R.id.froyo);

        showDonutOrder(iDonut);
        showIceCreamOrder(iCream);
        showFroyoOrder(iFroyo);
    }
    private void showDonutOrder(ImageView iDonut){
        iDonut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayToast(getString(R.string.donut_order_message));
            }
        });
    }
    private void showIceCreamOrder(ImageView iCream){
        iCream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayToast(getString(R.string.ice_cream_order_message));
            }
        });
    }
    private void showFroyoOrder(ImageView iCream){
        iCream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayToast(getString(R.string.froyo_order_message));
            }
        });
    }
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

}