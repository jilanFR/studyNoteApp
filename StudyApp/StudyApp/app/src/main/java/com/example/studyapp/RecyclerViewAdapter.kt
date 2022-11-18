package com.example.studyapp


import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.cards_view.view.*

class RecyclerViewAdabter(private val activity: Activity, private val studyList: ArrayList<ArrayList<String>>):
    RecyclerView.Adapter<RecyclerViewAdabter.ItemViewHolder>() {
    class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.cards_view,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        holder.itemView.apply {
            textTitle.text = studyList[position][0]  //[0][0]
            textDetails.text = studyList[position][1] //[0][1]
            card_views.setOnClickListener { CustomAlertDialog(activity,
                studyList[position][0],
                studyList[position][2])}
        }
    }

    override fun getItemCount() = studyList.size
}