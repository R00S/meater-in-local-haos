package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* loaded from: classes2.dex */
public final class ListenerHolder<L> {

    /* renamed from: a */
    private volatile L f17376a;

    /* renamed from: b */
    private final ListenerKey<L> f17377b;

    @KeepForSdk
    public static final class ListenerKey<L> {

        /* renamed from: a */
        private final L f17378a;

        /* renamed from: b */
        private final String f17379b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj;
            return this.f17378a == listenerKey.f17378a && this.f17379b.equals(listenerKey.f17379b);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f17378a) * 31) + this.f17379b.hashCode();
        }
    }

    @KeepForSdk
    public interface Notifier<L> {
    }

    @KeepForSdk
    /* renamed from: a */
    public final void m14043a() {
        this.f17376a = null;
    }

    @KeepForSdk
    /* renamed from: b */
    public final ListenerKey<L> m14044b() {
        return this.f17377b;
    }

    @KeepForSdk
    /* renamed from: c */
    public final void m14045c(Notifier<? super L> notifier) {
        Preconditions.m14373l(notifier, "Notifier must not be null");
        throw null;
    }
}
