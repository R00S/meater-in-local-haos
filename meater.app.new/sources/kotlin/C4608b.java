package kotlin;

import Ba.l;
import i0.C3602t0;
import i0.C3606v0;
import j0.AbstractC3703c;
import j0.C3707g;
import kotlin.C4767p;
import kotlin.C4774s0;
import kotlin.InterfaceC4770q0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;

/* compiled from: ColorVectorConverter.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\",\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"-\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0000*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "Lj0/c;", "Lv/q0;", "Li0/t0;", "Lv/p;", "a", "LBa/l;", "ColorToVector", "Li0/t0$a;", "(Li0/t0$a;)LBa/l;", "VectorConverter", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: u.b, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4608b {

    /* renamed from: a, reason: collision with root package name */
    private static final l<AbstractC3703c, InterfaceC4770q0<C3602t0, C4767p>> f50160a = a.f50161B;

    /* compiled from: ColorVectorConverter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj0/c;", "colorSpace", "Lv/q0;", "Li0/t0;", "Lv/p;", "a", "(Lj0/c;)Lv/q0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: u.b$a */
    static final class a extends AbstractC3864v implements l<AbstractC3703c, InterfaceC4770q0<C3602t0, C4767p>> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f50161B = new a();

        /* compiled from: ColorVectorConverter.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/t0;", "color", "Lv/p;", "a", "(J)Lv/p;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: u.b$a$a, reason: collision with other inner class name */
        static final class C0714a extends AbstractC3864v implements l<C3602t0, C4767p> {

            /* renamed from: B, reason: collision with root package name */
            public static final C0714a f50162B = new C0714a();

            C0714a() {
                super(1);
            }

            public final C4767p a(long j10) {
                long jI = C3602t0.i(j10, C3707g.f43324a.t());
                return new C4767p(C3602t0.n(jI), C3602t0.r(jI), C3602t0.q(jI), C3602t0.o(jI));
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4767p invoke(C3602t0 c3602t0) {
                return a(c3602t0.getValue());
            }
        }

        /* compiled from: ColorVectorConverter.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv/p;", "vector", "Li0/t0;", "a", "(Lv/p;)J"}, k = 3, mv = {1, 8, 0})
        /* renamed from: u.b$a$b */
        static final class b extends AbstractC3864v implements l<C4767p, C3602t0> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ AbstractC3703c f50163B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AbstractC3703c abstractC3703c) {
                super(1);
                this.f50163B = abstractC3703c;
            }

            public final long a(C4767p c4767p) {
                float v22 = c4767p.getV2();
                if (v22 < 0.0f) {
                    v22 = 0.0f;
                }
                if (v22 > 1.0f) {
                    v22 = 1.0f;
                }
                float v32 = c4767p.getV3();
                if (v32 < -0.5f) {
                    v32 = -0.5f;
                }
                if (v32 > 0.5f) {
                    v32 = 0.5f;
                }
                float v42 = c4767p.getV4();
                float f10 = v42 >= -0.5f ? v42 : -0.5f;
                float f11 = f10 <= 0.5f ? f10 : 0.5f;
                float v12 = c4767p.getV1();
                float f12 = v12 >= 0.0f ? v12 : 0.0f;
                return C3602t0.i(C3606v0.a(v22, v32, f11, f12 <= 1.0f ? f12 : 1.0f, C3707g.f43324a.t()), this.f50163B);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C3602t0 invoke(C4767p c4767p) {
                return C3602t0.g(a(c4767p));
            }
        }

        a() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4770q0<C3602t0, C4767p> invoke(AbstractC3703c abstractC3703c) {
            return C4774s0.a(C0714a.f50162B, new b(abstractC3703c));
        }
    }

    public static final l<AbstractC3703c, InterfaceC4770q0<C3602t0, C4767p>> a(C3602t0.Companion companion) {
        return f50160a;
    }
}
