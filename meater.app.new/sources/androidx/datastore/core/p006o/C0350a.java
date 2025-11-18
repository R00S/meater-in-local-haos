package androidx.datastore.core.p006o;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.InterfaceC0336a;
import kotlin.coroutines.Continuation;

/* compiled from: NoOpCorruptionHandler.kt */
/* renamed from: androidx.datastore.core.o.a */
/* loaded from: classes.dex */
public final class C0350a<T> implements InterfaceC0336a<T> {
    @Override // androidx.datastore.core.InterfaceC0336a
    /* renamed from: a */
    public Object mo2346a(CorruptionException corruptionException, Continuation<? super T> continuation) throws CorruptionException {
        throw corruptionException;
    }
}
