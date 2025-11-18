package androidx.datastore.core;

import androidx.datastore.core.p006o.C0350a;
import androidx.datastore.core.p006o.C0351b;
import java.io.File;
import java.util.List;
import kotlin.collections.C10815t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DataStoreFactory.kt */
/* renamed from: androidx.datastore.core.f */
/* loaded from: classes.dex */
public final class C0341f {

    /* renamed from: a */
    public static final C0341f f2544a = new C0341f();

    private C0341f() {
    }

    /* renamed from: a */
    public final <T> InterfaceC0340e<T> m2360a(InterfaceC0345j<T> interfaceC0345j, C0351b<T> c0351b, List<? extends InterfaceC0338c<T>> list, CoroutineScope coroutineScope, Function0<? extends File> function0) {
        C9801m.m32346f(interfaceC0345j, "serializer");
        C9801m.m32346f(list, "migrations");
        C9801m.m32346f(coroutineScope, "scope");
        C9801m.m32346f(function0, "produceFile");
        if (c0351b == null) {
            c0351b = (C0351b<T>) new C0350a();
        }
        return new C0347l(function0, interfaceC0345j, C10815t.m38883e(C0339d.f2526a.m2354b(list)), c0351b, coroutineScope);
    }
}
