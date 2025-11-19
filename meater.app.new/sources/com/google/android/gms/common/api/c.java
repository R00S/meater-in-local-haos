package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import d7.InterfaceC3051e;
import e7.InterfaceC3215e;
import e7.InterfaceC3222l;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@Deprecated
/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f33486a = Collections.newSetFromMap(new WeakHashMap());

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @Deprecated
    public interface a extends InterfaceC3215e {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @Deprecated
    public interface b extends InterfaceC3222l {
    }

    @ResultIgnorabilityUnspecified
    public <A extends a.b, R extends InterfaceC3051e, T extends com.google.android.gms.common.api.internal.a<R, A>> T a(T t10) {
        throw new UnsupportedOperationException();
    }

    public Looper b() {
        throw new UnsupportedOperationException();
    }
}
