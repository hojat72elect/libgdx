package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Matrix4;

public interface ImmediateModeRenderer {
    public void begin(Matrix4 projModelView, int primitiveType);

    public void flush();

    public void color(Color color);

    public void color(float r, float g, float b, float a);

    public void color(float colorBits);

    public void texCoord(float u, float v);

    public void normal(float x, float y, float z);

    public void vertex(float x, float y, float z);

    public void end();

    public int getNumVertices();

    public int getMaxVertices();

    public void dispose();
}
