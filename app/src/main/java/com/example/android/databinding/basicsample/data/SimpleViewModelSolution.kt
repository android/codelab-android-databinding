/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.databinding.basicsample.data

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField
import android.databinding.ObservableInt
import com.example.android.databinding.basicsample.data.Popularity.NORMAL

/**
 * A VM for [com.example.android.databinding.basicsample.ui.SolutionActivity].
 */
class SimpleViewModelSolution : ViewModel() {
    val name = "Grace"
    val lastName = "Hopper"
    val likes = ObservableInt()
    val popularity = ObservableField<Popularity>(NORMAL)

    /**
     * Increments the number of likes.
     */
    fun onLike() {
        likes.set(likes.get() + 1)

        popularity.set(likes.get().let {
            when {
                it > 9 -> Popularity.STAR
                it > 4 -> Popularity.POPULAR
                else -> Popularity.NORMAL
            }
        })
    }
}