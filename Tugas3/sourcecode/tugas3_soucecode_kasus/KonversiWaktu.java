/*
NIM: 13020240245
    NAMA: MUHAMMAD ARIANSYAH HANI
    HARI/TANGGAL: 18 APRIL 2026
    WAKTU: 15.00
    */
package konversiwaktu;

public class KonversiWaktu {
    private long detik;

    public KonversiWaktu(long detik) {
        this.detik = detik;
    }

    public long jam() {
        return (detik / 3600) % 24;
    }

    public long menit() {
        return (detik / 60) % 60;
    }

    public long detik() {
        return detik % 60;
    }
}
