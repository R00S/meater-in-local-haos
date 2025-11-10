package com.apptionlabs.meater_app.data;

import kotlin.Metadata;
import wh.m;

/* compiled from: FeedBackResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/apptionlabs/meater_app/data/FeedBackResponse;", "", "data", "Lcom/apptionlabs/meater_app/data/Data;", "(Lcom/apptionlabs/meater_app/data/Data;)V", "getData", "()Lcom/apptionlabs/meater_app/data/Data;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /tmp/meat/meat/classes.dex */
public final /* data */ class FeedBackResponse {
    private final Data data;

    public FeedBackResponse(Data data) {
        m.f(data, "data");
        this.data = data;
    }

    public static /* synthetic */ FeedBackResponse copy$default(FeedBackResponse feedBackResponse, Data data, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            data = feedBackResponse.data;
        }
        return feedBackResponse.copy(data);
    }

    /* renamed from: component1, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    public final FeedBackResponse copy(Data data) {
        m.f(data, "data");
        return new FeedBackResponse(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof FeedBackResponse) && m.a(this.data, ((FeedBackResponse) other).data)) {
            return true;
        }
        return false;
    }

    public final Data getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "FeedBackResponse(data=" + this.data + ")";
    }
}
