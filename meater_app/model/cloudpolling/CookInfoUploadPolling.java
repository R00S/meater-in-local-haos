package com.apptionlabs.meater_app.model.cloudpolling;

import bn.d;
import bn.s;
import c6.h;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.singletons.cloudpolling.CloudPollingManager;
import ih.u;
import kotlin.Metadata;
import w7.a;
import wh.g;
import wh.m;

/* compiled from: CookInfoUploadPolling.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0005\u001a\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016J+\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/apptionlabs/meater_app/model/cloudpolling/CookInfoUploadPolling;", "Lcom/apptionlabs/meater_app/model/cloudpolling/CloudPolling;", "Lih/u;", "Lbn/d;", "callback", "performRequest", "", "success", "info", "", "error", "onComplete", "(ZLih/u;Ljava/lang/Throwable;)V", "", "pollingRate", "<init>", "(J)V", "Companion", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class CookInfoUploadPolling extends CloudPolling<u> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: CookInfoUploadPolling.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/apptionlabs/meater_app/model/cloudpolling/CookInfoUploadPolling$Companion;", "", "Lih/u;", "addUpdateOrRemove", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final void addUpdateOrRemove() {
            a u10 = com.apptionlabs.meater_app.app.a.u();
            long l10 = u10.l();
            if (u10.k() != null && l10 != 0) {
                CloudPollingManager.INSTANCE.addOrUpdate(new CookInfoUploadPolling(l10));
            } else {
                CloudPollingManager.INSTANCE.remove(CookInfoUploadPolling.class);
            }
        }
    }

    public CookInfoUploadPolling(long j10) {
        super(j10, null, 2, null);
    }

    @Override // com.apptionlabs.meater_app.model.cloudpolling.CloudPolling
    public void performRequest(d<u> dVar) {
        m.f(dVar, "callback");
        dVar.onResponse(new EmptyCall(), s.h((Object) null));
    }

    @Override // com.apptionlabs.meater_app.model.cloudpolling.CloudPolling
    public void onComplete(boolean success, u info, Throwable error) {
        for (Probe probe : h.f8879a.M()) {
            if (probe.appearsToHaveCookInProgress()) {
                probe.updateSavedStateIfNeeded();
            }
        }
        z5.h.f20309a.d();
    }
}
