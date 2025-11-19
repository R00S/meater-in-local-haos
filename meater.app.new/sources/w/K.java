package w;

import F0.ProgressBarRangeInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;

/* compiled from: ProgressSemantics.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lb0/i;", "a", "(Lb0/i;)Lb0/i;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class K {

    /* compiled from: ProgressSemantics.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LF0/x;", "Loa/F;", "a", "(LF0/x;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<F0.x, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f51678B = new a();

        a() {
            super(1);
        }

        public final void a(F0.x xVar) {
            F0.v.G(xVar, ProgressBarRangeInfo.INSTANCE.a());
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(F0.x xVar) {
            a(xVar);
            return C4153F.f46609a;
        }
    }

    public static final b0.i a(b0.i iVar) {
        return F0.o.c(iVar, true, a.f51678B);
    }
}
