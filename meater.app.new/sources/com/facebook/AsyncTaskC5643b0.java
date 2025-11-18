package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.internal.C5696p0;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: GraphRequestAsyncTask.kt */
/* renamed from: com.facebook.b0 */
/* loaded from: classes.dex */
public class AsyncTaskC5643b0 extends AsyncTask<Void, Void, List<? extends C5653d0>> {

    /* renamed from: a */
    public static final a f14224a = new a(null);

    /* renamed from: b */
    private static final String f14225b = AsyncTaskC5643b0.class.getCanonicalName();

    /* renamed from: c */
    private final HttpURLConnection f14226c;

    /* renamed from: d */
    private final C5646c0 f14227d;

    /* renamed from: e */
    private Exception f14228e;

    /* compiled from: GraphRequestAsyncTask.kt */
    /* renamed from: com.facebook.b0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    public AsyncTaskC5643b0(HttpURLConnection httpURLConnection, C5646c0 c5646c0) {
        C9801m.m32346f(c5646c0, "requests");
        this.f14226c = httpURLConnection;
        this.f14227d = c5646c0;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<C5653d0> doInBackground(Void... voidArr) {
        C9801m.m32346f(voidArr, "params");
        try {
            HttpURLConnection httpURLConnection = this.f14226c;
            return httpURLConnection == null ? this.f14227d.m11325i() : GraphRequest.f14159a.m11235m(httpURLConnection, this.f14227d);
        } catch (Exception e2) {
            this.f14228e = e2;
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(List<C5653d0> list) {
        C9801m.m32346f(list, "result");
        super.onPostExecute(list);
        Exception exc = this.f14228e;
        if (exc != null) {
            C5696p0 c5696p0 = C5696p0.f14478a;
            String str = f14225b;
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            String str2 = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
            C9801m.m32345e(str2, "java.lang.String.format(format, *args)");
            C5696p0.m11575j0(str, str2);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
        C5641a0 c5641a0 = C5641a0.f14199a;
        if (C5641a0.m11302u()) {
            C5696p0 c5696p0 = C5696p0.f14478a;
            String str = f14225b;
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            String str2 = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
            C9801m.m32345e(str2, "java.lang.String.format(format, *args)");
            C5696p0.m11575j0(str, str2);
        }
        if (this.f14227d.m11329t() == null) {
            this.f14227d.m11320G(Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper()));
        }
    }

    public String toString() {
        String str = "{RequestAsyncTask:  connection: " + this.f14226c + ", requests: " + this.f14227d + "}";
        C9801m.m32345e(str, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC5643b0(C5646c0 c5646c0) {
        this(null, c5646c0);
        C9801m.m32346f(c5646c0, "requests");
    }
}
