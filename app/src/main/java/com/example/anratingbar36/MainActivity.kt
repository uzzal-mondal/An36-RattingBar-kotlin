package com.example.anratingbar36

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ratingBar = findViewById<RatingBar>(R.id.ratingBarid);
        var btn= findViewById<Button>(R.id.buttonid);
        var text1 = findViewById<TextView>(R.id.textViewid)
        text1.setText("Value : "+ratingBar.progress)



        ratingBar.setOnRatingBarChangeListener(object:RatingBar.OnRatingBarChangeListener{

            override fun onRatingChanged(ratingBar: RatingBar?, rating: Float, fromUser: Boolean) {
                //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

                text1.text = " Ratingbar Result $rating"

            }
        })



        /*

         3rd rules of

        if (ratingBar!=null){

            btn.setOnClickListener {

                val msg = ratingBar.rating.toString();
                text1.setText("The result of $msg")
            }
        }


       // rating bar click to show the text view

       // ratingBar.setOnRatingBarChangeListener(this)






                  // 1st rules of Rating Bar..
      ratingBar.setOnRatingBarChangeListener(object: RatingBar.OnRatingBarChangeListener{

          override fun onRatingChanged(ratingBar: RatingBar?, rating: Float, fromUser: Boolean) {
             // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

              text1.text = "Rating bar result $rating"
          }
      })




    }


                // 2nd rules of Rating bar ....
    override fun onRatingChanged(ratingBar: RatingBar?, rating: Float, fromUser: Boolean) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        var text1 = findViewById<TextView>(R.id.textViewid)
        text1.text = "Rating Bar Result : $rating"


*/

    }


}
