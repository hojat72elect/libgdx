package com.badlogic.gdx.tests.gles2

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Mesh
import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.Texture.TextureFilter
import com.badlogic.gdx.graphics.VertexAttribute
import com.badlogic.gdx.graphics.VertexAttributes.Usage
import com.badlogic.gdx.graphics.glutils.ShaderProgram
import com.badlogic.gdx.tests.utils.GdxTest

class MipMap2D : GdxTest() {

    private lateinit var shader: ShaderProgram
    private lateinit var texture: Texture
    private lateinit var mesh: Mesh

    override fun create() {

        val vertexShader = """uniform float u_offset;      
attribute vec4 a_position;   
attribute vec2 a_texCoord;   
varying vec2 v_texCoord;     
void main()                  
{                            
   gl_Position = a_position; 
   gl_Position.x += u_offset;
   v_texCoord = a_texCoord;  
}                            
"""
        val fragmentShader = """#ifdef GL_ES
precision mediump float;
#endif
varying vec2 v_texCoord;                            
uniform sampler2D s_texture;                        
void main()                                         
{                                                   
  gl_FragColor = texture2D( s_texture, v_texCoord );
}                                                   
"""

        shader = ShaderProgram(vertexShader, fragmentShader)
        mesh = Mesh(
            true,
            4,
            6,
            VertexAttribute(Usage.Position, 4, "a_position"),
            VertexAttribute(Usage.TextureCoordinates, 2, "a_texCoord")
        )
        val vertices = floatArrayOf(
            -0.5f, 0.5f, 0.0f, 1.5f, // Position 0
            0.0f, 0.0f, // TexCoord 0
            -0.5f, -0.5f, 0.0f, 0.75f, // Position 1
            0.0f, 1.0f, // TexCoord 1
            0.5f, -0.5f, 0.0f, 0.75f, // Position 2
            1.0f, 1.0f, // TexCoord 2
            0.5f, 0.5f, 0.0f, 1.5f, // Position 3
            1.0f, 0.0f // TexCoord 3
        )
        val indices = shortArrayOf(0, 1, 2, 0, 2, 3)

        mesh.setVertices(vertices)
        mesh.setIndices(indices)
        createTexture()
    }

    private fun createTexture() {
        val pixmap = Pixmap(256, 256, Pixmap.Format.RGB565)
        var useRed = true
        for (y in 0 until 256 step 8) {
            for (x in 0 until 256 step 8) {
                pixmap.setColor(
                    if (useRed) 1f else 0f,
                    0f,
                    if (useRed) 0f else 1f,
                    1f
                )
                pixmap.fillRectangle(x, y, 8, 8)
                useRed = useRed.not()
            }
            useRed = useRed.not()
        }
        texture = Texture(pixmap, true)
        texture.setFilter(
            TextureFilter.MipMapLinearLinear,
            TextureFilter.Linear
        )
    }

    override fun resume() {
        createTexture()
    }

    override fun render() {
        Gdx.gl20.glViewport(
            0,
            0,
            Gdx.graphics.backBufferWidth,
            Gdx.graphics.backBufferHeight
        )
        Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT)

        Gdx.gl20.glActiveTexture(GL20.GL_TEXTURE0)
        texture.bind()
        shader.bind()
        shader.setUniformf("s_texture", 0f)

        Gdx.gl20.glTexParameteri(GL20.GL_TEXTURE_2D, GL20.GL_TEXTURE_MIN_FILTER, GL20.GL_NEAREST)
        shader.setUniformf("u_offset", -0.6f)
        mesh.render(shader, GL20.GL_TRIANGLES)

        Gdx.gl20.glTexParameteri(
            GL20.GL_TEXTURE_2D,
            GL20.GL_TEXTURE_MIN_FILTER,
            GL20.GL_LINEAR_MIPMAP_LINEAR
        )
        shader.setUniformf("u_offset", 0.6f)
        mesh.render(shader, GL20.GL_TRIANGLES)
    }
}