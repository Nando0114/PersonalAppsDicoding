package com.fernando.dicodingsubmission;

import java.util.ArrayList;

public class SatelliteData {
    private static String[] satelliteNames = {
            "Io",
            "Europa",
            "Ganymede",
            "Callisto",
            "Amalthea",
            "Himalia",
            "Elara",
            "Pasiphae",
            "Sinope",
            "Lysithea",
            "Carme",
            "Ananke"
    };

    private static String[] satelliteDetails = {
            "Io (bahasa Yunani: Ἰώ) adalah satelit terdalam di antara empat satelit Galileo yang mengelilingi planet Jupiter. Dengan diameter sebesar 3642 kilometer (2263 mil), io merupakan satelit terbesar keempat di Tata Surya. Satelit ini dinamai dari io, yang merupakan pendeta wanita untuk Hera yang menjadi salah satu kekasih Zeus.",
            "Europa (bahasa Yunani: Ευρώπη) adalah satelit keenam dari planet Jupiter. europa ditemukan pada tahun 1610 oleh Galileo Galilei (dengan pembantahan dari Simon Marius, yang mengklaim bahwa ia telah menemukannya pada tahun 1609). Satelit ini dinamakan atas seorang wanita bangsawan Phoenicia yang bernama europa, yang kemudian dinikahi oleh Zeus dan menjadi ratu dari Kreta. Satelit ini adalah satelit terkecil dari empat satelit Galileo.",
            "Ganymede adalah satelit alami planet Jupiter dan merupakan satelit alami terbesar di Tata Surya. ganymede adalah satelit terbesar ketujuh di Tata Surya dan satelit Galileo ketiga dari Jupiter. Satelit ini mengitari planetnya selama tujuh hari. ganymede turut serta dalam resonansi orbit 1:2:4 dengan satelit europa dan io. Satelit ini lebih besar diameternya dibanding planet Merkurius, namun massanya hanya sekitar setengahnya.",
            "Callisto (bahasa Yunani: 'Καλλιστώ') adalah satelit planet Jupiter yang ditemukan pada tahun 1610 oleh Galileo Galilei. callisto merupakan satelit terbesar ketiga di Tata Surya dan terbesar kedua di sistem Jupiter setelah ganymede. Diameter callisto kurang lebih sekitar 99% diameter planet Merkurius, tetapi massanya hanya sekitar sepertiganya. Berdasarkan jarak, ia adalah satelit Galileo keempat dari Jupiter, dengan jari-jari orbit sekitar 1.880.000 km. Satelit ini tidak ikut serta dalam resonansi orbit yang memengaruhi tiga satelit Galileo lainnya—io, europa, dan ganymede—dan akibatnya tidak mengalami pemanasan pasang surut. Rotasi callisto terkunci pasang surut terhadap Jupiter, sehingga belahan yang sama selalu menghadap ke arah Jupiter dan Jupiter tampak diam di langit callisto. callisto tidak terlalu terpengaruh oleh magnetosfer Jupiter dibanding satelit Galileo lainnya karena orbitnya yang jauh.",
            "Amalthea (bahasa Yunani: Ἀμάλθεια) adalah satelit Jupiter dengan urutan ketiga bila dilihat dari jarak Jupiter dengan satelit-satelitnya. amalthea ditemukan pada tanggal 9 September 1892, oleh Edward Emerson Barnard.",
            "Himalia adalah satelit ireguler terbesar Jupiter, dengan diameter diperkirakan lebih dari 205 km (127 mi).himalia merupakan satelit Jupiter terbesar keenam secara keseluruhan dalam hal ukuran, dan hanya keempat satelit Galileo Jupiter yang memiliki massa yang lebih besar. Satelit ini ditemukan oleh Charles Dillon Perrine di Observatorium Lick pada 3 Desember 1904 dan dinamai berdasarkan nimfa himalia, yang melahirkan tiga putra dari Zeus (padanan Yunani dari Dewa Jupiter), sejak tahun 1975. Satelit ini juga dikenal sebagai Jupiter VI atau Satelit Jupiter VI. Satelit ini juga kadang disebut sebagai Hestia, berdasarkan dewi Yunani, dari tahun 1955 hingga 1975.",
            "Elara (bahasa Yunani: Ελάρα) adalah satelit ireguler prograde Jupiter. elara ditemukan oleh Charles Dillon Perrine di Observatorium Lick pada tahun 1905. Satelit ini adalah satelit terbesar kedelapan Jupiter dan dinamai berdasarkan elara, salah satu dari selir Zeus dan ibu dari raksasa Titios. elara tidak menerima nama tersebut hingga tahun 1975. Sebelumnya, satelit tersebut dikenal sebagai Jupiter VII. Satelit ini kadang dirujuk sebagai \"Hera\" dari tahun 1955 hingga 1975.",
            "Pasiphae (bahasa Yunani: Πασιφάη; sebelumnya dieja sebagai Pasiphaë) adalah satelit ireguler retrograde Jupiter. pasiphae ditemukan pada tahun 1908 oleh Philibert Jacques Melotte dan kemudian dinamai berdasarkan tokoh mitologi Pasifae, istri dari Minos dan ibu dari Minotaur dalam legenda Yunani.",
            "Sinope (bahasa Yunani: Σινώπη) adalah satelit ireguler retrograde Jupiter yang ditemukan oleh Seth Barnes Nicholson di Observatorium Lick pada tahun 1914, dan dinamai berdasarkan berdasarkan tokoh sinope dalam mitologi Yunani.",
            "Lysithea (bahasa Yunani: Λυσιθέα) adalah satelit ireguler prograde Jupiter. lysithea ditemukan oleh Seth Barnes Nicholson pada tahun 1938 di Observatorium Mount Wilson dan dinamai berdasarkan tokoh mitologis Lisitea, putri dari Okeanos dan salah satu selir Zeus. lysithea tidak mendapat nama sekarang hingga tahun 1975. Sebelumnya, Lysethia dikenal sebagai Jupiter X. Satelit ini kadang disebut pula sebagai \"Demeter\" dari tahun 1955 hingga 1975.",
            "Carme (Yunani: Κάρμη) adalah satelit ireguler retrograde Jupiter. carme ditemukan oleh Seth Barnes Nicholson di Observatorium Mount Wilson di California pada bulan Juli 1938. Satelit ini dinamai berdasarkan tokoh mitologi Karme, ibu dari Britomartis dengan Zeus, seorang dewi Kreta.",
            "Ananke (bahasa Yunani: Ανάγκη) adalah satelit retrograde ireguler Jupiter. ananke ditemukan oleh Seth Barnes Nicholson di Observatorium Mount Wilson pada tahun 1951 dan dinamai berdasarkan tokoh mitologi ananke, personifikasi dari \"kebutuhan\", dan ibu dari para Moirai (\"takdir\") bersama Zeus. Bentuk kata sifat dalam Bahasa Inggris dari ananke adalah Anankean."
    };

    private static int[] satelliteImages = {
            R.drawable.io,
            R.drawable.europa,
            R.drawable.ganymede,
            R.drawable.callisto,
            R.drawable.amalthea,
            R.drawable.himalia,
            R.drawable.elara,
            R.drawable.pasiphae,
            R.drawable.sinope,
            R.drawable.lysithea,
            R.drawable.carme,
            R.drawable.ananke

    };

    static ArrayList<Satellite> getListData() {
        ArrayList<Satellite> list = new ArrayList<>();
        for (int position = 0; position < satelliteNames.length; position++) {
            Satellite satellite = new Satellite();
            satellite.setNama_satellite(satelliteNames[position]);
            satellite.setDetail_satellite(satelliteDetails[position]);
            satellite.setPicture_satellite(satelliteImages[position]);
            list.add(satellite);
        }
        return list;
    }
}
