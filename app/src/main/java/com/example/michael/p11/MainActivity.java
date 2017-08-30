package com.example.michael.p11;

import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private RadioButton rCuadrado,rCirculo,rTriangulo,rCubo;
    private EditText eLcuadrado,eLcubo,eRadio,eBase;
    private TextView tInfo;

    private double lcuadrado,lcubo,ltri,radio,area,perimetro,volumen,pi=3.14159265359;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rCuadrado = (RadioButton)findViewById(R.id.rCuadrado);
        rCirculo = (RadioButton)findViewById(R.id.rCirculo);
        rTriangulo = (RadioButton)findViewById(R.id.rTriangulo);
        rCubo = (RadioButton)findViewById(R.id.rCubo);
        eLcuadrado = (EditText)findViewById(R.id.eLcuadrado);
        eLcubo = (EditText)findViewById(R.id.eLcubo);
        eRadio = (EditText)findViewById(R.id.eRadio);
        eBase = (EditText)findViewById(R.id.eBase);
        tInfo = (TextView)findViewById(R.id.tInfo);



    }



    public void Calcular(View view){

        String val1 = eLcuadrado.getText().toString().trim();
        String val2 = eRadio.getText().toString().trim();
        String val3 = eBase.getText().toString().trim();
        String val4 = eLcubo.getText().toString().trim();

     if(rCuadrado.isChecked() && !TextUtils.isEmpty(val1) ) {


             eLcubo.setText("");
             eRadio.setText("");
             eBase.setText("");
             lcuadrado = Double.parseDouble(eLcuadrado.getText().toString());
             area=0;
             perimetro=0;
             area = lcuadrado*lcuadrado;
             perimetro = 4*lcuadrado;
             tInfo.setText("Resultados Cuadrado" + "\nEl área es : " + String.valueOf(String.format("%.3f",area)) + " cm^2"
                     + "\nEl perímetro es : " + String.valueOf(String.format("%.3f",perimetro)) + " cm" );
//

     }



        else if (rCirculo.isChecked() && !TextUtils.isEmpty(val2)) {

            eLcubo.setText("");
            eLcuadrado.setText("");
            eBase.setText("");

            radio = Double.parseDouble(eRadio.getText().toString());
            area=0;
            perimetro=0;
            area = pi*(radio*radio);
            perimetro = 2*pi*radio;
            tInfo.setText("Resultados Círculo" + "\nEl área es : " + String.valueOf(String.format("%.3f",area)) + " cm^2"
                    + "\nEl perímetro es : " + String.valueOf(String.format("%.3f",perimetro)) + " cm" );
        }



        else if(rCubo.isChecked()&& !TextUtils.isEmpty(val4)) {

            eLcuadrado.setText("");
            eRadio.setText("");
            eBase.setText("");

            lcubo = Double.parseDouble(eLcubo.getText().toString());
            area=0;
            volumen=0;
            area = 6*(lcubo*lcubo);
            volumen = lcubo*lcubo*lcubo;
            tInfo.setText("Resultados Cubo" + "\nEl área es : " + String.valueOf(String.format("%.3f",area)) + " cm^2"
                    + "\nEl volumen es : " + String.valueOf(String.format("%.3f",volumen)) + " cm^3" );
        }



        else if(rTriangulo.isChecked() && !TextUtils.isEmpty(val3)) {

            eLcubo.setText("");
            eRadio.setText("");
            eLcuadrado.setText("");
            ltri = Double.parseDouble(eBase.getText().toString());
            area=0;
            perimetro=0;
            area = (Math.sqrt(3)*Math.pow(ltri,2))/4;
            perimetro = 3*ltri;
            tInfo.setText("Resultados Triángulo" + "\nEl área es : " + String.valueOf(String.format("%.3f",area)) + " cm^2"
                    + "\nEl perímetro es : " + String.valueOf(String.format("%.3f",perimetro)) + " cm" );
        }

        else {
         if (rCuadrado.isChecked()){
             eLcuadrado.setError("Porfavor ingrese un dato para calcular!");
             eLcuadrado.requestFocus();
             tInfo.setText("");
             eLcubo.setText("");
             eRadio.setText("");
             eBase.setText("");

         }
         else   if (rCirculo.isChecked()){
             eRadio.setError("Porfavor ingrese un dato para calcular!");
             eRadio.requestFocus();
             tInfo.setText("");
             eLcubo.setText("");
             eLcuadrado.setText("");
             eBase.setText("");

         }
         else   if (rTriangulo.isChecked()){
             eBase.setError("Porfavor ingrese un dato para calcular!");
             eBase.requestFocus();
             tInfo.setText("");
             eLcubo.setText("");
             eRadio.setText("");
             eLcuadrado.setText("");

         }
         else   if (rCubo.isChecked()){
             eLcubo.setError("Porfavor ingrese un dato para calcular!");
             eLcubo.requestFocus();
             tInfo.setText("");
             eLcuadrado.setText("");
             eRadio.setText("");
             eBase.setText("");

         }


        }

     }






    }

