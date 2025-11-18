package com.fasterxml.jackson.databind.util;

/* loaded from: classes2.dex */
public abstract class PrimitiveArrayBuilder<T> {
    protected Node<T> _bufferHead;
    protected Node<T> _bufferTail;
    protected int _bufferedEntryCount;
    protected T _freeBuffer;

    static final class Node<T> {
        final T _data;
        final int _dataLength;
        Node<T> _next;

        public Node(T t, int i2) {
            this._data = t;
            this._dataLength = i2;
        }

        public int copyData(T t, int i2) {
            System.arraycopy(this._data, 0, t, i2, this._dataLength);
            return i2 + this._dataLength;
        }

        public T getData() {
            return this._data;
        }

        public void linkNext(Node<T> node) {
            if (this._next != null) {
                throw new IllegalStateException();
            }
            this._next = node;
        }

        public Node<T> next() {
            return this._next;
        }
    }

    protected PrimitiveArrayBuilder() {
    }

    protected abstract T _constructArray(int i2);

    protected void _reset() {
        Node<T> node = this._bufferTail;
        if (node != null) {
            this._freeBuffer = node.getData();
        }
        this._bufferTail = null;
        this._bufferHead = null;
        this._bufferedEntryCount = 0;
    }

    public final T appendCompletedChunk(T t, int i2) {
        Node<T> node = new Node<>(t, i2);
        if (this._bufferHead == null) {
            this._bufferTail = node;
            this._bufferHead = node;
        } else {
            this._bufferTail.linkNext(node);
            this._bufferTail = node;
        }
        this._bufferedEntryCount += i2;
        return _constructArray(i2 < 16384 ? i2 + i2 : i2 + (i2 >> 2));
    }

    public int bufferedSize() {
        return this._bufferedEntryCount;
    }

    public T completeAndClearBuffer(T t, int i2) {
        int i3 = this._bufferedEntryCount + i2;
        T t_constructArray = _constructArray(i3);
        int iCopyData = 0;
        for (Node<T> next = this._bufferHead; next != null; next = next.next()) {
            iCopyData = next.copyData(t_constructArray, iCopyData);
        }
        System.arraycopy(t, 0, t_constructArray, iCopyData, i2);
        int i4 = iCopyData + i2;
        if (i4 == i3) {
            return t_constructArray;
        }
        throw new IllegalStateException("Should have gotten " + i3 + " entries, got " + i4);
    }

    public T resetAndStart() {
        _reset();
        T t = this._freeBuffer;
        return t == null ? _constructArray(12) : t;
    }
}
