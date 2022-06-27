package com.yasin.dividerdecoration

import android.content.Context
import android.widget.TextView
import com.yasin.decoration.BaseRecyclerAdapter
import com.yasin.decoration.BaseViewHolder

/**
 * 邮箱：lengyacheng@163.com
 * Created by yasin on 2021/12/18.
 */
class UserAdapter(context: Context) : BaseRecyclerAdapter<User>(context, R.layout.item_view_user){
    override fun bindViewHolder(holder: BaseViewHolder?, itemData: User?, position: Int) {
        if (holder==null || itemData==null) return
        holder.findViewById<TextView>(R.id.item_name).text=itemData.head

        holder.findViewById<TextView>(R.id.item_context).text=itemData.context

    }


    fun addData(list:List<User>){

        dataList.addAll(list)

    }
}