/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.softbody;

import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.physics.bullet.dynamics.*;

public class btSoftBodyConcaveCollisionAlgorithm extends btCollisionAlgorithm {
    private long swigCPtr;

    protected btSoftBodyConcaveCollisionAlgorithm(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, SoftbodyJNI.btSoftBodyConcaveCollisionAlgorithm_SWIGUpcast(cPtr), cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btSoftBodyConcaveCollisionAlgorithm, normally you should not need this constructor it's intended for
     * low-level usage.
     */
    public btSoftBodyConcaveCollisionAlgorithm(long cPtr, boolean cMemoryOwn) {
        this("btSoftBodyConcaveCollisionAlgorithm", cPtr, cMemoryOwn);
        construct();
    }

    public btSoftBodyConcaveCollisionAlgorithm(btCollisionAlgorithmConstructionInfo ci, btCollisionObjectWrapper body0Wrap,
                                               btCollisionObjectWrapper body1Wrap, boolean isSwapped) {
        this(SoftbodyJNI.new_btSoftBodyConcaveCollisionAlgorithm(btCollisionAlgorithmConstructionInfo.getCPtr(ci), ci,
                btCollisionObjectWrapper.getCPtr(body0Wrap), body0Wrap, btCollisionObjectWrapper.getCPtr(body1Wrap), body1Wrap,
                isSwapped), true);
    }

    public static long getCPtr(btSoftBodyConcaveCollisionAlgorithm obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    @Override
    protected void reset(long cPtr, boolean cMemoryOwn) {
        if (!destroyed) destroy();
        super.reset(SoftbodyJNI.btSoftBodyConcaveCollisionAlgorithm_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
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
                SoftbodyJNI.delete_btSoftBodyConcaveCollisionAlgorithm(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public void clearCache() {
        SoftbodyJNI.btSoftBodyConcaveCollisionAlgorithm_clearCache(swigCPtr, this);
    }

    static public class CreateFunc extends btCollisionAlgorithmCreateFunc {
        private long swigCPtr;

        protected CreateFunc(final String className, long cPtr, boolean cMemoryOwn) {
            super(className, SoftbodyJNI.btSoftBodyConcaveCollisionAlgorithm_CreateFunc_SWIGUpcast(cPtr), cMemoryOwn);
            swigCPtr = cPtr;
        }

        /**
         * Construct a new CreateFunc, normally you should not need this constructor it's intended for low-level usage.
         */
        public CreateFunc(long cPtr, boolean cMemoryOwn) {
            this("CreateFunc", cPtr, cMemoryOwn);
            construct();
        }

        public CreateFunc() {
            this(SoftbodyJNI.new_btSoftBodyConcaveCollisionAlgorithm_CreateFunc(), true);
        }

        public static long getCPtr(CreateFunc obj) {
            return (obj == null) ? 0 : obj.swigCPtr;
        }

        @Override
        protected void reset(long cPtr, boolean cMemoryOwn) {
            if (!destroyed) destroy();
            super.reset(SoftbodyJNI.btSoftBodyConcaveCollisionAlgorithm_CreateFunc_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
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
                    SoftbodyJNI.delete_btSoftBodyConcaveCollisionAlgorithm_CreateFunc(swigCPtr);
                }
                swigCPtr = 0;
            }
            super.delete();
        }

    }

    static public class SwappedCreateFunc extends btCollisionAlgorithmCreateFunc {
        private long swigCPtr;

        protected SwappedCreateFunc(final String className, long cPtr, boolean cMemoryOwn) {
            super(className, SoftbodyJNI.btSoftBodyConcaveCollisionAlgorithm_SwappedCreateFunc_SWIGUpcast(cPtr), cMemoryOwn);
            swigCPtr = cPtr;
        }

        /**
         * Construct a new SwappedCreateFunc, normally you should not need this constructor it's intended for low-level usage.
         */
        public SwappedCreateFunc(long cPtr, boolean cMemoryOwn) {
            this("SwappedCreateFunc", cPtr, cMemoryOwn);
            construct();
        }

        public SwappedCreateFunc() {
            this(SoftbodyJNI.new_btSoftBodyConcaveCollisionAlgorithm_SwappedCreateFunc(), true);
        }

        public static long getCPtr(SwappedCreateFunc obj) {
            return (obj == null) ? 0 : obj.swigCPtr;
        }

        @Override
        protected void reset(long cPtr, boolean cMemoryOwn) {
            if (!destroyed) destroy();
            super.reset(SoftbodyJNI.btSoftBodyConcaveCollisionAlgorithm_SwappedCreateFunc_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
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
                    SoftbodyJNI.delete_btSoftBodyConcaveCollisionAlgorithm_SwappedCreateFunc(swigCPtr);
                }
                swigCPtr = 0;
            }
            super.delete();
        }

    }

}
