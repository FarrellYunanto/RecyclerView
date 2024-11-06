package infor.c14220016.recyclerview

import androidx.recyclerview.widget.RecyclerView

data class wayang(
    var foto : String,
    var nama : String,
    var karakter : String,
    var deskripsi : String
)

class adapterRecView(private val listwayang: ArrayList<wayang>): RecyclerView
.Adapter<adapterRecView.ListViewHodler>(){

}


