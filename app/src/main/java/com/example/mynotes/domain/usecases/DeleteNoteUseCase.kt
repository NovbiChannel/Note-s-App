package com.example.mynotes.domain.usecases

import com.example.mynotes.domain.model.Note
import com.example.mynotes.domain.repository.NoteRepository
import javax.inject.Inject

class DeleteNoteUseCase @Inject constructor(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.deleteNote(note = note)
}