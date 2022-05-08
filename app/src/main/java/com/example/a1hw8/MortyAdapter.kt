package com.example.a1hw8

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a1hw8.databinding.FragmentMainBinding

class MortyAdapter: RecyclerView.Adapter<MortyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MortyViewHolder {
        return MortyViewHolder(FragmentMainBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MortyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}
class MortyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}