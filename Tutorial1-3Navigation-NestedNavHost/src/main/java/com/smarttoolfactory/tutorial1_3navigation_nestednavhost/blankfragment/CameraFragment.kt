package com.smarttoolfactory.tutorial1_3navigation_nestednavhost.blankfragment

import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.smarttoolfactory.tutorial1_3navigation_nestednavhost.R
import com.smarttoolfactory.tutorial1_3navigation_nestednavhost.databinding.FragmentCameraBinding

class CameraFragment : BaseDataBindingFragment<FragmentCameraBinding>() {

    override fun getLayoutRes(): Int = R.layout.fragment_camera

    private var navController: NavController? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nestedNavHostFragment =
            childFragmentManager.findFragmentById(R.id.main_nav_host_fragment2) as NavHostFragment
        navController = nestedNavHostFragment.navController
    }
}
