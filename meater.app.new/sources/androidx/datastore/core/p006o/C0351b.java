package androidx.datastore.core.p006o;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.InterfaceC0336a;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;

/* compiled from: ReplaceFileCorruptionHandler.kt */
/* renamed from: androidx.datastore.core.o.b */
/* loaded from: classes.dex */
public final class C0351b<T> implements InterfaceC0336a<T> {

    /* renamed from: a */
    private final Function1<CorruptionException, T> f2657a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0351b(Function1<? super CorruptionException, ? extends T> function1) {
        C9801m.m32346f(function1, "produceNewData");
        this.f2657a = function1;
    }

    @Override // androidx.datastore.core.InterfaceC0336a
    /* renamed from: a */
    public Object mo2346a(CorruptionException corruptionException, Continuation<? super T> continuation) throws IOException {
        return this.f2657a.invoke(corruptionException);
    }
}
