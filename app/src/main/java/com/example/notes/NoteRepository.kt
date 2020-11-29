package com.example.notes

import androidx.lifecycle.LiveData

class NoteRepository(private val notedao:NoteDao) {
    val allNotes:LiveData<List<Note>> = notedao.getAll()
    suspend fun insert(note:Note){
        notedao.insert(note)
    }
    suspend fun delete(note:Note){
        notedao.delete(note)
    }

}