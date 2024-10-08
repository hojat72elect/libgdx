/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.linearmath.*;

public class btCompoundCollisionAlgorithm extends btActivatingCollisionAlgorithm {
    private long swigCPtr;

    protected btCompoundCollisionAlgorithm(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, CollisionJNI.btCompoundCollisionAlgorithm_SWIGUpcast(cPtr), cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new btCompoundCollisionAlgorithm, normally you should not need this constructor it's intended for low-level
     * usage.
     */
    public btCompoundCollisionAlgorithm(long cPtr, boolean cMemoryOwn) {
        this("btCompoundCollisionAlgorithm", cPtr, cMemoryOwn);
        construct();
    }

    public btCompoundCollisionAlgorithm(btCollisionAlgorithmConstructionInfo ci, btCollisionObjectWrapper body0Wrap,
                                        btCollisionObjectWrapper body1Wrap, boolean isSwapped) {
        this(CollisionJNI.new_btCompoundCollisionAlgorithm(btCollisionAlgorithmConstructionInfo.getCPtr(ci), ci,
                btCollisionObjectWrapper.getCPtr(body0Wrap), body0Wrap, btCollisionObjectWrapper.getCPtr(body1Wrap), body1Wrap,
                isSwapped), true);
    }

    public static long getCPtr(btCompoundCollisionAlgorithm obj) {
        return (obj == null) ? 0 : obj.swigCPtr;
    }

    @Override
    protected void reset(long cPtr, boolean cMemoryOwn) {
        if (!destroyed) destroy();
        super.reset(CollisionJNI.btCompoundCollisionAlgorithm_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
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
                CollisionJNI.delete_btCompoundCollisionAlgorithm(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public btCollisionAlgorithm getChildAlgorithm(int n) {
        long cPtr = CollisionJNI.btCompoundCollisionAlgorithm_getChildAlgorithm(swigCPtr, this, n);
        return (cPtr == 0) ? null : new btCollisionAlgorithm(cPtr, false);
    }

    static public class CreateFunc extends btCollisionAlgorithmCreateFunc {
        private long swigCPtr;

        protected CreateFunc(final String className, long cPtr, boolean cMemoryOwn) {
            super(className, CollisionJNI.btCompoundCollisionAlgorithm_CreateFunc_SWIGUpcast(cPtr), cMemoryOwn);
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
            this(CollisionJNI.new_btCompoundCollisionAlgorithm_CreateFunc(), true);
        }

        public static long getCPtr(CreateFunc obj) {
            return (obj == null) ? 0 : obj.swigCPtr;
        }

        @Override
        protected void reset(long cPtr, boolean cMemoryOwn) {
            if (!destroyed) destroy();
            super.reset(CollisionJNI.btCompoundCollisionAlgorithm_CreateFunc_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
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
                    CollisionJNI.delete_btCompoundCollisionAlgorithm_CreateFunc(swigCPtr);
                }
                swigCPtr = 0;
            }
            super.delete();
        }

    }

    static public class SwappedCreateFunc extends btCollisionAlgorithmCreateFunc {
        private long swigCPtr;

        protected SwappedCreateFunc(final String className, long cPtr, boolean cMemoryOwn) {
            super(className, CollisionJNI.btCompoundCollisionAlgorithm_SwappedCreateFunc_SWIGUpcast(cPtr), cMemoryOwn);
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
            this(CollisionJNI.new_btCompoundCollisionAlgorithm_SwappedCreateFunc(), true);
        }

        public static long getCPtr(SwappedCreateFunc obj) {
            return (obj == null) ? 0 : obj.swigCPtr;
        }

        @Override
        protected void reset(long cPtr, boolean cMemoryOwn) {
            if (!destroyed) destroy();
            super.reset(CollisionJNI.btCompoundCollisionAlgorithm_SwappedCreateFunc_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
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
                    CollisionJNI.delete_btCompoundCollisionAlgorithm_SwappedCreateFunc(swigCPtr);
                }
                swigCPtr = 0;
            }
            super.delete();
        }

    }

}
