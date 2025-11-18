package com.google.android.gms.internal.common;

import java.util.Iterator;
import org.jspecify.nullness.NullMarked;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@NullMarked
/* loaded from: classes.dex */
public abstract class zzaj implements Iterator {
    protected zzaj() {
    }

    @Override // java.util.Iterator
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
