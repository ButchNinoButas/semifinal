package com.ucb.semifinals.butas.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.ucb.semifinals.butas.R
import com.ucb.semifinals.butas.models.Schedule

class StudentAdapter(private val context: Context, private val students: List<Schedule>) : BaseAdapter() {

    override fun getCount(): Int = students.size

    override fun getItem(position: Int): Any = students[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: LayoutInflater.from(context).inflate(R.layout.butas_list_item, parent, false)

        val student = students[position]
        val ivProfile: ImageView = view.findViewById(R.id.ivProfile)
        val tvName: TextView = view.findViewById(R.id.tvName)
        val tvIdNumber: TextView = view.findViewById(R.id.tvIdNumber)
        val tvProgram: TextView = view.findViewById(R.id.tvProgram)


        // Set data to views
        tvName.text = context.getString(R.string.name_label, student.name)
        tvIdNumber.text = context.getString(R.string.id_label, student.idNumber)
        tvProgram.text = context.getString(R.string.program_label, student.program)

        // Set student profile image
        ivProfile.setImageResource(student.profileImage)


        return view
    }
}
