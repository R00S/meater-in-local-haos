package com.aptoide.aptoide_ab_testing.model;

import cm.aptoide.p092pt.aab.C1152a;
import com.google.gson.C8573l;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: FlagrJson.kt */
@Metadata(m32266d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\u0010\n\u001a\u00060\u000bj\u0002`\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0011HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\r\u0010)\u001a\u00060\u000bj\u0002`\fHÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003Jq\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\f\b\u0002\u0010\n\u001a\u00060\u000bj\u0002`\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0015\u0010\n\u001a\u00060\u000bj\u0002`\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001a¨\u00063"}, m32267d2 = {"Lcom/aptoide/aptoide_ab_testing/model/PostEvaluationResponseJson;", HttpUrl.FRAGMENT_ENCODE_SET, "flagID", HttpUrl.FRAGMENT_ENCODE_SET, "flagKey", HttpUrl.FRAGMENT_ENCODE_SET, "flagSnapshotID", "segmentID", "variantID", "variantKey", "variantAttachment", "Lcom/google/gson/JsonObject;", "Lcom/aptoide/aptoide_ab_testing/model/VariantAttachment;", "evalContext", "Lcom/aptoide/aptoide_ab_testing/model/EvalContext;", "timestamp", "evalDebugLog", "Lcom/aptoide/aptoide_ab_testing/model/EvalDebugLog;", "(JLjava/lang/String;JJJLjava/lang/String;Lcom/google/gson/JsonObject;Lcom/aptoide/aptoide_ab_testing/model/EvalContext;Ljava/lang/String;Lcom/aptoide/aptoide_ab_testing/model/EvalDebugLog;)V", "getEvalContext", "()Lcom/aptoide/aptoide_ab_testing/model/EvalContext;", "getEvalDebugLog", "()Lcom/aptoide/aptoide_ab_testing/model/EvalDebugLog;", "getFlagID", "()J", "getFlagKey", "()Ljava/lang/String;", "getFlagSnapshotID", "getSegmentID", "getTimestamp", "getVariantAttachment", "()Lcom/google/gson/JsonObject;", "getVariantID", "getVariantKey", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "aptoide-ab-testing"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PostEvaluationResponseJson {
    private final EvalContext evalContext;
    private final EvalDebugLog evalDebugLog;
    private final long flagID;
    private final String flagKey;
    private final long flagSnapshotID;
    private final long segmentID;
    private final String timestamp;
    private final C8573l variantAttachment;
    private final long variantID;
    private final String variantKey;

    public PostEvaluationResponseJson(long j2, String str, long j3, long j4, long j5, String str2, C8573l c8573l, EvalContext evalContext, String str3, EvalDebugLog evalDebugLog) {
        C9801m.m32346f(str, "flagKey");
        C9801m.m32346f(str2, "variantKey");
        C9801m.m32346f(c8573l, "variantAttachment");
        C9801m.m32346f(evalContext, "evalContext");
        C9801m.m32346f(str3, "timestamp");
        C9801m.m32346f(evalDebugLog, "evalDebugLog");
        this.flagID = j2;
        this.flagKey = str;
        this.flagSnapshotID = j3;
        this.segmentID = j4;
        this.variantID = j5;
        this.variantKey = str2;
        this.variantAttachment = c8573l;
        this.evalContext = evalContext;
        this.timestamp = str3;
        this.evalDebugLog = evalDebugLog;
    }

    /* renamed from: component1, reason: from getter */
    public final long getFlagID() {
        return this.flagID;
    }

    /* renamed from: component10, reason: from getter */
    public final EvalDebugLog getEvalDebugLog() {
        return this.evalDebugLog;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFlagKey() {
        return this.flagKey;
    }

    /* renamed from: component3, reason: from getter */
    public final long getFlagSnapshotID() {
        return this.flagSnapshotID;
    }

    /* renamed from: component4, reason: from getter */
    public final long getSegmentID() {
        return this.segmentID;
    }

    /* renamed from: component5, reason: from getter */
    public final long getVariantID() {
        return this.variantID;
    }

    /* renamed from: component6, reason: from getter */
    public final String getVariantKey() {
        return this.variantKey;
    }

    /* renamed from: component7, reason: from getter */
    public final C8573l getVariantAttachment() {
        return this.variantAttachment;
    }

    /* renamed from: component8, reason: from getter */
    public final EvalContext getEvalContext() {
        return this.evalContext;
    }

    /* renamed from: component9, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    public final PostEvaluationResponseJson copy(long j2, String str, long j3, long j4, long j5, String str2, C8573l c8573l, EvalContext evalContext, String str3, EvalDebugLog evalDebugLog) {
        C9801m.m32346f(str, "flagKey");
        C9801m.m32346f(str2, "variantKey");
        C9801m.m32346f(c8573l, "variantAttachment");
        C9801m.m32346f(evalContext, "evalContext");
        C9801m.m32346f(str3, "timestamp");
        C9801m.m32346f(evalDebugLog, "evalDebugLog");
        return new PostEvaluationResponseJson(j2, str, j3, j4, j5, str2, c8573l, evalContext, str3, evalDebugLog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostEvaluationResponseJson)) {
            return false;
        }
        PostEvaluationResponseJson postEvaluationResponseJson = (PostEvaluationResponseJson) other;
        return this.flagID == postEvaluationResponseJson.flagID && C9801m.m32341a(this.flagKey, postEvaluationResponseJson.flagKey) && this.flagSnapshotID == postEvaluationResponseJson.flagSnapshotID && this.segmentID == postEvaluationResponseJson.segmentID && this.variantID == postEvaluationResponseJson.variantID && C9801m.m32341a(this.variantKey, postEvaluationResponseJson.variantKey) && C9801m.m32341a(this.variantAttachment, postEvaluationResponseJson.variantAttachment) && C9801m.m32341a(this.evalContext, postEvaluationResponseJson.evalContext) && C9801m.m32341a(this.timestamp, postEvaluationResponseJson.timestamp) && C9801m.m32341a(this.evalDebugLog, postEvaluationResponseJson.evalDebugLog);
    }

    public final EvalContext getEvalContext() {
        return this.evalContext;
    }

    public final EvalDebugLog getEvalDebugLog() {
        return this.evalDebugLog;
    }

    public final long getFlagID() {
        return this.flagID;
    }

    public final String getFlagKey() {
        return this.flagKey;
    }

    public final long getFlagSnapshotID() {
        return this.flagSnapshotID;
    }

    public final long getSegmentID() {
        return this.segmentID;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final C8573l getVariantAttachment() {
        return this.variantAttachment;
    }

    public final long getVariantID() {
        return this.variantID;
    }

    public final String getVariantKey() {
        return this.variantKey;
    }

    public int hashCode() {
        return (((((((((((((((((C1152a.m6829a(this.flagID) * 31) + this.flagKey.hashCode()) * 31) + C1152a.m6829a(this.flagSnapshotID)) * 31) + C1152a.m6829a(this.segmentID)) * 31) + C1152a.m6829a(this.variantID)) * 31) + this.variantKey.hashCode()) * 31) + this.variantAttachment.hashCode()) * 31) + this.evalContext.hashCode()) * 31) + this.timestamp.hashCode()) * 31) + this.evalDebugLog.hashCode();
    }

    public String toString() {
        return "PostEvaluationResponseJson(flagID=" + this.flagID + ", flagKey=" + this.flagKey + ", flagSnapshotID=" + this.flagSnapshotID + ", segmentID=" + this.segmentID + ", variantID=" + this.variantID + ", variantKey=" + this.variantKey + ", variantAttachment=" + this.variantAttachment + ", evalContext=" + this.evalContext + ", timestamp=" + this.timestamp + ", evalDebugLog=" + this.evalDebugLog + ')';
    }
}
