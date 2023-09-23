package com.ieseljust.pmdm.comptador


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ieseljust.pmdm.comptador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var comptador=0
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Restaurar el valor del contador si existe un estado guardado
        if (savedInstanceState != null) {
            comptador = savedInstanceState.getInt("comptador", 0)
        }

        // Inicializar el TextView con el valor del contador
        binding.textViewComptador.text = comptador.toString()

        // Referencia al botón
        val btAdd = binding.btAdd
        val btReset = binding.btReset
        val btResta = binding.btResta

        // Asociar una expresión lambda como respuesta al evento Clic sobre el botón
        btAdd.setOnClickListener {
            comptador++
            binding.textViewComptador.text = comptador.toString()
        }

        btResta.setOnClickListener {
            if (comptador > 0){
                comptador--
            }
            binding.textViewComptador.text = comptador.toString()
        }

        btReset.setOnClickListener {
            comptador = 0
            binding.textViewComptador.text = comptador.toString()
        }

        // Registro de log en onCreate
        Log.d(TAG, "onCreate")

    }

    // Correcto
    override fun onStart() {
        super.onStart()
        // Registro de log en onStart
        Log.d(TAG, "onStart")
    }

    // Correcto
    override fun onResume() {
        super.onResume()
        // Registro de log en onResume
        Log.d(TAG, "onResume")
    }

    // Correcto
    override fun onPause() {
        super.onPause()
        // Registro de log en onPause
        Log.d(TAG, "onPause")
    }

    // Correcto
    override fun onStop() {
        super.onStop()
        // Registro de log en onStop
        Log.d(TAG, "onStop")
    }

    // Correcto
    override fun onRestart() {
        super.onRestart()
        // Registro de log en onRestart
        Log.d(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        // Registro de log en onDestroy
        Log.d(TAG, "onDestroy")
    }

    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("comptador", comptador)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        comptador = savedInstanceState.getInt("comptador", 0)
    }
}