package com.apptionlabs.meater_app.cloud.responses;

import kotlin.Metadata;
import wh.g;
import wh.m;

/* compiled from: ReviewCheckResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/apptionlabs/meater_app/cloud/responses/ReviewCheckResponse;", "", "action", "", "(Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "setAction", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /tmp/meat/meat/classes.dex */
public final /* data */ class ReviewCheckResponse {
    private String action;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ReviewCheckResponse() {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apptionlabs.meater_app.cloud.responses.ReviewCheckResponse.<init>():void");
    }

    public static /* synthetic */ ReviewCheckResponse copy$default(ReviewCheckResponse reviewCheckResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = reviewCheckResponse.action;
        }
        return reviewCheckResponse.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final ReviewCheckResponse copy(String action) {
        return new ReviewCheckResponse(action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof ReviewCheckResponse) && m.a(this.action, ((ReviewCheckResponse) other).action)) {
            return true;
        }
        return false;
    }

    public final String getAction() {
        return this.action;
    }

    public int hashCode() {
        String str = this.action;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setAction(String str) {
        this.action = str;
    }

    public String toString() {
        return "ReviewCheckResponse(action=" + this.action + ")";
    }

    public ReviewCheckResponse(String str) {
        this.action = str;
    }

    public /* synthetic */ ReviewCheckResponse(String str, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}
