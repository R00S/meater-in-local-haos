package id;

import Ia.d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: KClassExt.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0004\u0010\u0003\"$\u0010\u0007\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0000\u0012\u0004\u0012\u00020\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0006¨\u0006\b"}, d2 = {"LIa/d;", "", "a", "(LIa/d;)Ljava/lang/String;", "b", "", "Ljava/util/Map;", "classNames", "koin-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<d<?>, String> f43309a = kd.a.f43922a.f();

    public static final String a(d<?> dVar) {
        C3862t.g(dVar, "<this>");
        String str = f43309a.get(dVar);
        return str == null ? b(dVar) : str;
    }

    public static final String b(d<?> dVar) {
        C3862t.g(dVar, "<this>");
        String strD = kd.a.f43922a.d(dVar);
        f43309a.put(dVar, strD);
        return strD;
    }
}
