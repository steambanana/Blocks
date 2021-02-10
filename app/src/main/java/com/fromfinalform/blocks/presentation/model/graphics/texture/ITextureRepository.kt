/*
 * Created by S.Dobranos on 05.02.21 20:01
 * Copyright (c) 2021. All rights reserved.
 */

package com.fromfinalform.blocks.presentation.model.graphics.texture

interface ITextureRepository {
    operator fun get(assetId: Int): Int
    operator fun get(path: String): Int
}