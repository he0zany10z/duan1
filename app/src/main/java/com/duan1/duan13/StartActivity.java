package com.duan1.duan13;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class StartActivity extends AppCompatActivity {
    Button LoginButton,RegisterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        LoginButton = findViewById(R.id.login);
        RegisterButton = findViewById(R.id.register);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(StartActivity.this);
                bottomSheetDialog.setContentView(R.layout.buttom_sheet_login);
                bottomSheetDialog.setCanceledOnTouchOutside(false);

                bottomSheetDialog.show();
            }

        });
        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(StartActivity.this);
                bottomSheetDialog.setContentView(R.layout.activity_register);
                bottomSheetDialog.setCanceledOnTouchOutside(false);

                bottomSheetDialog.show();
            }
        });
    }
}