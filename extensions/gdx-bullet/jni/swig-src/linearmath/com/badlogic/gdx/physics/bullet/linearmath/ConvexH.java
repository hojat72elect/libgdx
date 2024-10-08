/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.physics.bullet.BulletBase;

public class ConvexH extends BulletBase {
    private long swigCPtr;

    protected ConvexH(final String className, long cPtr, boolean cMemoryOwn) {
        super(className, cPtr, cMemoryOwn);
        swigCPtr = cPtr;
    }

    /**
     * Construct a new ConvexH, normally you should not need this constructor it's intended for low-level usage.
     */
    public ConvexH(long cPtr, boolean cMemoryOwn) {
        this("ConvexH", cPtr, cMemoryOwn);
        construct();
    }

    public ConvexH() {
        this(LinearMathJNI.new_ConvexH__SWIG_0(), true);
    }

    public ConvexH(int vertices_size, int edges_size, int facets_size) {
        this(LinearMathJNI.new_ConvexH__SWIG_1(vertices_size, edges_size, facets_size), true);
    }

    public static long getCPtr(ConvexH obj) {
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
                LinearMathJNI.delete_ConvexH(swigCPtr);
            }
            swigCPtr = 0;
        }
        super.delete();
    }

    public btVector3Array getVertices() {
        long cPtr = LinearMathJNI.ConvexH_vertices_get(swigCPtr, this);
        return (cPtr == 0) ? null : new btVector3Array(cPtr, false);
    }

    public void setVertices(btVector3Array value) {
        LinearMathJNI.ConvexH_vertices_set(swigCPtr, this, btVector3Array.getCPtr(value), value);
    }

    public SWIGTYPE_p_btAlignedObjectArrayT_ConvexH__HalfEdge_t getEdges() {
        long cPtr = LinearMathJNI.ConvexH_edges_get(swigCPtr, this);
        return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_ConvexH__HalfEdge_t(cPtr, false);
    }

    public void setEdges(SWIGTYPE_p_btAlignedObjectArrayT_ConvexH__HalfEdge_t value) {
        LinearMathJNI.ConvexH_edges_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_ConvexH__HalfEdge_t.getCPtr(value));
    }

    public SWIGTYPE_p_btAlignedObjectArrayT_btPlane_t getFacets() {
        long cPtr = LinearMathJNI.ConvexH_facets_get(swigCPtr, this);
        return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_btPlane_t(cPtr, false);
    }

    public void setFacets(SWIGTYPE_p_btAlignedObjectArrayT_btPlane_t value) {
        LinearMathJNI.ConvexH_facets_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btPlane_t.getCPtr(value));
    }

    static public class HalfEdge extends BulletBase {
        private long swigCPtr;

        protected HalfEdge(final String className, long cPtr, boolean cMemoryOwn) {
            super(className, cPtr, cMemoryOwn);
            swigCPtr = cPtr;
        }

        /**
         * Construct a new HalfEdge, normally you should not need this constructor it's intended for low-level usage.
         */
        public HalfEdge(long cPtr, boolean cMemoryOwn) {
            this("HalfEdge", cPtr, cMemoryOwn);
            construct();
        }

        public HalfEdge() {
            this(LinearMathJNI.new_ConvexH_HalfEdge__SWIG_0(), true);
        }

        public HalfEdge(short _ea, short _v, short _p) {
            this(LinearMathJNI.new_ConvexH_HalfEdge__SWIG_1(_ea, _v, _p), true);
        }

        public static long getCPtr(HalfEdge obj) {
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
                    LinearMathJNI.delete_ConvexH_HalfEdge(swigCPtr);
                }
                swigCPtr = 0;
            }
            super.delete();
        }

        public short getEa() {
            return LinearMathJNI.ConvexH_HalfEdge_ea_get(swigCPtr, this);
        }

        public void setEa(short value) {
            LinearMathJNI.ConvexH_HalfEdge_ea_set(swigCPtr, this, value);
        }

        public short getV() {
            return LinearMathJNI.ConvexH_HalfEdge_v_get(swigCPtr, this);
        }

        public void setV(short value) {
            LinearMathJNI.ConvexH_HalfEdge_v_set(swigCPtr, this, value);
        }

        public short getP() {
            return LinearMathJNI.ConvexH_HalfEdge_p_get(swigCPtr, this);
        }

        public void setP(short value) {
            LinearMathJNI.ConvexH_HalfEdge_p_set(swigCPtr, this, value);
        }

    }

}
