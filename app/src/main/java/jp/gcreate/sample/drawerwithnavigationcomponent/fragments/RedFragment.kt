package jp.gcreate.sample.drawerwithnavigationcomponent.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentStatePagerAdapter
import jp.gcreate.sample.drawerwithnavigationcomponent.R
import kotlinx.android.synthetic.main.fragment_red.*

class RedFragment : Fragment() {
    
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_red, container, false)
    }
    
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        
        tab_layout.setupWithViewPager(viewpager)
        viewpager.adapter = object : FragmentStatePagerAdapter(childFragmentManager) {
            override fun getItem(position: Int): Fragment = SubPageFragment.createInstance(position)
            
            override fun getCount(): Int = 3
            
            override fun getPageTitle(position: Int): CharSequence? = "Num$position"
        }
    }
}
