package net.sgonzalez.kplayground.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import net.sgonzalez.kplayground.R

class MainFragment : BaseFragment() {
  override fun onCreateView(inflater: LayoutInflater?,
                            container: ViewGroup?,
                            savedInstanceState: Bundle?): View? {
    return inflater!!.inflate(R.layout.fragment_main, container, false)
  }
}
