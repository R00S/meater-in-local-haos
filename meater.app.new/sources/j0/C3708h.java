package j0;

import i0.C3602t0;
import i0.C3606v0;
import j0.C3702b;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: Connector.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000  2\u00020\u0001:\u0002\u0011\u0016B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Lj0/h;", "", "Lj0/c;", "source", "destination", "transformSource", "transformDestination", "Lj0/n;", "renderIntent", "", "transform", "<init>", "(Lj0/c;Lj0/c;Lj0/c;Lj0/c;I[FLkotlin/jvm/internal/k;)V", "intent", "(Lj0/c;Lj0/c;ILkotlin/jvm/internal/k;)V", "Li0/t0;", "color", "a", "(J)J", "Lj0/c;", "getSource", "()Lj0/c;", "b", "getDestination", "c", "d", "e", "I", "getRenderIntent-uksYyKA", "()I", "f", "[F", "g", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: j0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3708h {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC3703c source;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC3703c destination;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC3703c transformSource;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC3703c transformDestination;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int renderIntent;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float[] transform;

    /* compiled from: Connector.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Lj0/h$a;", "", "<init>", "()V", "Lj0/c;", "source", "destination", "Lj0/n;", "intent", "", "b", "(Lj0/c;Lj0/c;I)[F", "Lj0/h;", "c", "(Lj0/c;)Lj0/h;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: j0.h$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] b(AbstractC3703c source, AbstractC3703c destination, int intent) {
            if (!C3714n.e(intent, C3714n.INSTANCE.a())) {
                return null;
            }
            long model = source.getModel();
            C3702b.Companion companion = C3702b.INSTANCE;
            boolean zE = C3702b.e(model, companion.b());
            boolean zE2 = C3702b.e(destination.getModel(), companion.b());
            if (zE && zE2) {
                return null;
            }
            if (!zE && !zE2) {
                return null;
            }
            if (!zE) {
                source = destination;
            }
            C3862t.e(source, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            x xVar = (x) source;
            float[] fArrC = zE ? xVar.getWhitePoint().c() : C3711k.f43359a.c();
            float[] fArrC2 = zE2 ? xVar.getWhitePoint().c() : C3711k.f43359a.c();
            return new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]};
        }

        public final C3708h c(AbstractC3703c source) {
            return new C0554a(source, C3714n.INSTANCE.c());
        }

        private Companion() {
        }

        /* compiled from: Connector.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0010ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"j0/h$a$a", "Lj0/h;", "Li0/t0;", "color", "a", "(J)J", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: j0.h$a$a, reason: collision with other inner class name */
        public static final class C0554a extends C3708h {
            C0554a(AbstractC3703c abstractC3703c, int i10) {
                super(abstractC3703c, abstractC3703c, i10, null);
            }

            @Override // j0.C3708h
            public long a(long color) {
                return color;
            }
        }
    }

    /* compiled from: Connector.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0010ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Lj0/h$b;", "Lj0/h;", "Lj0/x;", "mSource", "mDestination", "Lj0/n;", "intent", "<init>", "(Lj0/x;Lj0/x;ILkotlin/jvm/internal/k;)V", "source", "destination", "", "b", "(Lj0/x;Lj0/x;I)[F", "Li0/t0;", "color", "a", "(J)J", "h", "Lj0/x;", "i", "j", "[F", "mTransform", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: j0.h$b */
    public static final class b extends C3708h {

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final x mSource;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final x mDestination;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final float[] mTransform;

        public /* synthetic */ b(x xVar, x xVar2, int i10, C3854k c3854k) {
            this(xVar, xVar2, i10);
        }

        private final float[] b(x source, x destination, int intent) {
            if (C3704d.f(source.getWhitePoint(), destination.getWhitePoint())) {
                return C3704d.l(destination.getInverseTransform(), source.getTransform());
            }
            float[] transform = source.getTransform();
            float[] inverseTransform = destination.getInverseTransform();
            float[] fArrC = source.getWhitePoint().c();
            float[] fArrC2 = destination.getWhitePoint().c();
            WhitePoint whitePoint = source.getWhitePoint();
            C3711k c3711k = C3711k.f43359a;
            if (!C3704d.f(whitePoint, c3711k.b())) {
                float[] transform2 = AbstractC3701a.INSTANCE.a().getTransform();
                float[] fArrC3 = c3711k.c();
                float[] fArrCopyOf = Arrays.copyOf(fArrC3, fArrC3.length);
                C3862t.f(fArrCopyOf, "copyOf(this, size)");
                transform = C3704d.l(C3704d.e(transform2, fArrC, fArrCopyOf), source.getTransform());
            }
            if (!C3704d.f(destination.getWhitePoint(), c3711k.b())) {
                float[] transform3 = AbstractC3701a.INSTANCE.a().getTransform();
                float[] fArrC4 = c3711k.c();
                float[] fArrCopyOf2 = Arrays.copyOf(fArrC4, fArrC4.length);
                C3862t.f(fArrCopyOf2, "copyOf(this, size)");
                inverseTransform = C3704d.k(C3704d.l(C3704d.e(transform3, fArrC2, fArrCopyOf2), destination.getTransform()));
            }
            if (C3714n.e(intent, C3714n.INSTANCE.a())) {
                transform = C3704d.m(new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]}, transform);
            }
            return C3704d.l(inverseTransform, transform);
        }

        @Override // j0.C3708h
        public long a(long color) {
            float fR = C3602t0.r(color);
            float fQ = C3602t0.q(color);
            float fO = C3602t0.o(color);
            float fN = C3602t0.n(color);
            float fA = (float) this.mSource.getEotfFunc().a(fR);
            float fA2 = (float) this.mSource.getEotfFunc().a(fQ);
            float fA3 = (float) this.mSource.getEotfFunc().a(fO);
            float[] fArr = this.mTransform;
            return C3606v0.a((float) this.mDestination.getOetfFunc().a((fArr[0] * fA) + (fArr[3] * fA2) + (fArr[6] * fA3)), (float) this.mDestination.getOetfFunc().a((fArr[1] * fA) + (fArr[4] * fA2) + (fArr[7] * fA3)), (float) this.mDestination.getOetfFunc().a((fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3)), fN, this.mDestination);
        }

        private b(x xVar, x xVar2, int i10) {
            super(xVar, xVar2, xVar, xVar2, i10, null, null);
            this.mSource = xVar;
            this.mDestination = xVar2;
            this.mTransform = b(xVar, xVar2, i10);
        }
    }

    public /* synthetic */ C3708h(AbstractC3703c abstractC3703c, AbstractC3703c abstractC3703c2, int i10, C3854k c3854k) {
        this(abstractC3703c, abstractC3703c2, i10);
    }

    public long a(long color) {
        float fR = C3602t0.r(color);
        float fQ = C3602t0.q(color);
        float fO = C3602t0.o(color);
        float fN = C3602t0.n(color);
        long j10 = this.transformSource.j(fR, fQ, fO);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        float fM = this.transformSource.m(fR, fQ, fO);
        float[] fArr = this.transform;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fM *= fArr[2];
        }
        float f10 = fIntBitsToFloat;
        return this.transformDestination.n(f10, fIntBitsToFloat2, fM, fN, this.destination);
    }

    public /* synthetic */ C3708h(AbstractC3703c abstractC3703c, AbstractC3703c abstractC3703c2, AbstractC3703c abstractC3703c3, AbstractC3703c abstractC3703c4, int i10, float[] fArr, C3854k c3854k) {
        this(abstractC3703c, abstractC3703c2, abstractC3703c3, abstractC3703c4, i10, fArr);
    }

    private C3708h(AbstractC3703c abstractC3703c, AbstractC3703c abstractC3703c2, AbstractC3703c abstractC3703c3, AbstractC3703c abstractC3703c4, int i10, float[] fArr) {
        this.source = abstractC3703c;
        this.destination = abstractC3703c2;
        this.transformSource = abstractC3703c3;
        this.transformDestination = abstractC3703c4;
        this.renderIntent = i10;
        this.transform = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private C3708h(AbstractC3703c abstractC3703c, AbstractC3703c abstractC3703c2, int i10) {
        long model = abstractC3703c.getModel();
        C3702b.Companion companion = C3702b.INSTANCE;
        this(abstractC3703c, abstractC3703c2, C3702b.e(model, companion.b()) ? C3704d.d(abstractC3703c, C3711k.f43359a.b(), null, 2, null) : abstractC3703c, C3702b.e(abstractC3703c2.getModel(), companion.b()) ? C3704d.d(abstractC3703c2, C3711k.f43359a.b(), null, 2, null) : abstractC3703c2, i10, INSTANCE.b(abstractC3703c, abstractC3703c2, i10), null);
    }
}
