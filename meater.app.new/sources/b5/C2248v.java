package b5;

import Xb.C1841i;
import Xb.F;
import Xb.I;
import Xb.InterfaceC1867v0;
import a5.C1890a;
import android.util.Log;
import android.view.B;
import android.view.D;
import android.view.Y;
import android.view.Z;
import com.apptionlabs.meater_app.data.JuicyVideoList;
import com.apptionlabs.meater_app.data.OfferBasePairDevices;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.data.UserOfferData;
import com.apptionlabs.meater_app.model.MEATERCloudAccount;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;
import l4.AbstractC3900b;
import oa.C4153F;
import oa.C4173r;
import p4.CurrentOffers;
import p4.MarkOffers;
import p4.OfferData;
import t4.InterfaceC4552b;
import t4.InterfaceC4556f;
import ta.AbstractC4585a;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: NewsViewModel.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00150\nH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\"¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b)\u0010*J\u0013\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\"¢\u0006\u0004\b+\u0010$J\u0015\u0010-\u001a\u00020\r2\u0006\u0010,\u001a\u00020%¢\u0006\u0004\b-\u0010.J%\u00102\u001a\u00020\r2\u0016\u00101\u001a\u0012\u0012\u0004\u0012\u00020%0/j\b\u0012\u0004\u0012\u00020%`0¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\r¢\u0006\u0004\b4\u00105J\r\u00107\u001a\u000206¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\rH\u0014¢\u0006\u0004\b9\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001a0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001a0\"8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010$R\u0014\u0010I\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\b9\u0010HR\u0014\u0010K\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\bJ\u0010HR\u0014\u0010M\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\bL\u0010HR\u0014\u0010O\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\bN\u0010HR\u0014\u0010Q\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\bP\u0010HR\u0014\u0010R\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010HR\u0014\u0010S\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010HR\u0018\u0010V\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010UR\u0014\u0010Y\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010X¨\u0006Z"}, d2 = {"Lb5/v;", "Landroidx/lifecycle/Y;", "Lt4/f;", "markOfferViewedUseCase", "Lt4/b;", "currentOffersUseCase", "LG5/a;", "preferences", "<init>", "(Lt4/f;Lt4/b;LG5/a;)V", "Ll4/b;", "Lp4/i;", "offerResponse", "Loa/F;", "v", "(Ll4/b;)V", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "device", "", "q", "(Lcom/apptionlabs/meater_app/model/MEATERDevice;)Ljava/lang/String;", "Lp4/c;", "w", "Lcom/apptionlabs/meater_app/data/OfferBasePairDevices;", "n", "()Lcom/apptionlabs/meater_app/data/OfferBasePairDevices;", "", "l", "()Z", "m", "", "Lp4/j;", "o", "()Ljava/util/List;", "Landroidx/lifecycle/B;", "p", "()Landroidx/lifecycle/B;", "", "u", "()I", "Lcom/apptionlabs/meater_app/data/JuicyVideoList;", "r", "()Lcom/apptionlabs/meater_app/data/JuicyVideoList;", "s", "offerId", "z", "(I)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "offers", "y", "(Ljava/util/ArrayList;)V", "A", "()V", "Lcom/apptionlabs/meater_app/data/UserOfferData;", "x", "()Lcom/apptionlabs/meater_app/data/UserOfferData;", "g", "b", "Lt4/f;", "c", "Lt4/b;", "d", "LG5/a;", "Landroidx/lifecycle/D;", "e", "Landroidx/lifecycle/D;", "_loading", "f", "Landroidx/lifecycle/B;", "t", "loading", "Ljava/lang/String;", "ORIGINAL_MEATAER", "h", "MEATER_PLUS", "i", "MEATER_SE", "j", "MEATER_BLOCK", "k", "MEATER_PLUS_G2", "MEATER2_PROXL", "MEATER2_PRO_DUO", "LXb/v0;", "LXb/v0;", "currentOfferJob", "LXb/F;", "LXb/F;", "coroutineExceptionHandler", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: b5.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2248v extends Y {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4556f markOfferViewedUseCase;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4552b currentOffersUseCase;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final G5.a preferences;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final D<Boolean> _loading;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final B<Boolean> loading;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String ORIGINAL_MEATAER;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String MEATER_PLUS;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String MEATER_SE;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final String MEATER_BLOCK;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final String MEATER_PLUS_G2;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final String MEATER2_PROXL;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final String MEATER2_PRO_DUO;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 currentOfferJob;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final F coroutineExceptionHandler;

    /* compiled from: NewsViewModel.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: b5.v$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30601a;

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
                iArr[MEATERDeviceType.BLOCK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_PLUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_PROBE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_PLUS_PRO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_TWO_PROBE_BLOCK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MEATERDeviceType.THIRD_GENERATION_ONE_FIRST_GENERATION_PROBE_BLOCK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[MEATERDeviceType.THIRD_GENERATION_TWO_FIRST_GENERATION_PROBE_BLOCK.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[MEATERDeviceType.THIRD_GENERATION_ONE_SECOND_GENERATION_PROBE_BLOCK.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[MEATERDeviceType.THIRD_GENERATION_TWO_SECOND_GENERATION_PROBE_BLOCK.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[MEATERDeviceType.THERMOMIX_PROBE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[MEATERDeviceType.TRAEGER_PROBE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[MEATERDeviceType.BLOCK_PROBE_ONE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[MEATERDeviceType.BLOCK_PROBE_TWO.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[MEATERDeviceType.BLOCK_PROBE_THREE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[MEATERDeviceType.BLOCK_PROBE_FOUR.ordinal()] = 19;
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
            f30601a = iArr;
        }
    }

    /* compiled from: NewsViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.news.ui.NewsViewModel$markAllOfferViewed$1", f = "NewsViewModel.kt", l = {103, Temperature.MAX_INTERNAL_SECOND_GEN_PROBE}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: b5.v$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f30602B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f30603C;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ ArrayList<Integer> f30605E;

        /* compiled from: NewsViewModel.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.news.ui.NewsViewModel$markAllOfferViewed$1$2$1", f = "NewsViewModel.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: b5.v$b$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f30606B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ C2248v f30607C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ AbstractC3900b<MarkOffers> f30608D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C2248v c2248v, AbstractC3900b<MarkOffers> abstractC3900b, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f30607C = c2248v;
                this.f30608D = abstractC3900b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new a(this.f30607C, this.f30608D, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f30606B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                this.f30607C.v(this.f30608D);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ArrayList<Integer> arrayList, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f30605E = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            b bVar = C2248v.this.new b(this.f30605E, interfaceC4588d);
            bVar.f30603C = obj;
            return bVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r7.f30602B
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r7.f30603C
                oa.C4173r.b(r8)
                goto L73
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                oa.C4173r.b(r8)     // Catch: java.lang.Throwable -> L20
                goto L41
            L20:
                r8 = move-exception
                goto L48
            L22:
                oa.C4173r.b(r8)
                java.lang.Object r8 = r7.f30603C
                Xb.I r8 = (Xb.I) r8
                b5.v r8 = b5.C2248v.this
                java.util.ArrayList<java.lang.Integer> r1 = r7.f30605E
                oa.q$a r4 = oa.C4172q.INSTANCE     // Catch: java.lang.Throwable -> L20
                t4.f r8 = b5.C2248v.i(r8)     // Catch: java.lang.Throwable -> L20
                p4.h r4 = new p4.h     // Catch: java.lang.Throwable -> L20
                r4.<init>(r1)     // Catch: java.lang.Throwable -> L20
                r7.f30602B = r3     // Catch: java.lang.Throwable -> L20
                java.lang.Object r8 = r8.a(r4, r7)     // Catch: java.lang.Throwable -> L20
                if (r8 != r0) goto L41
                return r0
            L41:
                l4.b r8 = (l4.AbstractC3900b) r8     // Catch: java.lang.Throwable -> L20
                java.lang.Object r8 = oa.C4172q.a(r8)     // Catch: java.lang.Throwable -> L20
                goto L52
            L48:
                oa.q$a r1 = oa.C4172q.INSTANCE
                java.lang.Object r8 = oa.C4173r.a(r8)
                java.lang.Object r8 = oa.C4172q.a(r8)
            L52:
                b5.v r1 = b5.C2248v.this
                boolean r3 = oa.C4172q.d(r8)
                if (r3 == 0) goto L74
                r3 = r8
                l4.b r3 = (l4.AbstractC3900b) r3
                Xb.G0 r4 = Xb.Z.c()
                b5.v$b$a r5 = new b5.v$b$a
                r6 = 0
                r5.<init>(r1, r3, r6)
                r7.f30603C = r8
                r7.f30602B = r2
                java.lang.Object r1 = Xb.C1837g.g(r4, r5, r7)
                if (r1 != r0) goto L72
                return r0
            L72:
                r0 = r8
            L73:
                r8 = r0
            L74:
                java.lang.Throwable r8 = oa.C4172q.b(r8)
                if (r8 == 0) goto L83
                java.lang.String r0 = "Exception"
                java.lang.Object[] r8 = new java.lang.Object[]{r8}
                U4.b.e(r0, r8)
            L83:
                oa.F r8 = oa.C4153F.f46609a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: b5.C2248v.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: NewsViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.news.ui.NewsViewModel$markOfferViewed$1", f = "NewsViewModel.kt", l = {Temperature.MAX_TEMPERATURE_FOR_ESTIMATE, 92}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: b5.v$c */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f30609B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f30610C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f30611D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ C2248v f30612E;

        /* compiled from: NewsViewModel.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.news.ui.NewsViewModel$markOfferViewed$1$2$1", f = "NewsViewModel.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: b5.v$c$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f30613B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ C2248v f30614C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ AbstractC3900b<MarkOffers> f30615D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C2248v c2248v, AbstractC3900b<MarkOffers> abstractC3900b, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f30614C = c2248v;
                this.f30615D = abstractC3900b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new a(this.f30614C, this.f30615D, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f30613B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                this.f30614C.v(this.f30615D);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, C2248v c2248v, InterfaceC4588d<? super c> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f30611D = i10;
            this.f30612E = c2248v;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            c cVar = new c(this.f30611D, this.f30612E, interfaceC4588d);
            cVar.f30610C = obj;
            return cVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((c) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r7.f30609B
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r7.f30610C
                oa.C4173r.b(r8)
                goto L7f
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                oa.C4173r.b(r8)     // Catch: java.lang.Throwable -> L20
                goto L4d
            L20:
                r8 = move-exception
                goto L54
            L22:
                oa.C4173r.b(r8)
                java.lang.Object r8 = r7.f30610C
                Xb.I r8 = (Xb.I) r8
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                int r1 = r7.f30611D
                java.lang.Integer r1 = kotlin.coroutines.jvm.internal.b.c(r1)
                r8.add(r1)
                b5.v r1 = r7.f30612E
                oa.q$a r4 = oa.C4172q.INSTANCE     // Catch: java.lang.Throwable -> L20
                t4.f r1 = b5.C2248v.i(r1)     // Catch: java.lang.Throwable -> L20
                p4.h r4 = new p4.h     // Catch: java.lang.Throwable -> L20
                r4.<init>(r8)     // Catch: java.lang.Throwable -> L20
                r7.f30609B = r3     // Catch: java.lang.Throwable -> L20
                java.lang.Object r8 = r1.a(r4, r7)     // Catch: java.lang.Throwable -> L20
                if (r8 != r0) goto L4d
                return r0
            L4d:
                l4.b r8 = (l4.AbstractC3900b) r8     // Catch: java.lang.Throwable -> L20
                java.lang.Object r8 = oa.C4172q.a(r8)     // Catch: java.lang.Throwable -> L20
                goto L5e
            L54:
                oa.q$a r1 = oa.C4172q.INSTANCE
                java.lang.Object r8 = oa.C4173r.a(r8)
                java.lang.Object r8 = oa.C4172q.a(r8)
            L5e:
                b5.v r1 = r7.f30612E
                boolean r3 = oa.C4172q.d(r8)
                if (r3 == 0) goto L80
                r3 = r8
                l4.b r3 = (l4.AbstractC3900b) r3
                Xb.G0 r4 = Xb.Z.c()
                b5.v$c$a r5 = new b5.v$c$a
                r6 = 0
                r5.<init>(r1, r3, r6)
                r7.f30610C = r8
                r7.f30609B = r2
                java.lang.Object r1 = Xb.C1837g.g(r4, r5, r7)
                if (r1 != r0) goto L7e
                return r0
            L7e:
                r0 = r8
            L7f:
                r8 = r0
            L80:
                java.lang.Throwable r8 = oa.C4172q.b(r8)
                if (r8 == 0) goto L8f
                java.lang.String r0 = "Exception"
                java.lang.Object[] r8 = new java.lang.Object[]{r8}
                U4.b.e(r0, r8)
            L8f:
                oa.F r8 = oa.C4153F.f46609a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: b5.C2248v.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: NewsViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.news.ui.NewsViewModel$requestCurrentOffers$1", f = "NewsViewModel.kt", l = {152, 154}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: b5.v$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f30616B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f30617C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ ArrayList<String> f30618D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ C2248v f30619E;

        /* compiled from: NewsViewModel.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.news.ui.NewsViewModel$requestCurrentOffers$1$2$1", f = "NewsViewModel.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: b5.v$d$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f30620B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ C2248v f30621C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ AbstractC3900b<CurrentOffers> f30622D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C2248v c2248v, AbstractC3900b<CurrentOffers> abstractC3900b, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f30621C = c2248v;
                this.f30622D = abstractC3900b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new a(this.f30621C, this.f30622D, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f30620B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                this.f30621C.w(this.f30622D);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ArrayList<String> arrayList, C2248v c2248v, InterfaceC4588d<? super d> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f30618D = arrayList;
            this.f30619E = c2248v;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            d dVar = new d(this.f30618D, this.f30619E, interfaceC4588d);
            dVar.f30617C = obj;
            return dVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((d) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r14.f30616B
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L24
                if (r1 == r4) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r14.f30617C
                oa.C4173r.b(r15)
                goto L8f
            L16:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1e:
                oa.C4173r.b(r15)     // Catch: java.lang.Throwable -> L22
                goto L5e
            L22:
                r15 = move-exception
                goto L65
            L24:
                oa.C4173r.b(r15)
                java.lang.Object r15 = r14.f30617C
                Xb.I r15 = (Xb.I) r15
                java.util.ArrayList<java.lang.String> r5 = r14.f30618D
                r12 = 62
                r13 = 0
                java.lang.String r6 = ","
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                java.lang.String r15 = kotlin.collections.r.s0(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                int r1 = r15.length()
                if (r1 != 0) goto L47
                p4.d r15 = new p4.d
                r15.<init>(r3, r4, r3)
                goto L4d
            L47:
                p4.d r1 = new p4.d
                r1.<init>(r15)
                r15 = r1
            L4d:
                b5.v r1 = r14.f30619E
                oa.q$a r5 = oa.C4172q.INSTANCE     // Catch: java.lang.Throwable -> L22
                t4.b r1 = b5.C2248v.h(r1)     // Catch: java.lang.Throwable -> L22
                r14.f30616B = r4     // Catch: java.lang.Throwable -> L22
                java.lang.Object r15 = r1.a(r15, r14)     // Catch: java.lang.Throwable -> L22
                if (r15 != r0) goto L5e
                return r0
            L5e:
                l4.b r15 = (l4.AbstractC3900b) r15     // Catch: java.lang.Throwable -> L22
                java.lang.Object r15 = oa.C4172q.a(r15)     // Catch: java.lang.Throwable -> L22
                goto L6f
            L65:
                oa.q$a r1 = oa.C4172q.INSTANCE
                java.lang.Object r15 = oa.C4173r.a(r15)
                java.lang.Object r15 = oa.C4172q.a(r15)
            L6f:
                b5.v r1 = r14.f30619E
                boolean r4 = oa.C4172q.d(r15)
                if (r4 == 0) goto L90
                r4 = r15
                l4.b r4 = (l4.AbstractC3900b) r4
                Xb.G0 r5 = Xb.Z.c()
                b5.v$d$a r6 = new b5.v$d$a
                r6.<init>(r1, r4, r3)
                r14.f30617C = r15
                r14.f30616B = r2
                java.lang.Object r1 = Xb.C1837g.g(r5, r6, r14)
                if (r1 != r0) goto L8e
                return r0
            L8e:
                r0 = r15
            L8f:
                r15 = r0
            L90:
                java.lang.Throwable r15 = oa.C4172q.b(r15)
                if (r15 == 0) goto L9f
                java.lang.String r0 = "Exception"
                java.lang.Object[] r15 = new java.lang.Object[]{r15}
                U4.b.e(r0, r15)
            L9f:
                oa.F r15 = oa.C4153F.f46609a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: b5.C2248v.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"b5/v$e", "Lta/a;", "LXb/F;", "Lta/g;", "context", "", "exception", "Loa/F;", "y", "(Lta/g;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: b5.v$e */
    public static final class e extends AbstractC4585a implements F {
        public e(F.Companion companion) {
            super(companion);
        }

        @Override // Xb.F
        public void y(ta.g context, Throwable exception) {
            U4.b.e("Exception", exception);
        }
    }

    public C2248v(InterfaceC4556f markOfferViewedUseCase, InterfaceC4552b currentOffersUseCase, G5.a preferences) {
        C3862t.g(markOfferViewedUseCase, "markOfferViewedUseCase");
        C3862t.g(currentOffersUseCase, "currentOffersUseCase");
        C3862t.g(preferences, "preferences");
        this.markOfferViewedUseCase = markOfferViewedUseCase;
        this.currentOffersUseCase = currentOffersUseCase;
        this.preferences = preferences;
        D<Boolean> d10 = new D<>();
        this._loading = d10;
        this.loading = d10;
        this.ORIGINAL_MEATAER = "meater";
        this.MEATER_PLUS = "meater-plus";
        this.MEATER_SE = "meater-se";
        this.MEATER_BLOCK = "meater-block";
        this.MEATER_PLUS_G2 = "meater2-plus";
        this.MEATER2_PROXL = "meater2-proxl";
        this.MEATER2_PRO_DUO = "meater2-pro";
        this.coroutineExceptionHandler = new e(F.INSTANCE);
    }

    private final OfferBasePairDevices n() {
        OfferBasePairDevices offerBasePairDevices = new OfferBasePairDevices();
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        for (MEATERDevice mEATERDevice : M4.h.f11978a.K()) {
            if (mEATERDevice.isPaired()) {
                if (mEATERDevice.isMEATERBlock()) {
                    if (!z10) {
                        offerBasePairDevices.haveMeaterBlock = true;
                    }
                    z10 = true;
                } else if (mEATERDevice.isMEATERPlus()) {
                    if (!z11) {
                        offerBasePairDevices.haveMeaterPlus = true;
                    }
                    z11 = true;
                } else if (!mEATERDevice.isBlockProbe()) {
                    if (!z12) {
                        offerBasePairDevices.haveMeaterProbe = true;
                    }
                    z12 = true;
                }
            }
        }
        return offerBasePairDevices;
    }

    private final String q(MEATERDevice device) {
        switch (a.f30601a[device.getMEATERDeviceType().ordinal()]) {
            case 1:
                return this.ORIGINAL_MEATAER;
            case 2:
                return this.MEATER_PLUS;
            case 3:
                return this.MEATER_SE;
            case 4:
                return this.MEATER_BLOCK;
            case 5:
            case 6:
            case 7:
                return this.MEATER_PLUS_G2;
            case 8:
                return this.MEATER2_PROXL;
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return this.MEATER2_PRO_DUO;
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
                return "";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(AbstractC3900b<MarkOffers> offerResponse) {
        if (offerResponse instanceof AbstractC3900b.a) {
            Log.d("<<Offer>>", "Error" + ((AbstractC3900b.a) offerResponse).getError());
            return;
        }
        if (!(offerResponse instanceof AbstractC3900b.C0590b)) {
            throw new NoWhenBranchMatchedException();
        }
        Log.d("<<Offer>>", "Success" + ((AbstractC3900b.C0590b) offerResponse).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void w(AbstractC3900b<CurrentOffers> offerResponse) {
        List<OfferData> listA;
        if (offerResponse instanceof AbstractC3900b.a) {
            this._loading.l(Boolean.FALSE);
            C1890a.f20074a.e(new ArrayList());
            return;
        }
        if (!(offerResponse instanceof AbstractC3900b.C0590b)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC3900b.C0590b c0590b = (AbstractC3900b.C0590b) offerResponse;
        CurrentOffers currentOffers = (CurrentOffers) c0590b.a();
        if (currentOffers != null) {
            this.preferences.c1(currentOffers.getSignedUpToNewsLetter());
        }
        CurrentOffers currentOffers2 = (CurrentOffers) c0590b.a();
        if (currentOffers2 != null && (listA = currentOffers2.a()) != null) {
            C1890a.f20074a.e(listA);
        }
        this._loading.l(Boolean.FALSE);
    }

    public final void A() {
        this._loading.l(Boolean.TRUE);
        List<MEATERDevice> listK = M4.h.f11978a.K();
        ArrayList arrayList = new ArrayList();
        for (MEATERDevice mEATERDevice : listK) {
            if (mEATERDevice.isPaired()) {
                String strQ = q(mEATERDevice);
                U4.b.t("Device : " + mEATERDevice.shortDeviceIDString() + " : " + strQ, new Object[0]);
                if (strQ.length() > 0 && !arrayList.contains(strQ)) {
                    arrayList.add(strQ);
                }
            }
        }
        this.currentOfferJob = C1841i.d(Z.a(this), Xb.Z.b().s(this.coroutineExceptionHandler), null, new d(arrayList, this, null), 2, null);
    }

    @Override // android.view.Y
    protected void g() {
        super.g();
        InterfaceC1867v0 interfaceC1867v0 = this.currentOfferJob;
        if (interfaceC1867v0 != null) {
            InterfaceC1867v0.a.a(interfaceC1867v0, null, 1, null);
        }
    }

    public final boolean l() {
        String strJ = this.preferences.J();
        C3862t.f(strJ, "getUserEmail(...)");
        return strJ.length() > 0;
    }

    public final boolean m() {
        return this.preferences.P();
    }

    public final List<OfferData> o() {
        return C1890a.f20074a.a().e();
    }

    public final B<List<OfferData>> p() {
        return C1890a.f20074a.a();
    }

    public final JuicyVideoList r() {
        return C1890a.f20074a.c().e();
    }

    public final B<JuicyVideoList> s() {
        return C1890a.f20074a.c();
    }

    public final B<Boolean> t() {
        return this.loading;
    }

    public final int u() {
        List<OfferData> listE = C1890a.f20074a.a().e();
        int i10 = 0;
        if (listE == null) {
            return 0;
        }
        Iterator<OfferData> it = listE.iterator();
        while (it.hasNext()) {
            if (C3862t.b(it.next().getIsNew(), Boolean.TRUE)) {
                i10++;
            }
        }
        return i10;
    }

    public final UserOfferData x() {
        UserOfferData userOfferData = new UserOfferData();
        MEATERCloudAccount mEATERCloudAccountL = x4.g.t().l();
        if (x4.g.t() != null && mEATERCloudAccountL != null) {
            userOfferData.email = mEATERCloudAccountL.email;
        }
        userOfferData.pairedDevices = n();
        return userOfferData;
    }

    public final void y(ArrayList<Integer> offers) {
        C3862t.g(offers, "offers");
        this.currentOfferJob = C1841i.d(Z.a(this), Xb.Z.b().s(this.coroutineExceptionHandler), null, new b(offers, null), 2, null);
    }

    public final void z(int offerId) {
        this.currentOfferJob = C1841i.d(Z.a(this), Xb.Z.b().s(this.coroutineExceptionHandler), null, new c(offerId, this, null), 2, null);
    }
}
