package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;
import java.util.List;

/* loaded from: classes2.dex */
public final class ObjectBuffer {
    private Object[] _freeBuffer;
    private LinkedNode<Object[]> _head;
    private int _size;
    private LinkedNode<Object[]> _tail;

    protected final void _copyTo(Object obj, int i2, Object[] objArr, int i3) {
        int i4 = 0;
        for (LinkedNode<Object[]> next = this._head; next != null; next = next.next()) {
            Object[] objArrValue = next.value();
            int length = objArrValue.length;
            System.arraycopy(objArrValue, 0, obj, i4, length);
            i4 += length;
        }
        System.arraycopy(objArr, 0, obj, i4, i3);
        int i5 = i4 + i3;
        if (i5 == i2) {
            return;
        }
        throw new IllegalStateException("Should have gotten " + i2 + " entries, got " + i5);
    }

    protected void _reset() {
        LinkedNode<Object[]> linkedNode = this._tail;
        if (linkedNode != null) {
            this._freeBuffer = linkedNode.value();
        }
        this._tail = null;
        this._head = null;
        this._size = 0;
    }

    public Object[] appendCompletedChunk(Object[] objArr) {
        LinkedNode<Object[]> linkedNode = new LinkedNode<>(objArr, null);
        if (this._head == null) {
            this._tail = linkedNode;
            this._head = linkedNode;
        } else {
            this._tail.linkNext(linkedNode);
            this._tail = linkedNode;
        }
        int length = objArr.length;
        this._size += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new Object[length];
    }

    public int bufferedSize() {
        return this._size;
    }

    public Object[] completeAndClearBuffer(Object[] objArr, int i2) {
        int i3 = this._size + i2;
        Object[] objArr2 = new Object[i3];
        _copyTo(objArr2, i3, objArr, i2);
        return objArr2;
    }

    public int initialCapacity() {
        Object[] objArr = this._freeBuffer;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public Object[] resetAndStart() {
        _reset();
        Object[] objArr = this._freeBuffer;
        return objArr == null ? new Object[12] : objArr;
    }

    public <T> T[] completeAndClearBuffer(Object[] objArr, int i2, Class<T> cls) {
        int i3 = this._size + i2;
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i3));
        _copyTo(tArr, i3, objArr, i2);
        _reset();
        return tArr;
    }

    public void completeAndClearBuffer(Object[] objArr, int i2, List<Object> list) {
        int i3;
        LinkedNode<Object[]> next = this._head;
        while (true) {
            i3 = 0;
            if (next == null) {
                break;
            }
            Object[] objArrValue = next.value();
            int length = objArrValue.length;
            while (i3 < length) {
                list.add(objArrValue[i3]);
                i3++;
            }
            next = next.next();
        }
        while (i3 < i2) {
            list.add(objArr[i3]);
            i3++;
        }
    }
}
