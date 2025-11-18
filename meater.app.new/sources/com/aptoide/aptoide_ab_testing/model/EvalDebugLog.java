package com.aptoide.aptoide_ab_testing.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: FlagrJson.kt */
@Metadata(m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m32267d2 = {"Lcom/aptoide/aptoide_ab_testing/model/EvalDebugLog;", HttpUrl.FRAGMENT_ENCODE_SET, "segmentDebugLogs", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/aptoide/aptoide_ab_testing/model/SegmentDebugLog;", "msg", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/List;Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "getSegmentDebugLogs", "()Ljava/util/List;", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "aptoide-ab-testing"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class EvalDebugLog {
    private final String msg;
    private final List<SegmentDebugLog> segmentDebugLogs;

    public EvalDebugLog(List<SegmentDebugLog> list, String str) {
        C9801m.m32346f(list, "segmentDebugLogs");
        C9801m.m32346f(str, "msg");
        this.segmentDebugLogs = list;
        this.msg = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EvalDebugLog copy$default(EvalDebugLog evalDebugLog, List list, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = evalDebugLog.segmentDebugLogs;
        }
        if ((i2 & 2) != 0) {
            str = evalDebugLog.msg;
        }
        return evalDebugLog.copy(list, str);
    }

    public final List<SegmentDebugLog> component1() {
        return this.segmentDebugLogs;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    public final EvalDebugLog copy(List<SegmentDebugLog> segmentDebugLogs, String msg) {
        C9801m.m32346f(segmentDebugLogs, "segmentDebugLogs");
        C9801m.m32346f(msg, "msg");
        return new EvalDebugLog(segmentDebugLogs, msg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EvalDebugLog)) {
            return false;
        }
        EvalDebugLog evalDebugLog = (EvalDebugLog) other;
        return C9801m.m32341a(this.segmentDebugLogs, evalDebugLog.segmentDebugLogs) && C9801m.m32341a(this.msg, evalDebugLog.msg);
    }

    public final String getMsg() {
        return this.msg;
    }

    public final List<SegmentDebugLog> getSegmentDebugLogs() {
        return this.segmentDebugLogs;
    }

    public int hashCode() {
        return (this.segmentDebugLogs.hashCode() * 31) + this.msg.hashCode();
    }

    public String toString() {
        return "EvalDebugLog(segmentDebugLogs=" + this.segmentDebugLogs + ", msg=" + this.msg + ')';
    }
}
