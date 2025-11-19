package vb;

import Ra.H;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: constantValues.kt */
/* loaded from: classes3.dex */
public abstract class l extends AbstractC4943g<C4153F> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f51604b = new a(null);

    /* compiled from: constantValues.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final l a(String message) {
            C3862t.g(message, "message");
            return new b(message);
        }

        private a() {
        }
    }

    /* compiled from: constantValues.kt */
    public static final class b extends l {

        /* renamed from: c, reason: collision with root package name */
        private final String f51605c;

        public b(String message) {
            C3862t.g(message, "message");
            this.f51605c = message;
        }

        @Override // vb.AbstractC4943g
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Jb.i a(H module) {
            C3862t.g(module, "module");
            return Jb.l.d(Jb.k.f7721K0, this.f51605c);
        }

        @Override // vb.AbstractC4943g
        public String toString() {
            return this.f51605c;
        }
    }

    public l() {
        super(C4153F.f46609a);
    }

    @Override // vb.AbstractC4943g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C4153F b() {
        throw new UnsupportedOperationException();
    }
}
