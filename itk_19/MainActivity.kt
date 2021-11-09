package com.famco.itk_19

import android.content.Intent
import android.media.Image
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class MainActivity : AppCompatActivity() {

    /** Getting reference for imageview **/
    val web1 = findViewById<ImageView>(R.id.web1)
    val web2 = findViewById<ImageView>(R.id.web2)
    val web3 = findViewById<ImageView>(R.id.web3)
    val help = findViewById<ImageView>(R.id.help)

    // Extra tag for log statement
    companion object{
        val TAG = "TAG"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Viewpager function
        viewPagerImages()

        // Setting different viewImages
        web1.setOnClickListener { view ->
            if (view == web1) {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("http://itkorba.ac.in")
                startActivity(intent)
            }
        }
    }
    private fun viewPagerImages() {
        // Here's code are responsible for viewPager
        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.college1,"IT Korba"))
        imageList.add(SlideModel("https://upload.wikimedia.org/wikipedia/commons/0/01/Itkorba.gif","Bird Eye View of IT College Korba"))
        imageList.add(SlideModel("https://images.bhaskarassets.com/webp/thumb/540x0/web2images/521/2019/12/06/mpcg-ci1099900-large.jpg","IT Korba"))
        imageSlider.setImageList(imageList, ScaleTypes.CENTER_CROP)
        /*-- ViewPage code are ended */
    }
}