class Tarea {
    var descripcion=""
    var completado=false
    var nombre= ""



    fun tarea(args: Array<String>) {

    }

    fun switch() {
        if (completado == true) {
            completado = false
        } else {
            completado = true
        }
    }

    fun asignarNombre(nuevoNombre:String){
        nombre= nuevoNombre
    }

    fun asignarDescripcion(nuevaDescripcion:String){
        descripcion= nuevaDescripcion}


    override fun toString() :String{
        var formato="Nombre: \n"+nombre+"\n"+"Decripcion:\n"+ descripcion+"\n"
        return formato
    }
}
