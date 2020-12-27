package tugas8

 open class anak : penghuni() {
    var suka: String = ""

    open fun kesukaan(){
        println("Saya suka $suka")
    }

    override fun perkenalan() {
        println("Nama saya $nama, saya adalah seorang $kerja, umur saya $umur")
    }

 }