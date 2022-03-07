package com.luisfernandomgrs.learning.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView ListViewContent;
    private String[] astrCitiesList = {
            "Machu Picchu (Peru)",
            "Baños (Equador)",
            "Las Lajas (Colômbia)",
            "Ilhas Uros (Peru/Bolívia)",
            "Torres del Paine (Chile)",
            "Salar de Uyuni (Bolívia)",
            "Ushuaia (Argentina)",
            "Paramaribo (Suriname)",
            "Cabo Polonio (Uruguai)",
            "El Calafate (Argentina)\n",
            "Parque Tayrona (Colômbia)",
            "Ilha de Páscoa (Chile)",
            "Encarnación (Paraguai)",
            "Ilhas Galápagos (Equador)",
            "Isla Negra (Chile)"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // settings initialize personal
        ListViewContent = findViewById(R.id._ListViewContent);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                astrCitiesList
        );

        ListViewContent.setAdapter(adaptador);

        ListViewContent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, ListViewContent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}