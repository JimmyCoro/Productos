package com.example.productos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import java.io.Serializable

data class Producto(val nombre:String, val stock:Int, val precio:Double, var cantidad:Int): Serializable

class MainActivity : AppCompatActivity() {


        //nombre   stock   precio
        val P1= Producto("Mouse", 10, 4.50, 0)
        val P2 = Producto("Teclado", 8, 18.0, 0)
        val P3 = Producto("Monitor", 5, 60.0, 0)
        val P4 = Producto("Camara Web", 7, 8.0, 0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvArt1:TextView = findViewById(R.id.tvArt1)
        val tvprecio1:TextView = findViewById(R.id.tvprecio1)
        val tvStock1:TextView = findViewById(R.id.tvStock1)
        val tvArt2:TextView = findViewById(R.id.tvArt2)
        val tvprecio2:TextView = findViewById(R.id.tvprecio2)
        val tvStock2:TextView = findViewById(R.id.tvStock2)
        val tvArt3:TextView = findViewById(R.id.tvArt3)
        val tvprecio3:TextView = findViewById(R.id.tvprecio3)
        val tvStock3:TextView = findViewById(R.id.tvStock3)
        val tvArt4:TextView = findViewById(R.id.tvArt4)
        val tvprecio4:TextView = findViewById(R.id.tvprecio4)
        val tvStock4:TextView = findViewById(R.id.tvStock4)
        val ibMas1:ImageButton = findViewById(R.id.btnMas1)
        val ibMenos1:ImageButton = findViewById(R.id.btnMenos1)
        val ibMas2:ImageButton = findViewById(R.id.btnMas2)
        val ibMenos2:ImageButton = findViewById(R.id.btnMenos2)
        val ibMas3:ImageButton = findViewById(R.id.btnMas3)
        val ibMenos3:ImageButton = findViewById(R.id.btnMenos3)
        val ibMas4:ImageButton = findViewById(R.id.btnMas4)
        val ibMenos4:ImageButton = findViewById(R.id.btnMenos4)
        val tvCant4:TextView = findViewById(R.id.tvCant4)
        val tvCant3:TextView = findViewById(R.id.tvCant3)
        val tvCant2:TextView = findViewById(R.id.tvCant2)
        val tvCant1:TextView = findViewById(R.id.tvCant1)
        val btnPagar:Button = findViewById(R.id.btnPagar)


        tvArt1.setText(P1.nombre)
        tvprecio1.setText(P1.precio.toString())
        tvStock1.setText(P1.stock.toString())
        tvArt2.setText(P2.nombre)
        tvprecio2.setText(P2.precio.toString())
        tvStock2.setText(P2.stock.toString())
        tvArt3.setText(P3.nombre)
        tvprecio3.setText(P3.precio.toString())
        tvStock3.setText(P3.stock.toString())
        tvArt4.setText(P4.nombre)
        tvprecio4.setText(P4.precio.toString())
        tvStock4.setText(P4.stock.toString())

        ibMas1.setOnClickListener {
            var aux1 = tvCant1.text.toString().toInt()
            aux1=aux1+1
            tvCant1.setText(aux1.toString())
        }
        ibMenos1.setOnClickListener {
            var aux1 = tvCant1.text.toString().toInt()
            if (aux1>0){
                aux1=aux1-1
                tvCant1.setText(aux1.toString())
            }
        }

        ibMas2.setOnClickListener {
            var aux2 = tvCant2.text.toString().toInt()
            aux2=aux2+1
            tvCant2.setText(aux2.toString())
        }
        ibMenos2.setOnClickListener {
            var aux2 = tvCant2.text.toString().toInt()
            if (aux2>0){
                aux2=aux2-1
                tvCant2.setText(aux2.toString())
           }
        }

        ibMas3.setOnClickListener {
            var aux3 = tvCant3.text.toString().toInt()
            aux3=aux3+1
            tvCant3.setText(aux3.toString())
        }
        ibMenos3.setOnClickListener {
            var aux3 = tvCant3.text.toString().toInt()
            if (aux3>0){
                aux3=aux3-1
                tvCant3.setText(aux3.toString())
            }
        }

        ibMas4.setOnClickListener {
            var aux4 = tvCant4.text.toString().toInt()
            aux4=aux4+1
            tvCant4.setText(aux4.toString())
        }
        ibMenos4.setOnClickListener {
            var aux4 = tvCant4.text.toString().toInt()
            if (aux4>0){
                aux4=aux4-1
                tvCant4.setText(aux4.toString())
            }
        }

        btnPagar.setOnClickListener {
            P1.cantidad = tvCant1.text.toString().toInt()
            P2.cantidad = tvCant2.text.toString().toInt()
            P3.cantidad = tvCant3.text.toString().toInt()
            P4.cantidad = tvCant4.text.toString().toInt()

            val intent = Intent(this, Pagar::class.java)
            intent.putExtra("P_Extra1", P1)
            intent.putExtra("P_Extra2", P2)
            intent.putExtra("P_Extra3", P3)
            intent.putExtra("P_Extra4", P4)





            startActivity(intent)

        }


    }
}


