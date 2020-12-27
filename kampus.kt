package tugas8

open class sekolah : anak() {
    var kampus: String = ""
    var prodi: String = ""

    fun kuliah(){
        println("Saya kuliah di $kampus, prodi $prodi")
    }
}