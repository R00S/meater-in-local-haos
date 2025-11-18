package J4;

import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.model.TemperatureLog;
import java.util.List;
import kotlin.C1509K0;
import kotlin.C1516O;
import kotlin.C1538d1;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1557m0;
import kotlin.Metadata;
import kotlin.W0;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: AnimatedCloudImage.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0005²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"Loa/F;", "b", "(LO/l;I)V", "", "currentIndex", "app_playstoreLiveRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: J4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1205b {

    /* compiled from: AnimatedCloudImage.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.dashboard.ui.AnimatedCloudImageKt$AnimatedCloudImage$1$1", f = "AnimatedCloudImage.kt", l = {29}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: J4.b$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f7449B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ List<Integer> f7450C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC1557m0 f7451D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<Integer> list, InterfaceC1557m0 interfaceC1557m0, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f7450C = list;
            this.f7451D = interfaceC1557m0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new a(this.f7450C, this.f7451D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:12:0x0025). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r5.f7449B
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                oa.C4173r.b(r6)
                goto L25
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                oa.C4173r.b(r6)
            L1a:
                r5.f7449B = r2
                r3 = 100
                java.lang.Object r6 = Xb.T.a(r3, r5)
                if (r6 != r0) goto L25
                return r0
            L25:
                O.m0 r6 = r5.f7451D
                int r1 = J4.C1205b.f(r6)
                int r1 = r1 + r2
                java.util.List<java.lang.Integer> r3 = r5.f7450C
                int r3 = r3.size()
                int r1 = r1 % r3
                J4.C1205b.g(r6, r1)
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: J4.C1205b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void b(InterfaceC1554l interfaceC1554l, final int i10) {
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(378820670);
        if (i10 == 0 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(378820670, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.AnimatedCloudImage (AnimatedCloudImage.kt:16)");
            }
            interfaceC1554lR.S(1048205814);
            Object objF = interfaceC1554lR.f();
            InterfaceC1554l.Companion companion = InterfaceC1554l.INSTANCE;
            if (objF == companion.a()) {
                objF = C1538d1.a(0);
                interfaceC1554lR.J(objF);
            }
            InterfaceC1557m0 interfaceC1557m0 = (InterfaceC1557m0) objF;
            interfaceC1554lR.I();
            List listP = kotlin.collections.r.p(Integer.valueOf(R.drawable.ic_meater_cloud_loading_01), Integer.valueOf(R.drawable.ic_meater_cloud_loading_02), Integer.valueOf(R.drawable.ic_meater_cloud_loading_03), Integer.valueOf(R.drawable.ic_meater_cloud_loading_04));
            C4153F c4153f = C4153F.f46609a;
            interfaceC1554lR.S(1048215667);
            Object objF2 = interfaceC1554lR.f();
            if (objF2 == companion.a()) {
                objF2 = new a(listP, interfaceC1557m0, null);
                interfaceC1554lR.J(objF2);
            }
            interfaceC1554lR.I();
            C1516O.e(c4153f, (Ba.p) objF2, interfaceC1554lR, 6);
            w.y.a(D0.e.c(((Number) listP.get(c(interfaceC1557m0))).intValue(), interfaceC1554lR, 0), null, androidx.compose.foundation.layout.r.f(b0.i.INSTANCE, 0.0f, 1, null), null, null, 0.0f, null, interfaceC1554lR, 432, TemperatureLog.MAX_TEMPERATURE_HISTORY_SAMPLES);
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new Ba.p() { // from class: J4.a
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return C1205b.e(i10, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(InterfaceC1557m0 interfaceC1557m0) {
        return interfaceC1557m0.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC1557m0 interfaceC1557m0, int i10) {
        interfaceC1557m0.g(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F e(int i10, InterfaceC1554l interfaceC1554l, int i11) {
        b(interfaceC1554l, C1509K0.a(i10 | 1));
        return C4153F.f46609a;
    }
}
