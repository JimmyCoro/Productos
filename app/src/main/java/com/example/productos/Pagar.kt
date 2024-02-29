package com.example.productos
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Pagar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagar)

        val Prod1:TextView = findViewById(R.id.Prod1)
        val Num1:TextView = findViewById(R.id.Num1)
        val Uni1:TextView = findViewById(R.id.Uni1)
        val Tot1:TextView = findViewById(R.id.Tot1)
        val Prod2:TextView = findViewById(R.id.Prod2)
        val Num2:TextView = findViewById(R.id.Num2)
        val Uni2:TextView = findViewById(R.id.Uni2)
        val Tot2:TextView = findViewById(R.id.Tot2)

        val Prod3:TextView = findViewById(R.id.Prod3)
        val Num3:TextView = findViewById(R.id.Num3)
        val Uni3:TextView = findViewById(R.id.Uni3)
        val Tot3:TextView = findViewById(R.id.Tot3)

        val Prod4:TextView = findViewById(R.id.Prod4)
        val Num4:TextView = findViewById(R.id.Num4)
        val Uni4:TextView = findViewById(R.id.Uni4)
        val Tot4:TextView = findViewById(R.id.Tot4)

        val pTotal:TextView = findViewById(R.id.PTotal)

        val P1 = intent.getSerializableExtra("P_Extra1") as Producto
        val valor1:Double = P1.precio * P1.cantidad
        Prod1.setText(P1.nombre)
        Num1.setText(P1.cantidad.toString())
        Uni1.setText(P1.precio.toString())
        Tot1.setText(valor1.toString())

        val P2 = intent.getSerializableExtra("P_Extra2") as Producto
        val valor2:Double = P2.precio * P2.cantidad
        Prod2.setText(P2.nombre)
        Num2.setText(P2.cantidad.toString())
        Uni2.setText(P2.precio.toString())
        Tot2.setText(valor2.toString())

        val P3 = intent.getSerializableExtra("P_Extra3") as Producto
        val valor3:Double = P3.precio * P3.cantidad
        Prod3.setText(P3.nombre)
        Num3.setText(P3.cantidad.toString())
        Uni3.setText(P3.precio.toString())
        Tot3.setText(valor3.toString())


        val P4 = intent.getSerializableExtra("P_Extra4") as Producto
        val valor4:Double = P4.precio * P4.cantidad
        Prod4.setText(P4.nombre)
        Num4.setText(P4.cantidad.toString())
        Uni4.setText(P4.precio.toString())
        Tot4.setText(valor4.toString())

        val Pfinal:Double = Tot1.text.toString().toDouble()+Tot2.text.toString().toDouble()+Tot3.text.toString().toDouble()+Tot4.text.toString().toDouble()
        pTotal.setText(Pfinal.toString())


    }
}