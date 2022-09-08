package com.app.mynotes.ui.main

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.app.mynotes.database.Note
import com.app.mynotes.repository.NoteRepository

class MainViewModel(application: Application)  : ViewModel() {

    private val mNoteRepository: NoteRepository = NoteRepository(application)

    fun getAllNotes(): LiveData<List<Note>> = mNoteRepository.getAllNotes()
}