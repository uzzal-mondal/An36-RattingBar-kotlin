# An36-RattingBar-kotlin

RatingButton

1.	Important method, setOnRatingBarChangesListner then override fun onRatingChanged 

2.	Rattingbar.getProgress this is work to method , by default ratting show within set text a textview.


3.	Create a constraint layout .
  xml file create

android:numStars="4"
android:rating="3"
android:stepSize="1"
android:progressBackgroundTint="#FF5722"
android:progressTint="#3AB78B"

4.	With in create a text view in show  result.

5.	Mainactiviy use to findViewById rating bar and Text view.


6.	Firstof all call setOnRattingBarChangedListner create a object and call to RattingBar.OnRattingBarChangeListner  with override to fun  then call to onRattingChanged there are want to three parameter  like RatingBar , ratingBar, formUser.

7.	Second if I use to  condition of if  when if condition isn’t null so it is working including button call to setOnClickListner. With set to text view that is waiting for your result before the run.

8.	When I am text to setText  then call to rattingbar.progress..
Then result to value..

Codding:


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
 // then show the ratting bar progress now stand : like 3
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



