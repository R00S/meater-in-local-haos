package com.google.firebase.sessions.settings;

import android.net.Uri;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import com.google.firebase.sessions.ApplicationInfo;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.C10568o;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9788f0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.C10961h;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* compiled from: RemoteSettingsFetcher.kt */
@Metadata(m32266d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJm\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\f2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000e2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m32267d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettingsFetcher;", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "appInfo", "Lcom/google/firebase/sessions/ApplicationInfo;", "blockingDispatcher", "Lkotlin/coroutines/CoroutineContext;", "baseUrl", HttpUrl.FRAGMENT_ENCODE_SET, "(Lcom/google/firebase/sessions/ApplicationInfo;Lkotlin/coroutines/CoroutineContext;Ljava/lang/String;)V", "doConfigFetch", HttpUrl.FRAGMENT_ENCODE_SET, "headerOptions", HttpUrl.FRAGMENT_ENCODE_SET, "onSuccess", "Lkotlin/Function2;", "Lorg/json/JSONObject;", "Lkotlin/coroutines/Continuation;", HttpUrl.FRAGMENT_ENCODE_SET, "onFailure", "(Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "settingsUrl", "Ljava/net/URL;", "Companion", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.sessions.m0.d, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class RemoteSettingsFetcher implements CrashlyticsSettingsFetcher {

    /* renamed from: a */
    public static final a f32289a = new a(null);

    /* renamed from: b */
    private final ApplicationInfo f32290b;

    /* renamed from: c */
    private final CoroutineContext f32291c;

    /* renamed from: d */
    private final String f32292d;

    /* compiled from: RemoteSettingsFetcher.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m32267d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettingsFetcher$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "FIREBASE_PLATFORM", HttpUrl.FRAGMENT_ENCODE_SET, "FIREBASE_SESSIONS_BASE_URL_STRING", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.m0.d$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: RemoteSettingsFetcher.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", m39050f = "RemoteSettingsFetcher.kt", m39051l = {68, 70, 73}, m39052m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.m0.d$b */
    static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C10775u>, Object> {

        /* renamed from: f */
        int f32293f;

        /* renamed from: h */
        final /* synthetic */ Map<String, String> f32295h;

        /* renamed from: i */
        final /* synthetic */ Function2<JSONObject, Continuation<? super C10775u>, Object> f32296i;

        /* renamed from: j */
        final /* synthetic */ Function2<String, Continuation<? super C10775u>, Object> f32297j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Map<String, String> map, Function2<? super JSONObject, ? super Continuation<? super C10775u>, ? extends Object> function2, Function2<? super String, ? super Continuation<? super C10775u>, ? extends Object> function22, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f32295h = map;
            this.f32296i = function2;
            this.f32297j = function22;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            return RemoteSettingsFetcher.this.new b(this.f32295h, this.f32296i, this.f32297j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C10775u> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
        }

        /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM39045c = C10855d.m39045c();
            int i2 = this.f32293f;
            try {
                if (i2 == 0) {
                    C10568o.m37655b(obj);
                    URLConnection uRLConnectionOpenConnection = RemoteSettingsFetcher.this.m26812c().openConnection();
                    C9801m.m32344d(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setRequestProperty("Accept", "application/json");
                    for (Map.Entry<String, String> entry : this.f32295h.entrySet()) {
                        httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb = new StringBuilder();
                        C9788f0 c9788f0 = new C9788f0();
                        while (true) {
                            ?? line = bufferedReader.readLine();
                            c9788f0.f37179f = line;
                            if (line == 0) {
                                break;
                            }
                            sb.append((String) line);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        JSONObject jSONObject = new JSONObject(sb.toString());
                        Function2<JSONObject, Continuation<? super C10775u>, Object> function2 = this.f32296i;
                        this.f32293f = 1;
                        if (function2.invoke(jSONObject, this) == objM39045c) {
                            return objM39045c;
                        }
                    } else {
                        Function2<String, Continuation<? super C10775u>, Object> function22 = this.f32297j;
                        String str = "Bad response code: " + responseCode;
                        this.f32293f = 2;
                        if (function22.invoke(str, this) == objM39045c) {
                            return objM39045c;
                        }
                    }
                } else {
                    if (i2 != 1 && i2 != 2 && i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C10568o.m37655b(obj);
                }
            } catch (Exception e2) {
                Function2<String, Continuation<? super C10775u>, Object> function23 = this.f32297j;
                String message = e2.getMessage();
                if (message == null) {
                    message = e2.toString();
                }
                this.f32293f = 3;
                if (function23.invoke(message, this) == objM39045c) {
                    return objM39045c;
                }
            }
            return C10775u.f41439a;
        }
    }

    public RemoteSettingsFetcher(ApplicationInfo applicationInfo, CoroutineContext coroutineContext, String str) {
        C9801m.m32346f(applicationInfo, "appInfo");
        C9801m.m32346f(coroutineContext, "blockingDispatcher");
        C9801m.m32346f(str, "baseUrl");
        this.f32290b = applicationInfo;
        this.f32291c = coroutineContext;
        this.f32292d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final URL m26812c() {
        return new URL(new Uri.Builder().scheme(BuildConfig.APTOIDE_WEB_SERVICES_SCHEME).authority(this.f32292d).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.f32290b.getAppId()).appendPath("settings").appendQueryParameter("build_version", this.f32290b.getAndroidAppInfo().getAppBuildVersion()).appendQueryParameter("display_version", this.f32290b.getAndroidAppInfo().getVersionName()).build().toString());
    }

    @Override // com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher
    /* renamed from: a */
    public Object mo26802a(Map<String, String> map, Function2<? super JSONObject, ? super Continuation<? super C10775u>, ? extends Object> function2, Function2<? super String, ? super Continuation<? super C10775u>, ? extends Object> function22, Continuation<? super C10775u> continuation) {
        Object objM39412e = C10961h.m39412e(this.f32291c, new b(map, function2, function22, null), continuation);
        return objM39412e == C10855d.m39045c() ? objM39412e : C10775u.f41439a;
    }

    public /* synthetic */ RemoteSettingsFetcher(ApplicationInfo applicationInfo, CoroutineContext coroutineContext, String str, int i2, C9789g c9789g) {
        this(applicationInfo, coroutineContext, (i2 & 4) != 0 ? "firebase-settings.crashlytics.com" : str);
    }
}
