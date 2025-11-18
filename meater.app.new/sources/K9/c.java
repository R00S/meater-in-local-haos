package K9;

import Ba.p;
import I9.ApplicationInfo;
import Ub.k;
import Vb.a;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import gc.C3462c;
import gc.InterfaceC3460a;
import k9.InterfaceC3810e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4165j;
import oa.C4173r;
import oa.InterfaceC4164i;
import org.json.JSONObject;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: RemoteSettings.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0016B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010$R\u0016\u0010(\u001a\u0004\u0018\u00010&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010'R\u001f\u0010+\u001a\u0004\u0018\u00010)8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0018\u0010*R\u0016\u0010.\u001a\u0004\u0018\u00010,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010-\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"LK9/c;", "LK9/h;", "Lta/g;", "backgroundDispatcher", "Lk9/e;", "firebaseInstallationsApi", "LI9/b;", "appInfo", "LK9/a;", "configsFetcher", "LB1/e;", "LE1/d;", "dataStore", "<init>", "(Lta/g;Lk9/e;LI9/b;LK9/a;LB1/e;)V", "", "s", "g", "(Ljava/lang/String;)Ljava/lang/String;", "Loa/F;", "c", "(Lta/d;)Ljava/lang/Object;", "a", "Lta/g;", "b", "Lk9/e;", "LI9/b;", "d", "LK9/a;", "LK9/g;", "e", "Loa/i;", "f", "()LK9/g;", "settingsCache", "Lgc/a;", "Lgc/a;", "fetchInProgress", "", "()Ljava/lang/Boolean;", "sessionEnabled", "LVb/a;", "()LVb/a;", "sessionRestartTimeout", "", "()Ljava/lang/Double;", "samplingRate", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c implements h {

    /* renamed from: g, reason: collision with root package name */
    private static final a f8808g = new a(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ta.g backgroundDispatcher;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3810e firebaseInstallationsApi;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ApplicationInfo appInfo;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final K9.a configsFetcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i settingsCache;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3460a fetchInProgress;

    /* compiled from: RemoteSettings.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LK9/c$a;", "", "<init>", "()V", "", "FORWARD_SLASH_STRING", "Ljava/lang/String;", "TAG", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: RemoteSettings.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LK9/g;", "a", "()LK9/g;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.a<g> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ B1.e<E1.d> f8815B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(B1.e<E1.d> eVar) {
            super(0);
            this.f8815B = eVar;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            return new g(this.f8815B);
        }
    }

    /* compiled from: RemoteSettings.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", l = {170, 76, 94}, m = "updateSettings")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K9.c$c, reason: collision with other inner class name */
    static final class C0174c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f8816B;

        /* renamed from: C, reason: collision with root package name */
        Object f8817C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f8818D;

        /* renamed from: F, reason: collision with root package name */
        int f8820F;

        C0174c(InterfaceC4588d<? super C0174c> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8818D = obj;
            this.f8820F |= Integer.MIN_VALUE;
            return c.this.c(this);
        }
    }

    /* compiled from: RemoteSettings.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", l = {125, 128, 131, 133, 134, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "it", "Loa/F;", "<anonymous>", "(Lorg/json/JSONObject;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends l implements p<JSONObject, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        Object f8821B;

        /* renamed from: C, reason: collision with root package name */
        Object f8822C;

        /* renamed from: D, reason: collision with root package name */
        int f8823D;

        /* renamed from: E, reason: collision with root package name */
        /* synthetic */ Object f8824E;

        d(InterfaceC4588d<? super d> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(JSONObject jSONObject, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((d) create(jSONObject, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            d dVar = c.this.new d(interfaceC4588d);
            dVar.f8824E = obj;
            return dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0195 A[RETURN] */
        /* JADX WARN: Type inference failed for: r13v12, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Double] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws org.json.JSONException {
            /*
                Method dump skipped, instructions count: 428
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: K9.c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: RemoteSettings.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "msg", "Loa/F;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends l implements p<String, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f8826B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f8827C;

        e(InterfaceC4588d<? super e> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((e) create(str, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            e eVar = new e(interfaceC4588d);
            eVar.f8827C = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f8826B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f8827C));
            return C4153F.f46609a;
        }
    }

    public c(ta.g backgroundDispatcher, InterfaceC3810e firebaseInstallationsApi, ApplicationInfo appInfo, K9.a configsFetcher, B1.e<E1.d> dataStore) {
        C3862t.g(backgroundDispatcher, "backgroundDispatcher");
        C3862t.g(firebaseInstallationsApi, "firebaseInstallationsApi");
        C3862t.g(appInfo, "appInfo");
        C3862t.g(configsFetcher, "configsFetcher");
        C3862t.g(dataStore, "dataStore");
        this.backgroundDispatcher = backgroundDispatcher;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.appInfo = appInfo;
        this.configsFetcher = configsFetcher;
        this.settingsCache = C4165j.a(new b(dataStore));
        this.fetchInProgress = C3462c.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g f() {
        return (g) this.settingsCache.getValue();
    }

    private final String g(String s10) {
        return new k("/").c(s10, "");
    }

    @Override // K9.h
    public Boolean a() {
        return f().g();
    }

    @Override // K9.h
    public Vb.a b() {
        Integer numE = f().e();
        if (numE == null) {
            return null;
        }
        a.Companion companion = Vb.a.INSTANCE;
        return Vb.a.s(Vb.c.o(numE.intValue(), Vb.d.f18246F));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x004a, B:47:0x00b7, B:49:0x00c5, B:52:0x00d0), top: B:64:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0 A[Catch: all -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x004a, B:47:0x00b7, B:49:0x00c5, B:52:0x00d0), top: B:64:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // K9.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(ta.InterfaceC4588d<? super oa.C4153F> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K9.c.c(ta.d):java.lang.Object");
    }

    @Override // K9.h
    public Double d() {
        return f().f();
    }
}
