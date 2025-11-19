package nb;

import java.util.List;
import kotlin.jvm.internal.C3862t;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* compiled from: ProtoBufUtil.kt */
/* loaded from: classes3.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends h.d<M>, T> T a(h.d<M> dVar, h.f<M, T> extension) {
        C3862t.g(dVar, "<this>");
        C3862t.g(extension, "extension");
        if (dVar.y(extension)) {
            return (T) dVar.v(extension);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends h.d<M>, T> T b(h.d<M> dVar, h.f<M, List<T>> extension, int i10) {
        C3862t.g(dVar, "<this>");
        C3862t.g(extension, "extension");
        if (i10 < dVar.x(extension)) {
            return (T) dVar.w(extension, i10);
        }
        return null;
    }
}
