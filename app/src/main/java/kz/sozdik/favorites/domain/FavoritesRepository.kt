package kz.sozdik.favorites.domain

import kz.sozdik.dictionary.domain.model.Word

interface FavoritesRepository {
    suspend fun getFavoriteWordsCount(): Int

    suspend fun getFavorites(langFrom: String): List<Word>

    suspend fun clearFavorites(langFrom: String)

    suspend fun createFavoritePhrase(word: Word): Word

    suspend fun deleteFavoritePhrase(word: Word): Word
}