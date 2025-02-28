package akira.erick.com.cadastro

data class Form(
    val nome : String,
    val telefone : String,
    val email : String,
    val emailLista : Boolean,
    val sexo : String,
    val cidade : String,
    val uf : String
){
    override fun toString(): String {
        return "Form(nome='$nome', telefone='$telefone', email='$email', emailLista=$emailLista, sexo='$sexo', cidade='$cidade', uf='$uf')"
    }
}
