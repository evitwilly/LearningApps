package ru.freeit.hiltapp

import androidx.lifecycle.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import ru.freeit.hiltapp.data.repo.ChapterRepository
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repo: ChapterRepository) : ViewModel() {

    private val chapterText = MutableLiveData<ChapterUi>()

    fun observe(owner: LifecycleOwner, observer: Observer<ChapterUi>) = chapterText.observe(owner, observer)

    init {
        viewModelScope.launch {
            val chapter = repo.chapter()
            chapterText.value = chapter.ui()
        }
    }

}