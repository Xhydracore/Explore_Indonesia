package com.dicoding.picodiploma.exploreindonesia

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import androidx.core.util.Pair as UtilPair

class MainActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //load wisata
            val wisataList = listOf(
            Wisata(
                R.drawable.mandalika,
                "Pantai Mandalika",
                "Nusa Tenggara Barat",
                "https://maps.app.goo.gl/aK57kjd1sKGyUMd66",
                "Mandalika, Surga Tersembuyi di Nusa Tenggara Barat\n" +
                        "Setelah Presiden Joko Widodo meresmikan Mandalika, Lombok, Nusa Tenggara Barat (NTB) sebagai Kawasan Ekonomi Khusus (KEK) pada bulan Oktober 2017 lalu dan berkat unggahan vlog Jokowi bersama Gubernur NTB di akun Instagram dan channel Youtube miliknya, kini destinasi wisata tersebut menjadi bahan perbincangan para penyuka kegiatan Traveling.\n" +
                        "Bagi sebagian wisatawan dalam negeri, nama Mandalika mungkin belum terdengar familiar. Masyarakat lebih mengenal Gili Trawangan, Gili Meno, atau Pantai Senggigi dibandingkan Mandalika. Padahal, kawasan ini tidak kalah cantik dengan destinasi wisata yang sekarang sudah tenar di Lombok.\n" +
                        "Perlu diketahui, KEK, atau Special Economic Zone (SEZ) adalah sebuah wilayah geografis yang memiliki peraturan ekonomi khusus. Peraturan di wilayah KEK biasanya lebih longgar ketimbang wilayah lainnya di suatu negara.\n" +
                        "Kelonggaran didapat terutama untuk perizinan membangun sebuah usaha. Tujuannya untuk menarik minat investasi sebanyak-banyaknya di wilayah tersebut.\n" +
                        "Selain Mandalika, pemerintah Indonesia memiliki 12 KEK, empat di antaranya merupakan KEK Pariwisata, antara lain Tanjung Kelayang, Bangka Belitung; Tanjung Lesung, Banten; dan Morotai, Maluku Utara.\n" +
                        "Kembali ke Mandalika. Nama Mandalika sendiri diambil dari cerita legenda masyarakat Sasak di Lombok tentang Putri Mandalika.\n" +
                        "Ceritanya, Putri Mandalika memilih mengorbankan dirinya ke laut agar tidak terjadi peperangan karena diperebutkan sejumlah pangeran yang hendak meminangnya. Putri itu konon menenggelamkan diri di Pantai Seger. Saat ini, wisatawan bisa melihat monumen Putri Mandalika di pantai itu.\n" +
                        "Berada di lahan seluas 1.034 hektar, KEK Mandalika memiliki lokasi yang sangat strategis. Mandalika berjarak sekitar satu jam perjalanan dari Bandara Internasional Lombok atau setengah jam perjalanan dari pusat kota Lombok.\n" +
                        "Sama seperti Bali yang sering dikunjungi turis mancanegara, Mandalika pun menyediakan banyak pilihan kendaraan yang bisa digunakan menuju ke Mandalika, mulai dari kendaraan umum sampai rental mobil.\n" +
                        "Pantainya yang berpasir putih halus dengan ombak yang menyapu tenang, sangat cocok bagi Anda yang ingin melepaskan penat dari hingar-bingar kemacetan kota besar.\n" +
                        "Di kawasan Mandalika terdapat deretan pantai indah, mulai dari Pantai Tanjung Aan, Pantai Serenting, Pantai Seger, Pantai Kuta, dan Pantai Gerupuk.\n" +
                        "Berbeda dengan Bali, di Mandalika wisatawan akan jarang menemukan bar atau kelab malam. Tak cuma Mandalika, di seluruh pulau nyaris tak bisa ditemukan bar dan kelab malam. Meski demikian, sejumlah tempat makan masih menjual bir untuk mengakmodir keinginan wisatawan mancanegara. Keriaan malam yang seru masih bisa ditemui di sekitaran hotel besar.\n" +
                        "Bagi yang ingin berburu oleh-oleh, Mandalika juga sudah menyediakan sejumlah toko yang berjejer di sepanjang kawasan Pantai Kuta. Pedangan ini menjajakan oleh-oleh khas Lombok, seperti kain tenun, kaus, gelang, hingga ikat kepala.\n" +
                        "Setiap tahunnya di bulan Februari atau Maret, di kawasan Mandalika terdapat acara Festival Bau Nyale. Festival ini berupa tradisi Suku Sasak yang menangkap cacing laut di Pantai Seger.\n" +
                        "Bagi Anda pemburu kuliner, di Kawasan Bukit Mandalika, Pantai Kuta Lombok, Desa Kuta Kecamatan Pujut Lombok Tengah, NTB ada beberapa makanan khas yang patut Anda cicipi. Di antaranya adalah ayam taliwang, ayam Rarang, sate rembiga dan sate bulayak. Olahan bumbu khas daerah Lombok akan memanjakan lidah dan menambah selera makan.\n"
            ),
                Wisata(
                    R.drawable.sumur_tiga,
                    "Pantai Sumurtiga",
                    "Sabang",
                    "https://maps.app.goo.gl/Dq97LvEp1RLYHgLd7",
                    "Objek wisata pantai Sumur Tiga merupakan pantai indah yang terletak di gampong Ie Meulee, Pulau Weh. Pantai yang berpasir putih ini dikenal dengan panorama alam yang begitu mempesona. Sebagai pantai yang ramai dikunjungi oleh wisatawan lokal dan mancanegara, pantai sumur tiga dilengkapi fasilitas pendukung  seperti diving dan snorkling, sehingga tak heran bila pantai ini banyak diminati oleh wisatawan lokal maupun wisatawan untuk memanjakan diri di pantai ini.\n" +
                            "Pantai Sumur Tiga berlokasi di pantai timur Pulau Weh atau sekira 15 menit dari Kota Sabang, tepatnya di Kecamatan Ie Meule, Sukajaya, Sabang, Pulau Weh, Provinsi Aceh. Konon kaatnya, asal muasal nama Pantai Sumur Tiga ini dikarenakan memiliki tiga sumur air tawar disana. Sehingga oleh sebab iu tempat itu dinamai dengan nama Pantai Sumur Tiga. Pantai Sumur Tiga memiliki karakteristik yang berbeda dengan Pantai Iboih atau pun Pantai Gapang. Pasir di Pantai Sumur Tiga lebih putih berkilau bak kristal dan lembut meskipun airnya sedikit berombak. Panorama pantainya membentangkan laut biru dipadu angin sepoi yang menggerakkan nyiur di pinggir pantai.\n" +
                            "Selain itu, Pantai yang jernih dengan air laut berwarna biru kehijauan adalah pemandangan yang sangat menenangkan jiwa. Pohon kelapa yang dihembuskan oleh angin laut pastinya akan membuai Anda saat rebahan di pasir pantai atau duduk di rerumputan dan bawah pohon kelapa. Sementara itu, dilokasi pantai ini juga terdapat situs sejarah peninggalan masa Jepang. Yaitu, banyaknya benteng sisa Pendudukan Jepang meski kurang terawat, namun benteng tersebut masih bisa kita temukan di wilayah pantai Sumur Tiga tersebut. Pantai Sumur Tiga bisa dikatakan sebagai surga untuk Anda yang suka melakukan aktivitas diving dan snorkling dan berselancar angin.\n"
                ),
                Wisata(
                    R.drawable.danau_toba,
                    "Danau Toba",
                    "Sumatra Utara",
                    "https://maps.app.goo.gl/iumrcV5k9gzAeLpF9",
                    "Danau Toba merupakan keajaiban alam menakjubkan di Pulau Sumatera. Sulit membayangkan ada tempat yang lebih indah untuk dikunjungi di Sumatera Utara selain danau ini. Suasana sejuk menyegarkan, hamparan air jernih membiru, dan pemandangan memesona pegunungan hijau adalah sebagian kecil saja dari imaji danau raksasa yang berada 900 meter di atas permukaan laut itu.\n" +
                            "Danau Toba adalah danau berkawah seluas 1.145 kilometer persegi. Di tengahnya berdiam sebuah pulau dengan luas yang hampir sebanding dengan luas negara Singapura. Danau Toba sebenarnya lebih menyerupai lautan daripada danau mengingat ukurannya. Oleh karena itu, Danau Toba ditempatkan sebagai danau terluas di Asia Tenggara dan terbesar kedua di dunia sesudah Danau Victoria di Afrika. Danau Toba juga termasuk danau terdalam di dunia yaitu sekira 450 meter.\n" +
                            "Danau Toba diperkirakan para ahli terbentuk setelah letusan gunung api super sekira 73.000-75.000 tahun lalu. Saat itu 2.800 km kubik bahan vulkanik dimuntahkan Gunung Toba yang meletus hingga debu vulkanik yang ditiup angin menyebar ke separuh wilayah Bumi. Letusannya terjadi selama 1 minggu dan lontaran debunya mencapai 10 kilometer di atas permukaan laut.\n" +
                            "Akibat letusan gunung api super  (Gunung Toba) diperkirakan telah menyebabkan kematian massal dan kepunahan beberapa spesies mahluk hidup. Letusan Gunung Toba telah menyebabkan terjadinya perubahan cuaca bumi dan mulainya masuk ke zaman es sehingga mempengaruhi peradaban dunia.\n" +
                            "Pulau Samosir adalah pulau yang unik karena merupakan pulau vulkanik di tengah Danau Toba. Ketinggiannya 1.000 meter di atas permukaan laut. Meskipun telah menjadi tempat tujuan wisata sejak lama, Samosir merupakan keindahan alam yang belum terjamah. Di tengah Pulau Samosir ini masih ada lagi dua danau indah yang diberi nama Danau Sidihoni dan Danau Aek Natonang. Daerah sekitar Danau Toba memiliki hutan-hutan pinus yang tertata asri. Di pinggiran Danau Toba terdapat beberapa air terjun yang sangat mempesona. Di sekitar Danau Toba juga akan Anda dapati tempat pemandian air belarang.\n" +
                            "Di Pulau Samosir Anda juga dapat menemukan pegunungan berkabut, air terjun yang jernih untuk berenang, dan masyarakat peladang. Keramahan masyarakat Batak pun akan memikat Anda karena kemanapun Anda pergi maka dengan segera dapat menemukan teman baru.\n" +
                            "Di Kota Parapat yang merupakan semenanjung yang menonjol ke danau Anda dapat Anda nikmati pemandangan spektakuler Danau Toba. Parapat dihuni masyarakat Batak Toba dan Batak Simalungan yang dikenal memiliki sifat ceria dan mudah bergaul, terkenal pula senang mendendangkan lagu bertema cinta yang riang namun penuh perasaan.\n"
                ),
                Wisata(
                    R.drawable.ngarai_sianok,
                    "Ngarai Sianok",
                    "Bukittinggi",
                    "https://maps.app.goo.gl/92W4SEZVY58nHHNV8",
                    "Ngarai Sianok, biasa menjadi menu utama saat mengunjungi Bukittinggi, Sumatera Barat. Ngarai Sianok, berada di Desa Sianok, Kota Bukittinggi, Kabupaten Agam, Sumatera Barat. Keindahannya kondang sampai ke  mancanegara, bahkan disetarakan dengan Grand Canyon di Amerika Serikat. Ngarai Sianok memiliki kedalaman 100 m dan panjang kurang lebih 15 km dengan lebar 200 m.  Memanjang di selatan Ngarai Koto Gadang sampai Ngarai Sianok Enam Suku hingga Palupuh.\n" +
                            "Ngarai Sianok terbentuk karena adanya pergerakan patahan bumi. Patahannya terbentuk memanjang dan berkelok-kelok dari selatan ngarai Koto Gadang sampai ke nagari Sianok Anam Suku dan berakhir di Palupuh. Patahan memanjang atau biasa disebut patahan Semangko ini membentuk dinding curam, tegak lurus dengan lembah dan aliran sungai. Dalam bahasa Minangkabau, aliran sungai dengan air jernih tersebut disebut Batang Sianok.\n" +
                            "Pada masa kolonial Belanda, tempat ini disebut dengan Karbouwengat atau Kerbau Sanget, karena tumbuhan dan padang rumput tumbuh subur dan banyak kerbau liar di dasar ngarai ini.\n" +
                            "\n" +
                            "Surganya Flora dan Fauna Liar\n" +
                            "Di dasar Ngarai Sihanok selain aliran sungai Batang Sianok yang jernih, tumbuhan subur membentuk hutan. Tempat ini menjadi lokasi yang aman buat satwa dan fauna liar hidup bergantung. Keberadaan satwa dan fauna liar seakan melengkapi keindahan Ngarai Sianok. Beberapa satwa liar yang bisa ditemui di sepanjang aliran Batang Sianok  diantaranya Siamang atau monyet ekor panjang, tapir rusia, rusa, macan tutul dan babi hutan.\n" +
                            "Selain satwa, flora yang tumbuh pun beraneka jenisnya. Yang paling istimewa, banyaknya tumbuhan Raflesia yang bisa ditemui di tempat ini. Bahkan tumbuhan yang punya manfaat untuk obat-obatan juga banyak ditemuai.\n" +
                            "Menikmati Hamparan Ngarai Sianok\n" +
                            "Kita bisa melihat dan mengagumi bentang alam Ngarai Sianok melalui dua titik lokasi. Lokasi pertama adalah Taman Panorama di tengah kota Bukittinggi. Di sini bisa melihat keindahan Ngarai Sianok dari ketinggian.  Tidak hanya pemandangan tebing curam, lekukan aliran Batang Sianok yang dikelilingi hijaunya hutan tetapi juga menikmati suara burung-burung liar yang  bebas terbang, menambah kesempurnaan keindahan lokasi wisata ini.\n" +
                            "Dan jika masih kurang puas,  bisa melanjutkan perjalanan menuju lembah. Hanya saja untuk menuju lokasi ini butuh sedikit perjuangan untuk  melintasi jalan menurun terjal.  Tapi jangan khawatir, semua itu akan terbayarkan dengan melihat indahnya Ngarai dari bawah dan menikmati udara segar hutan dan suara gemericik air sungai yang menentramkan hati.\n"
                ),
                Wisata(
                    R.drawable.kepulauan_anambas,
                    "Kepulauan Anambas",
                    "Kepulauan Riau",
                    "https://maps.app.goo.gl/Joi4dB8n7YkHiCi39",
                    "Anambas.  Mungkin masih terasa asing di telinga para pelancong karena pulau ini kesannya kalah pamor dengan pulau yang berada di sisi baratnya, yaitu Natuna.  Namun perbincangan akrab di Tanjung Pinang dengan beberapa rekan mengulik keingintahuan saya dan berminat besar berkunjung ke pulau Anambas. Lokasinya masih sangat sepi dan cocok untuk Sobat Pesona yang ingin menikmati suasana pantai yang tenang dan tak banyak orang.\n" +
                            "Menuju Ibukota Tarempa\n" +
                            "Bandara Matak berada di Pulau Palmatak dan Kota Tarempa sebagai ibukota Kepulauan Anambas berada di Pulai Siantan, maka kita harus naik angkutan menuju Pelabuhan selama 10 menit. Dari pelabuhan dilanjutkan dengan naik speed boat berkapasitas 7 orang melaju 20 menit menuju pelabuhan Tarempa.\n" +
                            "Di sini, saya sungguh penasaran dengan keindahan alam, budaya serta kehidupan keseharian pulau Anambas. Berikut kisah saya di Anambas, pulau yang damai dengan segala keistimewaannya dan lokasi-lokasi yang wajib dikunjungi jika Sobat Pesona ke Anambas. Apa saja, ya?\n" +
                            "1. Batu Timpak Tiga\n" +
                            "Batu ini unik bersusun tiga dengan alur-alur di bebatuannya, seolah seperti disusun bertingkat tiga, dari kejauhan saat mendekati pulau Siantan sudah terlihat, hingga tiga batu saling tumpang ini menjadi salah satu ikon pulau Siantan di kota Tarempa\n" +
                            "2. Air Terjun Temburun\n" +
                            "Air terjun ini masih terletak di Pulau Siantan di Desa Temburun, Kecamatan Siantan Selatan. Air terjun Temburun memiliki tujuh tingkatan dan dari tingkat paling atas kita bisa melihat pemandangan laut dan laguna yang begitu jelas. Bisa ditempuh dengan berjalan kaki atau naik kendaraan roda dua atau empat selama 25 menit, atau bisa juga dengan berjalan kaki dengan kondisi medan mendaki, bahkan hampir kemiringan 45 derajat, karena air terjun Temburun ini berada di ketinggian 200 mdpl.\n" +
                            "Hanya 30 menit saya sudah tiba di lokasi air terjun Temburun, dari kejauhan tampak air terjun yang airnya langsung mengalir ke laut diantara bebatuan, indah sekali, rasanya tak sabar ingin segera berenang saja dan bermain di dekat air terjunnya. \n" +
                            "3. Pulau Penjalin\n" +
                            "Pulau ini merupakan pulau terluar Indonesia yang berbatasan dengan Malaysia, Singapura dan Vietnam. Meski terluar, keindahan Pulau Penjalin salah satu yang terindah di Anambas.\n" +
                            "Keelokan pantainya dengan bebatuan besar dan lebar yang menjadi ciri khas morfologi alam di kepulauan Riau seperti di Belitung dan Bangka, pantai putih bersih, air laut yang tenang karena bentuk pantai seperti teluk sehingga aman untuk berenang dan bermain di airnya. Gradasi air laut yang biru tosca melengkapi keindahan Pulau Penjalin.\n" +
                            "4. Pantai Tanjung Momong\n" +
                            "Menikmati sunset di Pantai Tanjung Momong adalah kegiatan saya di hari berikutnya. Ada baiknya datang saat sore hari ya ke pantai Momong, agar tidak terlalu terik, karena memanjakan mata dengan menyaksikan matahari terbenam di sini adalah pilihan yang tepat.\n" +
                            "Ombak pantainya tenang, jangan ragu untuk bermain di airnya, sepanjang mata memandang hanya ketenangan yang dirasa, duduk sambil sesekali memecah kan kaki di air laut di tepi jembatan kayu. Rasakan kesegaran udara laut.\n" +
                            "Masih banyak tempat-tempat menarik lainnya, yang bisa dikunjungi apabila waktu kunjungan cukup lama. Di Anambas juga ada Vihara Gunung Dewa Siantan, Tugu burung hantu dan paling jauh adalah Pulau Banyak yang saat ini dikenal sebagai “Maldives-nya” Kepulauan Riau.\n"
                ),
                Wisata(
                    R.drawable.sungai_kampar,
                    "Sungai Kampar",
                    "Riau",
                    "https://maps.app.goo.gl/HkbZERv3FZbdzByz6",
                    "Jika kita bicara ombak maka asosiasi kita akan langsung tertuju pada laut. Tapi di Pelalawan, Riau, kita bisa mendapati sebuah ombak yang tidak biasanya. Ini karena ombak yang ada muncul di sebuah perairan sungai. Ombak Sungai Kampar atau juga disebut Bono dalam bahasa setempat memang sangat unik dan menarik. Bahkan karena keunikannya ombak besar yang muncul di sini telah menjadi sebuah destinasi wisata dan juga spot surfing atau berselancar.\n" +
                            "Fenomena munculnya ombak besar di sungai memang tidak lazim dan merupakan hal yang aneh. Keanehan ombak di Sungai Kampar juga membuat beberapa orang menghubungkan dengan hal gaib dan mistis. Padahal secara keilmuan, munculnya ombak di Sungai Kampar ini bisa dijelaskan secara ilmiah. Jadi secara ilmiah ombak (gelombang bono) di Sungai Kampar ini muncul karena masuknya arus laut yang sedang pasang masuk ke sungai dan arus sungai yang kencang menuju laut. Dari pertemuan kedua arus ini terjadilah benturan yang kemudian menghasilkan ombak besar.\n" +
                            "Ombak atau gelombang bono yang muncul di Sungai Kampar ini akan semakin besar jika bagian hulu sungai terjadi hujan deras serta juga air laut yang mengalami pasang besar (bulan besar). Maka bila Anda ingin menjumpai ombak bono yang besar di Sungai Kampar datanglah pada musim penghujan yang biasanya terjadi pada bulan November dan Desember.\n" +
                            "Meskipun sudah dijelaskan secara ilmiah, masih banyak masyarakat yang meyakini adanya hal mistis dari munculnya ombak di Sungai Kampar ini. Banyak warga yang beranggapan bahwa ombak bono merupakan perwujudan dari 7 (tujuh) hantu yang sering menghancurkan sampan maupun kapal. Bahkan kapal-kapal Belanda pun dahulu sangat kesulitan dan bahkan karam saat masuk ke Kuala Kampar.\n" +
                            "Bagi beberapa masyarakat, untuk bisa melewati ombak bono ini diharuskan melakukan upacara semah agar selamat. Tapi saat ini masyarakat pun sudah semakin tersadarkan bahwa ombak bono adalah peristiwa alam biasa. Bahkan banyak dari mereka yang memanfaatkan ombak bono untuk kegiatan surfing atau selancar yang seru dan mengasyikkan.\n" +
                            "Jika kamu suka berselancar, maka jangan lewatkan untuk berwisata ke Sungai Kampar, Riau! Sungai ini terkenal memiliki ombak yang cukup menantang setinggi 6 meter.\n" +
                            "Berdasarkan kriteria tersebut, sungai yang berada di Teluk Meranti, Kabupaten Pelalawan, Riau ini merupakan destinasi yang cocok untuk para adrenalin junkie. Siap menaklukkan ombaknya? Agendakan segera!\n"
                ),
                Wisata(
                    R.drawable.museum_sultan,
                    "Museum Sultan Mahmud Badaruddin II",
                    "Palembang",
                    "https://maps.app.goo.gl/BGtTGYMG8mKVBVX67",
                    "Museum Sultan Badaruddin II berada di Jl. Sultan Mahmud Badaruddin, 19 Ilir Kecamatan Bukit Kecil, Palembang. Tak lengkap rasanya kunjungan kita ke Palembang tanpa mengunjungi museum ini.\n" +
                            "Isi Museum Sultan Badaruddin II merupakan koleksi artefak dan benda-benda arkeologi. Ada pula koleksi keramik-keramik kuno, barang seni rupa, koleksi diorama, dan benda-benda sains biologi.\n" +
                            "Hingga 2013 tercatat ada 669 buah koleksi Museum Sultan Badaruddin II. Beberapa barang merupakan peninggalan kerajaan Kesultanan Palembang, lainnya adalah koleksi dari berbagai daerah di Sumatera Selatan.\n" +
                            "Salah satu yang paling menarik di museum Sultan Badaruddin II ini adalah koin Kesultanan Palembang yang masih lengkap, tersusun rapi dan terawat dengan baik. Koleksi koin tersebut berurutan dari 1023 Hijriah, hingga 1253 Hijriah.\n" +
                            "Bentuknya bulat dengan lubang di tengah dan terbuat dari timah serta perunggu. Koin ini berfungsi sebagai uang dan dipakai dalam transaksi perdagangan atau membayar pajak pada Kerajaan Mataram.\n" +
                            "Selain koin, tahta Kesultanan Palembang juga ada di museum ini. Tahta indah berwarna dominan emas dengan kombinasi merah dan hitam ini merupakan salah satu koleksi terbaik Museum Sultan Mahmud Badaruddin II.\n" +
                            "Kita bisa berfoto di dekat tahta ini, tapi tidak diperkenankan untuk duduk di atasnya. Koleksi dari Kesultanan Palembang lainnya adalah senjata tradisional, pakaian, peralatan khitan anak sultan, dan kerajinan.\n" +
                            "Bagi Sobat Pesona yang memiliki ketertarikan pada bidang arkeologi dan biologi, maka isi museum Sultan Badaruddin II dapat memuaskan rasa penasaran. Pasalnya, di sana terdapat artefak dan peninggalan sejarah lainnya, mulai dari zaman Sriwijaya. Misalnya, patung Buddha dan Ganesha. Patung-patung tersebut terletak di beberapa tempat di taman Museum Sultan Badaruddin II.\n" +
                            "\n" +
                            "Sejarah Museum Sultan Badaruddin II\n" +
                            "Museum ini memiliki gedung yang bersejarah dan ternyata masih berbentuk sama dengan bangunan asalnya. Hanya sekali mengalami renovasi bentuk di tahun 1920 dengan menambahkan lebih banyak kaca. Selebihnya, masih berbentuk gedung lama yang antik. Arsitekturnya merupakan perpaduan antara gaya Eropa dan bentuk tradisional rumah adat Sumatera Selatan.\n" +
                            "Gedung Museum Sultan Badaruddin II tadinya merupakan rumah residen kolonial yang dibangun pada abad ke 19, tepatnya pada tahun 1823. Sebelumnya, lokasi ini adalah Kuta Lama, istana Sultan Mahmud Badaruddin I yang memerintah pada tahun 1724 hingga 1758.\n" +
                            "Pemerintah kolonial Inggris menghancurkan istana tersebut pada tanggal 7 Oktober 1823 sebagai gerakan politik untuk menghapus Kesultanan Palembang. Segera setelah penghancuran istana Kuta Lama, dibangunlah gedung baru di atasnya. Bangunan pertama selesai pada tahun 1824, dan bangunan kedua selesai pada tahun 1825.\n" +
                            "Gedung tersebut digunakan sebagai markas pasukan Jepang saat negara tersebut menjajah Indonesia pada Perang Dunia II. Lalu sempat dijadikan markas besar TNI (Kodam II Sriwijaya) sebelum akhirnya diserahkan kembali pada pemerintah Sumatera Selatan. Setelah beberapa kali beralih fungsi sejak dibangunnya, gedung tersebut akhirnya dijadikan sebuah museum pada tahun 1984.\n" +
                            "Dari kisah sejarah di atas, Sobat Pesona bisa mengetahui bahwa museum ini dipenuhi oleh sejarah yang kental. Bahkan gedungnya sendiri juga merupakan sebuah bangunan bersejarah. Isi Museum Sultan Badaruddin sendiri langsung mulai dilengkapi pada tahun yang sama dengan tahun peresmiannya, dan terus bertambah hingga saat ini.\n"
                ),
                Wisata(
                    R.drawable.fort_marlborough,
                    "Fort Marlborough",
                    "Bengkulu",
                    "https://maps.app.goo.gl/GVS2XycM3Uq9iDDbA",
                    "Jika ke Bengkulu, silahkan berkunjung ke Benteng Marlborough yang berlokasi di Jalan Ahmad Yani. Mengapa? Karena kisah Benteng yang dibangun East Indies Company (EIC) tahun 1713 ini sangat luar biasa.  Hubungan rakyat Bengkulu dengan Inggris (EIC) sudah berjalan sejak abad ke-17. Namun pada 1682,  Belanda (VOC) mampu mengungguli Inggris, khususnya setelah tercapai kesepakatan dengan kerajaan Banten mengenai monopoli perdagangan rempah-rempah. Hal ini memaksa Inggris keluar dari Jawa dan harus mencari tempat pangkalan baru. Akhirnya pilihan jatuh kepada Bengkulu.\n" +
                            "Pada 1685, didirikanlah Pangkalan Fort York setelah memperoleh izin untuk menjalin hubungan dagang dengan para penguasa Bengkulu. Selang 30 tahun kemudian, Fort York menjadi kritis. Berbagai macam penyakit, umumnya disentri dan malaria, menyebabkan sebagian besar prajurit garnizun sakit. Akhirnya pimpinan Garnizun EIC, Joseph Collet, menulis surat kepada Dewan Direksi EIC untuk membangun benteng baru di Ujung Karang sekitar dua mil dari Fort York, sekitar tahun 1712.\n" +
                            "Dibangunlah benteng seluas 240 x 170 meter di atas bukit buatan menghadap ke arah Bengkulu, memunggungi Samudera Hindia. Benteng diberi nama Fort Marlborough untuk menghormati komandan ternama Inggris, John Churchill, bergelar Duke of Marlborough.\n" +
                            "Selain sebagai pusat perdagangan, benteng terkuat Inggris ke-2 di Asia setelah Benteng St. George Madras di India ini juga direncanakan untuk menghadapi ancaman-ancaman dari Kerajaan Banten, Belanda maupun dari pribumi sendiri. Namun, tetap saja ketika hampir selesai dibangun, benteng mampu dibakar rakyat Bengkulu pimpinan Pangeran Jenggalu, sehingga penghuninya mengungsi ke Madras. Para pengungsi dari Madras baru bisa kembali ke benteng pada tahun 1724 setelah diadakan perjanjian. Jadi benteng baru bisa diselesaikan seluruhnya tahun 1741.\n" +
                            "Pada 1793, serangan kembali dilancarkan rakyat Bengkulu. Dalam insiden ini, seorang Kapten Angkatan Laut Inggris, Robert Hamilton, tewas. Tahun 1807residen Thomas Parr, juga tewas. Untuk memperingatinya, Pemerintah Inggris lalu mendirikan monumen-monumen yang letaknya tidak jauh dari Benteng Marlborough.\n" +
                            "Selanjutnya Benteng Marlborough tetap berdiri pada masa Hindia Belanda tahun 1825-1942, Jepang tahun 1942-1945, dan masa perang kemerdekaan Indonesia. Benteng ini masih tetap difungsikan sebagai benteng pertahanan. Setelah Jepang kalah hingga tahun 1948, benteng menjadi markas Polri. Namun tahun 1949-1950, Benteng Marlborough diduduki kembali oleh Belanda. Setelah Belanda pergi barulah menjadi markas TNI-ADI hingga tahun 1977. Selanjutnya benteng diserahkan kepada pemerintah untuk dipugar dan dijadikan bangunan cagar budaya.\n" +
                            "Jika ingin mengetahui dan menikmati keistimewaannya lebih jauh lagi, Sobat Pesona harus berkunjung ke Museum Benteng Marlborough. Karena berbagai peristiwa sejarah yang pernah terjadi di Benteng Marlborough, kini tertempel disana, Termasuk kisah Presiden Pertama Indonesia Soekarno yang diasingkan ke Bengkulu dari tahun 1938 hingga 1942. Soekarno pernah ditahan sementara di Benteng Marlborough untuk diinterogasi.\n"
                ),
                Wisata(
                    R.drawable.way_kambas,
                    "Taman Nasional Way Kambas",
                    "Lampung",
                    "https://maps.app.goo.gl/rikKcBMQ3ni3nq5Q9",
                    "Di Taman Nasional Way Kambas, Sobat Pesona dapat melihat gajah melakukan kegiatan seperti bermain sepak bola atau pertunjukan menghibur lainnya. Di Taman Nasional ini juga berdiri Rumah Sakit khusus Gajah yang terbesar di Asia.\n" +
                            "Taman Nasional Way Kambas (TNWK) terletak di ujung selatan Sumatera, 110 km dari Bandar Lampung Taman ini menempati 1.300 km persegi dari hutan dataran rendah pantai sekitar Sungai Way Kambas. TNWK dikenal dengan konservasi gajah, karena selain menjadi tempat perlindungan bagi Gajah Sumatera juga tempat latihan mereka.\n" +
                            "Way Kambas didirikan oleh pemerintah Belanda pada tahun 1937. Sampai sekarang, ada sekitar 200 gajah Sumatera (Elephas maximus sumatranensis) hidup didalam TNWK. Gajah Sumatera merupakan salah satu dari tiga subspesies yang merupakan hewan asli dari Pulau Sumatera. Perbedaan secara umum, gajah Asia lebih kecil dibandingkan dengan Afrika. Di antara gajah Asia, gajah Sumatera merupakan yang terkecil, dengan ketinggian bahu berkisar antara 2 meter dan 3,2 meter.\n" +
                            "Di TNWK, Sobat Pesona dapat melihat gajah melakukan kegiatan seperti bermain sepak bola atau pertunjukan menghibur lainnya. Di Taman Nasional ini juga berdiri Rumah Sakit khusus Gajah yang terbesar di Asia. Fasilitas utama yang ditemukan di dekat taman nasional yang terletak 500 meter dari pintu masuk di sebuah tempat bernama Satwa Sumatra bernama Elephant Eco Lodge. Terletak di sebuah taman berdinding yang luas penuh dengan pohon buah-buahan tropis , tempat ini menawarkan empat cottage masing-masing dengan kamar yang luas yang dapat menampung hingga empat orang.\n" +
                            "TNWK bisa ditempuh dalam 2 jam perjalanan darat dari Kota Bandar Lampung.Jalan menuju ke sini, cukup bagus. Sobat Pesona bisa menggunakan kendaraan pribadi atau bisa juga menggunakan kendaraan umum. Rute yang paling sederhana adalah mengambil bus dari Rajabasa di Terminal di Bandar Lampung ke arah Way Jepara. Lalu turun di Gajah Batu di Desa Rajabasa Lama, Way Jepara. dan lalu lanjutkan dengan ojek Way Kanan atau Pusat Pelatihan Gajah (PLG ) yang merupakan pintu masuk ke TNWK. Perlu diketahui bahwa bus yang menuju langsung jam terakhir kembali ke Rajabasa itu adalah pukul 15.00 WIB.\n" +
                            "Di Pusat Pelatihan Gajah (PLG), ada atraksi gajah yang dilakukan rutin setiap sore dengan pertandingan dan khusus sepak bola gajah yang diadakan setiap akhir pekan. Sobat Pesona juga bisa menaiki gajah berputar dan masuk ke dalam hutan dengan pawangnya. Dengan trip seperti ini,  jika beruntung, Sobat Pesona anda akan bertemu dengan gajah-gajah liar yang banyak terdapat di Taman Nasional Way Kambas. Di Taman Nasional ini, kita bisa mengenal lebih dalam tentang Konservasi Gajah, di sini kita bisa banyak berinteraksi dengan gajah dan banyak bertanya tentang gajah pawang yang sehari-harinya memang merawat hewan ini.\n" +
                            "Tips Fotografi:\n" +
                            "Banyak Sobat Pesona yang hobi fotografi maupun wisatawan yang kecewa datang ke Taman Nasional Way Kambas ini karena sesampai di sana mereka hanya melihat sedikit gajah. Padahal ada ada ratusan gajah di sini. Waktu terbaik untuk melihat gajah-gajah ini adalah pagi hari sebelum jam 6 pagi karena setelah itu pagi pawang-pawang gajah ini melepaskan gajah ke sabanah rumput yang luas dan terpisah pisah. Sebelum dilepas, gajah dimandikan dahulu dikolam dan sungai Way Kambas. Jika Sobat Pesona datang sebelum jam 7 pagi, selain bisa mengabadikan gajah pada saat sunrise juga bisa memotret puas gajah Gajah di pusat konservasi.\n"
                ),
                Wisata(
                    R.drawable.parai_tenggiri,
                    "Pantai Parai Tenggiri",
                    "Bangka Belitung",
                    "https://maps.app.goo.gl/2K5H598WykPdXv888",
                    "Pantai-pantai yang ada di Bangka Belitung bisa mudah dikenali dari batuan berbagai ukuran yang tersebar di pesisirnya. \n" +
                            "Salah satu wisata pantai unggulan di Kepulauan Bangka Belitung, ialah Pantai Parai Tenggiri. Berada di Kabupaten Sungai Liat, Pantai Parai Tenggiri memiliki kontur tanah yang landai dengan ombak yang relatif kecil. Dengan tipe pantai yang seperti ini, kita yang datang berkunjung ke Pantai Parai Tenggiri dapat melakukan aktivitas berenang dengan tenang.\n" +
                            "Dinamakan Pantai Parai atau Pantai Parai Tenggiri karena dahulu banyak nelayan yang mendapatkan ikan tenggiri dari pesisir pantai ini. Akan tetapi, wajah Pantai Parai Tenggiri kini telah berubah. Tidak ada lagi nelayan yang bisa dilihat di tepian pantai. Di sekitar pantai, terdapat berbagai penginapan yang bisa dijadikan pilihan bagi pengunjung yang ingin berlama-lama menikmati Pantai Parai Tenggiri.\n" +
                            "Pasir yang ada di pantai ini cukup lembut, menyenangkan untuk jalan-jalan di atasnya. Selain itu, ombak di sini juga terkenal tenang. Benar-benar pilihan yang tepat untuk menenangkan pikiran.\n" +
                            "\n" +
                            "Sama seperti pantai-pantai kebanyakan, pantai ini juga memiliki hamparan pasir putih. Namun, yang membedakan air lautnya yang berwarna hijau tosca. Seolah menambah eksotisme keindahan Pantai Parai Tenggiri. Kawasan wisata pantai ini merupakan kawasan wisata hijau, atau disebut Parai Green Resort, sebagai bentuk dalam menyelamatkan lingkungan. Oleh karena itu, tak heran bila Pantai Parai Tenggiri jadi pantai andalan di Kepulauan Bangka Belitung.\n" +
                            "\n" +
                            "Selain pesona keindahan air lautnya yang berwarna hijau dan kebersihan pantainya, juga terdapat Rock Island yang terhubung dengan jembatan sepanjang 200 meter. Jembatan ini berhiaskan lampu-lampu cantik. Saat malam, pancaran lampu-lampu tersebut menambah kecantikan dari Rock Island.\n" +
                            "Rock Island merupakan bebatuan yang ada sepanjang pantai yang menambah nilai keindahan dari Pantai Parai Tenggiri. Walau berukuran kecil, kecantikan yang disajikan Rock Island sangatlah mempesona.\n" +
                            "Dengan bebatuan granit yang dapat didaki, kita akan melihat tepian pantai dengan batu granit di atas pasir putih yang bersih. Momen ini sangat tepat diabadikan lewat lensa kamera agar menjadi kenang-kenangan yang indah untuk dibawa pulang.\n" +
                            "Selain itu, di pantai ini kita juga bisa melakukan aktivitas memancing, snorkeling, dan diving. Di tempat ini juga disewakan beragam fasilitas olahraga air lainnya, seperti jetski, parasailing, dan banana boat. Hembusan angin pantai yang sejuk ditambah pemandangan yang mempesona, akan membuat setiap pengunjung betah berlama-lama menikmati pesona kecantikan Pantai Parai Tenggiri.\n"
                ),
                Wisata(
                        R.drawable.tana_toraja,
                "Tana Toraja",
                "Sulawesi Selatan",
                "https://maps.app.goo.gl/BjR8ZtQeqcvLSEwGA",
                "Jika kamu datang ke Tana Toraja, sempatkan untuk melihat Tongkonan yang menjadi tempat tinggal Suku Toraja. Ada juga beberapa wisata lain seperti Kompleks Megalit Kalimbuang Bori dan Kete Ketsu.\n" +
                        "Indonesia dikenal karena memiliki ragam suku dan budaya yang unik, salah satunya ada di Tana Toraja di Makale, Sulawesi Selatan. Selain pemandangan alamnya yang luar biasa indahnya, tempat ini dikenal karena kebudayaan dan adat istiadatnya yang tidak biasa. Oleh sebab itu, tempat ini selalu menjadi incaran para wisatawan lokal maupun asing dari berbagai macam negara.\n" +
                        "Tana Toraja dikenal dengan keyakinan penduduknya yaitu Aluk Tadolo. Meski sebagian besar beragama Kristen, warga masih melakukan tradisi adat yang dilakukan secara turun temurun. Warga lokal sangat menjaga kebudayaan dan tradisi itu karena memang sudah dari jaman nenek moyang. Bahkan, hampir semua tempat wisata di Tana Toraja ini memiliki aura mistis yang sangat terasa.\n" +
                        "Tana Toraja dihuni oleh Suku Toraja yang kebanyakan dari mereka tinggal dan menetap di pegunungan bagian utara Sulawesi Selatan. Mereka tinggal di rumah adat yang disebut Tongkonan. Rumah ini memiliki ukiran yang setiap gerutan punya makna tersendiri. Namun, dewasa ini jarang ditemui rumah Tongkonan yang masih asli. Kebanyakan rumah Tongkonan yang sekarang terbuat dari aluminium. Sedangkan Tongkonan yang asli terbuat dari bambu kecil yang disusun bolak balik.\n" +
                        "Kamu akan menemukan kepala kerbau yang disusun di atas Tongkonan. Kepala kerbau menandakan tinggi rendahnya kasta orang yang tinggal di dalamnya. Semakin tinggi dan banyak kepala kerbau yang terpasang, maka orang tersebut berarti orang kaya, begitu pun sebaliknya. Kepala kerbau tersebut berasal dari kerbau yang disembelih saat ada orang yang meninggal Selain melihat Tongkonan, Sobat Pesona juga bisa datang ke lokasi wisata berikut ini:\n" +
                        "Wisata Kompleks Megalit Kalimbuang Bori\n" +
                        "Tempat ini berada di Kecamatan Sesean. Di sini, Sobat Pesona akan melihat banyak situs kuno berupa kuburan batu yang dijadikan tempat pelaksanaan pemakaman. Kuburan  dibentuk dari batu tinggi yang berfungsi untuk menghormati para sesepuh, ketua adat atau bangsawan yang telah meninggal. Semakin tinggi batu tersebut, maka tinggi juga kastanya. \n" +
                        "Kete Ketsu\n" +
                        "Tempat ini merupakan desa budaya yang iconic di Tana Toraja. Banyak rumah Tongkonan serta peti-peti yang terletak di ceruk tebing.  Tempat ini merupakan salah satu tempat pemakaman masyarakat Toraja. Sobat Pesona mungkin merinding karena disini banyak ditemukan tengkorak dan tulang belulang yang sebagian sudah berserakan di bawah. Tengkorak-tengkorak ini sudah berusia ratusan tahun.\n"
                ),
                Wisata(
                        R.drawable.taman_nasional_bunaken,
                "Taman Laut Bunaken",
                "Sulawesi Utara",
                "https://maps.app.goo.gl/MJNPQQYQXMdCaP4A6",
                "Memiliki biodoversitas tertinggi di seluruh dunia menjadikan Taman Laut Bunaken sebagai primadona untuk wisata bawah laut dan diving. Karena kekayaan alamnya ini, tak heran jika Taman Nasional Bunaken termasuk dalam International Heritage yang menjadi favorit para penyelam dan pengunjung Festival Pesona Bunaken 2019. Taman nasional dengan luas area sebesar 89.065 hektar ini terdiri dari lima pulau, Pulau Bunaken, Pulau Mantehage, Pulau Siladen, Pulau Naen, dan Pulau Manado Tua.\n" +
                        "Puluhan Titik Penyelaman\n" +
                        "Setidaknya, terdapat 20 titik tempat penyelaman (diving spot) yang bisa kita jelajahi di Taman Nasional Bunaken. Sebanyak 12 di antaranya berada di area Pulau Bunaken yang biasanya paling banyak dikunjungi oleh berbagai wisatawan domestik maupun mancanegara.\n" +
                        "Di tempat ini terkenal dengan underwater great walls atau biasa disebut hanging walls yang merupakan dinding-dinding karang besar berbentuk vertikal dan melengkung ke atas. Dinding-dinding vertikal ini merupakan sumber makan untuk ikan-ikan yang berada di perairan sekitar Pulau Bunaken.\n" +
                        "Selain adanya under water great walls, Taman Nasional Bunaken juga memiliki harta karun berupa ekosistem terumbu karang yang sangat kaya. Dalam terumbu karang tersebut terdapat spesies unik seperti spesies alga Padina, Caulerpa, dam Halimeda.\n" +
                        "Termasuk dalam perairan ‘Segi Tiga Emas’, setidaknya terdapat lebih dari 3000an spesies ikan yang  berada di Taman Nasional Bunaken. Kita pun dengan mudahnya bisa menemukan gerombolan ikan nemo (clown fish) yang lucu di Taman Nasional Bunaken ini.\n" +
                        "Selain itu, terdapat titik penyelaman menarik bernama Mandolin. Titik penyelaman ini bisa dikatakan menjadi titik yang paling banyak diminati karena memiliki dinding dan juga puncak dari batu karang yang terbentuk secara alami. Beberapa jenis ikan yang bisa kita temui di Mandolin ini yakni kelompok ikan surgeonfish, Bannerfish, dan unicornfish.\n" +
                        "Untuk bisa melihat penyu, kita bisa mengunjungi spot diving bernama Likuan 1, 2, dan 3 yang juga jadi spot favorit para penyelam. Di sini, kita akan menikmati spot diving dengan ombak yang tenang dan air yang jernih. Selain penyu, kita juga bisa melihat bannerfish, napoleon wrasse, dan pyramid butterflyfish.\n" +
                        "Nah, itu dia beberapa spot diving di Taman Nasional Bunaken yang bisa kamu jadikan referensi. Yuk, berangkat!\n"
                )

        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = WisataAdapter(this, wisataList) {
            val intent = Intent(this, Details::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this,
                UtilPair.create(_imageRecyclerView,"transisi"))
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent, options.toBundle())
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if(id == R.id.action_about) {
            val intent = Intent(this,profile::class.java)
            this.startActivity(intent)
            Toast.makeText(this, "Welcome To My Profile", Toast.LENGTH_LONG).show()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}