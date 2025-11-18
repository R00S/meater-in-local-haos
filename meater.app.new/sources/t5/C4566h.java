package t5;

import Ba.p;
import Xb.C1841i;
import Xb.I;
import Xb.InterfaceC1867v0;
import Xb.T;
import android.content.Context;
import android.view.B;
import android.view.D;
import android.view.Y;
import android.view.Z;
import com.apptionlabs.meater_app.R;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3862t;
import la.C3920a;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import va.C4929b;
import va.InterfaceC4928a;

/* compiled from: WelcomeScreenViewModel.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001/B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0010\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR'\u0010#\u001a\u0015\u0012\u0011\u0012\u000f \u001f*\u0004\u0018\u00010\u001e0\u001e¢\u0006\u0002\b 0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R'\u0010%\u001a\u0015\u0012\u0011\u0012\u000f \u001f*\u0004\u0018\u00010\u001e0\u001e¢\u0006\u0002\b 0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010'R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001e0)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001e0)8F¢\u0006\u0006\u001a\u0004\b-\u0010+¨\u00060"}, d2 = {"Lt5/h;", "Landroidx/lifecycle/Y;", "Landroid/content/Context;", "context", "LG5/a;", "prefs", "<init>", "(Landroid/content/Context;LG5/a;)V", "Loa/F;", "n", "()V", "m", "", "k", "()I", "j", "g", "b", "Landroid/content/Context;", "c", "LG5/a;", "Lt5/h$a;", "d", "Lt5/h$a;", "getState", "()Lt5/h$a;", "setState", "(Lt5/h$a;)V", "state", "Landroidx/lifecycle/D;", "", "kotlin.jvm.PlatformType", "Lkotlin/jvm/internal/EnhancedNullability;", "e", "Landroidx/lifecycle/D;", "_titleText", "f", "_bodyText", "LXb/v0;", "LXb/v0;", "textStateJob", "Landroidx/lifecycle/B;", "l", "()Landroidx/lifecycle/B;", "titleText", "i", "bodyText", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: t5.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4566h extends Y {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final G5.a prefs;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private a state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final D<String> _titleText;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final D<String> _bodyText;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 textStateJob;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WelcomeScreenViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lt5/h$a;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: t5.h$a */
    public static final class a {

        /* renamed from: B, reason: collision with root package name */
        public static final a f49934B = new a("RELIABILITY", 0);

        /* renamed from: C, reason: collision with root package name */
        public static final a f49935C = new a("FREEDOM", 1);

        /* renamed from: D, reason: collision with root package name */
        public static final a f49936D = new a("VERSATILITY", 2);

        /* renamed from: E, reason: collision with root package name */
        private static final /* synthetic */ a[] f49937E;

        /* renamed from: F, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC4928a f49938F;

        static {
            a[] aVarArrC = c();
            f49937E = aVarArrC;
            f49938F = C4929b.a(aVarArrC);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] c() {
            return new a[]{f49934B, f49935C, f49936D};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f49937E.clone();
        }
    }

    /* compiled from: WelcomeScreenViewModel.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: t5.h$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49939a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f49934B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f49936D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f49939a = iArr;
        }
    }

    /* compiled from: WelcomeScreenViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.welcome.WelcomeScreenViewModel$startJobForUpdateTextState$1", f = "WelcomeScreenViewModel.kt", l = {48}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: t5.h$c */
    static final class c extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f49940B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f49941C;

        /* compiled from: WelcomeScreenViewModel.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.welcome.WelcomeScreenViewModel$startJobForUpdateTextState$1$1", f = "WelcomeScreenViewModel.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: t5.h$c$a */
        static final class a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f49943B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ C4566h f49944C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C4566h c4566h, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f49944C = c4566h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new a(this.f49944C, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f49943B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                this.f49944C.n();
                return C4153F.f46609a;
            }
        }

        c(InterfaceC4588d<? super c> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            c cVar = C4566h.this.new c(interfaceC4588d);
            cVar.f49941C = obj;
            return cVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((c) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            I i10;
            Object objE = C4696b.e();
            int i11 = this.f49940B;
            if (i11 == 0) {
                C4173r.b(obj);
                i10 = (I) this.f49941C;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = (I) this.f49941C;
                C4173r.b(obj);
            }
            do {
                C3920a.b(i10, new a(C4566h.this, null));
                this.f49941C = i10;
                this.f49940B = 1;
            } while (T.a(8000L, this) != objE);
            return objE;
        }
    }

    public C4566h(Context context, G5.a prefs) {
        C3862t.g(context, "context");
        C3862t.g(prefs, "prefs");
        this.context = context;
        this.prefs = prefs;
        this.state = a.f49935C;
        this._titleText = new D<>(context.getString(R.string.freedom));
        this._bodyText = new D<>(context.getString(R.string.less_time_babbysetting));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        int i10 = b.f49939a[this.state.ordinal()];
        if (i10 == 1) {
            this.state = a.f49936D;
            this._titleText.o(this.context.getString(R.string.versatility));
            this._bodyText.o(this.context.getString(R.string.indoor_or_outdoor_appliance));
        } else if (i10 != 2) {
            this.state = a.f49934B;
            this._titleText.o(this.context.getString(R.string.reliability));
            this._bodyText.o(this.context.getString(R.string.consistent_pefect_result));
        } else {
            this.state = a.f49935C;
            this._titleText.o(this.context.getString(R.string.freedom));
            this._bodyText.o(this.context.getString(R.string.less_time_babbysetting));
        }
    }

    @Override // android.view.Y
    protected void g() {
        super.g();
        InterfaceC1867v0 interfaceC1867v0 = this.textStateJob;
        if (interfaceC1867v0 != null) {
            InterfaceC1867v0.a.a(interfaceC1867v0, null, 1, null);
        }
    }

    public final B<String> i() {
        return this._bodyText;
    }

    public final int j() {
        return this.prefs.x();
    }

    public final int k() {
        return this.prefs.y();
    }

    public final B<String> l() {
        return this._titleText;
    }

    public final void m() {
        InterfaceC1867v0 interfaceC1867v0 = this.textStateJob;
        if (interfaceC1867v0 != null) {
            if (interfaceC1867v0 != null) {
                InterfaceC1867v0.a.a(interfaceC1867v0, null, 1, null);
            }
            this.textStateJob = null;
        }
        this.textStateJob = C1841i.d(Z.a(this), Xb.Z.a(), null, new c(null), 2, null);
    }
}
