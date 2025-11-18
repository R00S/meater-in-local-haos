package mb;

import java.io.InputStream;
import kotlin.jvm.internal.C3862t;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import lb.C3933m;
import oa.C4170o;
import oa.v;
import za.C5220a;

/* compiled from: readPackageFragment.kt */
/* renamed from: mb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4018c {
    public static final C4170o<C3933m, C4016a> a(InputStream inputStream) {
        C3933m c3933mX;
        C3862t.g(inputStream, "<this>");
        try {
            C4016a c4016aA = C4016a.f45422g.a(inputStream);
            if (c4016aA.h()) {
                f fVarD = f.d();
                C4017b.a(fVarD);
                c3933mX = C3933m.X(inputStream, fVarD);
            } else {
                c3933mX = null;
            }
            C4170o<C3933m, C4016a> c4170oA = v.a(c3933mX, c4016aA);
            C5220a.a(inputStream, null);
            return c4170oA;
        } finally {
        }
    }
}
