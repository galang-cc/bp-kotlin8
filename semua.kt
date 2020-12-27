package tugas8

fun main(){
    val galang = peliharaan ()
    galang.nama = "Galang Aji Pangestu"
    galang.umur = 20
    galang.kerja = "Mahasiswa"
    galang.suka = "Fotografi"
    galang.kampus = "AMIKOM"
    galang.prodi = "Sistem Informasi"
    galang.hewan = "Kucing"
    galang.perkenalan()
    galang.kesukaan()
    galang.kuliah()
    galang.pet()
    println()

    val ayah = orangTua()
    ayah.nama = "Suprapto"
    ayah.umur = 50
    ayah.kerja = "Wiraswasta"
    ayah.hobi = "Merawat tanaman"
    ayah.perkenalan()
    ayah.hobi()
    println()

    val omah = kolamIkan()
    omah.luas = "150 meter persegi"
    omah.jumlah = 2
    omah.home()
    omah.alamat = "Grabag"
    omah.lokasi()
    omah.bagian = "keluarga"
    omah.kegiatan = "Bersantai"
    omah.kebiasaan()
    omah.ikan = "Koi"
    omah.isi()
    omah.tanaman = "Celosia"
    omah.tanam()
}