package com.fasterxml.jackson.core;

/* loaded from: classes2.dex */
public abstract class JsonStreamContext {
    protected int _index;
    protected int _type;

    protected JsonStreamContext() {
    }

    public final int getCurrentIndex() {
        int i2 = this._index;
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }

    public abstract String getCurrentName();

    public final int getEntryCount() {
        return this._index + 1;
    }

    public abstract JsonStreamContext getParent();

    public final boolean inArray() {
        return this._type == 1;
    }

    public final boolean inObject() {
        return this._type == 2;
    }

    public final boolean inRoot() {
        return this._type == 0;
    }

    public abstract void setCurrentValue(Object obj);

    public String typeDesc() {
        int i2 = this._type;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? "?" : "Object" : "Array" : "root";
    }
}
