package com.example.boatardeturma

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    var cont=0
    lateinit var texto: TextView
    lateinit var animacaoFogos: LottieAnimationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        texto=findViewById<TextView>(R.id.textView2)
        animacaoFogos = findViewById<LottieAnimationView>(R.id.animacaoFogos)

    }

    fun clicaBt(v:View){

        if (cont<60){
            cont=cont+10
        }else{
            cont=cont+1
        }
        texto.text=""+cont
        if(cont==67){
            val boatarde= findViewById<TextView>(R.id.textView)
            animacaoFogos.visibility= View.VISIBLE
            // Reinicia a animação caso ela já tenha tocado
            animacaoFogos.cancelAnimation()

            // Dá o play macho
            animacaoFogos.playAnimation()
            boatarde.visibility= View.INVISIBLE
        }
    }
}