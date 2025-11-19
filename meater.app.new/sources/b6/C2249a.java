package b6;

import W5.c;
import X5.f;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.io.IOException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;
import nd.k;
import oc.C4178B;
import oc.C4180D;
import oc.C4184d;
import oc.v;
import oc.w;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016¨\u0006\u0019"}, d2 = {"Lb6/a;", "Loc/w;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LW5/b;", "apiType", "LW5/c;", "deploymentType", "", "b", "(LW5/b;LW5/c;)Ljava/lang/String;", "", "c", "()Z", "Loc/w$a;", "chain", "Loc/D;", "a", "(Loc/w$a;)Loc/D;", "Landroid/content/Context;", "Ljava/lang/String;", "SHOULD_CACHE", "MUST_AUTHENTICATE", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: b6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2249a implements w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String SHOULD_CACHE;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String MUST_AUTHENTICATE;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: b6.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0423a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30626a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f30627b;

        static {
            int[] iArr = new int[W5.b.values().length];
            try {
                iArr[W5.b.f18425C.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[W5.b.f18426D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[W5.b.f18427E.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30626a = iArr;
            int[] iArr2 = new int[c.values().length];
            try {
                iArr2[c.f18436H.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            f30627b = iArr2;
        }
    }

    public C2249a(Context context) {
        C3862t.g(context, "context");
        this.context = context;
        this.SHOULD_CACHE = "Should-Cache";
        this.MUST_AUTHENTICATE = "Must-Authenticate";
    }

    private final String b(W5.b apiType, c deploymentType) {
        int i10 = C0423a.f30626a[apiType.ordinal()];
        if (i10 == 1) {
            return "https://api.cloud.meater.com/";
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        return "https://" + (C0423a.f30627b[deploymentType.ordinal()] == 1 ? "recipes.dev." : "recipes.") + apiType.getUrl();
    }

    private final boolean c() {
        NetworkCapabilities networkCapabilities;
        Object systemService = this.context.getSystemService("connectivity");
        C3862t.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3);
    }

    @Override // oc.w
    public C4180D a(w.a chain) throws IOException {
        Method methodA;
        W5.a aVar;
        W5.b bVarValue;
        C4178B.a aVarA;
        C3862t.g(chain, "chain");
        C4178B c4178bRequest = chain.request();
        k kVar = (k) c4178bRequest.j(k.class);
        if (kVar == null || (methodA = kVar.a()) == null || (aVar = (W5.a) methodA.getAnnotation(W5.a.class)) == null || (bVarValue = aVar.value()) == null) {
            throw new IOException("You must add ApiType to your request method in interface.");
        }
        if (bVarValue == W5.b.f18427E) {
            return chain.a(c4178bRequest.i().b());
        }
        Context context = this.context;
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + ".settings.pref", 0);
        c cVar = c.f18437I;
        if (sharedPreferences.getBoolean("recipe_data_source", false)) {
            cVar = c.f18436H;
        }
        v vVarD = v.INSTANCE.d(b(bVarValue, cVar));
        v vVarC = c4178bRequest.getUrl().k().s(vVarD.getScheme()).h(vVarD.getHost()).n(vVarD.getPort()).c();
        String strB = new f(this.context).b("access-token_v1");
        String strD = c4178bRequest.d(this.SHOULD_CACHE);
        String strD2 = c4178bRequest.d(this.MUST_AUTHENTICATE);
        int i10 = C0423a.f30626a[bVarValue.ordinal()];
        if (i10 == 1) {
            aVarA = c4178bRequest.i().j(vVarC).a("Authorization", "Bearer " + strB).a("Cache-Control", "no-cache");
        } else if (i10 == 2) {
            C4178B.a aVarI = c4178bRequest.i();
            if (!c() && strD != null) {
                aVarA = aVarI.c(C4184d.f46870p).j(vVarC);
            } else if (strD2 != null) {
                aVarA = aVarI.j(vVarC).a("Authorization", "Bearer " + strB);
            } else {
                aVarA = aVarI.j(vVarC);
            }
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            aVarA = c4178bRequest.i();
        }
        return chain.a(aVarA.g(this.SHOULD_CACHE).g(this.MUST_AUTHENTICATE).b());
    }
}
