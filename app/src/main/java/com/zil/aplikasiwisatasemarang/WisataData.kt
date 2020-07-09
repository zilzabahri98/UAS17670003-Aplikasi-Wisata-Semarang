package com.zil.aplikasiwisatasemarang

object WisataData {
    private val wisataNames = arrayOf(
        "Kota Lama",
        "Candi Gedong Songo",
        "Simpang Lima",
        "Brown Canyon",
        "Citra Grand",
        "Puri Maerokoco",
        "Lawang Sewu",
        "Klenteng Sam Poo Kong",
        "Obyek Wisata Goa Kreo",
        "Desa Wisata Lembah Kalipancur"
    )
    private val wisataDetails = arrayOf(
        "Pusat kota perpaduan gaya Belanda & Indonesia abad ke-18 ini terawat dengan baik.",
        "Candi Gedong Songo adalah nama sebuah kompleks bangunan candi peninggalan budaya Hindu yang terletak di desa Candi, Kecamatan Bandungan, Kabupaten Semarang, Jawa Tengah, Indonesia tepatnya di lereng Gunung Ungaran. Di kompleks candi ini terdapat sembilan buah candi.",
        "Simpang Lima Semarang adalah sebuah lapangan yang berada di pusat kota Semarang dijalur nasional. Lapangan ini disebut juga Lapangan Pancasila. Simpang lima merupakan pertemuan dari lima jalan yang menyatu, yaitu Jl. Pahlawan, Jl. Pandanaran, Jl. Ahmad Yani, Jl. Gajah Mada dan Jl A Dahlan.",
        "Brown Canyon adalah sebuah bekas penambangan tanah di Meteseh, Tembalang, Semarang. Lokasi ini menjadi salah satu lokasi yang populer di Semarang dan dianggap mirip dengan Grand Canyon di Amerika Serikat. Kemiripan ini terletak pada bukit-bukit yang berubah menjadi tebing-tebing curam.",
        "CitraGrand Semarang merupakan persembahan dari Ciputra Group, developer terkemuka dengan berbagai proyek property di Indonesia dan mancanegara.",
        "Puri Maerokoco atau sering disebut Taman Mini Jawa Tengah Indah adalah sebuah objek wisata yang berada di Jalan Yos Sudarso Semarang kurang lebih 5 Km dari Tugu Muda, adalah salah satu bagian taman dari kawasan PRPP Jawa Tengah.",
        "Lawang Sewu adalah landmark di Semarang, Jawa Tengah, Indonesia, yang dibangun sebagai kantor pusat Perusahaan Kereta Api Hindia Belanda. Bangunan era kolonial terkenal sebagai rumah berhantu dan lokasi syuting, meskipun pemerintah kota Semarang telah berusaha mengubah citra itu.",
        "Kompleks kelenteng bersejarah dengan arsitektur khas penduduk Tionghoa & Jawa yang tradisional.",
        "Goa Kreo adalah objek wisata yang terdapat di Kota Semarang. Gua Kreo merupakan Gua yang terbentuk oleh alam dan terletak di tengah-tengah Waduk Jatibarang, sebuah bendungan yang membendung Kali Kreo.",
        "Cocok untuk anak-anak."
        )
    private val wisataImage = intArrayOf(
        R.drawable.kotalama,
        R.drawable.gedong9,
        R.drawable.simpang5,
        R.drawable.brown,
        R.drawable.citragrand,
        R.drawable.maerokoco,
        R.drawable.lawangsewu,
        R.drawable.klenteng,
        R.drawable.jatibarang,
        R.drawable.kalipancur
    )
    private val wisataRating = floatArrayOf(
        4.4f, 4.4f, 4.5f, 4.2f, 4.4f, 4.2f, 4.1f, 4.0f, 4.4f, 4.1f
    )
    private val wisataHargaTiket = arrayOf(
        "Parkir = Rp.2000,-",
        "Rp.10000,-",
        "Parkir = Rp.2000,-",
        "Parkir = Rp.3000,-",
        "Parkir = Rp.2000,- Bianglala = Rp.10000,-",
        "Rp.8000",
        "Rp.5000 - Rp.10000,-",
        "Rp.7000,-",
        "Rp.10000,-",
        "Parkir = Rp.3000,-"
    )
    private val wisataAlamat = arrayOf(
        "Old Town, Bandarharjo, North Semarang, Semarang City, Central Java 50175.",
        "Dsn Darum, Krajan, Candi, Kec. Bandungan, Semarang, Jawa Tengah 50614",
        "Jl. Simpang Lima, Pleburan, Kec. Semarang Sel., Kota Semarang, Jawa Tengah 50241",
        "Rowosari, Kec. Tembalang, Kota Semarang, Jawa Tengah 50279",
        "Ruko Amsterdam B3-B5, CitraGrand Boulevard, Jl. Kompol R Soekanto, Sambiroto, Kec. Tembalang, Kota Semarang, Jawa Tengah 50271",
        "Jl. Puri Anjasmoro, Tawangsari, Kec. Semarang Bar., Kota Semarang, Jawa Tengah 50114",
        "Jl. Pemuda, Sekayu, Kec. Semarang Tengah, Kota Semarang, Jawa Tengah 50132",
        "Jl. Simongan No.129, Bongsari, Kec. Semarang Bar., Kota Semarang, Jawa Tengah 50148",
        "Jl. Raya Goa Kreo, Kandri, Kec. Gn. Pati, Kota Semarang, Jawa Tengah 50222",
        "Jl. Raya Kalipancur Manyaran, Kalipancur, Kec. Ngaliyan, Kota Semarang, Jawa Tengah 50183"
    )
    private val wisataBuka = arrayOf(
        "Setiap Hari (24 Jam)",
        "Setiap Hari (06.03- 18.00 WIB)",
        "Setiap Hari (24 Jam)",
        "Setiap Hari (07.00 - 17.00 WIB)",
        "Setiap Hari (08.00 - 17.00 WIB)",
        "Setiap Hari (07.00 - 19.00 WIB)",
        "Setiap Hari (07.00 - 21.00 WIB)",
        "Setiap Hari (08.00 - 20.00 WIB)",
        "Setiap Hari (07.00 - 16.00 WIB)",
        "Setiap Hari (09.00 - 20.00 WIB)"
    )
    val listData: ArrayList<Wisata>
        get() {
            val list = arrayListOf<Wisata>()
            for (position in wisataNames.indices) {
                val wisata = Wisata()
                wisata.name = wisataNames[position]
                wisata.alamat = wisataAlamat[position]
                wisata.buka = wisataBuka[position]
                wisata.hargaTiket = wisataHargaTiket[position]
                wisata.photo = wisataImage[position]
                wisata.rating = wisataRating[position]
                wisata.detail = wisataDetails[position]
                list.add(wisata)
            }
            return list
        }
}