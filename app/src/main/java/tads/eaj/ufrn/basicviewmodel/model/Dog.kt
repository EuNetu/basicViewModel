package tads.eaj.ufrn.basicviewmodel.model

class Dog (var raca : String, var idade: String){
    var idadeAux = (this.idade).toInt()

    fun envelhecer(){
        this.idade = (++this.idadeAux).toString()
    }
}