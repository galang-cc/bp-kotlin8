package tugas8

class orangTua : penghuni() {
    var hobi: String =""

    fun hobi(){
        println("hobi Ayah saya adalah $hobi")
    }

    override fun perkenalan() {
        println("Nama orang saya $nama, beliau bekerja sebagai $kerja, umur beliau $umur")
    }
}