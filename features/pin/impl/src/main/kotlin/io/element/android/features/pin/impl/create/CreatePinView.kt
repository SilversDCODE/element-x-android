/*
 * Copyright (c) 2023 New Vector Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.element.android.features.pin.impl.create

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewParameter
import io.element.android.libraries.designsystem.preview.ElementPreview
import io.element.android.libraries.designsystem.preview.PreviewsDayNight
import io.element.android.libraries.designsystem.theme.components.Text
import timber.log.Timber

@Composable
fun CreatePinView(
    state: CreatePinState,
    modifier: Modifier = Modifier,
) {
    Timber.d("CreatePinView: $state")
    Box(modifier, contentAlignment = Alignment.Center) {
        Text(
            "CreatePin feature view",
            color = MaterialTheme.colorScheme.primary,
        )
    }
}

@Composable
@PreviewsDayNight
internal fun CreatePinViewLightPreview(@PreviewParameter(CreatePinStateProvider::class) state: CreatePinState) {
    ElementPreview {
        CreatePinView(
            state = state,
        )
    }
}