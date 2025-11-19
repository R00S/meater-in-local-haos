package q5;

import Xb.A0;
import Xb.C1841i;
import Xb.F;
import Xb.InterfaceC1867v0;
import android.view.Z;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import e5.C3197a;
import g5.EnumC3425a;
import g5.EnumC3427c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;
import l4.AbstractC3900b;
import l4.InterfaceC3899a;
import la.C3920a;
import n4.Device;
import n4.DevicesData;
import oa.C4153F;
import oa.C4173r;
import r4.InterfaceC4345b;
import ta.AbstractC4585a;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: QSGSharedViewModel.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\r¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\r¢\u0006\u0004\b$\u0010#J\r\u0010%\u001a\u00020\r¢\u0006\u0004\b%\u0010#J\u0015\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u001f¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\r¢\u0006\u0004\b)\u0010#J#\u0010.\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020,0+j\b\u0012\u0004\u0012\u00020,`-0*¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0010¢\u0006\u0004\b0\u00101J\u0013\u00102\u001a\b\u0012\u0004\u0012\u00020,0*¢\u0006\u0004\b2\u0010/J\u001d\u00103\u001a\u0012\u0012\u0004\u0012\u00020,0+j\b\u0012\u0004\u0012\u00020,`-¢\u0006\u0004\b3\u00104J%\u00106\u001a\u00020\r2\u0016\u00105\u001a\u0012\u0012\u0004\u0012\u00020,0+j\b\u0012\u0004\u0012\u00020,`-¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\u00020\r2\u0006\u00108\u001a\u00020\u0010¢\u0006\u0004\b9\u0010\u0013J\r\u0010:\u001a\u00020\r¢\u0006\u0004\b:\u0010#J\r\u0010<\u001a\u00020;¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\r¢\u0006\u0004\b>\u0010#J\u000f\u0010?\u001a\u00020\rH\u0014¢\u0006\u0004\b?\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020;0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020;0*8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010/R\"\u0010R\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010N\u001a\u0004\bO\u0010=\"\u0004\bP\u0010QR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010X\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010UR \u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0Y0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010HR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020,0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010HR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020;0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010HR\u0014\u0010b\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010aR\u001d\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0Y0*8F¢\u0006\u0006\u001a\u0004\bc\u0010/R\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00020,0*8F¢\u0006\u0006\u001a\u0004\be\u0010/R\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020;0*8F¢\u0006\u0006\u001a\u0004\bg\u0010/¨\u0006i"}, d2 = {"Lq5/O;", "Landroidx/lifecycle/Y;", "Lr4/b;", "pairedDeviceUseCase", "LR5/c;", "videoTutorialViewModel", "LG5/a;", "preference", "<init>", "(Lr4/b;LR5/c;LG5/a;)V", "Ll4/b;", "Ln4/b;", "it", "Loa/F;", "A", "(Ll4/b;)V", "", "progress", "I", "(I)V", "Lg5/c;", "J", "(Lg5/c;)V", "t", "()Lg5/c;", "Lcom/apptionlabs/meater_app/model/MEATERDeviceType;", "selectedDevice", "K", "(Lcom/apptionlabs/meater_app/model/MEATERDeviceType;)V", "u", "()Lcom/apptionlabs/meater_app/model/MEATERDeviceType;", "Lg5/a;", "n", "()Lg5/a;", "E", "()V", "l", "L", "choseDevice", "F", "(Lg5/a;)V", "m", "Landroidx/lifecycle/B;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "y", "()Landroidx/lifecycle/B;", "w", "()I", "x", "r", "()Ljava/util/ArrayList;", "strings", "B", "(Ljava/util/ArrayList;)V", "id", "H", "C", "", "z", "()Z", "G", "g", "b", "Lr4/b;", "c", "LR5/c;", "d", "LG5/a;", "Landroidx/lifecycle/D;", "e", "Landroidx/lifecycle/D;", "_flagShowNavigation", "f", "Landroidx/lifecycle/B;", "q", "flagShowNavigation", "Z", "v", "D", "(Z)V", "shouldSaveQSGProgress", "LXb/v0;", "h", "LXb/v0;", "job", "i", "rebootJob", "", "Ln4/a;", "j", "_deviceList", "k", "_error", "_rebootFinish", "LXb/F;", "LXb/F;", "coroutineExceptionHandler", "o", "deviceList", "p", "error", "s", "rebootFinish", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class O extends android.view.Y {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4345b pairedDeviceUseCase;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final R5.c videoTutorialViewModel;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final G5.a preference;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final android.view.D<Boolean> _flagShowNavigation;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final android.view.B<Boolean> flagShowNavigation;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean shouldSaveQSGProgress;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 job;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 rebootJob;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final android.view.D<List<Device>> _deviceList;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final android.view.D<String> _error;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final android.view.D<Boolean> _rebootFinish;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Xb.F coroutineExceptionHandler;

    /* compiled from: QSGSharedViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.info.QSGSharedViewModel$fetchPairedDevices$1", f = "QSGSharedViewModel.kt", l = {93, 95}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f48032B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f48033C;

        /* compiled from: QSGSharedViewModel.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.info.QSGSharedViewModel$fetchPairedDevices$1$2$1", f = "QSGSharedViewModel.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: q5.O$a$a, reason: collision with other inner class name */
        static final class C0667a extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f48035B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ O f48036C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ AbstractC3900b<DevicesData> f48037D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0667a(O o10, AbstractC3900b<DevicesData> abstractC3900b, InterfaceC4588d<? super C0667a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f48036C = o10;
                this.f48037D = abstractC3900b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new C0667a(this.f48036C, this.f48037D, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((C0667a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f48035B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                this.f48036C.A(this.f48037D);
                return C4153F.f46609a;
            }
        }

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            a aVar = O.this.new a(interfaceC4588d);
            aVar.f48033C = obj;
            return aVar;
        }

        @Override // Ba.p
        public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r7.f48032B
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r7.f48033C
                oa.C4173r.b(r8)
                goto L7e
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                oa.C4173r.b(r8)     // Catch: java.lang.Throwable -> L20
                goto L4c
            L20:
                r8 = move-exception
                goto L53
            L22:
                oa.C4173r.b(r8)
                java.lang.Object r8 = r7.f48033C
                Xb.I r8 = (Xb.I) r8
                q5.O r8 = q5.O.this
                oa.q$a r1 = oa.C4172q.INSTANCE     // Catch: java.lang.Throwable -> L20
                r4.b r1 = q5.O.h(r8)     // Catch: java.lang.Throwable -> L20
                n4.c r4 = new n4.c     // Catch: java.lang.Throwable -> L20
                G5.a r8 = q5.O.i(r8)     // Catch: java.lang.Throwable -> L20
                java.lang.String r8 = r8.J()     // Catch: java.lang.Throwable -> L20
                java.lang.String r5 = "getUserEmail(...)"
                kotlin.jvm.internal.C3862t.f(r8, r5)     // Catch: java.lang.Throwable -> L20
                r4.<init>(r8)     // Catch: java.lang.Throwable -> L20
                r7.f48032B = r3     // Catch: java.lang.Throwable -> L20
                java.lang.Object r8 = r1.a(r4, r7)     // Catch: java.lang.Throwable -> L20
                if (r8 != r0) goto L4c
                return r0
            L4c:
                l4.b r8 = (l4.AbstractC3900b) r8     // Catch: java.lang.Throwable -> L20
                java.lang.Object r8 = oa.C4172q.a(r8)     // Catch: java.lang.Throwable -> L20
                goto L5d
            L53:
                oa.q$a r1 = oa.C4172q.INSTANCE
                java.lang.Object r8 = oa.C4173r.a(r8)
                java.lang.Object r8 = oa.C4172q.a(r8)
            L5d:
                q5.O r1 = q5.O.this
                boolean r3 = oa.C4172q.d(r8)
                if (r3 == 0) goto L7f
                r3 = r8
                l4.b r3 = (l4.AbstractC3900b) r3
                Xb.G0 r4 = Xb.Z.c()
                q5.O$a$a r5 = new q5.O$a$a
                r6 = 0
                r5.<init>(r1, r3, r6)
                r7.f48033C = r8
                r7.f48032B = r2
                java.lang.Object r1 = Xb.C1837g.g(r4, r5, r7)
                if (r1 != r0) goto L7d
                return r0
            L7d:
                r0 = r8
            L7e:
                r8 = r0
            L7f:
                java.lang.Throwable r8 = oa.C4172q.b(r8)
                if (r8 == 0) goto L8e
                java.lang.String r0 = "Exception"
                java.lang.Object[] r8 = new java.lang.Object[]{r8}
                U4.b.e(r0, r8)
            L8e:
                oa.F r8 = oa.C4153F.f46609a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: q5.O.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"q5/O$b", "Lta/a;", "LXb/F;", "Lta/g;", "context", "", "exception", "Loa/F;", "y", "(Lta/g;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends AbstractC4585a implements Xb.F {
        public b(F.Companion companion) {
            super(companion);
        }

        @Override // Xb.F
        public void y(ta.g context, Throwable exception) {
            U4.b.e("Exception", exception);
        }
    }

    /* compiled from: QSGSharedViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.info.QSGSharedViewModel$waitForRebootComplete$1", f = "QSGSharedViewModel.kt", l = {108}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class c extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f48038B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f48039C;

        /* compiled from: QSGSharedViewModel.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.info.QSGSharedViewModel$waitForRebootComplete$1$1", f = "QSGSharedViewModel.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f48041B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ O f48042C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(O o10, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f48042C = o10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new a(this.f48042C, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f48041B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                this.f48042C._rebootFinish.l(kotlin.coroutines.jvm.internal.b.a(true));
                return C4153F.f46609a;
            }
        }

        c(InterfaceC4588d<? super c> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            c cVar = O.this.new c(interfaceC4588d);
            cVar.f48039C = obj;
            return cVar;
        }

        @Override // Ba.p
        public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((c) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Xb.I i10;
            Object objE = C4696b.e();
            int i11 = this.f48038B;
            if (i11 == 0) {
                C4173r.b(obj);
                Xb.I i12 = (Xb.I) this.f48039C;
                this.f48039C = i12;
                this.f48038B = 1;
                if (Xb.T.a(70000L, this) == objE) {
                    return objE;
                }
                i10 = i12;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = (Xb.I) this.f48039C;
                C4173r.b(obj);
            }
            C3920a.b(i10, new a(O.this, null));
            return C4153F.f46609a;
        }
    }

    public O(InterfaceC4345b pairedDeviceUseCase, R5.c videoTutorialViewModel, G5.a preference) {
        C3862t.g(pairedDeviceUseCase, "pairedDeviceUseCase");
        C3862t.g(videoTutorialViewModel, "videoTutorialViewModel");
        C3862t.g(preference, "preference");
        this.pairedDeviceUseCase = pairedDeviceUseCase;
        this.videoTutorialViewModel = videoTutorialViewModel;
        this.preference = preference;
        android.view.D<Boolean> d10 = new android.view.D<>();
        this._flagShowNavigation = d10;
        this.flagShowNavigation = d10;
        this.shouldSaveQSGProgress = true;
        this._deviceList = new android.view.D<>();
        this._error = new android.view.D<>();
        this._rebootFinish = new android.view.D<>();
        this.coroutineExceptionHandler = new b(Xb.F.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void A(AbstractC3900b<DevicesData> it) {
        if (it instanceof AbstractC3900b.a) {
            android.view.D<String> d10 = this._error;
            InterfaceC3899a error = ((AbstractC3900b.a) it).getError();
            d10.l(error != null ? C3197a.c(error) : null);
            return;
        }
        if (!(it instanceof AbstractC3900b.C0590b)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC3900b.C0590b c0590b = (AbstractC3900b.C0590b) it;
        if (c0590b.a() != 0) {
            T tA = c0590b.a();
            C3862t.d(tA);
            if (((DevicesData) tA).a() != null) {
                android.view.D<List<Device>> d11 = this._deviceList;
                T tA2 = c0590b.a();
                C3862t.d(tA2);
                List<Device> listA = ((DevicesData) tA2).a();
                C3862t.d(listA);
                d11.l(listA);
                return;
            }
        }
        this._error.l("");
    }

    public final void B(ArrayList<String> strings) {
        C3862t.g(strings, "strings");
        this.videoTutorialViewModel.w(strings);
    }

    public final void C() {
        this.preference.S0(true);
    }

    public final void D(boolean z10) {
        this.shouldSaveQSGProgress = z10;
    }

    public final void E() {
        this._flagShowNavigation.o(Boolean.TRUE);
    }

    public final void F(EnumC3425a choseDevice) {
        C3862t.g(choseDevice, "choseDevice");
        this.preference.n0(choseDevice.getType());
    }

    public final void G() {
        HashSet hashSet = new HashSet();
        hashSet.add(Q5.b.f14344D.getValue());
        hashSet.add(Q5.b.f14345E.getValue());
        hashSet.add(Q5.b.f14346F.getValue());
        hashSet.add(Q5.b.f14347G.getValue());
        if (this.preference.z().isEmpty()) {
            this.preference.T0(hashSet);
        }
    }

    public final void H(int id2) {
        switch (id2) {
            case R.id.batteryTabFragment /* 2131362024 */:
                J(EnumC3427c.f41906K);
                break;
            case R.id.blockPowerUpFragment /* 2131362047 */:
                J(EnumC3427c.f41907L);
                break;
            case R.id.blockTemperatureScaleFragment /* 2131362049 */:
                J(EnumC3427c.f41908M);
                break;
            case R.id.chargeFragment /* 2131362118 */:
                J(EnumC3427c.f41909N);
                break;
            case R.id.chooseProductFragment /* 2131362131 */:
                J(EnumC3427c.f41901F);
                break;
            case R.id.devicePermissionsFragment /* 2131362323 */:
                J(EnumC3427c.f41910O);
                break;
            case R.id.importantAlertPermissionDisabledFragment /* 2131362656 */:
                J(EnumC3427c.f41915T);
                break;
            case R.id.importantAlertPermissionFragment /* 2131362657 */:
                J(EnumC3427c.f41914S);
                break;
            case R.id.loginFragment /* 2131362762 */:
                J(EnumC3427c.f41899D);
                break;
            case R.id.manualFragment /* 2131362786 */:
                J(EnumC3427c.f41903H);
                break;
            case R.id.nearByDevicesFragment /* 2131362908 */:
                J(EnumC3427c.f41917V);
                break;
            case R.id.notificationPermissionsDisabledFragment /* 2131362939 */:
                J(EnumC3427c.f41913R);
                break;
            case R.id.notificationPermissionsFragment /* 2131362940 */:
                J(EnumC3427c.f41912Q);
                break;
            case R.id.pairingCompleteFragment /* 2131362990 */:
                J(EnumC3427c.f41918W);
                break;
            case R.id.pairingFragment /* 2131362991 */:
                J(EnumC3427c.f41916U);
                break;
            case R.id.permissionsDisabledFragment /* 2131363018 */:
                J(EnumC3427c.f41911P);
                break;
            case R.id.productSelectionFragment /* 2131363057 */:
                J(EnumC3427c.f41902G);
                break;
            case R.id.signupFragment /* 2131363256 */:
                J(EnumC3427c.f41899D);
                break;
            case R.id.temperatureSensorsAmbientFragment /* 2131363362 */:
                J(EnumC3427c.f41905J);
                break;
            case R.id.temperatureSensorsInternalFragment /* 2131363363 */:
                J(EnumC3427c.f41904I);
                break;
        }
    }

    public final void I(int progress) {
        this.preference.o0(progress);
    }

    public final void J(EnumC3427c progress) {
        C3862t.g(progress, "progress");
        if (this.shouldSaveQSGProgress) {
            I(progress.getProgress());
        }
    }

    public final void K(MEATERDeviceType selectedDevice) {
        C3862t.g(selectedDevice, "selectedDevice");
        this.preference.p0(selectedDevice.probeNumber);
    }

    public final void L() {
        this.rebootJob = C1841i.d(Z.a(this), Xb.Z.b().s(this.coroutineExceptionHandler), null, new c(null), 2, null);
    }

    @Override // android.view.Y
    protected void g() {
        super.g();
        InterfaceC1867v0 interfaceC1867v0 = this.job;
        if (interfaceC1867v0 != null) {
            InterfaceC1867v0.a.a(interfaceC1867v0, null, 1, null);
        }
        InterfaceC1867v0 interfaceC1867v02 = this.rebootJob;
        if (interfaceC1867v02 != null) {
            InterfaceC1867v0.a.a(interfaceC1867v02, null, 1, null);
        }
        A0.i(Z.a(this).getCoroutineContext(), null, 1, null);
    }

    public final void l() {
        if (this.preference.e()) {
            this.job = C1841i.d(Z.a(this), Xb.Z.b().s(this.coroutineExceptionHandler), null, new a(null), 2, null);
        }
    }

    public final void m() {
        if (this.preference.e()) {
            this.videoTutorialViewModel.p();
        }
    }

    public final EnumC3425a n() {
        return EnumC3425a.INSTANCE.a(this.preference.w());
    }

    public final android.view.B<List<Device>> o() {
        return this._deviceList;
    }

    public final android.view.B<String> p() {
        return this._error;
    }

    public final android.view.B<Boolean> q() {
        return this.flagShowNavigation;
    }

    public final ArrayList<String> r() {
        return this.videoTutorialViewModel.l();
    }

    public final android.view.B<Boolean> s() {
        return this._rebootFinish;
    }

    public final EnumC3427c t() {
        return EnumC3427c.INSTANCE.a(this.preference.x());
    }

    public final MEATERDeviceType u() {
        MEATERDeviceType next;
        Iterator<MEATERDeviceType> it = MEATERDeviceType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.probeNumber == this.preference.y()) {
                break;
            }
        }
        MEATERDeviceType mEATERDeviceType = next;
        return mEATERDeviceType == null ? MEATERDeviceType.PROBE : mEATERDeviceType;
    }

    /* renamed from: v, reason: from getter */
    public final boolean getShouldSaveQSGProgress() {
        return this.shouldSaveQSGProgress;
    }

    public final int w() {
        return this.videoTutorialViewModel.t();
    }

    public final android.view.B<String> x() {
        return this.videoTutorialViewModel.v();
    }

    public final android.view.B<ArrayList<String>> y() {
        return this.videoTutorialViewModel.u();
    }

    public final boolean z() {
        Iterator<MEATERDevice> it = LocalStorage.sharedStorage().deviceDAO().a().iterator();
        while (it.hasNext()) {
            if (it.next().isPaired()) {
                return true;
            }
        }
        return false;
    }
}
