package F4;

import E4.i;
import c5.C2316d;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.cloud.responses.MeaterCloudAccountResponse;
import com.apptionlabs.meater_app.data.Config;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import nd.s;
import oc.E;

/* compiled from: MEATERCloudSyncing.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0003J\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0003J\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&¢\u0006\u0004\b\u001a\u0010\u000bJ\u000f\u0010\u001b\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0004H&¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0004H&¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0004H&¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0004H&¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0007H&¢\u0006\u0004\b \u0010!R\u0019\u0010'\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010*\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u0016\u0010,\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010+R\u001a\u0010/\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\u001e\u0010-\u001a\u0004\b.\u0010!R\u001f\u00105\u001a\n 1*\u0004\u0018\u000100008\u0006¢\u0006\f\n\u0004\b \u00102\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"LF4/g;", "", "<init>", "()V", "Loa/F;", "i", "t", "", "url", "hash", "v", "(Ljava/lang/String;Ljava/lang/String;)V", "u", "f", "q", "", "error", "h", "(Z)V", "Lnd/s;", "Loc/E;", "response", "g", "(Lnd/s;)V", "p", "n", "s", "r", "w", "o", "d", "c", "e", "()Ljava/lang/String;", "LF5/a;", "a", "LF5/a;", "m", "()LF5/a;", "unauthorizedMeaterApi", "b", "j", "authorizedMeaterApi", "Z", "isDownloading", "Ljava/lang/String;", "k", "greenwichTime", "LG5/a;", "kotlin.jvm.PlatformType", "LG5/a;", "l", "()LG5/a;", "prefs", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final F5.a unauthorizedMeaterApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final F5.a authorizedMeaterApi;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isDownloading;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String greenwichTime;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final G5.a prefs;

    public g() {
        x4.f fVar = x4.f.f52783a;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C3862t.f(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.unauthorizedMeaterApi = fVar.f(false, executorServiceNewSingleThreadExecutor);
        ExecutorService executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
        C3862t.f(executorServiceNewSingleThreadExecutor2, "newSingleThreadExecutor(...)");
        this.authorizedMeaterApi = fVar.f(true, executorServiceNewSingleThreadExecutor2);
        this.greenwichTime = "gt:";
        this.prefs = x4.g.t();
    }

    private final void i() {
        this.isDownloading = false;
    }

    public abstract void c();

    public abstract void d();

    public abstract String e();

    public final void f(String url, String hash) {
        U4.b.v(getClass().getSimpleName() + ": downloadData " + url + " " + hash, new Object[0]);
        if (url == null || hash == null) {
            r();
        } else {
            s(url, hash);
        }
    }

    public void g(s<E> response) {
        String message;
        C3862t.g(response, "response");
        String string = x4.g.h().getString(R.string.title_error);
        C3862t.f(string, "getString(...)");
        String string2 = x4.g.h().getString(R.string.please_try_again_later);
        C3862t.f(string2, "getString(...)");
        MeaterCloudAccountResponse.ErrorStatus error = MeaterCloudAccountResponse.parseError(response);
        if (error.code != -1 && (message = error.message) != null) {
            C3862t.f(message, "message");
            if (message.length() == 0) {
                string2 = error.message;
            }
        }
        C2316d.n(string, string2);
    }

    public final void h(boolean error) {
        if (error) {
            U4.b.v(getClass().getSimpleName() + ": Sync Failed. Error: " + error, new Object[0]);
        } else {
            U4.b.v(getClass().getSimpleName() + ": Sync Complete", new Object[0]);
        }
        i();
    }

    /* renamed from: j, reason: from getter */
    public final F5.a getAuthorizedMeaterApi() {
        return this.authorizedMeaterApi;
    }

    /* renamed from: k, reason: from getter */
    public final String getGreenwichTime() {
        return this.greenwichTime;
    }

    /* renamed from: l, reason: from getter */
    public final G5.a getPrefs() {
        return this.prefs;
    }

    /* renamed from: m, reason: from getter */
    public final F5.a getUnauthorizedMeaterApi() {
        return this.unauthorizedMeaterApi;
    }

    public void n() {
        U4.b.v(getClass().getSimpleName() + ": meaterCloudCredentialsChanged", new Object[0]);
        d();
        c();
    }

    public abstract void o();

    public void p() {
        U4.b.v(getClass().getSimpleName() + ": onFinishedSync", new Object[0]);
        w();
        i();
        o();
    }

    public final void q() {
        U4.b.v(getClass().getSimpleName() + ": onSyncFailed", new Object[0]);
        i();
        h(true);
    }

    public abstract void r();

    public abstract void s(String url, String hash);

    public final void t() {
        u(null, null);
    }

    protected void u(String url, String hash) {
        U4.b.v(getClass().getSimpleName() + ": sync " + url + " " + hash, new Object[0]);
        if (!Config.INSTANCE.getInstance().ENABLE_COOK_SYNCING || this.isDownloading || this.prefs.l() == null || i.D().W()) {
            return;
        }
        this.isDownloading = true;
        f(url, hash);
    }

    public void v(String url, String hash) {
        C3862t.g(url, "url");
        C3862t.g(hash, "hash");
        U4.b.v(getClass().getSimpleName() + ": syncWithURL " + url + " " + hash, new Object[0]);
        if (url.length() == 0 || hash.length() == 0 || C3862t.b(e(), hash)) {
            return;
        }
        u(url, hash);
    }

    public abstract void w();
}
