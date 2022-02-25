package com.smarttoolfactory.tutorial1_3navigation_nestednavhost.blankfragment

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.smarttoolfactory.tutorial1_3navigation_nestednavhost.R
import com.smarttoolfactory.tutorial1_3navigation_nestednavhost.databinding.FragmentDashboard1Binding


class DashboardFragment11 : BaseDataBindingFragment<FragmentDashboard1Binding>() {

    override fun getLayoutRes(): Int = R.layout.fragment_dashboard1

    var count = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataBinding.tvTitle.text = "${this.javaClass.simpleName} Count: $count"

        dataBinding.btnIncrease.setOnClickListener {
            dataBinding.tvTitle.text = "${this.javaClass.simpleName} Count: ${count++}"
        }

        dataBinding.btnNextPage.setOnClickListener {
            findNavController().popBackStack(R.id.dashboardFragment22, true)
            findNavController().navigate(R.id.dashboardFragment22)

        }
    }
}
