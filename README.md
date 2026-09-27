# UTS-PBO-Sistem Inventaris Laboratorium Kimia

Naisyla Auliya Rahmi Putri  
Kelas: B  
NIM: 2509116078

## 1. Deskripsi Singkat Program   
Sistem Inventaris Laboratorium adalah program sederhana berbasis Java yang digunakan untuk mengelola daftar alat dan pencatatan peminjaman serta pengembalian alat di laboratorium, seperti mikroskop, tabung reaksi, dan perangkat praktikum lainnya. Setiap data alat memiliki tiga informasi utama, yaitu ID alat, nama alat, dan jumlah alat. Program ini dirancang dengan menerapkan pola modular menggunakan *package* terpisah untuk mengatur struktur kode.
Program ini memiliki enam pilihan menu utama, yaitu Tambah Data Alat, Lihat Data Alat, Ubah Data Alat, Hapus Data Alat, Peminjaman dan Pengembalian, serta Keluar. Pengguna dapat mengubah atau menghapus data alat, serta mencatat peminjaman berdasarkan ID alat yang telah terdaftar di dalam sistem.
Program menerapkan konsep Pemrograman Berorientasi Objek (PBO) dengan menggunakan *ArrayList untuk menyimpan data selama program berjalan. Validasi input juga diterapkan untuk menjaga kualitas data, seperti menolak jumlah alat yang bernilai negatif atau nama alat yang kosong. Data inventaris dan peminjaman yang dimasukkan bersifat sementara dan akan diatur ulang ketika program ditutup.  

---

## 2. Alur Kerja Sistem (Program Flow)
### 1. Program Dimulai
Saat program dijalankan, method main pada kelas UtsInventaris menjadi bagian awal untuk menjalankan sistem. Program kemudian memanggil kelas TampilanInventaris yang berfungsi untuk menampilkan menu dan menerima input dari pengguna.  

### 2. Inisialisasi Data
Setelah program berjalan, kelas LabControl diinisialisasi untuk mengatur data inventaris. Kelas ini menyiapkan beberapa data awal alat dan bahan laboratorium serta menggunakan ArrayList untuk menyimpan dan mengelola data secara dinamis.  

### 3. Menampilkan Menu Utama
Sistem menampilkan menu utama yang terdiri dari 6 pilihan, yaitu Tambah Data, Lihat Data, Ubah Data, Hapus Data, Peminjaman & Pengembalian, dan Keluar. Menu akan terus ditampilkan selama pengguna belum memilih pilihan untuk keluar.  

### 4. Pengguna Memilih Menu
Pengguna memasukkan pilihan sesuai dengan menu yang tersedia. Pilihan tersebut kemudian diproses menggunakan switch-case untuk menentukan proses yang harus dijalankan oleh sistem.  

### 5. Menjalankan Proses Sesuai Pilihan
- Tambah Data: pengguna dapat menambahkan data alat atau bahan laboratorium. ID dibuat secara otomatis oleh sistem. Sistem juga melakukan validasi agar nama tidak kosong dan jumlah tidak boleh bernilai negatif.
- Lihat Data: sistem menampilkan daftar alat dan bahan yang tersimpan di dalam inventaris.
- Ubah Data: pengguna dapat memilih data berdasarkan ID, kemudian mengubah informasi seperti nama, jumlah, atau satuan.
- Hapus Data: pengguna dapat menghapus data alat atau bahan berdasarkan ID yang dipilih.
- Peminjaman & Pengembalian: pengguna dapat mencatat peminjaman alat. Sistem akan mengecek ketersediaan stok terlebih dahulu. Jika stok tersedia, jumlah stok akan berkurang. Saat alat dikembalikan, stok akan bertambah kembali.
  
### 6. Kembali ke Menu Utama
Setelah proses dari menu yang dipilih selesai, program akan kembali ke menu utama. Pengguna dapat memilih menu lainnya dan menjalankan proses yang berbeda. Perulangan ini menggunakan do-while sehingga program dapat terus berjalan selama pengguna belum memilih menu Keluar.

### 7. Program Berakhir
Jika pengguna memilih menu Keluar, perulangan dihentikan dan program selesai dijalankan.

---
## 3. Demo Program
<img width="397" height="193" alt="image" src="https://github.com/user-attachments/assets/bba12745-4552-41bb-b432-58dd8eec376c" />

Gambar ini menunjukkan tampilan awal (menu utama) dari aplikasi Sistem Inventaris Laboratorium saat pertama kali dijalankan. Di sini terdapat 6 pilihan menu utama mulai dari mengelola data (tambah, lihat, ubah, hapus), menu peminjaman dan pengembalian, hingga opsi untuk keluar dari program.

### 1. Tambah Data
<img width="396" height="120" alt="image" src="https://github.com/user-attachments/assets/76d745f2-92ae-495c-84a7-cc34143e45e4" />

Gambar ini menampilkan sub-menu saat pengguna memilih opsi nomor 1 (Tambah Data) dari menu utama. Pengguna dapat memilih apakah ingin menambahkan data alat laboratorium (pilihan 1) atau data bahan laboratorium (pilihan 2).  

#### a. Tambah Alat

<img width="398" height="346" alt="image" src="https://github.com/user-attachments/assets/5bf8fe71-2174-48fd-b3f3-9fad82b9c0ae" />

Gambar ini memperlihatkan proses pada Menu Tambah Alat. Di sini terlihat program sudah menggunakan fitur validasi input (defensive programming), di mana sistem secara otomatis akan menolak jika pengguna memasukkan nama alat yang hanya berupa simbol atau spasi, membiarkannya kosong, ataupun menginput jumlah dengan angka nol dan minus. Program baru akan menyimpan data dan menampilkan pesan berhasil setelah semua input diisi dengan benar (contohnya nama "Sekop" dengan jumlah "10").

<img width="491" height="93" alt="image" src="https://github.com/user-attachments/assets/0b4e89b3-0fee-4ff3-9ebd-98f1641a8ae3" />

Gambar tersebut memperlihatkan bahwa data alat baru sudah berhasil ditambahkan.


#### b. Tambah Bahan

<img width="401" height="364" alt="image" src="https://github.com/user-attachments/assets/4c7bdaf7-1403-4d37-97a5-9e0cfc37c823" />

Gambar ini memperlihatkan proses pada Menu Tambah Bahan. Sama seperti sebelumnya, menu ini juga sudah menerapkan validasi input, di mana program akan otomatis menolak jika nama bahan hanya berupa simbol, dikosongkan, jumlahnya bernilai nol atau minus, maupun saat satuan bahan dikosongkan. Data baru akan berhasil disimpan setelah semua input diisi dengan benar (seperti nama "H2O", jumlah "3", dan satuan "gram").   

<img width="460" height="66" alt="image" src="https://github.com/user-attachments/assets/a4bbf43e-45c9-42f5-9b9c-f729b54ca3f9" />

Gambar tersebut memperlihatkan bahwa data bahan baru sudah berhasil ditambahkan.

---

### 2. Lihat Data
<img width="206" height="115" alt="image" src="https://github.com/user-attachments/assets/e0782c35-d1c8-4896-98f9-20054e9f05e5" />

Gambar ini menunjukkan sub-menu saat pengguna memilih opsi nomor 2 (Lihat Data) dari menu utama. Di sini pengguna dapat memilih apakah ingin menampilkan daftar data alat laboratorium (pilihan 1) atau daftar data bahan laboratorium (pilihan 2) yang tersimpan di dalam sistem.

#### a. Lihat Data Alat
<img width="505" height="217" alt="image" src="https://github.com/user-attachments/assets/78abf932-b449-40ba-9ad1-a4929e456786" />

Gambar ini menunjukkan hasil saat pengguna memilih untuk melihat daftar alat laboratorium (pilihan 1 pada menu lihat data). Sistem menampilkan seluruh data alat yang tersimpan secara rapi, lengkap dengan informasi ID alat, nama alat, serta jumlah stok yang tersedia.

#### b. Lihat Data Bahan
<img width="481" height="201" alt="image" src="https://github.com/user-attachments/assets/e69b0b17-1738-4709-99e8-33a3c63f2bf8" />

Gambar ini menunjukkan hasil saat pengguna memilih untuk melihat daftar bahan laboratorium (pilihan 2 pada menu lihat data). Sistem menampilkan seluruh data bahan yang tersimpan, lengkap dengan informasi ID bahan, nama bahan, jumlah stok, beserta satuannya.

---

### 3. Ubah Data
<img width="237" height="119" alt="image" src="https://github.com/user-attachments/assets/c254bab7-85a5-4420-ba5b-5da64710f166" />

Gambar ini menunjukkan sub-menu saat pengguna memilih opsi nomor 3 (Ubah Data) dari menu utama. Di sini pengguna dapat memilih apakah ingin memperbarui atau mengubah data alat laboratorium (pilihan 1) atau data bahan laboratorium (pilihan 2) yang sudah tersimpan sebelumnya di dalam sistem.

#### a. Ubah Data Alat
<img width="526" height="295" alt="image" src="https://github.com/user-attachments/assets/1a1c8f51-af91-4853-bcae-f342499d32b3" />

Gambar ini memperlihatkan proses pada Menu Ubah Data Alat. Sistem akan menampilkan daftar alat yang tersedia terlebih dahulu, lalu pengguna diminta memasukkan ID alat yang ingin diubah (contohnya ID 101). Pengguna juga memiliki fleksibilitas untuk mengisi nama baru (atau menekan Enter jika tidak ingin mengubah nama) serta memperbarui jumlah stok yang baru, dan program akan menampilkan pesan berhasil setelah data diperbarui.

<img width="502" height="293" alt="image" src="https://github.com/user-attachments/assets/a14856e6-7018-448e-9dc0-15c6569725c4" />

Gambar ini memperlihatkan contoh penggunaan fitur fleksibel pada Menu Ubah Data Alat. Ketika pengguna memilih ID alat (contohnya ID 101) dan langsung menekan tombol Enter pada bagian "Nama Baru", sistem akan mengabaikan perubahan nama sehingga nama alat tetap seperti sebelumnya, lalu hanya memperbarui jumlah stok yang baru

<img width="493" height="300" alt="image" src="https://github.com/user-attachments/assets/7842097e-0d55-4262-98fc-7b65e85ea0f8" />

Gambar ini memperlihatkan penanganan kesalahan saat pengguna memasukkan ID alat yang tidak terdaftar di sistem (contohnya memasukkan ID 1 padahal daftar ID yang ada adalah 101, 102, dan 103). Sistem akan mendeteksi bahwa ID tersebut tidak ada dan langsung menampilkan pesan peringatan "Alat dengan ID tersebut tidak ditemukan."

<img width="503" height="362" alt="image" src="https://github.com/user-attachments/assets/933f54d8-e0b2-4159-a3e2-81b3699009ce" />

Gambar ini memperlihatkan fitur validasi input saat pengguna mengubah jumlah stok pada data alat. Sistem secara otomatis akan menolak jika pengguna memasukkan angka nol atau nilai minus (seperti -0 atau -99), dan baru akan berhasil menyimpan perubahan setelah memasukkan angka positif yang valid.

<img width="493" height="69" alt="image" src="https://github.com/user-attachments/assets/00b7724e-510f-438c-a76d-4dd204d42e92" />

Gambar menunjukkan bahwa data alat sudah berhasil di ubah (stok = 100) sesuai yang di input pada sistem.


#### b. Ubah Data Bahan
<img width="467" height="294" alt="image" src="https://github.com/user-attachments/assets/2a76d5e5-dd81-4e30-8cc8-92bb2eab152d" />

Gambar ini menunjukkan proses pada Menu Ubah Data Bahan. Pengguna memasukkan ID bahan yang ingin diperbarui (contohnya ID 201), lalu mengisi nama baru (Retinol 90%), jumlah stok baru (20), serta satuan baru (100 (ml)), hingga akhirnya program menampilkan pesan bahwa data bahan berhasil diubah.

<img width="478" height="71" alt="image" src="https://github.com/user-attachments/assets/27b1fdbd-82b9-41a1-8894-537f48a24b80" />

Gambar setelah Data Bahan diubah sesuai yang sudah dimasukkan di sistem.


<img width="493" height="293" alt="image" src="https://github.com/user-attachments/assets/28fb4d86-eff4-42b3-8456-2be57068057a" />

Gambar ini memperlihatkan penanganan kesalahan saat pengguna memasukkan ID bahan yang tidak terdaftar di sistem (contohnya memasukkan ID 10 padahal daftar ID yang tersedia adalah 201 dan 202). Sistem langsung mendeteksi bahwa ID tersebut tidak ada dan menampilkan pesan peringatan "Bahan dengan ID tersebut tidak ditemukan."

<img width="484" height="293" alt="image" src="https://github.com/user-attachments/assets/75162808-9e6c-4144-9a85-fd10a4643470" />

Gambar ini memperlihatkan contoh penggunaan fitur fleksibel pada Menu Ubah Data Bahan. Ketika pengguna memasukkan ID bahan (contohnya 201) dan langsung menekan tombol Enter pada bagian "Nama Baru", sistem akan mempertahankan nama bahan yang lama tanpa mengubahnya, lalu memperbarui jumlah stok baru (10) beserta satuan barunya ((200 ml)), hingga akhirnya data berhasil diubah.

<img width="479" height="424" alt="image" src="https://github.com/user-attachments/assets/57404878-c139-4e98-8baa-7324d7e1bd3b" />

Gambar ini memperlihatkan fitur validasi input yang ketat pada Menu Ubah Data Bahan. Sistem secara otomatis akan menolak jika pengguna memasukkan jumlah stok baru bernilai nol atau minus (-0, 0, -99), serta menolak jika bagian satuan baru dikosongkan. Perubahan data baru akan berhasil disimpan setelah seluruh input diisi dengan valid (seperti jumlah 10 dan satuan ml).

---

### 4. Hapus Data
<img width="236" height="111" alt="image" src="https://github.com/user-attachments/assets/1ea1f13e-7907-4d28-8870-d3c2f119f714" />

Gambar ini menunjukkan sub-menu saat pengguna memilih opsi nomor 4 (Hapus Data) dari menu utama. Di sini pengguna dapat memilih apakah ingin menghapus data alat laboratorium (pilihan 1) atau data bahan laboratorium (pilihan 2).

#### a. Hapus Data Alat
<img width="502" height="226" alt="image" src="https://github.com/user-attachments/assets/313186d7-ab8f-40b5-9ee7-f54dc010431e" />

Gambar ini memperlihatkan proses penghapusan data pada Menu Hapus Data Alat. Pengguna memasukkan ID alat yang ingin dihapus (contohnya ID 103), dan sistem langsung memprosesnya serta menampilkan pesan konfirmasi "Data alat berhasil dihapus".

<img width="518" height="83" alt="image" src="https://github.com/user-attachments/assets/b92ebb5d-e741-496d-ab7d-7637211ce23b" />

Gambar setelah Data Alat dengan ID tersebut dihapus.

<img width="494" height="223" alt="image" src="https://github.com/user-attachments/assets/7d4bbd2c-176c-416b-8e8e-0dde4d7a2443" />

Gambar ini memperlihatkan penanganan kesalahan saat pengguna memasukkan ID alat yang tidak terdaftar di sistem pada Menu Hapus Data (contohnya memasukkan ID 0 padahal daftar ID yang tersedia adalah 101, 102, dan 103). Sistem secara otomatis mendeteksi bahwa ID tersebut tidak ditemukan dan langsung menampilkan pesan peringatan "Alat dengan ID tersebut tidak ditemukan."

#### b. Hapus Data Bahan
<img width="489" height="197" alt="image" src="https://github.com/user-attachments/assets/789f10a3-88e4-492b-bd66-7887322971dd" />

Gambar ini memperlihatkan proses penghapusan data pada Menu Hapus Data Bahan. Pengguna memasukkan ID bahan yang ingin dihapus (contohnya ID 202), dan sistem langsung memprosesnya serta menampilkan pesan konfirmasi "Data bahan berhasil dihapus".

<img width="488" height="62" alt="image" src="https://github.com/user-attachments/assets/0af7a26e-ddd5-49a2-ad46-d2de49cf98cc" />

Gambar setelah menghapus Data Bahan sesuai ID yang di input.

<img width="495" height="201" alt="image" src="https://github.com/user-attachments/assets/24227bdd-9ceb-4b22-9ccf-0f7c2b24dd25" />

Gambar ini memperlihatkan penanganan kesalahan saat pengguna memasukkan ID bahan yang tidak terdaftar di sistem pada Menu Hapus Data (contohnya memasukkan ID 10 padahal daftar ID bahan yang tersedia adalah 201 dan 202). Sistem secara otomatis mendeteksi bahwa ID tersebut tidak ditemukan dan langsung menampilkan pesan peringatan "Bahan dengan ID tersebut tidak ditemukan."

---

### 5. Peminjaman dan Pengembalian
<img width="303" height="128" alt="image" src="https://github.com/user-attachments/assets/96e33a06-9fce-4fc0-af4d-6d9a68e8a959" />

Gambar ini menunjukkan sub-menu saat pengguna memilih opsi nomor 5 (Peminjaman) dari menu utama. Di sini terdapat beberapa pilihan fitur terkait transaksi peminjaman, yaitu:  
- Pinjam Alat (pilihan 1) untuk mencatat peminjaman alat laboratorium.
- Lihat Peminjaman (pilihan 2) untuk melihat daftar atau riwayat alat yang sedang dipinjam.
- Pengembalian (pilihan 3) untuk memproses pengembalian alat laboratorium yang telah dipinjam.

#### a. Pinjam Alat
<img width="487" height="305" alt="image" src="https://github.com/user-attachments/assets/d6958773-4973-4029-8cc4-070754acc8e6" />

Gambar ini memperlihatkan proses transaksi peminjaman pada Menu Pinjam Alat. Sistem menampilkan daftar alat yang tersedia, lalu pengguna memasukkan informasi peminjaman seperti ID peminjaman, nama peminjam (Nai), ID alat yang dipinjam (101), dan jumlah pinjam (10). Setelah itu, sistem berhasil mencatat transaksi dan memperbarui stok alat secara otomatis.

<img width="496" height="77" alt="image" src="https://github.com/user-attachments/assets/f2e1fe4a-4ef1-4258-9af1-9b1ae1098c31" />

Update stok sesuai berapa banyak yang dipinjam.

<img width="494" height="303" alt="image" src="https://github.com/user-attachments/assets/39266ccc-0ecf-4953-9c8b-acd1e7b74a5e" />

Gambar ini memperlihatkan fitur validasi ketika pengguna mencoba meminjam alat dengan jumlah yang melebihi stok yang tersedia. Saat peminjam mencoba meminjam 200 buah alat dengan ID 101 (padahal sisa stok saat itu hanya 90), sistem secara otomatis menolak transaksi dan menampilkan pesan peringatan "Gagal: Stok alat tidak mencukupi. Sisa stok saat ini: 90".

<img width="493" height="313" alt="image" src="https://github.com/user-attachments/assets/2eaaa356-a184-4fe8-905c-7d132dd39fc3" />

Gambar ini memperlihatkan fitur validasi ketika pengguna memasukkan ID alat yang tidak terdaftar di dalam inventaris saat ingin melakukan peminjaman. Saat peminjam mencoba memasukkan ID alat 10 (yang tidak ada dalam daftar), sistem secara otomatis menggagalkan transaksi dan menampilkan pesan peringatan "Gagal: ID Alat yang ingin dipinjam tidak terdaftar di inventaris."

#### b. Lihat Peminjam
<img width="333" height="257" alt="image" src="https://github.com/user-attachments/assets/1e493db3-be74-4fcb-97c3-d859b7dfc96e" />

Gambar ini menunjukkan hasil saat pengguna memilih opsi nomor 2 (Lihat Peminjaman) di dalam sub-menu Peminjaman. Sistem menampilkan daftar rinci data peminjaman alat yang sedang aktif, yang mencakup informasi ID Peminjaman (misalnya 1), Nama Peminjam (Nai), ID Alat yang dipinjam (101), serta Jumlah Dipinjam (10).

#### c. Pengembalian
<img width="514" height="177" alt="image" src="https://github.com/user-attachments/assets/b7ab21a0-3e64-46a5-b510-f600f3605fcf" />

Gambar ini memperlihatkan proses pengembalian alat pada Menu Pengembalian (pilihan 3 dari sub-menu Peminjaman). Pengguna memasukkan ID peminjaman yang dikembalikan (contohnya ID 1), lalu sistem mencatat pengembalian tersebut, memperbarui status, dan mengembalikan stok alat ke inventaris dengan menampilkan pesan sukses "Pengembalian berhasil dicatat. Stok alat telah dikembalikan ^-^".

<img width="497" height="76" alt="image" src="https://github.com/user-attachments/assets/f147aece-fe23-4fd5-bfec-bbd5ed8ca1d1" />

Gambar menampilkan bahwa stok akan kembali seperti semula setelah dilakukan pengembalian alat.

---

### 6. Keluar
<img width="542" height="158" alt="image" src="https://github.com/user-attachments/assets/1ee7dfad-d046-4091-a381-24155958fd30" />

Gambar ini memperlihatkan tampilan saat pengguna memilih opsi nomor 6 dari menu utama untuk keluar dari program. Sistem menampilkan pesan "Program selesai. Terima kasih!" diikuti dengan status eksekusi program yang sukses (BUILD SUCCESS) beserta informasi durasi dan waktu penyelesaian.

---
