package com.apptionlabs.meater_app.data;

import kotlin.Metadata;
import ph.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReviewReasonType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/apptionlabs/meater_app/data/ReviewReasonType;", "", "reason", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getReason", "()Ljava/lang/String;", "DEVICE_CONNECTED", "COOK_FINISHED", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /tmp/meat/meat/classes.dex */
public final class ReviewReasonType {
    private static final /* synthetic */ ph.a $ENTRIES;
    private static final /* synthetic */ ReviewReasonType[] $VALUES;
    private final String reason;
    public static final ReviewReasonType DEVICE_CONNECTED = new ReviewReasonType("DEVICE_CONNECTED", 0, "DEVICE-CONNECTED");
    public static final ReviewReasonType COOK_FINISHED = new ReviewReasonType("COOK_FINISHED", 1, "COOK-FINISHED");

    private static final /* synthetic */ ReviewReasonType[] $values() {
        return new ReviewReasonType[]{DEVICE_CONNECTED, COOK_FINISHED};
    }

    static {
        ReviewReasonType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ReviewReasonType(String str, int i10, String str2) {
        this.reason = str2;
    }

    public static ph.a<ReviewReasonType> getEntries() {
        return $ENTRIES;
    }

    public static ReviewReasonType valueOf(String str) {
        return (ReviewReasonType) Enum.valueOf(ReviewReasonType.class, str);
    }

    public static ReviewReasonType[] values() {
        return (ReviewReasonType[]) $VALUES.clone();
    }

    public final String getReason() {
        return this.reason;
    }
}
