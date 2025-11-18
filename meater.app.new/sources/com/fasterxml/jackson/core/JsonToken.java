package com.fasterxml.jackson.core;

import cm.aptoide.p092pt.account.AdultContentAnalytics;

/* loaded from: classes2.dex */
public enum JsonToken {
    NOT_AVAILABLE(null, -1),
    START_OBJECT("{", 1),
    END_OBJECT("}", 2),
    START_ARRAY("[", 3),
    END_ARRAY("]", 4),
    FIELD_NAME(null, 5),
    VALUE_EMBEDDED_OBJECT(null, 12),
    VALUE_STRING(null, 6),
    VALUE_NUMBER_INT(null, 7),
    VALUE_NUMBER_FLOAT(null, 8),
    VALUE_TRUE("true", 9),
    VALUE_FALSE(AdultContentAnalytics.UNLOCK, 10),
    VALUE_NULL("null", 11);

    final int _id;
    final boolean _isBoolean;
    final boolean _isNumber;
    final boolean _isScalar;
    final boolean _isStructEnd;
    final boolean _isStructStart;
    final String _serialized;
    final byte[] _serializedBytes;
    final char[] _serializedChars;

    JsonToken(String str, int i2) {
        boolean z = false;
        if (str == null) {
            this._serialized = null;
            this._serializedChars = null;
            this._serializedBytes = null;
        } else {
            this._serialized = str;
            char[] charArray = str.toCharArray();
            this._serializedChars = charArray;
            int length = charArray.length;
            this._serializedBytes = new byte[length];
            for (int i3 = 0; i3 < length; i3++) {
                this._serializedBytes[i3] = (byte) this._serializedChars[i3];
            }
        }
        this._id = i2;
        this._isBoolean = i2 == 10 || i2 == 9;
        this._isNumber = i2 == 7 || i2 == 8;
        boolean z2 = i2 == 1 || i2 == 3;
        this._isStructStart = z2;
        boolean z3 = i2 == 2 || i2 == 4;
        this._isStructEnd = z3;
        if (!z2 && !z3 && i2 != 5 && i2 != -1) {
            z = true;
        }
        this._isScalar = z;
    }

    public final char[] asCharArray() {
        return this._serializedChars;
    }

    public final String asString() {
        return this._serialized;
    }

    /* renamed from: id */
    public final int m12940id() {
        return this._id;
    }

    public final boolean isNumeric() {
        return this._isNumber;
    }

    public final boolean isScalarValue() {
        return this._isScalar;
    }

    public final boolean isStructEnd() {
        return this._isStructEnd;
    }

    public final boolean isStructStart() {
        return this._isStructStart;
    }
}
