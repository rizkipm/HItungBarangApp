package imastudio.id.co.hitungbarangapp;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CoordinatorLayout main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //oncreate
        Log.d("lifecycle", "proses oncreate");

        //message pada android
        //1. Toast (Short , long)
        //2. Snackbar

        //memanggil activity : getContext, getApplicationContext, this

        Toast.makeText(getApplicationContext(), "Halo ini toast short", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Halo ini toast long", Toast.LENGTH_LONG).show();

        main = (CoordinatorLayout)findViewById(R.id.main);

        //snackbar
        Snackbar snackbar = Snackbar.make(main, "Hello, ini snackbar", Snackbar.LENGTH_LONG);
        //menampilkan snackbar
        snackbar.show();

    }

    //onstart

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle", "Proses onStart");

    }

    //onResume

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle", "Proses OnResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle", "Proses onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle", "Proses onRestart");
    }

    //onDestroy

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle", "onDestroy");
    }
}
