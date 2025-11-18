package com.aptoide.aptoide_ab_testing.model;

import cm.aptoide.p092pt.aab.C1152a;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: FlagrJson.kt */
@Metadata(m32266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m32267d2 = {"Lcom/aptoide/aptoide_ab_testing/model/SegmentDebugLog;", HttpUrl.FRAGMENT_ENCODE_SET, "segmentID", HttpUrl.FRAGMENT_ENCODE_SET, "msg", HttpUrl.FRAGMENT_ENCODE_SET, "(JLjava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "getSegmentID", "()J", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "aptoide-ab-testing"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SegmentDebugLog {
    private final String msg;
    private final long segmentID;

    public SegmentDebugLog(long j2, String str) {
        C9801m.m32346f(str, "msg");
        this.segmentID = j2;
        this.msg = str;
    }

    public static /* synthetic */ SegmentDebugLog copy$default(SegmentDebugLog segmentDebugLog, long j2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = segmentDebugLog.segmentID;
        }
        if ((i2 & 2) != 0) {
            str = segmentDebugLog.msg;
        }
        return segmentDebugLog.copy(j2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getSegmentID() {
        return this.segmentID;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    public final SegmentDebugLog copy(long segmentID, String msg) {
        C9801m.m32346f(msg, "msg");
        return new SegmentDebugLog(segmentID, msg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentDebugLog)) {
            return false;
        }
        SegmentDebugLog segmentDebugLog = (SegmentDebugLog) other;
        return this.segmentID == segmentDebugLog.segmentID && C9801m.m32341a(this.msg, segmentDebugLog.msg);
    }

    public final String getMsg() {
        return this.msg;
    }

    public final long getSegmentID() {
        return this.segmentID;
    }

    public int hashCode() {
        return (C1152a.m6829a(this.segmentID) * 31) + this.msg.hashCode();
    }

    public String toString() {
        return "SegmentDebugLog(segmentID=" + this.segmentID + ", msg=" + this.msg + ')';
    }
}
