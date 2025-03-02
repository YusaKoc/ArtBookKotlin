package com.yusakoc.artbookkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yusakoc.artbookkotlin.databinding.RecylerRowBinding


class ArtAdapter(val artList:  ArrayList<Art>) : RecyclerView.Adapter<ArtAdapter.ArtHolder>() {

    class ArtHolder(val binding : RecylerRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtHolder {
        val binding = RecylerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ArtHolder(binding)
    }

    override fun getItemCount(): Int {
        return artList.size
    }

    override fun onBindViewHolder(holder: ArtHolder, position: Int) {
        holder.binding.recylerViewTextView.text = artList.get(position).name
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context,MainActivity2::class.java)
            intent.putExtra("info","old")
            intent.putExtra("id",artList.get(position).id)
            holder.itemView.context.startActivity(intent)
        }
    }

}