package com.google.firebase.perf.session;

import C9.d;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.application.a;
import com.google.firebase.perf.application.b;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import z9.C5219a;

@Keep
/* loaded from: classes2.dex */
public class SessionManager extends b {

    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final a appStateMonitor;
    private final Set<WeakReference<z9.b>> clients;
    private final GaugeManager gaugeManager;
    private C5219a perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), C5219a.c(UUID.randomUUID().toString()), a.b());
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setApplicationContext$0(Context context, C5219a c5219a) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (c5219a.e()) {
            this.gaugeManager.logGaugeMetadata(c5219a.h(), d.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(d dVar) {
        if (this.perfSession.e()) {
            this.gaugeManager.logGaugeMetadata(this.perfSession.h(), dVar);
        }
    }

    private void startOrStopCollectingGauges(d dVar) {
        if (this.perfSession.e()) {
            this.gaugeManager.startCollectingGauges(this.perfSession, dVar);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        d dVar = d.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(dVar);
        startOrStopCollectingGauges(dVar);
    }

    @Override // com.google.firebase.perf.application.b, com.google.firebase.perf.application.a.b
    public void onUpdateAppState(d dVar) {
        super.onUpdateAppState(dVar);
        if (this.appStateMonitor.f()) {
            return;
        }
        if (dVar == d.FOREGROUND) {
            updatePerfSession(C5219a.c(UUID.randomUUID().toString()));
        } else if (this.perfSession.f()) {
            updatePerfSession(C5219a.c(UUID.randomUUID().toString()));
        } else {
            startOrStopCollectingGauges(dVar);
        }
    }

    public final C5219a perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<z9.b> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(final Context context) {
        final C5219a c5219a = this.perfSession;
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: z9.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f53925B.lambda$setApplicationContext$0(context, c5219a);
            }
        });
    }

    public void setPerfSession(C5219a c5219a) {
        this.perfSession = c5219a;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.f()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<z9.b> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(C5219a c5219a) {
        if (c5219a.h() == this.perfSession.h()) {
            return;
        }
        this.perfSession = c5219a;
        synchronized (this.clients) {
            try {
                Iterator<WeakReference<z9.b>> it = this.clients.iterator();
                while (it.hasNext()) {
                    z9.b bVar = it.next().get();
                    if (bVar != null) {
                        bVar.a(c5219a);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.a());
        startOrStopCollectingGauges(this.appStateMonitor.a());
    }

    public SessionManager(GaugeManager gaugeManager, C5219a c5219a, a aVar) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = c5219a;
        this.appStateMonitor = aVar;
        registerForAppState();
    }
}
