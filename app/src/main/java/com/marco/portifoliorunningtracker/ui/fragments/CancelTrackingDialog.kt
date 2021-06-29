package com.marco.portifoliorunningtracker.ui.fragments

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.marco.portifoliorunningtracker.R

class CancelTrackingDialog : DialogFragment() {

    private var yesListener: (() -> Unit)? = null

    fun setYesListener(listerner: () -> Unit){
        yesListener = listerner
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return  MaterialAlertDialogBuilder(requireContext(), R.style.AlertDialogTheme)
            .setTitle("Cancel the Run?")
            .setMessage("Are you sure to cancel the current run and delete all this data?")
            .setIcon(R.drawable.ic_delete)
            .setPositiveButton("Yes"){ _,_ ->
                yesListener?.let { yes ->
                    yes()

                }
            }
            .setNegativeButton("No"){ dialogInterface,_ ->
                dialogInterface.cancel()
            }
            .create()

    }
}