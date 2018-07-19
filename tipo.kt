class Tipo{
    fun tipo(args: Array<String>){}


var misTareas: ArrayList<Tarea> = ArrayList()

fun verTareas(){
    for (x in misTareas){
        print(x)
    }
}

fun agregarTarea(){
    val tareas= Tarea()
    print("Ingrese el nombre de la tarea")
    var nuevoNombre= readLine()
    nuevoNombre = nuevoNombre.toString()
    tareas.asignarNombre(nuevoNombre)

//    val nuevaDescripcion=""
//    print("Ingrese la descripcion de la tarea")
//    nuevaDescripcion= readLine()
//    nuevaDescripcion = nuevaDescripcion.toString()
//    tareas.asignarNombre(nuevoNombre)
//    misTareas.add(tareas)

}

fun quitarTarea(x:Tarea){
    misTareas.remove(x)

}}