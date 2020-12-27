package tugas8

open class lokasiRumah : rumah() {
    var alamat: String = ""

    fun lokasi(){
        println("Rumah saya terletak di $alamat")
    }
}