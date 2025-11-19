package Fb;

import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: DeserializedAnnotations.kt */
/* loaded from: classes3.dex */
public final class T extends C1020a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(Gb.n storageManager, Ba.a<? extends List<? extends Sa.c>> compute) {
        super(storageManager, compute);
        C3862t.g(storageManager, "storageManager");
        C3862t.g(compute, "compute");
    }

    @Override // Fb.C1020a, Sa.h
    public boolean isEmpty() {
        return false;
    }
}
