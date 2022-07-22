package com.example.quizindonesiaku;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank { //38.15

    private static List<QuestionsList> sejarahQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("Berikut raja-raja yang pernah memerintah Kerajaan Mataram Kuno di Jawa Timur, kecuali ...", "Airlangga", "Purnawarman", "Dharmawangsa", "Empu Sendok", "Purnawarman", "");
        final QuestionsList question2 = new QuestionsList("Siapa pemilik rumah perumusan naskah proklamasi?", "Laksamana Hasega", "Laksamana Maega", "Laksamana Maeda", "Laksamana Waseda", "Laksamana Maeda", "");
        final QuestionsList question3 = new QuestionsList("Siapa tokoh pemuda yang membawa Bung Karno dan Bung Hatta ke Rengasdengklok dan mendesak proklamasi?", "Chaerul Saleh", "Abdul Kahar Mudzakkir", "Chaerul Tanjung", "Soeroso", "Chaerul Saleh", "");
        final QuestionsList question4 = new QuestionsList("Ibu Fatmawati Soekarno merupakan tokoh yang berjasa dalam ...", "menjahit bendera merah putih", "mengibarkan bendera merah putih", "mengetik naskah proklamasi", "menyebarkan berita kemerdekaan", "menjahit bendera merah putih", "");
        final QuestionsList question5 = new QuestionsList("Peristiwa perobekan bagian biru pada bendera Belanda terjadi di ...", "Surakarta", "Bali", "Surabaya", "Banten", "Surabaya", "");
        final QuestionsList question6 = new QuestionsList("Salah satu Kerajaan Hindu di Indonesia adalah ...", "Tarumanegara", "Sriwijaya", "Melayu", "Samudera Pasai", "Tarumanegara", "");
        final QuestionsList question7 = new QuestionsList("Berapa lama Belanda menjajah Indonesia?", "35 tahun", "350 bulan", "3,5 tahun", "350 tahun", "350 tahun", "");
        final QuestionsList question8 = new QuestionsList("Berapa lama Jepang menjajah Indonesia? ", "3,5 bulan", "3,5 tahun", "35 tahun", "350 tahun", "3,5 tahun", "");
        final QuestionsList question9 = new QuestionsList("Apa peran Sayuti Melik selain mengetik naskah proklamasi?", "Mengabarkan ke surat kabar", "Menyunting naskah", "Mengibarkan sang merah putih", "Mendokumentasikan proklamasi", "Menyunting naskah", "");
        final QuestionsList question10 = new QuestionsList("Peristiwa rengasdengklok terjadi pada tanggal ...", "17 Agustus 1945", "16 Agustus 1954", "16 Juli 1945", "16 Agustus 1945", "16 Agustus 1945", "");

        //Add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    private static List<QuestionsList> budayaQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("Tari Tor Tor merupakan tarian daerah yang berasal dari ...", "Tapanuli Utara", "Minangkabau", "Mentawai", "Ponorogo", "Tapanuli Utara", "");
        final QuestionsList question2 = new QuestionsList("Pulau-pulau di Indonesia berjumlah ... pulau. ", "13.766", "13.767", "13.667", "13.676", "13.667", "");
        final QuestionsList question3 = new QuestionsList("Upacara Ngaben berasal dari daerah ...", "NTB", "Bali", "Bengkulu", "Samarinda", "Bali", "");
        final QuestionsList question4 = new QuestionsList("Pencak Silat merupakan pertunjukkan tradisional ...", "Seni Bela Diri", "Seni Sastra", "Seni Musik", "Seni Rupa", "Seni Bela Diri", "");
        final QuestionsList question5 = new QuestionsList("Kesenian yang berasal dari Jawa Timur adalah ...", "Jaipong", "Wayang", "Lenong", "Ludruk", "Ludruk", "");
        final QuestionsList question6 = new QuestionsList("Pakaian adat dari daerah Sumatera Selatan adalah ...", "Cele", "Ulos", "Paksian", "Ewer", "Ulos", "");
        final QuestionsList question7 = new QuestionsList("Rumah adat khas Sumatera Barat yang memiliki beberapa atap yang runcing dan menjulang ke atas disebut ...", "Rumah Gadang", "Rumah Panggung", "Rumah Nuwo Sesat", "Rumah Limas", "Rumah Gadang", "");
        final QuestionsList question8 = new QuestionsList("Apuse merupakan lagu daerah yang berasal dari daerah ...", "Maluku", "NTB", "Papua", "Sumut", "Papua", "");
        final QuestionsList question9 = new QuestionsList("Kain Sasirangan merupakan kain adat dari suku ...", "Jawa", "Banjar", "Dayak", "Aceh", "Banjar", "");
        final QuestionsList question10 = new QuestionsList("Berikut yang bukan merupakan suku dari Jambi adalah ...", "Kubu", "Pindah", "Gayo", "Kerinci", "Gayo", "");

        //Add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    private static List<QuestionsList> bahasaQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("Bahasa jawanya “makan” adalah ...", "ngakan", "makan", "dahar", "pajoh", "dahar", "");
        final QuestionsList question2 = new QuestionsList("Bahasa sundanya “terima kasih” adalah ...", "hatur nuhun", "matur nuwun", "tarimo kasih", "terimo kasih", "hatur nuhun", "");
        final QuestionsList question3 = new QuestionsList("“Bersebo” artinya maling atau pencuri, yang berasal dari bahasa daerah ...", "Jawa", "Bugis", "Jambi", "Sunda", "Jambi", "");
        final QuestionsList question4 = new QuestionsList("Tunduh merupakan bahasa daerah dari ...", "Sunda", "Dayak", "Papua", "Minang", "Sunda", "");
        final QuestionsList question5 = new QuestionsList("“Siki – Kalih – Telu”", "2-3-4", "5-4-3", "1-2-3", "7-5-3", "1-2-3", "");
        final QuestionsList question6 = new QuestionsList("Bahasa daerah apa yang sering digunakan di Indonesia?", "Betawi", "Jawa", "Madura", "Banjar", "Jawa", "");
        final QuestionsList question7 = new QuestionsList("Congor dan Ngejeplak memiliki arti ", "asal bicara dan mulut", "bibir dan asal dengar", "mulut dan asal bicara", "meledak dan asal bicara", "mulut dan asal bicara", "");
        final QuestionsList question8 = new QuestionsList("Manakah dibawah ini yang termasuk bahasa daerah yang sangat terancam punah, kecuali ...", "Bahasa Reta", "Bahasa Bukat", "Bahasa Ibo", "Bahasa Meher", "Bahasa Bukat", "");
        final QuestionsList question9 = new QuestionsList("Bahasa Persatuan yaitu ...", "Bahasa Indonesia", "Bahasa Jawa", "Bahasa Gaul", "Bahasa Betawi", "Bahasa Indonesia", "");
        final QuestionsList question10 = new QuestionsList("Bahasa Jawa menempati urutan teratas dalam kontribusinya terhadap pengembangan kosakata bahasa Indonesia, yakni sebesar ...", "40,88%", "50,31%", "25,59%", "30,54%", "30,54%", "");

        //Add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    private static List<QuestionsList> makananQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("Gudeg merupakan makanan khas daerah ...", "Sumatra Utara", "Kalimantan Barat", "Jawa Tengah", "Jawa Timur", "Jawa Tengah", "");
        final QuestionsList question2 = new QuestionsList("Jajanan populer khas Betawi yang disajikan dengan taburan serundeng adalah ...", "Ketoprak", "Kerak Telor", "Kue Ape", "Karedok", "Kerak Telor", "");
        final QuestionsList question3 = new QuestionsList("Makanan yang disajikan dengan bumbu petis, isiannya terdiri dari tahu goreng dan lontong adalah ...", "Tahu Gejrot", "Tahu Lontong", "Tahu Gimbal", "Tahu Tek", "Tahu Tek", "");
        final QuestionsList question4 = new QuestionsList("Pisang Srikaya merupakan oleh-oleh khas dari daerah ...", "Ambon", "Pontianak", "Makassar", "Bandung", "Pontianak", "");
        final QuestionsList question5 = new QuestionsList("Eungkot keumamah terbuat dari ikan tongkol yang diberi bumbu hingga meresap kedalam ikan. Makanan tersebut berasal dari daerah ...", "Banjarmasin", "Aceh", "Maluku", "Padang", "Aceh", "");
        final QuestionsList question6 = new QuestionsList("Kue khas Betawi yang berbahan baku adonan tepung beras dan santan, berbentuk bunga dan digoreng ialah ...", "Kembang Goyang", "Kue Bhoi", "Kue Keukarah", "Kue Bingkang", "Kembang Goyang", "");
        final QuestionsList question7 = new QuestionsList("Kue rambut merupakan jajanan yang terbuat dari campuran tepung terigu goreng dan gula merah, berasal dari ...", "Langsa", "Batam", "Sabang", "NTT", "NTT", "");
        final QuestionsList question8 = new QuestionsList("Nasi campur yang sering dijumpai ketika upacara keagamaan Hari Raya Saraswati adalah ...", "Nasi Yasa", "Nasi Timbel", "Nasi Subut", "Nasi Megono", "Nasi Yasa", "");
        final QuestionsList question9 = new QuestionsList("Bubur ase merupakan kuliner khas dari ...", "Madura", "Betawi", "Sunda", "Jawa", "Betawi", "");
        final QuestionsList question10 = new QuestionsList("Berikut yang bukan makanan khas daerah Riau adalah ...", "Gulai Belacan", "Lakse Kuah", "Roti Jala", "Mie Ongklok", "Mie Ongklok", "");

        //Add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName) { //39.28
            case "Sejarah":
                return sejarahQuestions();
            case "Budaya":
                return budayaQuestions();
            case "Bahasa":
                return bahasaQuestions();
            default:
                return makananQuestions();
        }
    }
}
