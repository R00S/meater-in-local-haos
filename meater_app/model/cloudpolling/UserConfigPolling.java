package com.apptionlabs.meater_app.model.cloudpolling;

import android.content.Context;
import android.content.Intent;
import com.apptionlabs.meater_app.cloud.requests.UserConfigRequest;
import com.apptionlabs.meater_app.cloud.responses.UserConfigResponse;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.singletons.cloudpolling.CloudPollingManager;
import kotlin.Metadata;
import lm.d;
import v7.a;
import wh.g;
import wh.m;
import z5.f;

/* compiled from: UserConfigPolling.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016J$\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/apptionlabs/meater_app/model/cloudpolling/UserConfigPolling;", "Lcom/apptionlabs/meater_app/model/cloudpolling/CloudPolling;", "Lcom/apptionlabs/meater_app/cloud/responses/UserConfigResponse;", "Lbn/d;", "callback", "Lih/u;", "performRequest", "", "success", "info", "", "error", "onComplete", "Lv7/a;", "client", "Lv7/a;", "", "pollingRate", "<init>", "(J)V", "Companion", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class UserConfigPolling extends CloudPolling<UserConfigResponse> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final a client;

    /* compiled from: UserConfigPolling.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/apptionlabs/meater_app/model/cloudpolling/UserConfigPolling$Companion;", "", "Lih/u;", "addUpdateOrRemove", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final void addUpdateOrRemove() {
            w7.a u10 = com.apptionlabs.meater_app.app.a.u();
            long T = u10.T();
            if (u10.k() != null && T != 0) {
                CloudPollingManager.INSTANCE.addOrUpdate(new UserConfigPolling(T));
            } else {
                CloudPollingManager.INSTANCE.remove(UserConfigPolling.class);
            }
        }
    }

    public UserConfigPolling(long j10) {
        super(j10, null, 2, null);
        this.client = d.i(d.f17383a, true, null, 2, null);
    }

    @Override // com.apptionlabs.meater_app.model.cloudpolling.CloudPolling
    public void performRequest(bn.d<UserConfigResponse> dVar) {
        m.f(dVar, "callback");
        this.client.f(new UserConfigRequest(null, null, 3, null)).enqueue(dVar);
    }

    @Override // com.apptionlabs.meater_app.model.cloudpolling.CloudPolling
    public void onComplete(boolean z10, UserConfigResponse userConfigResponse, Throwable th) {
        if (z10 && userConfigResponse != null && th == null) {
            String cookSyncHash = userConfigResponse.getCookSyncHash();
            String noteSyncHash = userConfigResponse.getNoteSyncHash();
            String cookSyncFullURL = userConfigResponse.getCookSyncFullURL();
            String noteSyncFullURL = userConfigResponse.getNoteSyncFullURL();
            boolean resetCookSync = userConfigResponse.getResetCookSync();
            boolean resetNoteSync = userConfigResponse.getResetNoteSync();
            String news = userConfigResponse.getNews();
            if (resetCookSync) {
                z5.d dVar = z5.d.f20287f;
                dVar.d();
                dVar.c();
            }
            if (resetNoteSync) {
                f fVar = f.f20298f;
                fVar.d();
                fVar.c();
            }
            w7.a u10 = com.apptionlabs.meater_app.app.a.u();
            u10.z1(userConfigResponse.getSafetyInstructionSeenVersion());
            u10.y1(userConfigResponse.getSafetyInstructionLatestVersion());
            if (cookSyncHash.length() > 0 && cookSyncFullURL.length() > 0 && !m.a(u10.o(), cookSyncHash)) {
                z5.d.f20287f.v(cookSyncFullURL, cookSyncHash);
            }
            if (noteSyncHash.length() > 0 && noteSyncFullURL.length() > 0 && !m.a(u10.p(), noteSyncHash)) {
                f.f20298f.v(noteSyncFullURL, noteSyncHash);
            }
            if (news == null || news.length() == 0) {
                return;
            }
            Context i10 = com.apptionlabs.meater_app.app.a.i();
            Intent intent = new Intent(MEATERIntent.INTENT_NEWS_FROM_SERVER);
            intent.putExtra(MEATERIntent.EXTRA_NEWS_URL, news);
            intent.setPackage(com.apptionlabs.meater_app.app.a.i().getPackageName());
            i10.sendBroadcast(intent);
        }
    }
}
