package com.apptionlabs.meater_app.model.cloudpolling;

import android.content.SharedPreferences;
import bn.b;
import bn.d;
import bn.s;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import wh.m;

/* compiled from: CloudPolling.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b%\u0010&J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0006\u0010\u0005\u001a\u00020\u0003J\u0006\u0010\u0006\u001a\u00020\u0003J\u0006\u0010\u0007\u001a\u00020\u0003J+\u0010\u000f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00018\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0012\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H&J+\u0010\u0013\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00018\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u0013\u0010\u000eR\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/apptionlabs/meater_app/model/cloudpolling/CloudPolling;", "T", "", "Lih/u;", "restartTimer", "start", "stop", "reset", "", "success", "info", "", "error", "onResponse$app_playstoreLiveRelease", "(ZLjava/lang/Object;Ljava/lang/Throwable;)V", "onResponse", "Lbn/d;", "callback", "performRequest", "onComplete", "", "pollingRate", "J", "getPollingRate", "()J", "setPollingRate", "(J)V", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "Ljava/util/Timer;", "pollingTimer", "Ljava/util/Timer;", "", "getLastPolledKey", "()Ljava/lang/String;", "lastPolledKey", "<init>", "(JLandroid/content/SharedPreferences;)V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public abstract class CloudPolling<T> {
    private long pollingRate;
    private Timer pollingTimer;
    private final SharedPreferences sharedPreferences;

    public CloudPolling(long j10, SharedPreferences sharedPreferences) {
        m.f(sharedPreferences, "sharedPreferences");
        this.pollingRate = j10;
        this.sharedPreferences = sharedPreferences;
    }

    private final String getLastPolledKey() {
        String simpleName = getClass().getSimpleName();
        m.e(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    private final void restartTimer() {
        long max = Math.max(0L, this.pollingRate - (new Date().getTime() - this.sharedPreferences.getLong(getLastPolledKey(), 0L)));
        stop();
        Timer timer = new Timer();
        this.pollingTimer = timer;
        timer.schedule(new TimerTask() { // from class: com.apptionlabs.meater_app.model.cloudpolling.CloudPolling$restartTimer$$inlined$schedule$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                final CloudPolling cloudPolling = CloudPolling.this;
                cloudPolling.performRequest(new d<T>() { // from class: com.apptionlabs.meater_app.model.cloudpolling.CloudPolling$restartTimer$1$1
                    public void onFailure(b<T> bVar, Throwable th) {
                        m.f(bVar, "call");
                        m.f(th, "t");
                        cloudPolling.onResponse$app_playstoreLiveRelease(false, null, th);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public void onResponse(b<T> bVar, s<T> sVar) {
                        m.f(bVar, "call");
                        m.f(sVar, "response");
                        cloudPolling.onResponse$app_playstoreLiveRelease(sVar.f(), sVar.a(), null);
                    }
                });
            }
        }, max);
    }

    public final long getPollingRate() {
        return this.pollingRate;
    }

    public abstract void onComplete(boolean success, T info, Throwable error);

    public final void onResponse$app_playstoreLiveRelease(boolean success, T info, Throwable error) {
        k6.b.e(getClass().getSimpleName() + " - success: " + success + " info: " + info + " error: " + error, new Object[0]);
        onComplete(success, info, error);
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putLong(getLastPolledKey(), new Date().getTime());
        edit.commit();
        restartTimer();
    }

    public abstract void performRequest(d<T> dVar);

    public final void reset() {
        stop();
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.remove(getLastPolledKey());
        edit.commit();
    }

    public final void setPollingRate(long j10) {
        this.pollingRate = j10;
    }

    public final void start() {
        if (this.pollingTimer != null) {
            return;
        }
        restartTimer();
    }

    public final void stop() {
        Timer timer = this.pollingTimer;
        if (timer != null) {
            timer.cancel();
        }
        this.pollingTimer = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ CloudPolling(long r1, android.content.SharedPreferences r3, int r4, wh.g r5) {
        /*
            r0 = this;
            r4 = r4 & 2
            if (r4 == 0) goto L11
            w7.a r3 = com.apptionlabs.meater_app.app.a.u()
            android.content.SharedPreferences r3 = r3.s()
            java.lang.String r4 = "getGlobalPreferences(...)"
            wh.m.e(r3, r4)
        L11:
            r0.<init>(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apptionlabs.meater_app.model.cloudpolling.CloudPolling.<init>(long, android.content.SharedPreferences, int, wh.g):void");
    }
}
