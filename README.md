# **Sistem Booking Studio Foto**  

Nama : Atha Rina Sarwahita  
NIM : 2509116047  
Kelas : B Sistem Informasi 2025

---

## **1. Deskripsi Studi Kasus**
Sistem Manajemen Booking Studio Foto ini adalah program CLI yang menangani alur reservasi layanan fotografi secara terstruktur. Setiap transaksi mengelola data pembooking (Nama dan No HP), jadwal sesi (Tanggal dan Jam), serta katalog paket foto. Informasi paket foto terbagi menjadi Paket Studio (dengan batas kapasitas orang dan kalkulasi biaya ekstra) serta Paket Outdoor (dengan perhitungan biaya izin lokasi).

Program ini menerapkan konsep Pemrograman Berorientasi Objek (PBO) seperti inheritance, encapsulation, dan polymorphism untuk menghitung total biaya transaksi dan mencetak invoice secara real-time. Penyimpanan data selama program berjalan mengandalkan ArrayList agar fleksibel saat menambah dan menampilkan daftar booking.

---

## **2. Hierarki Class & Diagram**  

```
          +-------------------+
          |     PaketFoto     | (Superclass)
          +-------------------+
                   |
    +--------------+--------------+
    |                             |
+---------------+             +----------------+
|  PaketStudio  |             |  PaketOutdoor  | 
+---------------+             +----------------+
    (Subclass)                    (Subclass)

models
├── Customer.java      (Model data pelanggan)
├── Jadwal.java        (Model data tanggal & jam)
├── PaketFoto.java     (Superclass)
├── PaketStudio.java   (Subclass dari PaketFoto)
├── PaketOutdoor.java  (Subclass dari PaketFoto)
└── Booking.java       (Menggabungkan Customer, Jadwal, & PaketFoto)

service
├── BookingService.java (Manajemen penyimpanan list booking)
└── ValidasiInput.java  (Handling dan validasi input)

main
└── Main.java          (Menu utama & kontrol alur program/entry point)
```
---

## **3. Penerapan Inheritance**  

Dalam sistem ini, kelas `PaketFoto` bertindak sebagai superclass yang menyimpan properti dasar seluruh paket, seperti `namaPaket` dan `harga`, serta method dasar `hitungTotalHarga()`.

Kelas `PaketStudio` dan `PaketOutdoor` bertindak sebagai subclass yang diturunkan menggunakan kata kunci extends:

- Class Induk (`PaketFoto`)

  Kelas `PaketFoto` menampung atribut umum yang dimiliki oleh seluruh jenis paket foto, yaitu `namaPaket` dan `harga`, serta method dasar `hitungTotalHarga()`.

  <img width="600" alt="image" src="https://github.com/user-attachments/assets/7985c92e-56b0-4c15-83b6-9c9b7d1effb4" />

  Penggunaan akses modifier protected memungkinkan atribut namaPaket dan harga diakses langsung oleh kelas anak tanpa perlu re-deklarasi.


- Subclass 1 (`PaketStudio`)
  
  Kelas `PaketStudio` mewarisi properti dari `PaketFoto` menggunakan kata kunci `extends`. Kelas ini menambahkan variabel khusus `kapasitasOrang` dan melakukan method overriding pada `hitungTotalHarga()` untuk menghitung biaya tambahan jika kapasitas melebihi batas standar (5 orang)

  <img width="600" alt="image" src="https://github.com/user-attachments/assets/6da00810-206e-4e57-a1b0-55c4894b1ff1" />

  Penggunaan `super(namaPaket, harga)` meneruskan nilai nama paket dan harga dasar ke konstruktor kelas induk (`PaketFoto`), sehingga tidak perlu membuat ulang variabel pencatat harga di kelas anak.

- Subclass 2 (`PaketOutdoor`)

  Sama halnya dengan `PaketStudio`, kelas `PaketOutdoor` juga menurunkan kelas `PaketFoto`. Perbedaannya terletak pada variabel spesifik `biayaLokasi` serta kalkulasi total harganya.

  <img width="600" alt="image" src="https://github.com/user-attachments/assets/cc4a40ec-48f3-4adf-85ef-1a6992ada579" />


Melalui struktur inheritance ini, variabel umum seperti namaPaket dan harga tidak perlu ditulis ulang di tiap subclass, sehingga kode jadi lebih bersih, terstruktur, dan terhindar dari duplikasi.  

---  

## **4. Tangkapan Layar Running Program**  

- **Menu Utama**

  <img width="324" height="97" alt="Screenshot 2026-09-19 090921" src="https://github.com/user-attachments/assets/5efe3df1-b122-4411-bc2d-2d9d8a3ab5dd" />

  Tampilan awal program CLI yang menampilkan opsi menu navigasi utama, yaitu: Tambah Booking (1), Lihat Daftar Booking (2), dan Keluar (3).

---

- **Menu 1 - Tambah Booking**

  <img width="329" height="538" alt="Screenshot 2026-09-19 091642" src="https://github.com/user-attachments/assets/05319d96-0dcb-4329-8bde-e40eb89613a0" />
  

  **Invoice Booking**

  <img width="347" height="271" alt="Screenshot 2026-09-19 091736" src="https://github.com/user-attachments/assets/4fe8383e-7e85-4369-ab81-9be2da285cd8" />

  Proses penginputan data booking baru, meliputi ID booking, identitas pembooking, jadwal sesi, serta pemilihan jenis paket foto studio. Sistem secara otomatis menghitung kalkulasi biaya ekstra (jika memilih paket studio dan jumlah orang yang diinput melebihi 5 orang) dan mencetak invoice transaksi secara real-time setelah berhasil booking.

---

- **Menu 2 - Tambah Booking**

  <img width="409" height="324" alt="Screenshot 2026-09-19 091938" src="https://github.com/user-attachments/assets/07d57614-599a-4319-931c-f320352e6bd5" />

  Menampilkan seluruh riwayat transaksi booking yang tersimpan di dalam memori (ArrayList), mencakup data dummy awal serta transaksi baru yang baru saja ditambahkan.

---

- **Menu 3 - Keluar**

  <img width="521" height="207" alt="Screenshot 2026-09-19 092212" src="https://github.com/user-attachments/assets/66280b73-e289-4e82-95eb-ba5ca3b0195d" />

  Menampilkan pesan penutup saat pengguna memilih opsi keluar dari aplikasi dan mengakhiri sesi program.

---

- **Validasi Input - Pilihan Menu**

  <img width="300" alt="Screenshot 2026-09-19 092355" src="https://github.com/user-attachments/assets/3ae4de03-4833-4c22-970e-89ae5f3f6003" />

  Validasi Input dan eror handling saat pengguna memasukkan nomor menu di luar opsi yang tersedia (misal menginput angka 4), di mana sistem memberikan peringatan dan meminta input ulang.
  
---

- **Validasi Input - ID Unik**

  <img width="300" alt="Screenshot 2026-09-19 092443" src="https://github.com/user-attachments/assets/b39efba5-2948-41aa-a846-c0adcb2fa587" />
  
  Pencegahan duplikasi data di mana sistem menolak penginputan ID Booking yang sudah terdaftar sebelumnya di dalam memori (ArrayList).

---

- **Validasi Input - Kosong**

  <img width="300" alt="Screenshot 2026-09-19 092534" src="https://github.com/user-attachments/assets/41100fe8-c70d-497e-8f4f-f1b33183654f" />

  Validasi yang menolak penginputan data kosong (empty string) untuk memastikan seluruh data transaksi terisi secara lengkap.

  
