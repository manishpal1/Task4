package com.example.api.presentation.utils


import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.api.R
import com.example.api.domain.Entity.UserEntity
import com.example.api.domain.Entity.UserEntityR


//class ApiAdapter(mcontext: Context): RecyclerView.Adapter<ApiAdapter.ViewHolder>() {
//
//    var context:Context=mcontext
//    lateinit var mlistner : onItemClickListerner
//    //var product = mutableListOf<Article>()
//
//fun setProductList(product: List<UserEntity>) {
//        this.product.addAll(product.toMutableList())
//        notifyDataSetChanged()
//    }
//
//
//    interface onItemClickListerner {
//        fun onItemClick(position: )
//    }
//
//    inner class ViewHolder(val binding: Binding, listerner:onItemClickListerner):RecyclerView.ViewHolder(binding.root) {
//        init {
//            itemView.setOnClickListener {
//                listerner.onItemClick(product[adapterPosition])
//            }
//        }
//    }
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ApiAdapter.ViewHolder {
//        val inflater = LayoutInflater.from(parent.context)
//        val binding = NewsListBinding.inflate(inflater, parent, false)
//        return RecyclerView.ViewHolder(binding, mlistner)
//    }
//
//
//    override fun onBindViewHolder(holder: ApiAdapter.ViewHolder, position: Int) {
//        val currentItem = product[position]
//        holder.binding.txtTitle.text = currentItem.title
//        val url = currentItem.urlToImage
//        Glide.with(context).load(url).into(holder.binding.imgRecyclerItem)
//
//    }
//
//    override fun getItemCount(): Int {
//        return product.size
//    }
//}

class ApiAdapter(private val dataSet: ArrayList<UserEntityR>) :
    RecyclerView.Adapter<ApiAdapter.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView
        val textView1:TextView
        val textView2:TextView


        init {
            // Define click listener for the ViewHolder's View.
            textView = view.findViewById(R.id.textView)
            textView1 = view.findViewById(R.id.textView2)
            textView2 = view.findViewById(R.id.textView3)

        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.list_item, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.textView.text = dataSet[position].employee_name
        viewHolder.textView1.text = dataSet[position].employee_age.toString()
        viewHolder.textView2.text = dataSet[position].employee_salary.toString()
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}
