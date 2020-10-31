package com.skill_factory.unit8

import android.graphics.Color
import android.os.Bundle
import android.transition.Slide
import android.transition.TransitionSet
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateInterpolator
import androidx.core.transition.addListener
import androidx.core.transition.doOnStart
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.skill_factory.unit8.SecondFragment

class MainFragment() : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.setOnClickListener {
            val a = activity as FragmentActivity
            a.supportFragmentManager.beginTransaction().replace(R.id.root, SecondFragment()).addToBackStack("MainFragment").commit()
        }
    }
}
