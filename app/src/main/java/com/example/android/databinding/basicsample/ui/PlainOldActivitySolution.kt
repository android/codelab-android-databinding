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

package com.example.android.databinding.basicsample.ui

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.android.databinding.basicsample.R
import com.example.android.databinding.basicsample.data.SimpleViewModelSolution
import com.example.android.databinding.basicsample.databinding.PlainActivitySolutionBinding

/**
 * This activity shows shows static data and lets the user increment the
 * number of likes by clicking a button. See [ViewModelActivity] for a better implementation.
 */
class PlainOldActivitySolution : AppCompatActivity() {

    // Obtain ViewModel from ViewModelProviders
    private val viewModel by lazy {
        ViewModelProviders.of(this).get(SimpleViewModelSolution::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: PlainActivitySolutionBinding =
            DataBindingUtil.setContentView(this, R.layout.plain_activity_solution)

        binding.viewmodel = viewModel
    }
}
