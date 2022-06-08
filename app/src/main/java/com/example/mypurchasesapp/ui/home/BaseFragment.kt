package com.example.mypurchasesapp.ui.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.mypurchasesapp.AppDatabase
import com.example.mypurchasesapp.MainActivity
import com.example.mypurchasesapp.arch.PurchasesViewModel

/**
 * @author Mingaleev D. 08.06.2022
 **/
open class BaseFragment : Fragment() {

    protected val mainActivity: MainActivity
        get() = activity as MainActivity

    protected val appDatabase: AppDatabase
        get() = AppDatabase.getDatabase(requireActivity())

    protected val sharedViewModel : PurchasesViewModel by activityViewModels()
}