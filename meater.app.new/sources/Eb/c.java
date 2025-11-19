package Eb;

import Db.AbstractC1014u;
import Gb.n;
import Ra.H;
import java.io.InputStream;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import lb.C3933m;
import mb.C4016a;
import mb.C4018c;
import oa.C4170o;
import xb.C5087e;

/* compiled from: BuiltInsPackageFragmentImpl.kt */
/* loaded from: classes3.dex */
public final class c extends AbstractC1014u implements Oa.c {

    /* renamed from: P, reason: collision with root package name */
    public static final a f4156P = new a(null);

    /* renamed from: O, reason: collision with root package name */
    private final boolean f4157O;

    /* compiled from: BuiltInsPackageFragmentImpl.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final c a(qb.c fqName, n storageManager, H module, InputStream inputStream, boolean z10) {
            C3862t.g(fqName, "fqName");
            C3862t.g(storageManager, "storageManager");
            C3862t.g(module, "module");
            C3862t.g(inputStream, "inputStream");
            C4170o<C3933m, C4016a> c4170oA = C4018c.a(inputStream);
            C3933m c3933mA = c4170oA.a();
            C4016a c4016aB = c4170oA.b();
            if (c3933mA != null) {
                return new c(fqName, storageManager, module, c3933mA, c4016aB, z10, null);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + C4016a.f45423h + ", actual " + c4016aB + ". Please update Kotlin");
        }

        private a() {
        }
    }

    public /* synthetic */ c(qb.c cVar, n nVar, H h10, C3933m c3933m, C4016a c4016a, boolean z10, C3854k c3854k) {
        this(cVar, nVar, h10, c3933m, c4016a, z10);
    }

    @Override // Ua.H, Ua.AbstractC1774m
    public String toString() {
        return "builtins package fragment for " + f() + " from " + C5087e.s(this);
    }

    private c(qb.c cVar, n nVar, H h10, C3933m c3933m, C4016a c4016a, boolean z10) {
        super(cVar, nVar, h10, c3933m, c4016a, null);
        this.f4157O = z10;
    }
}
