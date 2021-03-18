package com.example.recyclerviewhw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecipeMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_method);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String item_name = null;
        if (extras != null) {
            item_name = extras.getString(RecipeListAdapter.EXTRA_NAME);
        }
        TextView heading = findViewById(R.id.food_name);
        heading.setText(item_name);
        if (item_name != null) {
            switch (item_name){
                case "Chocolate Mint Bars":
                    break;
                case "Blueberry Cupcakes":
                    break;
                case "Fudge Walnut Brownies":
                    break;
                case "Lemon Cake":
                    break;
                case "Blueberry Peach Cobbler":
                    break;
                case "Texas Sheet Cake":
                    break;
                case "Espresso Crinkles":
                    break;

                default: break;

            }

        }
    }
}