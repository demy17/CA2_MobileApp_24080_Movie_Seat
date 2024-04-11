package com.example.movie_seat_24080

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class movie_details : AppCompatActivity() {
    private var seatsRemaining = 0
    private var seatsSelected = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movie_details)

        val movie = intent.getParcelableExtra<Movie>("movie")

        seatsRemaining = movie?.seatsRemaining ?: 0
        seatsSelected = 0

        val movieImage = findViewById<ImageView>(R.id.movie_poster)
        val movieTitle = findViewById<TextView>(R.id.movie_name)
        val movieCertification = findViewById<TextView>(R.id.certification)
        val movieDescription = findViewById<TextView>(R.id.description)
        val movieStarring = findViewById<TextView>(R.id.movie_starring)
        val movieRunningTime = findViewById<TextView>(R.id.running_time_mins)
        val movieSeatsRemaining = findViewById<TextView>(R.id.movie_seats_remaining)
        val minusButton = findViewById<ImageView>(R.id.minus_button)
        val plusButton = findViewById<ImageView>(R.id.plus_button)

        Glide.with(movieImage.context)
            .load(movie?.image)
            .into(movieImage)
        movieTitle.text = movie?.name
        movieCertification.text = movie?.certification
        movieDescription.text = movie?.description
        movieStarring.text = "Starring: ${movie?.starring?.joinToString(", ")}"
        movieRunningTime.text = "Running time: ${movie?.runningTime} minutes"
        movieSeatsRemaining.text = "Seats remaining: $seatsRemaining"

        minusButton.setOnClickListener {
            if (seatsSelected > 0) {
                seatsSelected--
                seatsRemaining++
                updateSeatsText()
                updateSeatsRemainingText()
            }
        }
        plusButton.setOnClickListener {
            if (seatsRemaining > 0) {
                seatsSelected++
                seatsRemaining--
                updateSeatsText()
                updateSeatsRemainingText()
            }
        }

        updateSeatsText()
        updateSeatsRemainingText()
    }

    override fun onBackPressed() {
        val resultIntent = Intent()
        resultIntent.putExtra("seats_selected", seatsSelected)
        setResult(RESULT_OK, resultIntent)
        super.onBackPressed()
    }

    private fun updateSeatsText() {
        findViewById<TextView>(R.id.seats_selected_text).text = seatsSelected.toString()
    }

    private fun updateSeatsRemainingText() {
        val seatsRemainingText = findViewById<TextView>(R.id.seats_remaining_text)
        seatsRemainingText.text = seatsRemaining.toString()

        findViewById<ImageView>(R.id.minus_button).isEnabled = seatsSelected > 0
        findViewById<ImageView>(R.id.plus_button).isEnabled = seatsRemaining > 0
    }
}

