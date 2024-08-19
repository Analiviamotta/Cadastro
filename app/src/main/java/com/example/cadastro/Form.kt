package com.example.cadastro

class Form (var name: String,
var phone: String, var email: String, var emailCb: Boolean, var gender: String, var city: String, var uf: String){

    override fun toString(): String {
        return """
        Dados(
            name='$name' |
            phone='$phone' |
            email='$email' |
            emailCb=$emailCb |
            gender='$gender' |
            city='$city' |
            uf='$uf'
        )
    """.trimIndent()
    }
}