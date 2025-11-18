package K9;

import Ba.p;
import I9.ApplicationInfo;
import Xb.C1837g;
import Xb.I;
import android.net.Uri;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.O;
import oa.C4153F;
import oa.C4173r;
import org.json.JSONObject;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: RemoteSettingsFetcher.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0016B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJo\u0010\u0016\u001a\u00020\u00122\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\r2\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000f2\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"LK9/d;", "LK9/a;", "LI9/b;", "appInfo", "Lta/g;", "blockingDispatcher", "", "baseUrl", "<init>", "(LI9/b;Lta/g;Ljava/lang/String;)V", "Ljava/net/URL;", "c", "()Ljava/net/URL;", "", "headerOptions", "Lkotlin/Function2;", "Lorg/json/JSONObject;", "Lta/d;", "Loa/F;", "", "onSuccess", "onFailure", "a", "(Ljava/util/Map;LBa/p;LBa/p;Lta/d;)Ljava/lang/Object;", "LI9/b;", "b", "Lta/g;", "Ljava/lang/String;", "d", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ApplicationInfo appInfo;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ta.g blockingDispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String baseUrl;

    /* compiled from: RemoteSettingsFetcher.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", l = {68, 70, 73}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f8832B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Map<String, String> f8834D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ p<JSONObject, InterfaceC4588d<? super C4153F>, Object> f8835E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ p<String, InterfaceC4588d<? super C4153F>, Object> f8836F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Map<String, String> map, p<? super JSONObject, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, p<? super String, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar2, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f8834D = map;
            this.f8835E = pVar;
            this.f8836F = pVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return d.this.new b(this.f8834D, this.f8835E, this.f8836F, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            Object objE = C4696b.e();
            int i10 = this.f8832B;
            try {
                if (i10 == 0) {
                    C4173r.b(obj);
                    URLConnection uRLConnectionOpenConnection = d.this.c().openConnection();
                    C3862t.e(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setRequestProperty("Accept", "application/json");
                    for (Map.Entry<String, String> entry : this.f8834D.entrySet()) {
                        httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb2 = new StringBuilder();
                        O o10 = new O();
                        while (true) {
                            ?? line = bufferedReader.readLine();
                            o10.f43978B = line;
                            if (line == 0) {
                                break;
                            }
                            sb2.append((String) line);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        JSONObject jSONObject = new JSONObject(sb2.toString());
                        p<JSONObject, InterfaceC4588d<? super C4153F>, Object> pVar = this.f8835E;
                        this.f8832B = 1;
                        if (pVar.invoke(jSONObject, this) == objE) {
                            return objE;
                        }
                    } else {
                        p<String, InterfaceC4588d<? super C4153F>, Object> pVar2 = this.f8836F;
                        String str = "Bad response code: " + responseCode;
                        this.f8832B = 2;
                        if (pVar2.invoke(str, this) == objE) {
                            return objE;
                        }
                    }
                } else {
                    if (i10 != 1 && i10 != 2 && i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                }
            } catch (Exception e10) {
                p<String, InterfaceC4588d<? super C4153F>, Object> pVar3 = this.f8836F;
                String message = e10.getMessage();
                if (message == null) {
                    message = e10.toString();
                }
                this.f8832B = 3;
                if (pVar3.invoke(message, this) == objE) {
                    return objE;
                }
            }
            return C4153F.f46609a;
        }
    }

    public d(ApplicationInfo appInfo, ta.g blockingDispatcher, String baseUrl) {
        C3862t.g(appInfo, "appInfo");
        C3862t.g(blockingDispatcher, "blockingDispatcher");
        C3862t.g(baseUrl, "baseUrl");
        this.appInfo = appInfo;
        this.blockingDispatcher = blockingDispatcher;
        this.baseUrl = baseUrl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL c() {
        return new URL(new Uri.Builder().scheme("https").authority(this.baseUrl).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.appInfo.getAppId()).appendPath("settings").appendQueryParameter("build_version", this.appInfo.getAndroidAppInfo().getAppBuildVersion()).appendQueryParameter("display_version", this.appInfo.getAndroidAppInfo().getVersionName()).build().toString());
    }

    @Override // K9.a
    public Object a(Map<String, String> map, p<? super JSONObject, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, p<? super String, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar2, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objG = C1837g.g(this.blockingDispatcher, new b(map, pVar, pVar2, null), interfaceC4588d);
        return objG == C4696b.e() ? objG : C4153F.f46609a;
    }

    public /* synthetic */ d(ApplicationInfo applicationInfo, ta.g gVar, String str, int i10, C3854k c3854k) {
        this(applicationInfo, gVar, (i10 & 4) != 0 ? "firebase-settings.crashlytics.com" : str);
    }
}
