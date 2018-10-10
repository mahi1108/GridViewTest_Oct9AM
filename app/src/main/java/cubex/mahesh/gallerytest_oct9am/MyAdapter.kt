package cubex.mahesh.gallerytest_oct9am

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.CompoundButton
import kotlinx.android.synthetic.main.indiview.view.*
import java.io.File

class MyAdapter(var mActivity:MainActivity,
                            var files:Array<File>) : BaseAdapter( )
{


    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var inflater = LayoutInflater.from(mActivity)
        var view = inflater.inflate(R.layout.indiview,null)
        var f = files[p0]
        view.vview.setVideoURI(Uri.fromFile(f))
        view.cb1.setText(f.name)
        view.cb1.setOnCheckedChangeListener{
            compoundButton: CompoundButton, b: Boolean ->
            if(b){
                view.vview.start()
            }else{
                view.vview.pause()
            }
        }
        return  view
    }

    override fun getItem(p0: Int): Any {
        return 0
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return files.size
    }

}