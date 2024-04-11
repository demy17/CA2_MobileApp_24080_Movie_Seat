package com.example.movie_seat_24080

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //MOVIE NAME, IMAGE, CERTIFICATION, DESCRIPTION, RUNNING TIME

        val movies = arrayOf(

            Movie(
                "THE FIRST OMEN",
                "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/d7f029cd-78a2-4f3b-a9f0-60898ec0751c_the-first-omen_posters_first-omen-the_teaser_1sheet-poster_unit.jpg?mw=450&rev=8628e0e3685f499fb16c21e5a9796491",
                "16",
                "When a young American woman is sent to Rome to begin a life of service to the church, she encounters a darkness that causes her to question her own faith .",
                arrayOf("Bill Nighy", "Ralph Ineson", "Sônia Braga", "Nell Tiger Free", "Tawfeek Barhom"),
                (Math.random() * 3).toInt(),
                120
            ),

            Movie(
                "CIVIL WAR",
                "https://www.myvue.com/-/jssmedia/vuecinemas/film-and-events/apr-2024/civil-war_sun_1sht_imax.jpg?mw=450&rev=6eb928814f0f4676a666f6f9552ff2e4",
                "15A",
                "In the near future, a team of journalists travel across the United States during a rapidly escalating civil war that has engulfed the entire nation.",
                arrayOf(
                    "Wagner Moura",
                    "Kirsten Dunst",
                    "Cailee Spaeny",
                    "Stephen McKinley Henderson"
                ),
                (Math.random() * 16).toInt(),
                109
            ),

            Movie(
                "AADUJEEVITHAM - THE GOAT LIFE",
                "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/4f0a5cff-2a8a-44cc-b666-e33b560ddaa9_aadujeevitham-malayalam_posters_aadujeevitham-1_712px.jpg?mw=450&rev=55474e2f43344f839e3d3f9f0eb250d5",
                "12A",
                "The real-life incident of an Indian migrant worker, Najeeb Muhammad, who goes to Saudi Arabia to earn money.",
                arrayOf("Ruseel Crowe", "Daniel Zovatto", "Franco Nero"),
                (Math.random() * 16).toInt(),
                161
            ),

            Movie(
                "GHOSTBUSTERS: FROZEN EMPIRE",
                "https://www.myvue.com/-/jssmedia/vuecinemas/film-and-events/feb-2024/ghostbusters-poster.jpg?mw=450&rev=890c7016efc4412293629c8d63844732",
                "12A",
                "In Ghostbusters: Frozen Empire, the Spengler family returns to where it all started – the iconic New York City firehouse – to team up with the original Ghostbusters.",
                arrayOf("Paul Rudd", "Bill Murray", "Finn Wolfhard", "Dan Aykroud", "Annie Potts", "Mckenna Grace", "Ernie Hudson"),
                (Math.random() * 16).toInt(),
                144
            ),

            Movie(
                "SUGA | AGUST D TOUR ‘D-DAY’ THE MOVIE",
                "https://www.myvue.com/-/jssmedia/vuecinemas/film-and-events/mar-2024/suga-bsm-poster.png?mw=450&rev=92e67236679741d09485dc8571a7835a",
                "12A",
                "<SUGA | Agust D TOUR ‘D-DAY’ THE MOVIE> is a film of the encore concert by Agust D, also known as SUGA of BTS. Tune in to relive the moments from the concert encompassing his rich musical world and performances, explosive energy, and joint performance, featuring behind-the-scenes and never before seen footage.",
                arrayOf("SUGA"),
                (Math.random() * 4).toInt(),
                84
            ),

            Movie(
                "KUNG FU PANDA 4",
                "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/a223aaeb-6a2d-4561-92f0-e3efa105a21e_kung-fu-panda-4_posters_kf4_intl_dgtl_payoff_1sheet_uk_712px.jpg?mw=450&rev=7239547d058742c7b4ee0899fe51c29e",
                "PG",
                "After Po is tapped to become the Spiritual Leader of the Valley of Peace, he needs to find and train a new Dragon Warrior, while a wicked sorceress plans to re-summon all the master villains whom Po has vanquished to the spirit realm.",
                arrayOf(
                    "Jack Black",
                    "Awkwafina",
                    "Viola David",
                    "Dustin Hoffman",
                    "Bryan Cranston",
                    "Mr. Beast"
                ),
                (Math.random() * 16).toInt(),
                94
            ),


            Movie(
                "KUNG FU PANDA 4",
                "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/a223aaeb-6a2d-4561-92f0-e3efa105a21e_kung-fu-panda-4_posters_kf4_intl_dgtl_payoff_1sheet_uk_712px.jpg?mw=450&rev=7239547d058742c7b4ee0899fe51c29e",
                "PG",
                "After Po is tapped to become the Spiritual Leader of the Valley of Peace, he needs to find and train a new Dragon Warrior, while a wicked sorceress plans to re-summon all the master villains whom Po has vanquished to the spirit realm.",
                arrayOf(
                    "Jack Black",
                    "Awkwafina",
                    "Viola David",
                    "Dustin Hoffman",
                    "Bryan Cranston",
                    "Mr. Beast"
                ),
                (Math.random() * 16).toInt(),
                94
            ),

            Movie(
                "GODZILLA X KONG: THE NEW EMPIRE",
                "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/7bf51248-5164-49ec-ab6f-090e904a263f_godzilla-x-kong-the-new-empire_posters_teaser---one-sheet_712px.jpg?mw=450&rev=013f431ef34d4bd98344d19d229a4345",
                "12A",
                "The new installment in the Monsterverse puts the mighty Kong and the fearsome Godzilla against a colossal deadly threat hidden within our world.",
                arrayOf("Rebecca Hall", "Dan Stevens", "Brian Tyree Henry" , "Fala Chen" , "Kaylee Hottle" , "Alex Ferns"),
                (Math.random() * 16).toInt(),
                161
            ),

            Movie(
                "MIGRATION",
                "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/fddf86f4-a848-4ffd-9a05-b602edc77b70_migration_posters_mig_intl_dgtl_one_sheet_opt_1_landing_uk_712p.jpg?mw=450&rev=69acf0619d6946d596b112f278bf4bd5",
                "PG",
                "A family of ducks decides to leave the safety of a New England pond for an adventurous trip to Jamaica. However, their well-laid plans quickly go awry when they get lost and wind up in New York City.",
                arrayOf(
                    "Elizabeth Banks",
                    "Danny DeVito",
                    "Keegan-Michael Key",
                    "Kumail Nanjinani",
                    "Awkwafina"
                ),
                (Math.random() * 16).toInt(),
                110
            ),




        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = MovieListAdapter(movies)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
