package tugas8

open class ruangKeluarga : lokasiRumah() {
    var bagian: String =""
    var kegiatan: String = ""

    fun kebiasaan() {
        println("Terdapat ruangan $bagian, untuk kegiatan $kegiatan")
    }
}