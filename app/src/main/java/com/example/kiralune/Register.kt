    package com.example.kiralune

    import android.content.Intent
    import android.os.Bundle
    import android.widget.Button
    import android.widget.CheckBox
    import android.widget.EditText
    import android.widget.RadioGroup
    import android.widget.Spinner
    import android.widget.Toast
    import androidx.appcompat.app.AppCompatActivity
    import com.example.kiralune.R

    class Register : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.register)

            val et_username: EditText = findViewById(R.id.et_username)
            val et_email: EditText = findViewById(R.id.et_email)
            val et_password: EditText = findViewById(R.id.et_password)
            val btn_daftar: Button = findViewById(R.id.btn_daftar)
            val btn_kembali: Button = findViewById(R.id.btn_kembali)
            val rg_gender: RadioGroup = findViewById(R.id.rg_gender)
            val cb_snk: CheckBox = findViewById(R.id.snk)
            val sp_domisili: Spinner = findViewById(R.id.sp_domisili)


            btn_daftar.setOnClickListener {
                val selectedJkId = rg_gender.checkedRadioButtonId

                val jenisKelamin = when (selectedJkId) {
                    R.id.pria -> "Pria"
                    R.id.wanita -> "Wanita"
                    else -> "Belum dipilih"
                }

                val setuju = cb_snk.isChecked

                val domisili = sp_domisili.selectedItem.toString()
                val domisiliPosition = sp_domisili.selectedItemPosition // <- Dapatkan posisinya

                if (domisiliPosition == 0) {
                    Toast.makeText(this, "Harap pilih domisili Anda!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(
                        this,
                        "Jenis Kelamin: $jenisKelamin, Setuju: $setuju, Domisili: $domisili",
                        Toast.LENGTH_LONG
                    ).show()
                }
                btn_kembali.setOnClickListener {
                    finish()
                }
            }
        }
    }