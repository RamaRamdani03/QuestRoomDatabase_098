package com.example.room_local_db_part1.ui.view.mahasiswa

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.room_local_db_part1.ui.viewmodel.PenyediaViewModel
import com.example.room_local_db_part1.ui.viewmodel.updateMhsViewModel

@Composable
fun UpdateMhsView(
    onBack : () -> Unit,
    onNavigate : () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: updateMhsViewModel = viewModel (factory = PenyediaViewModel.Factory) //Initialize ViewModel
) {

}