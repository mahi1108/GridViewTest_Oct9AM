package cubex.mahesh.gallerytest_oct9am

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        readFiles()
    }

    fun readFiles( )
    {
        var path = "/storage/sdcard0/WhatsApp/Media/WhatsApp Video/"
        var f = File(path)
        if(!f.exists()){
            path = "/storage/emulated/0/WhatsApp/Media/WhatsApp Video/"
            f = File(path)
        }
        var files:Array<File> = f.listFiles( )
        gallery.adapter = MyAdapter(this@MainActivity,files)
    }
}
