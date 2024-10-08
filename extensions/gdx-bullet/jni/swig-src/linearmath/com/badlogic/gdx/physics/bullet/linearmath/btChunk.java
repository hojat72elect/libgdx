/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.physics.bullet.BulletBase;

public class btChunk extends BulletBase {
    private long swigCPtr;

    protected btChunk(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, cPtr, cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btChunk, normally you should not need this constructor it's intended for low-level usage.
     */
    public btChunk(long cPtr, boolean cMemoryOwn) {
        this("btChunk", cPtr, cMemoryOwn);
        construct();
    }

    public btChunk() {
        this(LinearMathJNI.new_btChunk(), true);
    }

    public static long getCPtr(btChunk obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    @Override
    protected void reset(long cPtr, boolean cMemoryOwn) {
        if (!destroyed) destroy();
        super.reset(swigCPtr = cPtr, cMemoryOwn);
    }

    @Override
    protected void finalize() throws Throwable {
        if (!destroyed) destroy();
        super.finalize();
    }

    @Override
    protected synchronized void delete() {
        if (swigCPtr != 0) {
            if (swigCMemOwn) {
                swigCMemOwn = false;
                LinearMathJNI.delete_btChunk(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public int getChunkCode() {
        return LinearMathJNI.btChunk_chunkCode_get(swigCPtr, this);
    }

    public void setChunkCode(int value) {
        LinearMathJNI.btChunk_chunkCode_set(swigCPtr, this, value);
    }

    public int getLength() {
        return LinearMathJNI.btChunk_length_get(swigCPtr, this);
    }

    public void setLength(int value) {
        LinearMathJNI.btChunk_length_set(swigCPtr, this, value);
    }

    public long getOldPtr() {
        return LinearMathJNI.btChunk_oldPtr_get(swigCPtr, this);
    }

    public void setOldPtr(long value) {
        LinearMathJNI.btChunk_oldPtr_set(swigCPtr, this, value);
    }

    public int getDna_nr() {
        return LinearMathJNI.btChunk_dna_nr_get(swigCPtr, this);
    }

    public void setDna_nr(int value) {
        LinearMathJNI.btChunk_dna_nr_set(swigCPtr, this, value);
    }

    public int getNumber() {
        return LinearMathJNI.btChunk_number_get(swigCPtr, this);
    }

    public void setNumber(int value) {
        LinearMathJNI.btChunk_number_set(swigCPtr, this, value);
    }

}
