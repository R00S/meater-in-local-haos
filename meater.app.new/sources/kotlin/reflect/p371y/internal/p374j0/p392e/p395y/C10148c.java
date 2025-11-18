package kotlin.reflect.p371y.internal.p374j0.p392e.p395y;

import java.io.IOException;
import java.io.InputStream;
import kotlin.C10773s;
import kotlin.Pair;
import kotlin.jvm.internal.C9801m;
import kotlin.p429io.C10556a;
import kotlin.reflect.jvm.internal.impl.protobuf.C10747f;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10134m;

/* compiled from: readPackageFragment.kt */
/* renamed from: kotlin.f0.y.e.j0.e.y.c */
/* loaded from: classes3.dex */
public final class C10148c {
    /* renamed from: a */
    public static final Pair<C10134m, C10146a> m35357a(InputStream inputStream) throws IOException {
        C10134m c10134mM34828X;
        C9801m.m32346f(inputStream, "<this>");
        try {
            C10146a c10146aM35355a = C10146a.f39168g.m35355a(inputStream);
            if (c10146aM35355a.m35354h()) {
                C10747f c10747fM38348d = C10747f.m38348d();
                C10147b.m35356a(c10747fM38348d);
                c10134mM34828X = C10134m.m34828X(inputStream, c10747fM38348d);
            } else {
                c10134mM34828X = null;
            }
            Pair<C10134m, C10146a> pairM38547a = C10773s.m38547a(c10134mM34828X, c10146aM35355a);
            C10556a.m37638a(inputStream, null);
            return pairM38547a;
        } finally {
        }
    }
}
