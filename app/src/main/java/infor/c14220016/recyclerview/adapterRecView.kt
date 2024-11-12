package infor.c14220016.recyclerview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class adapterRecView(private val listwayang: ArrayList<wayang>): RecyclerView
.Adapter<adapterRecView.ListViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): adapterRecView.ListViewHolder {
        val view : View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycler, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: adapterRecView.ListViewHolder, position: Int) {
        var wayang: wayang = listwayang[position]

        holder._namaWayang.setText(wayang.nama)
        holder._deskripsiWayang.setText(wayang.deskripsi)
        holder._karakterWayang.setText(wayang.karakter)
        Log.d("TEST", wayang.foto)
        Picasso.get()
            .load(wayang.foto)
            .into(holder._fotoWayang)
    }

    override fun getItemCount(): Int {
        return listwayang.size
    }

    inner class ListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var _namaWayang = itemView.findViewById<TextView>(R.id.namaWayang)
        var _karakterWayang = itemView.findViewById<TextView>(R.id.karakterWayang)
        var _deskripsiWayang = itemView.findViewById<TextView>(R.id.deskripsiWayang)
        var _fotoWayang = itemView.findViewById<ImageView>(R.id.gambarWayang)
    }
}