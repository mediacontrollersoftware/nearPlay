package media.controller.nearplay.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import media.controller.nearplay.R
import media.controller.nearplay.databinding.FragmentQueueBinding

@AndroidEntryPoint
class Queue : Fragment(R.layout.fragment_queue) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(FragmentQueueBinding.bind(view)) {

    }

}
