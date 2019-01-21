package jp.gcreate.sample.drawerwithnavigationcomponent.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import jp.gcreate.sample.drawerwithnavigationcomponent.R
import kotlinx.android.synthetic.main.fragment_sub_page.*

private const val ARG_PARAM1 = "param1"

class SubPageFragment : Fragment() {
    
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(
            R.layout.fragment_sub_page, container, false)
    }
    
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        text.text = "Fragment${arguments?.getInt(ARG_PARAM1, -1)}"
    }
    
    companion object {
        fun createInstance(num: Int): SubPageFragment {
            return SubPageFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_PARAM1, num)
                }
            }
        }
    }
}
