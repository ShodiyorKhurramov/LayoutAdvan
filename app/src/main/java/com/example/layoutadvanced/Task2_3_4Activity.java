package com.example.layoutadvanced;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

public class Task2_3_4Activity extends AppCompatActivity {
    TextInputLayout tilName,tilEmail;
    EditText etName,etMobile,etPassword,etEmail;
    MaterialButton btClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2_3_4);


        tilEmail=findViewById(R.id.til_email);
        etName=findViewById(R.id.et_name);
        etMobile=findViewById(R.id.et_mobile);
        etEmail=findViewById(R.id.et_eamil);
        etPassword=findViewById(R.id.et_password);
        btClear=findViewById(R.id.bt_clear);
        tilEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etEmail.getText().clear();
            }
        });

        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etName.getText().clear();
                etMobile.getText().clear();
                etEmail.getText().clear();
                etPassword.getText().clear();
                etPassword.clearFocus();

            }
        });

        addTextChangedListener();
    }

    private void addTextChangedListener() {
        etName=findViewById(R.id.et_name);
        tilName=findViewById(R.id.til_name);
        etName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {
                if(!s.toString().isEmpty()&&!s.toString().matches("[a-zA-Z]+")){
                    tilName.setError("Allow only character");
                }else{
                    tilName.setError(null);
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}