#LAPORAN JOBSHEET 2 PRAKTIKUM STRUKTUR DATA

Dibuat oleh : <p>
Yasmine Navisha Andhani <p>
1F D4 Teknik Informatika <p>
2141720047 <p>

# 3.2 Membuat Array dari Object, mengisi dan menampilkan <p>
# 3.2.1 Langkah-langkah Percobaan
1. Buat Project baru, dengan nama “ArrayObjects”. Buat package dengan nama minggu3.
2. Buat class PersegiPanjang: <p>
<img src="J3 (3.2.1 - 2).PNG"> 
3. Pada fungsi main yaitu pada class ArrayObjects, buatlah array PersegiPanjang yang berisi 3 elemen: <p>
<img src="J3 (3.2.1 - 3).PNG">
4. Kemudian isikan masing-masing atributnya: <p>
<img src="J3 (3.2.1 - 4).PNG">
5. Cetak ke layar semua atribut dari objek ppArray: <p>
<img src="J3 (3.2.1 -5).PNG">
6. Jalankan dan amati hasilnya. <p>
<img src="J3 (3.2.1 - 6).PNG">

# 3.2.2 Verifikasi Hasil Percobaan
Cocokkan hasil compile kode program anda dengan gambar berikut ini. <P>
<img src="J3 (3.2.2).PNG"> <P>
<img src="J3 (3.2.1 - 6).PNG">

# 3.2.3 Pertanyaan
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method?Jelaskan!
> : Ya, karena jika tidak program tidak akan berjalan dengan baik atau dengan semestinya
2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan konstruktur pada baris program berikut : <p>
<img src="J3 (3.2.3 - 2).PNG"> 
> : Tidak, karena belum dibuat objek PersegiPanjang pada index ppArray.
3. Apa yang dimaksud dengan kode berikut ini: <P>
<img src="J3 (3.2.3 - 3).PNG">
> : Kode tersebut ialah untuk membuat Array yang dapat menampung 3 objek PersegiPanjang.
4. Apa yang dimaksud dengan kode berikut ini: <P>
<img src="J3 (3.2.3 - 4).PNG">
> : Kode tersebut untuk membuat objek untuk mengisikan class PersegiPanjang pada array.
5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?
> : Agar konsep dari class yang ditentukan jelas

# 3.3 Menerima Input Isian Array Menggunakan Looping
# 3.3.1 Langkah-langkah Percobaan
1. Import scanner pada class ArrayObjects <p>
<img src="J3 (3.3.1 - 1).PNG">
Note: Letakkan kode import dibawah kode package.
2. Pada praktikum 3.2 poin nomor 4, ganti kodenya dengan kode berikut ini, yaitu membuat objek Scanner untuk menerima input, kemudian melakukan looping untuk menerima input: <P>
<img src="J3 (3.3.1 - 2).PNG">
3. Pada praktikum 3.2 poin nomor 5, ganti kodenya dengan berikut ini, yaitu melakukan looping untuk mengakses isi array ppArray dan menampilkannya ke layar: <P>
<img src="J3 (3.3.1 - 3).PNG">
4. Jalankan dan amati hasilnya!<P>
<img src="J3 (3.3.1 - 4).PNG">

# 3.3.2 Verifikasi Hasil Percobaan
Contoh verifikasi hasil percobaan ini. <p>
<img src="J3 (3.3.1 - 4).PNG"> 

# 3.3.3 Pertanyaan
1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi? <p>
> : Iya bisa, dan akan ada kolom dan baris serta memiliki 2 indeks.
2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan! <p>
> : Contohnya terdapat pada program stok penyimpanan gudang
3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode dibawah ini akan memunculkan error saat dijalankan. Mengapa? <p>
<img src="J3 (3.3.3 - 3).PNG">
> : Karena, belum melakukan instansiasi pada pgArray[5].sisi = 20 diubah menjadi pgArray[5] = new persegi()
4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner! <p>
> : <img src="J3 (3.3.3 - 4).PNG">
5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan pada ppArray[i] sekaligus ppArray[0]?Jelaskan ! <p>
> : Bisa, namun program tersebut akan menjadi tidak efisien dan membuat terlalu banyak baris code.

# 3.4 Operasi Matematika Atribut Object Array
# 3.4.1 Langkah-langkah Percobaan
1. Buat Package baru "ArrayBalok" <p>
2. Buat class Balok: <p>
<img src="J3 (3.4.1 - 2).PNG"> <p>
3. Pada fungsi main yaitu pada class ArrayBalok, buat array Balok yang berisi 3 elemen: <p>
<img src="J3 (3.4.1 - 3).PNG"> <p>
4. Kemudian tambahkan kode berikut ini untuk mengisi array blArray menggunakan konstruktor dari class Balok: <p>
<img src="J3 (3.4.1 - 4).PNG"> <p>
5. Tampilkan semua volume balok tersebut dengan cara memanggil method hitungVolume() di dalam looping seperti berikut ini: <p>
<img src="J3 (3.4.1 - 5).PNG"> <p>
6. Jalankan dan amati hasilnya.
<img src="J3 (3.4.1 - 6).PNG"> <p>

# 3.4.2 Verifikasi Hasil Percobaan
<img src="J3 (3.4.1 - 6).PNG"> <p>

# 3.4.3 Pertanyaan
1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh! <p>
> : <img src="J3 (3.4.3 - 1).PNG"> <p>
2. Jika diketahui terdapat class Segitiga seperti berikut ini: <p>
<img src="J3 (3.4.3 - 2).PNG"> <P>
Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi. <P>
> : <img src="J3 (3.4.3 - 2.1).PNG"> <p>
3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga tersebut. <P>
> : <img src="J3 (3.4.3 - 3).PNG"> <P>
4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing atributnya sebagai berikut: <P>
<img src="J3 (3.4.3 - 4).PNG"> <P>
> : <img src="J3 (3.4.3 - 4.1).PNG">
5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method hitungLuas() dan hitungKeliling(). <P>
> : <img src="J3 (3.4.3 - 5).PNG"> <p>
<img src="J3 (3.4.3 - 6).PNG">

# 3.5 Latihan Praktikum
1. Buatlah program yang dapat menghitung luas permukaan dan volume beberapa bangun ruang (minimal 3, jenis bangun luas bebas). Buatlah 3 (tiga) class sesuai dengan jumlah jenis bangun ruang. Dan buat satu main class untuk membuat array of objek yang menginputkan atribut-atribut yang ada menggunakan konstruktor semua bangun ruang tersebut. <p>
Keterangan : Buat looping untuk menginputkan masing-masing atributnya, kemudian tampilkan luas permukaan dan volume dari tiap jenis bangun ruang tersebut. <p>
> : - Kubus <p>
<img src="J3 (3.5 - kubus).PNG"> <p>
<img src="J3 (3.5 - kubus1).PNG"> <p>
<img src="J3 (3.5 - kubus2).PNG"> <p>
- Tabung <p>
<img src="J3 (3.5 - tabung).PNG"> <p>
<img src="J3 (3.5 - tabung1).PNG"> <p>
<img src="J3 (3.5 - tabung2).PNG"> <p>
- Bola <p>
<img src="J3 (3.5 - bola).PNG"> <p>
<img src="J3 (3.5 - bola1).PNG"> <p>
<img src="J3 (3.5 - bola2).PNG"> <p>

2. Sebuah perusahaan jual beli tanah membutuhkan sebuah program yang dapat memberitahu luas tanah. Program tersebut dapat menerima input jumlah tanah yang akan dihitung dan atribut panjang dan lebar masing-masing dari tanah yang diinputkan. Program dapat menampilkan luas tanah masing-masing tanah yang diinputkan tadi dan juga tanah terluas dari ketiga tanah yang ada. Contoh output program: <p>
<img src="J3 (3.5 - 2.1).PNG"> <P>
>: <img src="J3 (3.5 - tanah).PNG"> <p>
<img src="J3 (3.5 - tanah1).PNG"> <p>
<img src="J3 (3.5 - tanah2).PNG"> <p>

3. Sebuah kampus membutuhkan program untuk menampilkan informasi mahasiswa berupa nama, nim, jenis kelamin dan juga IPK mahasiswa. Program dapat menerima input semua informasi 
tersebut, kemudian menampilkanya kembali ke user. Implementasikan program tersebut jika dimisalkan terdapat 3 data mahasiswa yang tersedia. Contoh output program: <P>
<img src="J3 (3.5 - 3.1).PNG"> <P>
> : <img src="J3 (3.5 - mahasiswa).PNG"> <p>
<img src="J3 (3.5 - mahasiswa1).PNG"> <p>
<img src="J3 (3.5 - mahasiswa2).PNG">
