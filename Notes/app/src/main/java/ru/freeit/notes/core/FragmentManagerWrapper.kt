package ru.freeit.notes.core

import android.widget.TextView
import androidx.annotation.AnimRes
import androidx.annotation.AnimatorRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import ru.freeit.notes.R

class FragmentManagerWrapper(private val manager: FragmentManager) {
    fun replace(fragment: Fragment) {
        manager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
    fun replaceWithAnim(
        fragment: Fragment,
        @AnimRes enterAnim: Int,
        @AnimRes exitAnim: Int,
        @AnimRes popEnter: Int,
        @AnimRes popExit: Int
    ) {
        manager.beginTransaction()
            .setCustomAnimations(enterAnim, exitAnim, popEnter, popExit)
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}