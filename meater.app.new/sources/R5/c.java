package R5;

import Ba.p;
import M4.h;
import Q5.BasicTutorial;
import Xb.C1841i;
import Xb.F;
import Xb.I;
import Xb.InterfaceC1867v0;
import android.view.B;
import android.view.D;
import android.view.Y;
import android.view.Z;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import e5.C3197a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3862t;
import l4.AbstractC3900b;
import l4.InterfaceC3899a;
import oa.C4153F;
import oa.C4169n;
import oa.C4173r;
import p4.SaveWatchedVideoRequestInput;
import p4.WatchedVideos;
import t4.InterfaceC4554d;
import t4.InterfaceC4557g;
import ta.AbstractC4585a;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: VideoTutorialSharedViewModel.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010!\u001a\u0012\u0012\u0004\u0012\u00020 0\u001cj\b\u0012\u0004\u0012\u00020 `\u001e2\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001e¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0015¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0015¢\u0006\u0004\b%\u0010$J%\u0010'\u001a\u00020\u00152\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020 0\u001cj\b\u0012\u0004\u0012\u00020 `\u001e¢\u0006\u0004\b'\u0010(J%\u0010*\u001a\u00020\u00152\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001e¢\u0006\u0004\b*\u0010(J\u001d\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001e¢\u0006\u0004\b+\u0010,J\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\b¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R*\u0010A\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001e0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R-\u0010G\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001e0B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001d0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010@R\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001d0B8\u0006¢\u0006\f\n\u0004\bJ\u0010D\u001a\u0004\bK\u0010FR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006Q"}, d2 = {"LR5/c;", "Landroidx/lifecycle/Y;", "Lt4/d;", "getWatchedVideosUseCase", "Lt4/g;", "saveWatchedVideosUseCase", "LG5/a;", "preference", "LI5/a;", "cacheManager", "<init>", "(Lt4/d;Lt4/g;LG5/a;LI5/a;)V", "", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "devices", "Lcom/apptionlabs/meater_app/model/MEATERDeviceType;", "r", "(Ljava/util/List;)Lcom/apptionlabs/meater_app/model/MEATERDeviceType;", "Ll4/b;", "Lp4/n;", "it", "Loa/F;", "m", "(Ll4/b;)V", "o", "", "n", "()Z", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "skippedVideos", "LQ5/a;", "s", "(Ljava/util/ArrayList;)Ljava/util/ArrayList;", "p", "()V", "y", "videoTutorialList", "x", "(Ljava/util/ArrayList;)V", "videoTutorialIds", "w", "l", "()Ljava/util/ArrayList;", "", "t", "()I", "q", "()LI5/a;", "b", "Lt4/d;", "c", "Lt4/g;", "d", "LG5/a;", "e", "LI5/a;", "LXb/v0;", "f", "LXb/v0;", "job", "Landroidx/lifecycle/D;", "g", "Landroidx/lifecycle/D;", "_watchedVideos", "Landroidx/lifecycle/B;", "h", "Landroidx/lifecycle/B;", "u", "()Landroidx/lifecycle/B;", "watchedVideos", "i", "_watchedVideosError", "j", "v", "watchedVideosError", "LXb/F;", "k", "LXb/F;", "coroutineExceptionHandler", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c extends Y {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4554d getWatchedVideosUseCase;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4557g saveWatchedVideosUseCase;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final G5.a preference;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final I5.a cacheManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 job;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final D<ArrayList<String>> _watchedVideos;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final B<ArrayList<String>> watchedVideos;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final D<String> _watchedVideosError;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final B<String> watchedVideosError;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final F coroutineExceptionHandler;

    /* compiled from: VideoTutorialSharedViewModel.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15039a;

        static {
            int[] iArr = new int[MEATERDeviceType.values().length];
            try {
                iArr[MEATERDeviceType.PROBE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MEATERDeviceType.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MEATERDeviceType.PLUS_SE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_PLUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_PLUS_PRO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MEATERDeviceType.BLOCK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_TWO_PROBE_BLOCK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MEATERDeviceType.THIRD_GENERATION_ONE_FIRST_GENERATION_PROBE_BLOCK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MEATERDeviceType.THIRD_GENERATION_TWO_FIRST_GENERATION_PROBE_BLOCK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[MEATERDeviceType.THIRD_GENERATION_ONE_SECOND_GENERATION_PROBE_BLOCK.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[MEATERDeviceType.THIRD_GENERATION_TWO_SECOND_GENERATION_PROBE_BLOCK.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[MEATERDeviceType.BLOCK_PROBE_ONE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[MEATERDeviceType.BLOCK_PROBE_TWO.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[MEATERDeviceType.BLOCK_PROBE_THREE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[MEATERDeviceType.BLOCK_PROBE_FOUR.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[MEATERDeviceType.THERMOMIX_PROBE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[MEATERDeviceType.TRAEGER_PROBE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_PROBE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_ONE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_TWO.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_THREE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_FOUR.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_THERMOMIX_PROBE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_TRAEGER_PROBE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_THERMOMIX_PLUS.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_TRAEGER_PLUS.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[MEATERDeviceType.AMBER.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            f15039a = iArr;
        }
    }

    /* compiled from: VideoTutorialSharedViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.videoTutorial.ui.VideoTutorialSharedViewModel$fetchWatchedVideos$1", f = "VideoTutorialSharedViewModel.kt", l = {159, 161}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class b extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f15040B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f15041C;

        /* compiled from: VideoTutorialSharedViewModel.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.videoTutorial.ui.VideoTutorialSharedViewModel$fetchWatchedVideos$1$2$1", f = "VideoTutorialSharedViewModel.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        static final class a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f15043B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ c f15044C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ AbstractC3900b<WatchedVideos> f15045D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, AbstractC3900b<WatchedVideos> abstractC3900b, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f15044C = cVar;
                this.f15045D = abstractC3900b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new a(this.f15044C, this.f15045D, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f15043B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                this.f15044C.m(this.f15045D);
                return C4153F.f46609a;
            }
        }

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            b bVar = c.this.new b(interfaceC4588d);
            bVar.f15041C = obj;
            return bVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r7.f15040B
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r7.f15041C
                oa.C4173r.b(r8)
                goto L6c
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                oa.C4173r.b(r8)     // Catch: java.lang.Throwable -> L20
                goto L3a
            L20:
                r8 = move-exception
                goto L41
            L22:
                oa.C4173r.b(r8)
                java.lang.Object r8 = r7.f15041C
                Xb.I r8 = (Xb.I) r8
                R5.c r8 = R5.c.this
                oa.q$a r1 = oa.C4172q.INSTANCE     // Catch: java.lang.Throwable -> L20
                t4.d r8 = R5.c.j(r8)     // Catch: java.lang.Throwable -> L20
                r7.f15040B = r3     // Catch: java.lang.Throwable -> L20
                java.lang.Object r8 = r8.a(r7)     // Catch: java.lang.Throwable -> L20
                if (r8 != r0) goto L3a
                return r0
            L3a:
                l4.b r8 = (l4.AbstractC3900b) r8     // Catch: java.lang.Throwable -> L20
                java.lang.Object r8 = oa.C4172q.a(r8)     // Catch: java.lang.Throwable -> L20
                goto L4b
            L41:
                oa.q$a r1 = oa.C4172q.INSTANCE
                java.lang.Object r8 = oa.C4173r.a(r8)
                java.lang.Object r8 = oa.C4172q.a(r8)
            L4b:
                R5.c r1 = R5.c.this
                boolean r3 = oa.C4172q.d(r8)
                if (r3 == 0) goto L6d
                r3 = r8
                l4.b r3 = (l4.AbstractC3900b) r3
                Xb.G0 r4 = Xb.Z.c()
                R5.c$b$a r5 = new R5.c$b$a
                r6 = 0
                r5.<init>(r1, r3, r6)
                r7.f15041C = r8
                r7.f15040B = r2
                java.lang.Object r1 = Xb.C1837g.g(r4, r5, r7)
                if (r1 != r0) goto L6b
                return r0
            L6b:
                r0 = r8
            L6c:
                r8 = r0
            L6d:
                java.lang.Throwable r8 = oa.C4172q.b(r8)
                if (r8 == 0) goto L7c
                java.lang.String r0 = "Exception"
                java.lang.Object[] r8 = new java.lang.Object[]{r8}
                U4.b.e(r0, r8)
            L7c:
                oa.F r8 = oa.C4153F.f46609a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: R5.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: VideoTutorialSharedViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.videoTutorial.ui.VideoTutorialSharedViewModel$saveWatchedVideosStatusOnCloud$1", f = "VideoTutorialSharedViewModel.kt", l = {176, 178}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: R5.c$c, reason: collision with other inner class name */
    static final class C0218c extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f15046B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f15047C;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ SaveWatchedVideoRequestInput f15049E;

        /* compiled from: VideoTutorialSharedViewModel.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.videoTutorial.ui.VideoTutorialSharedViewModel$saveWatchedVideosStatusOnCloud$1$2$1", f = "VideoTutorialSharedViewModel.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: R5.c$c$a */
        static final class a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f15050B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ c f15051C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ AbstractC3900b<WatchedVideos> f15052D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, AbstractC3900b<WatchedVideos> abstractC3900b, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f15051C = cVar;
                this.f15052D = abstractC3900b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new a(this.f15051C, this.f15052D, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f15050B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                this.f15051C.o(this.f15052D);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0218c(SaveWatchedVideoRequestInput saveWatchedVideoRequestInput, InterfaceC4588d<? super C0218c> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f15049E = saveWatchedVideoRequestInput;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            C0218c c0218c = c.this.new C0218c(this.f15049E, interfaceC4588d);
            c0218c.f15047C = obj;
            return c0218c;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((C0218c) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r7.f15046B
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r7.f15047C
                oa.C4173r.b(r8)
                goto L6e
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                oa.C4173r.b(r8)     // Catch: java.lang.Throwable -> L20
                goto L3c
            L20:
                r8 = move-exception
                goto L43
            L22:
                oa.C4173r.b(r8)
                java.lang.Object r8 = r7.f15047C
                Xb.I r8 = (Xb.I) r8
                R5.c r8 = R5.c.this
                p4.k r1 = r7.f15049E
                oa.q$a r4 = oa.C4172q.INSTANCE     // Catch: java.lang.Throwable -> L20
                t4.g r8 = R5.c.k(r8)     // Catch: java.lang.Throwable -> L20
                r7.f15046B = r3     // Catch: java.lang.Throwable -> L20
                java.lang.Object r8 = r8.a(r1, r7)     // Catch: java.lang.Throwable -> L20
                if (r8 != r0) goto L3c
                return r0
            L3c:
                l4.b r8 = (l4.AbstractC3900b) r8     // Catch: java.lang.Throwable -> L20
                java.lang.Object r8 = oa.C4172q.a(r8)     // Catch: java.lang.Throwable -> L20
                goto L4d
            L43:
                oa.q$a r1 = oa.C4172q.INSTANCE
                java.lang.Object r8 = oa.C4173r.a(r8)
                java.lang.Object r8 = oa.C4172q.a(r8)
            L4d:
                R5.c r1 = R5.c.this
                boolean r3 = oa.C4172q.d(r8)
                if (r3 == 0) goto L6f
                r3 = r8
                l4.b r3 = (l4.AbstractC3900b) r3
                Xb.G0 r4 = Xb.Z.c()
                R5.c$c$a r5 = new R5.c$c$a
                r6 = 0
                r5.<init>(r1, r3, r6)
                r7.f15047C = r8
                r7.f15046B = r2
                java.lang.Object r1 = Xb.C1837g.g(r4, r5, r7)
                if (r1 != r0) goto L6d
                return r0
            L6d:
                r0 = r8
            L6e:
                r8 = r0
            L6f:
                java.lang.Throwable r8 = oa.C4172q.b(r8)
                if (r8 == 0) goto L7e
                java.lang.String r0 = "Exception"
                java.lang.Object[] r8 = new java.lang.Object[]{r8}
                U4.b.e(r0, r8)
            L7e:
                oa.F r8 = oa.C4153F.f46609a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: R5.c.C0218c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"R5/c$d", "Lta/a;", "LXb/F;", "Lta/g;", "context", "", "exception", "Loa/F;", "y", "(Lta/g;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends AbstractC4585a implements F {
        public d(F.Companion companion) {
            super(companion);
        }

        @Override // Xb.F
        public void y(ta.g context, Throwable exception) {
            U4.b.e("Exception", exception);
        }
    }

    public c(InterfaceC4554d getWatchedVideosUseCase, InterfaceC4557g saveWatchedVideosUseCase, G5.a preference, I5.a cacheManager) {
        C3862t.g(getWatchedVideosUseCase, "getWatchedVideosUseCase");
        C3862t.g(saveWatchedVideosUseCase, "saveWatchedVideosUseCase");
        C3862t.g(preference, "preference");
        C3862t.g(cacheManager, "cacheManager");
        this.getWatchedVideosUseCase = getWatchedVideosUseCase;
        this.saveWatchedVideosUseCase = saveWatchedVideosUseCase;
        this.preference = preference;
        this.cacheManager = cacheManager;
        D<ArrayList<String>> d10 = new D<>();
        this._watchedVideos = d10;
        this.watchedVideos = d10;
        D<String> d11 = new D<>();
        this._watchedVideosError = d11;
        this.watchedVideosError = d11;
        this.coroutineExceptionHandler = new d(F.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void m(AbstractC3900b<WatchedVideos> it) {
        if (it instanceof AbstractC3900b.a) {
            B b10 = this._watchedVideosError;
            InterfaceC3899a error = ((AbstractC3900b.a) it).getError();
            b10.l(error != null ? C3197a.c(error) : null);
        } else {
            if (!(it instanceof AbstractC3900b.C0590b)) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                WatchedVideos watchedVideos = (WatchedVideos) ((AbstractC3900b.C0590b) it).a();
                ArrayList<String> arrayListA = watchedVideos != null ? watchedVideos.a() : null;
                C3862t.d(arrayListA);
                w(arrayListA);
                B b11 = this._watchedVideos;
                WatchedVideos watchedVideos2 = (WatchedVideos) ((AbstractC3900b.C0590b) it).a();
                Object objA = watchedVideos2 != null ? watchedVideos2.a() : null;
                C3862t.d(objA);
                b11.o(objA);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void o(AbstractC3900b<WatchedVideos> it) {
        if (it instanceof AbstractC3900b.a) {
            return;
        }
        if (!(it instanceof AbstractC3900b.C0590b)) {
            throw new NoWhenBranchMatchedException();
        }
        try {
            WatchedVideos watchedVideos = (WatchedVideos) ((AbstractC3900b.C0590b) it).a();
            ArrayList<String> arrayListA = watchedVideos != null ? watchedVideos.a() : null;
            C3862t.d(arrayListA);
            w(arrayListA);
            D<ArrayList<String>> d10 = this._watchedVideos;
            WatchedVideos watchedVideos2 = (WatchedVideos) ((AbstractC3900b.C0590b) it).a();
            ArrayList<String> arrayListA2 = watchedVideos2 != null ? watchedVideos2.a() : null;
            C3862t.d(arrayListA2);
            d10.o(arrayListA2);
        } catch (Exception unused) {
        }
    }

    private final MEATERDeviceType r(List<? extends MEATERDevice> devices) {
        MEATERDeviceType mEATERDeviceType = MEATERDeviceType.PLUS;
        for (MEATERDevice mEATERDevice : devices) {
            if (mEATERDevice.isMEATERBlock() && mEATERDevice.getMEATERDeviceType() != MEATERDeviceType.SECOND_GENERATION_TWO_PROBE_BLOCK) {
                return MEATERDeviceType.BLOCK;
            }
        }
        return mEATERDeviceType;
    }

    public final ArrayList<String> l() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String> it = this.preference.z().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public final boolean n() {
        Set<String> setZ = this.preference.z();
        switch (a.f15039a[r(h.f11978a.K()).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                if (setZ.size() >= 3) {
                    return false;
                }
                break;
            case 6:
            case 7:
            case 8:
                if (setZ.size() >= 4) {
                    return false;
                }
                break;
            default:
                if (setZ.size() >= 3) {
                    return false;
                }
                break;
        }
        return true;
    }

    public final void p() {
        this.job = C1841i.d(Z.a(this), Xb.Z.b().s(this.coroutineExceptionHandler), null, new b(null), 2, null);
    }

    /* renamed from: q, reason: from getter */
    public final I5.a getCacheManager() {
        return this.cacheManager;
    }

    public final ArrayList<BasicTutorial> s(ArrayList<String> skippedVideos) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        C3862t.g(skippedVideos, "skippedVideos");
        MEATERDeviceType mEATERDeviceTypeR = r(h.f11978a.K());
        ArrayList<BasicTutorial> arrayList = new ArrayList<>();
        String value = Q5.b.f14344D.getValue();
        if (skippedVideos == null || !skippedVideos.isEmpty()) {
            Iterator<T> it = skippedVideos.iterator();
            while (it.hasNext()) {
                if (C3862t.b((String) it.next(), Q5.b.f14344D.getValue())) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        } else {
            z10 = false;
        }
        arrayList.add(new BasicTutorial(value, R.string.cook_setup, R.string.cook_setup_description, R.string.cook_setup_subtitle, 20L, 2131231159, R.raw.vt_cook_setup_c, R.raw.vt_cook_setup_f, z10));
        String value2 = Q5.b.f14345E.getValue();
        if (skippedVideos == null || !skippedVideos.isEmpty()) {
            Iterator<T> it2 = skippedVideos.iterator();
            while (it2.hasNext()) {
                if (C3862t.b((String) it2.next(), Q5.b.f14345E.getValue())) {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
        } else {
            z11 = false;
        }
        arrayList.add(new BasicTutorial(value2, R.string.resting_label, R.string.resting_description, R.string.resting_subtitle, 18L, 2131231329, R.raw.vt_remove_from_heat_c, R.raw.vt_remove_from_heat_f, z11));
        String value3 = Q5.b.f14346F.getValue();
        if (skippedVideos == null || !skippedVideos.isEmpty()) {
            Iterator<T> it3 = skippedVideos.iterator();
            while (it3.hasNext()) {
                if (C3862t.b((String) it3.next(), Q5.b.f14346F.getValue())) {
                    z12 = true;
                    break;
                }
            }
            z12 = false;
        } else {
            z12 = false;
        }
        arrayList.add(new BasicTutorial(value3, R.string.reverse_searing, R.string.reverse_searing_description, R.string.reverse_searing_subtitle, 14L, 2131231332, R.raw.vt_searing_serving_c, R.raw.vt_searing_serving_f, z12));
        if (mEATERDeviceTypeR == MEATERDeviceType.BLOCK) {
            String value4 = Q5.b.f14347G.getValue();
            if (skippedVideos == null || !skippedVideos.isEmpty()) {
                Iterator<T> it4 = skippedVideos.iterator();
                while (it4.hasNext()) {
                    if (C3862t.b((String) it4.next(), Q5.b.f14347G.getValue())) {
                        z13 = true;
                        break;
                    }
                }
                z13 = false;
                arrayList.add(new BasicTutorial(value4, R.string.standalone_mode, R.string.standalone_mode_description, R.string.standalone_mode_subtitle, 24L, 2131231347, R.raw.vt_standalone_mode, R.raw.vt_standalone_mode, z13));
            } else {
                z13 = false;
                arrayList.add(new BasicTutorial(value4, R.string.standalone_mode, R.string.standalone_mode_description, R.string.standalone_mode_subtitle, 24L, 2131231347, R.raw.vt_standalone_mode, R.raw.vt_standalone_mode, z13));
            }
        }
        return arrayList;
    }

    public final int t() {
        switch (a.f15039a[r(h.f11978a.K()).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return 3;
            case 6:
            case 7:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return 4;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                throw new C4169n(null, 1, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final B<ArrayList<String>> u() {
        return this.watchedVideos;
    }

    public final B<String> v() {
        return this.watchedVideosError;
    }

    public final void w(ArrayList<String> videoTutorialIds) {
        C3862t.g(videoTutorialIds, "videoTutorialIds");
        HashSet hashSet = new HashSet();
        Iterator<String> it = videoTutorialIds.iterator();
        C3862t.f(it, "iterator(...)");
        while (it.hasNext()) {
            String next = it.next();
            C3862t.f(next, "next(...)");
            hashSet.add(next);
        }
        this.preference.T0(hashSet);
    }

    public final void x(ArrayList<BasicTutorial> videoTutorialList) {
        C3862t.g(videoTutorialList, "videoTutorialList");
        HashSet hashSet = new HashSet();
        Iterator<BasicTutorial> it = videoTutorialList.iterator();
        C3862t.f(it, "iterator(...)");
        while (it.hasNext()) {
            BasicTutorial next = it.next();
            C3862t.f(next, "next(...)");
            BasicTutorial basicTutorial = next;
            if (basicTutorial.getIsWatched()) {
                String id2 = basicTutorial.getId();
                C3862t.d(id2);
                hashSet.add(id2);
            }
        }
        this.preference.T0(hashSet);
    }

    public final void y() {
        SaveWatchedVideoRequestInput saveWatchedVideoRequestInput = new SaveWatchedVideoRequestInput(l());
        if (saveWatchedVideoRequestInput.a().isEmpty()) {
            return;
        }
        this.job = C1841i.d(Z.a(this), Xb.Z.b().s(this.coroutineExceptionHandler), null, new C0218c(saveWatchedVideoRequestInput, null), 2, null);
    }
}
