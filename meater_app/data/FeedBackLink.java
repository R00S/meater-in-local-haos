package com.apptionlabs.meater_app.data;

import kotlin.Metadata;
import wh.m;

/* compiled from: FeedBackLink.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/apptionlabs/meater_app/data/FeedBackLink;", "", "data", "Lcom/apptionlabs/meater_app/data/Data;", "meta", "Lcom/apptionlabs/meater_app/data/Meta;", "(Lcom/apptionlabs/meater_app/data/Data;Lcom/apptionlabs/meater_app/data/Meta;)V", "getData", "()Lcom/apptionlabs/meater_app/data/Data;", "getMeta", "()Lcom/apptionlabs/meater_app/data/Meta;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /tmp/meat/meat/classes.dex */
public final /* data */ class FeedBackLink {
    private final Data data;
    private final Meta meta;

    public FeedBackLink(Data data, Meta meta) {
        m.f(data, "data");
        m.f(meta, "meta");
        this.data = data;
        this.meta = meta;
    }

    public static /* synthetic */ FeedBackLink copy$default(FeedBackLink feedBackLink, Data data, Meta meta, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            data = feedBackLink.data;
        }
        if ((i10 & 2) != 0) {
            meta = feedBackLink.meta;
        }
        return feedBackLink.copy(data, meta);
    }

    /* renamed from: component1, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final Meta getMeta() {
        return this.meta;
    }

    public final FeedBackLink copy(Data data, Meta meta) {
        m.f(data, "data");
        m.f(meta, "meta");
        return new FeedBackLink(data, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedBackLink)) {
            return false;
        }
        FeedBackLink feedBackLink = (FeedBackLink) other;
        if (m.a(this.data, feedBackLink.data) && m.a(this.meta, feedBackLink.meta)) {
            return true;
        }
        return false;
    }

    public final Data getData() {
        return this.data;
    }

    public final Meta getMeta() {
        return this.meta;
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + this.meta.hashCode();
    }

    public String toString() {
        return "FeedBackLink(data=" + this.data + ", meta=" + this.meta + ")";
    }
}
