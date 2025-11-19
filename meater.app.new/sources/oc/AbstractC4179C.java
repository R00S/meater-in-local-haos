package oc;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.InterfaceC4156a;

/* compiled from: RequestBody.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Loc/C;", "", "<init>", "()V", "Loc/x;", "b", "()Loc/x;", "", "a", "()J", "LCc/f;", "sink", "Loa/F;", "h", "(LCc/f;)V", "", "f", "()Z", "g", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: oc.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4179C {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: RequestBody.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u0007*\u00020\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0011\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u0016\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Loc/C$a;", "", "<init>", "()V", "", "Loc/x;", "contentType", "Loc/C;", "b", "(Ljava/lang/String;Loc/x;)Loc/C;", "LCc/h;", "a", "(LCc/h;Loc/x;)Loc/C;", "", "", "offset", "byteCount", "f", "([BLoc/x;II)Loc/C;", "content", "c", "(Loc/x;LCc/h;)Loc/C;", "e", "(Loc/x;[BII)Loc/C;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oc.C$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: RequestBody.kt */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"oc/C$a$a", "Loc/C;", "Loc/x;", "b", "()Loc/x;", "", "a", "()J", "LCc/f;", "sink", "Loa/F;", "h", "(LCc/f;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: oc.C$a$a, reason: collision with other inner class name */
        public static final class C0646a extends AbstractC4179C {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f46768b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Cc.h f46769c;

            C0646a(x xVar, Cc.h hVar) {
                this.f46768b = xVar;
                this.f46769c = hVar;
            }

            @Override // oc.AbstractC4179C
            public long a() {
                return this.f46769c.J();
            }

            @Override // oc.AbstractC4179C
            /* renamed from: b, reason: from getter */
            public x getF46770b() {
                return this.f46768b;
            }

            @Override // oc.AbstractC4179C
            public void h(Cc.f sink) {
                C3862t.g(sink, "sink");
                sink.t0(this.f46769c);
            }
        }

        /* compiled from: RequestBody.kt */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"oc/C$a$b", "Loc/C;", "Loc/x;", "b", "()Loc/x;", "", "a", "()J", "LCc/f;", "sink", "Loa/F;", "h", "(LCc/f;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: oc.C$a$b */
        public static final class b extends AbstractC4179C {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f46770b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f46771c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ byte[] f46772d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f46773e;

            b(x xVar, int i10, byte[] bArr, int i11) {
                this.f46770b = xVar;
                this.f46771c = i10;
                this.f46772d = bArr;
                this.f46773e = i11;
            }

            @Override // oc.AbstractC4179C
            public long a() {
                return this.f46771c;
            }

            @Override // oc.AbstractC4179C
            /* renamed from: b, reason: from getter */
            public x getF46770b() {
                return this.f46770b;
            }

            @Override // oc.AbstractC4179C
            public void h(Cc.f sink) {
                C3862t.g(sink, "sink");
                sink.v(this.f46772d, this.f46773e, this.f46771c);
            }
        }

        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public static /* synthetic */ AbstractC4179C g(Companion companion, x xVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return companion.e(xVar, bArr, i10, i11);
        }

        public static /* synthetic */ AbstractC4179C h(Companion companion, byte[] bArr, x xVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                xVar = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return companion.f(bArr, xVar, i10, i11);
        }

        public final AbstractC4179C a(Cc.h hVar, x xVar) {
            C3862t.g(hVar, "<this>");
            return new C0646a(xVar, hVar);
        }

        public final AbstractC4179C b(String str, x xVar) {
            C3862t.g(str, "<this>");
            Charset charset = Ub.d.UTF_8;
            if (xVar != null) {
                Charset charsetD = x.d(xVar, null, 1, null);
                if (charsetD == null) {
                    xVar = x.INSTANCE.b(xVar + "; charset=utf-8");
                } else {
                    charset = charsetD;
                }
            }
            byte[] bytes = str.getBytes(charset);
            C3862t.f(bytes, "this as java.lang.String).getBytes(charset)");
            return f(bytes, xVar, 0, bytes.length);
        }

        @InterfaceC4156a
        public final AbstractC4179C c(x contentType, Cc.h content) {
            C3862t.g(content, "content");
            return a(content, contentType);
        }

        @InterfaceC4156a
        public final AbstractC4179C d(x xVar, byte[] content) {
            C3862t.g(content, "content");
            return g(this, xVar, content, 0, 0, 12, null);
        }

        @InterfaceC4156a
        public final AbstractC4179C e(x contentType, byte[] content, int offset, int byteCount) {
            C3862t.g(content, "content");
            return f(content, contentType, offset, byteCount);
        }

        public final AbstractC4179C f(byte[] bArr, x xVar, int i10, int i11) {
            C3862t.g(bArr, "<this>");
            pc.d.l(bArr.length, i10, i11);
            return new b(xVar, i11, bArr, i10);
        }

        private Companion() {
        }
    }

    public static final AbstractC4179C c(String str, x xVar) {
        return INSTANCE.b(str, xVar);
    }

    @InterfaceC4156a
    public static final AbstractC4179C d(x xVar, Cc.h hVar) {
        return INSTANCE.c(xVar, hVar);
    }

    @InterfaceC4156a
    public static final AbstractC4179C e(x xVar, byte[] bArr) {
        return INSTANCE.d(xVar, bArr);
    }

    public long a() {
        return -1L;
    }

    /* renamed from: b */
    public abstract x getF46770b();

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public abstract void h(Cc.f sink);
}
