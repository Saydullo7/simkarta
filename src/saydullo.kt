import java.util.*


fun main() {
    val input = Scanner(System.`in`)

    println("Assalomu alaykum, milliy uzga xushkelipsiz")
    println("O'zbek tilini tanlash uzhuun 1ni bosing; Russ tilini tanlash uchun 2ni bosing; Inglis tilini tanlash uchun 3ni bosing;")
    println("Hafsizilik uchun sizning ovozingiz yazib olinadi")
    val a = input.nextInt()
    if (a == 1) {
//O'zbek tili
        println("1-tarif reja; 2-internet paket; 3- daqiqa va SMS")
        val r = input.nextInt()

        if (r == 1) {

            //milliy
            println("1-milliy 10; 2-milliy 20; odiy 10")
            val d = input.nextInt()
            if (d == 1) {
                println("Milliy 10 rejasi:Daqiqalar 100 SMSlar 100 mblar100 atiga 10.000 ming so'm  ")
            } else
                if (d == 2) {
                    println("Milliy 20 rejasi: Daqiqalar 200 SMSlar 200 MBlar200")
                } else

                    if (r == 2) {
                        //omaviy
                    } else {
                        println("notag'ri kalit bostingiz")
                    }
        } else
            if (r == 2) {
                //internet
            } else
                if (r == 3) {
                    //Daqiqs SMS
                } else {
                    println("Notog'ri kalit bostingiz")
                }
        println("milliy uzga qoshilganingiz uchun  rahmat")

    } else if (a == 2) {
        //russ tili

        println("Zrastute prevestuyu vas v milli uz")
        println("Nazhmite 1, chtoby vybrat' uzbekskiy yazik; Nazhmite 2, chtoby vybrat' russkiy yazik; Nazhmite 3, chtoby vybrat' angliyskiy. ;")
        println("Dlya bezopasnosti vash golos zapsvaytsya ")
        val s = input.nextInt()
        if (s == 1) {
//russ tili

            println(" 1-Tarif plani;2-internet paket;3-minuti i SMS")
            val y = input.nextInt()
            if (y == 1) {

            }
//milliy
            println("1-milliy 10;2-milliy 20;prastoy10")
            val l = input.nextInt()
            if (l == 1) {

            }
            println("Milliy plani 10;minuti 100 SMS 100 MB 100 vot i vsyo 10.000 ming so'm")
        } else if (s == 2) {
            println("milliy plani 20;minuti 200 SMS 200 MB 200 vot ivyo 20.000 ming so'm")

            //obshestveni
        } else {

            println("ne praveni knopku najimali")
        }
    } else if (a == 3) {


        //ingilis tili
        println("Hello welcom to milliy uz")
        println("PRESS 1 TO SELECT UZBEKI LANGUAGE;Press 2 to select Russian language;Press 3 to select inglsh lannguge4")
        println("Your voice will be recorded for your convenience")
        val v = input.nextInt()
        if (v == 1) {
//inglish languge
            println("1st tariff plan; 2nd internet package; 3rd minute SMS")
            val x = input.nextInt()
            if (x == 1) {

                //milliy
                println("1-milli 10;2-milliy 20 ;ordinary 10")
                val m = input.nextInt()
                if (m == 1) {
                    println("National 10 plan: Minutes 100 SMS 100 MB 100 for 10,000 soums")
                } else if (m == 2) {
                    println("National 20 plan: Minutes 200 SMS 200 MBs 200")
                } else if (m == 2) {
                    println("You pressed the wrong key")
                }
            } else if (v == 2) {
                //internet
            } else if (v == 3) {
                //Daqiqs SMS
            } else {
                println("You pressed the wrong key")

            }
        }
    }
}






