package x4;

import E4.l;
import Vc.a;
import android.content.Context;
import android.os.LocaleList;
import android.os.StrictMode;
import com.apptionlabs.meater_app.cloud.SavedCookDeserializer;
import com.apptionlabs.meater_app.data.NetworkConstant;
import com.apptionlabs.meater_app.model.MEATERCloudAccount;
import com.apptionlabs.meater_app.model.SavedCook;
import g1.C3377a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import nd.t;
import oa.C4165j;
import oa.InterfaceC4164i;
import oc.C4178B;
import oc.C4180D;
import oc.EnumC4177A;
import oc.k;
import oc.w;
import oc.z;

/* compiled from: MeaterApi.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017²\u0006\f\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002"}, d2 = {"Lx4/f;", "LVc/a;", "<init>", "()V", "", "authorized", "Ljava/util/concurrent/Executor;", "callbackThread", "LF5/a;", "f", "(ZLjava/util/concurrent/Executor;)LF5/a;", "value", "b", "Z", "i", "()Z", "fetchingAccessToken", "", "j", "()Ljava/lang/String;", "language", "Lcom/apptionlabs/meater_app/data/NetworkConstant;", "networkConstant", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f implements Vc.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static boolean fetchingAccessToken;

    /* renamed from: a, reason: collision with root package name */
    public static final f f52783a = new f();

    /* renamed from: c, reason: collision with root package name */
    public static final int f52785c = 8;

    /* compiled from: OkHttpClient.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loc/w$a;", "chain", "Loc/D;", "a", "(Loc/w$a;)Loc/D;"}, k = 3, mv = {2, 0, 0})
    public static final class a implements w {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f52786a;

        public a(boolean z10) {
            this.f52786a = z10;
        }

        @Override // oc.w
        public final C4180D a(w.a chain) {
            C3862t.g(chain, "chain");
            C4178B.a aVarA = chain.request().i().a("Accept-Language", f.f52783a.j());
            MEATERCloudAccount mEATERCloudAccountL = g.t().l();
            String str = mEATERCloudAccountL != null ? mEATERCloudAccountL.accessToken : null;
            if (this.f52786a && str != null) {
                aVarA.a("Authorization", "Bearer " + str);
            }
            return chain.a(aVarA.b());
        }
    }

    /* compiled from: KoinComponent.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Ba.a<NetworkConstant> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Vc.a f52787B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ dd.a f52788C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.a f52789D;

        public b(Vc.a aVar, dd.a aVar2, Ba.a aVar3) {
            this.f52787B = aVar;
            this.f52788C = aVar2;
            this.f52789D = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.apptionlabs.meater_app.data.NetworkConstant, java.lang.Object] */
        @Override // Ba.a
        public final NetworkConstant invoke() {
            Vc.a aVar = this.f52787B;
            return (aVar instanceof Vc.b ? ((Vc.b) aVar).a() : aVar.b().getScopeRegistry().getRootScope()).c(P.b(NetworkConstant.class), this.f52788C, this.f52789D);
        }
    }

    private f() {
    }

    public static /* synthetic */ F5.a g(f fVar, boolean z10, Executor executor, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            executor = C3377a.h(g.h());
        }
        return fVar.f(z10, executor);
    }

    private static final NetworkConstant h(InterfaceC4164i<? extends NetworkConstant> interfaceC4164i) {
        return interfaceC4164i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String j() {
        String languageTags = LocaleList.getDefault().toLanguageTags();
        C3862t.d(languageTags);
        return languageTags;
    }

    @Override // Vc.a
    public Uc.a b() {
        return a.C0268a.a(this);
    }

    public final F5.a d() {
        return g(this, false, null, 3, null);
    }

    public final F5.a e(boolean z10) {
        return g(this, z10, null, 2, null);
    }

    public final F5.a f(boolean authorized, Executor callbackThread) {
        C3862t.g(callbackThread, "callbackThread");
        try {
            d dVar = d.f52781a;
            Context contextH = g.h();
            C3862t.f(contextH, "getAppContext(...)");
            dVar.b(contextH);
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
            InterfaceC4164i interfaceC4164iB = C4165j.b(kd.a.f43922a.b(), new b(this, null, null));
            z.a aVarF = new z.a().f(new k(0, 5L, TimeUnit.MINUTES));
            TimeUnit timeUnit = TimeUnit.SECONDS;
            z.a aVarK = aVarF.L(15L, timeUnit).N(15L, timeUnit).K(r.e(EnumC4177A.HTTP_1_1));
            aVarK.b(new a(authorized));
            if (authorized) {
                aVarK.c(new l());
            }
            return (F5.a) new t.b().b(h(interfaceC4164iB).getCloudBaseUrl()).g(aVarK.d()).a(od.a.g(new com.google.gson.e().d(SavedCook.class, new SavedCookDeserializer()).b())).f(callbackThread).d().b(F5.a.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean i() {
        return fetchingAccessToken;
    }
}
