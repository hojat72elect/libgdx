package com.badlogic.gdx.tests.utils

import com.badlogic.gdx.ApplicationListener
import com.badlogic.gdx.KotlinInputAdapter

abstract class GdxTest : KotlinInputAdapter(), ApplicationListener {

    override fun create() {

    }

    override fun resize(width: Int, height: Int) {

    }

    override fun render() {

    }

    override fun pause() {

    }

    override fun resume() {

    }

    override fun dispose() {

    }
}