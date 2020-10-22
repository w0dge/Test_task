package wodge.programming.testtaskfromarcanit.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_user_info.view.*
import wodge.programming.testtaskfromarcanit.R
import wodge.programming.testtaskfromarcanit.model.Users
import wodge.programming.testtaskfromarcanit.util.getProgressDrawable

class UserListAdapter(var users: ArrayList<Users>):
    RecyclerView.Adapter<UserListAdapter.UserViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = UserViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_user_info, parent, false)
    )

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(users[position])
    }

    override fun getItemCount() = users.size

    class UserViewHolder(view: View): RecyclerView.ViewHolder(view) {

        private val name = view.userName
        private val phone = view.phone
        private val email = view.email
        private val progressDrawable = getProgressDrawable(view.context)

        fun bind(user: Users) {
            name.text = user.userName
            phone.text = user.userPhone
            email.text = user.userEmail

        }
    }
}