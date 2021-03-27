package com.ck.test.cloudinterview_chengkai.ui.phone

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.ck.test.cloudinterview_chengkai.R
import com.ck.test.cloudinterview_chengkai.ui.phone.content.CardFragment

/**
 *
 * @author ChengKai YH
 * @version $
 * <p/>
 * <p/> $
 */
class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return CardFragment()
            else -> return CardFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "容幣紀錄"
            1 -> "兌換卷(2)"
            else -> ""
        }
    }
}