package com.badlogic.gdx.tests.gles2

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Mesh
import com.badlogic.gdx.graphics.VertexAttribute
import com.badlogic.gdx.graphics.VertexAttributes.Usage
import com.badlogic.gdx.graphics.glutils.ShaderProgram
import com.badlogic.gdx.tests.utils.GdxTest

class HelloTriangle : GdxTest() {

    private lateinit var shader: ShaderProgram
    private lateinit var mesh: Mesh

    override fun create() {

        val vertexShader = """attribute vec4 vPosition;    
void main()                  
{                            
   gl_Position = vPosition;  
}                            
"""
        val fragmentShader = """#ifdef GL_ES
precision mediump float;
#endif
void main()                                  
{                                            
  gl_FragColor = vec4 ( 1.0, 1.0, 1.0, 1.0 );
}"""

        shader = ShaderProgram(vertexShader, fragmentShader)
        mesh = Mesh(true, 3, 0, VertexAttribute(Usage.Position, 3, "vPosition"))
        val vertices = floatArrayOf(0.0f, 0.5f, 0.0f, -0.5f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f)
        mesh.setVertices(vertices)
    }

    override fun render() {
        Gdx.gl20.glViewport(0, 0, Gdx.graphics.backBufferWidth, Gdx.graphics.backBufferHeight)
        Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT)
        shader.bind()
        mesh.render(shader, GL20.GL_TRIANGLES)
    }
}