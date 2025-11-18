package com.fasterxml.jackson.core;

/* loaded from: classes2.dex */
public interface SerializableString {
    int appendQuotedUTF8(byte[] bArr, int i2);

    char[] asQuotedChars();

    byte[] asQuotedUTF8();

    byte[] asUnquotedUTF8();

    String getValue();
}
