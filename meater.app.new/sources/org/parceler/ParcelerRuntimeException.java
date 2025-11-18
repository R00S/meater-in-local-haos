package org.parceler;

/* loaded from: classes3.dex */
public class ParcelerRuntimeException extends RuntimeException {
    public ParcelerRuntimeException(String str) {
        super(str);
    }

    public ParcelerRuntimeException(String str, Exception exc) {
        super(str, exc);
    }
}
