package kotlin;

import Ba.l;
import K0.b;
import O0.r;
import O0.s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.x1;
import oa.C4153F;

/* compiled from: FontFamilyResolver.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u0016"}, d2 = {"LL0/V;", "", "<init>", "()V", "LL0/U;", "typefaceRequest", "Lkotlin/Function1;", "LL0/W;", "Loa/F;", "resolveTypeface", "LO/x1;", "c", "(LL0/U;LBa/l;)LO/x1;", "LO0/s;", "a", "LO0/s;", "b", "()LO0/s;", "lock", "LK0/b;", "LK0/b;", "resultCache", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: L0.V, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1328V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s lock = r.a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b<TypefaceRequest, InterfaceC1329W> resultCache = new b<>(16);

    /* compiled from: FontFamilyResolver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LL0/W;", "finalResult", "Loa/F;", "a", "(LL0/W;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: L0.V$a */
    static final class a extends AbstractC3864v implements l<InterfaceC1329W, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ TypefaceRequest f8968C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(TypefaceRequest typefaceRequest) {
            super(1);
            this.f8968C = typefaceRequest;
        }

        public final void a(InterfaceC1329W interfaceC1329W) {
            s lock = C1328V.this.getLock();
            C1328V c1328v = C1328V.this;
            TypefaceRequest typefaceRequest = this.f8968C;
            synchronized (lock) {
                try {
                    if (interfaceC1329W.getCacheable()) {
                        c1328v.resultCache.e(typefaceRequest, interfaceC1329W);
                    } else {
                        c1328v.resultCache.f(typefaceRequest);
                    }
                    C4153F c4153f = C4153F.f46609a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1329W interfaceC1329W) {
            a(interfaceC1329W);
            return C4153F.f46609a;
        }
    }

    /* renamed from: b, reason: from getter */
    public final s getLock() {
        return this.lock;
    }

    public final x1<Object> c(TypefaceRequest typefaceRequest, l<? super l<? super InterfaceC1329W, C4153F>, ? extends InterfaceC1329W> resolveTypeface) {
        synchronized (this.lock) {
            InterfaceC1329W interfaceC1329WD = this.resultCache.d(typefaceRequest);
            if (interfaceC1329WD != null) {
                if (interfaceC1329WD.getCacheable()) {
                    return interfaceC1329WD;
                }
                this.resultCache.f(typefaceRequest);
            }
            try {
                InterfaceC1329W interfaceC1329WInvoke = resolveTypeface.invoke(new a(typefaceRequest));
                synchronized (this.lock) {
                    try {
                        if (this.resultCache.d(typefaceRequest) == null && interfaceC1329WInvoke.getCacheable()) {
                            this.resultCache.e(typefaceRequest, interfaceC1329WInvoke);
                        }
                        C4153F c4153f = C4153F.f46609a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return interfaceC1329WInvoke;
            } catch (Exception e10) {
                throw new IllegalStateException("Could not load font", e10);
            }
        }
    }
}
