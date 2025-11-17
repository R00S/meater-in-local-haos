package com.apptionlabs.meater_app.cloud.responses;

import com.google.gson.l;
import g6.b;
import kotlin.Metadata;
import wh.m;

/* compiled from: UserConfigResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0006R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0018\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u001a\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006)"}, d2 = {"Lcom/apptionlabs/meater_app/cloud/responses/UserConfigResponse;", "", "Lcom/google/gson/l;", "data", "Lcom/google/gson/l;", "getData", "()Lcom/google/gson/l;", "meta", "getMeta", "getCookSync", "cookSync", "getNoteSync", "noteSync", "getSafetyInfo", "safetyInfo", "", "getNews", "()Ljava/lang/String;", "news", "getNoteSyncFullURL", "noteSyncFullURL", "getCookSyncFullURL", "cookSyncFullURL", "getCookSyncHash", "cookSyncHash", "getNoteSyncHash", "noteSyncHash", "", "getSafetyInstructionSeenVersion", "()I", "safetyInstructionSeenVersion", "getSafetyInstructionLatestVersion", "safetyInstructionLatestVersion", "", "getResetCookSync", "()Z", "resetCookSync", "getResetNoteSync", "resetNoteSync", "<init>", "(Lcom/google/gson/l;Lcom/google/gson/l;)V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class UserConfigResponse {
    private final l data;
    private final l meta;

    public UserConfigResponse(l lVar, l lVar2) {
        m.f(lVar, "data");
        m.f(lVar2, "meta");
        this.data = lVar;
        this.meta = lVar2;
    }

    private final l getCookSync() {
        return b.e(this.data, "cook_sync");
    }

    private final l getNoteSync() {
        return b.e(this.data, "note_sync");
    }

    private final l getSafetyInfo() {
        return b.e(this.data, "safety_info");
    }

    public final String getCookSyncFullURL() {
        String g10;
        l cookSync = getCookSync();
        if (cookSync == null || (g10 = b.g(cookSync, "url")) == null) {
            return "";
        }
        return g10;
    }

    public final String getCookSyncHash() {
        String g10;
        l cookSync = getCookSync();
        if (cookSync == null || (g10 = b.g(cookSync, "hash")) == null) {
            return "";
        }
        return g10;
    }

    public final l getData() {
        return this.data;
    }

    public final l getMeta() {
        return this.meta;
    }

    public final String getNews() {
        return b.g(this.data, "news");
    }

    public final String getNoteSyncFullURL() {
        String g10;
        l noteSync = getNoteSync();
        if (noteSync == null || (g10 = b.g(noteSync, "url")) == null) {
            return "";
        }
        return g10;
    }

    public final String getNoteSyncHash() {
        String g10;
        l noteSync = getNoteSync();
        if (noteSync == null || (g10 = b.g(noteSync, "hash")) == null) {
            return "";
        }
        return g10;
    }

    public final boolean getResetCookSync() {
        Boolean a10;
        l cookSync = getCookSync();
        if (cookSync != null && (a10 = b.a(cookSync, "reset")) != null) {
            return a10.booleanValue();
        }
        return false;
    }

    public final boolean getResetNoteSync() {
        Boolean a10;
        l noteSync = getNoteSync();
        if (noteSync != null && (a10 = b.a(noteSync, "reset")) != null) {
            return a10.booleanValue();
        }
        return false;
    }

    public final int getSafetyInstructionLatestVersion() {
        Integer c10;
        l safetyInfo = getSafetyInfo();
        if (safetyInfo != null && (c10 = b.c(safetyInfo, "version_latest")) != null) {
            return c10.intValue();
        }
        return -1;
    }

    public final int getSafetyInstructionSeenVersion() {
        Integer c10;
        l safetyInfo = getSafetyInfo();
        if (safetyInfo != null && (c10 = b.c(safetyInfo, "version_seen")) != null) {
            return c10.intValue();
        }
        return -1;
    }
}
