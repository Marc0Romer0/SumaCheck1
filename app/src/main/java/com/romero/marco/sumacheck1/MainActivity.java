package com.romero.marco.sumacheck1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText varTxtNum1, varTxtNum2;
    RadioButton varRdSuma, varRdResta, varRdDivision, varRdMultiplicacion;
    Button varButton;
    TextView txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        varTxtNum1 = (EditText) findViewById(R.id.txtNum1);
        varTxtNum2 = (EditText) findViewById(R.id.txtNum2);
        varRdSuma = (RadioButton) findViewById(R.id.rdSuma);
        varRdDivision = (RadioButton) findViewById(R.id.rdDivision);
        varRdMultiplicacion = (RadioButton) findViewById(R.id.rdMultiplicacion);
        varRdResta = (RadioButton) findViewById(R.id.rdResta);
        varButton = (Button) findViewById(R.id.btnOperacion);
        txtResultado = (TextView) findViewById(R.id.txtResultado);

        varButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int resultado = 0;
                int num1 = Integer.parseInt(varTxtNum1.getText().toString());
                int num2 = Integer.parseInt(varTxtNum1.getText().toString());
                if (varRdSuma.isChecked())
                    resultado = num1 + num2;
                if(varRdResta.isChecked())
                    resultado = num1 - num2;
                if(varRdDivision.isChecked())
                    resultado = num1 / num2;
                if(varRdMultiplicacion.isChecked())
                    resultado = num1 * num2;

                txtResultado.setText("El resultado es " + resultado);
            }
            })
        ;}
}

