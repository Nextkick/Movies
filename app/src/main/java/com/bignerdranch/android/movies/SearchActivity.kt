package com.bignerdranch.android.movies

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        val isFragmentContainerEmpty =
            savedInstanceState == null
        if (isFragmentContainerEmpty) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container_search, FilmChooseListFragment.newInstance(
                    intent.getStringExtra("TITLE").toString(),
                    intent.getStringExtra("YEAR").toString()
                ))
                .commit()
        }
    }
}