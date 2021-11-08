package com.dicoding.latihan.lightnovel.adp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dicoding.latihan.lightnovel.R
import com.dicoding.latihan.lightnovel.User
import kotlinx.android.synthetic.main.item_grid.view.*

class GridCardAdapter(private val listUser: ArrayList<User>, private val mContext: Context, private val callback: DcListCallback) : RecyclerView.Adapter<GridCardAdapter.ViewHolder>() {


    var onItemClickListener: ((User) -> Unit)? = null

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(user: User) {
            with(itemView) {
                Glide.with(itemView.context)
                    .load(user.avatar)
                    .into(img_item_photo)
                tv_item_name.text = user.name
                tv_item_detail.text = user.description

                btn_set_favorite.setOnClickListener {
                    Toast.makeText(mContext, "Favorit " + user.name, Toast.LENGTH_SHORT).show() }

                btn_set_share.setOnClickListener {callback.onShareClick(user)}

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_grid, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listUser[position])
        holder.itemView.setOnClickListener {
            onItemClickListener?.invoke(listUser[position])
        }

    }

    override fun getItemCount(): Int = listUser.size

}