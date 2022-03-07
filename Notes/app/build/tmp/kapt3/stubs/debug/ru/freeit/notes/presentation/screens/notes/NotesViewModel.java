package ru.freeit.notes.presentation.screens.notes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\u0012J\"\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0018J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\fJ\u0006\u0010\u001b\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u0012J\u0006\u0010\u001d\u001a\u00020\u0012J\u0006\u0010\u001e\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lru/freeit/notes/presentation/screens/notes/NotesViewModel;", "Lru/freeit/notes/core/CoroutineViewModel;", "noteRepo", "Lru/freeit/notes/domain/repository/NoteRepository;", "tagRepo", "Lru/freeit/notes/domain/repository/TagRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lru/freeit/notes/domain/repository/NoteRepository;Lru/freeit/notes/domain/repository/TagRepository;Landroidx/lifecycle/SavedStateHandle;)V", "notes", "Lru/freeit/notes/core/LiveDataWrapper;", "", "Lru/freeit/notes/domain/entity/Note;", "sortingKey", "", "sortingType", "Lru/freeit/notes/domain/entity/SortingType;", "fetchNotes", "", "init", "observeNotes", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "remove", "note", "sortByCreatedDate", "sortByEditedDate", "sortByTitle", "sortDefault", "app_debug"})
public final class NotesViewModel extends ru.freeit.notes.core.CoroutineViewModel {
    private final ru.freeit.notes.domain.repository.NoteRepository noteRepo = null;
    private final ru.freeit.notes.domain.repository.TagRepository tagRepo = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    private final ru.freeit.notes.core.LiveDataWrapper<java.util.List<ru.freeit.notes.domain.entity.Note>> notes = null;
    private ru.freeit.notes.domain.entity.SortingType sortingType = ru.freeit.notes.domain.entity.SortingType.TITLE;
    private final java.lang.String sortingKey = "sorting_key";
    
    public NotesViewModel(@org.jetbrains.annotations.NotNull()
    ru.freeit.notes.domain.repository.NoteRepository noteRepo, @org.jetbrains.annotations.NotNull()
    ru.freeit.notes.domain.repository.TagRepository tagRepo, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    public final void observeNotes(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<java.util.List<ru.freeit.notes.domain.entity.Note>> observer) {
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull()
    ru.freeit.notes.domain.entity.Note note) {
    }
    
    public final void init() {
    }
    
    public final void sortDefault() {
    }
    
    public final void sortByTitle() {
    }
    
    public final void sortByEditedDate() {
    }
    
    public final void sortByCreatedDate() {
    }
    
    private final void fetchNotes() {
    }
}