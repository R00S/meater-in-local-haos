package com.apptionlabs.meater_app.cloud.responses;

import com.google.gson.l;
import g6.b;
import java.util.List;
import kotlin.Metadata;
import wh.m;

/* compiled from: SyncApiResponse.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/apptionlabs/meater_app/cloud/responses/SyncApiResponse;", "", "", "Lcom/google/gson/l;", "data", "Ljava/util/List;", "getData", "()Ljava/util/List;", "meta", "Lcom/google/gson/l;", "getMeta", "()Lcom/google/gson/l;", "getPagination", "pagination", "", "getPage", "()I", "page", "getPerPage", "perPage", "", "getHasMore", "()Z", "hasMore", "<init>", "(Ljava/util/List;Lcom/google/gson/l;)V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class SyncApiResponse {
    private final List<l> data;
    private final l meta;

    public SyncApiResponse(List<l> list, l lVar) {
        m.f(list, "data");
        m.f(lVar, "meta");
        this.data = list;
        this.meta = lVar;
    }

    private final l getPagination() {
        return b.e(this.meta, "pagination");
    }

    public final List<l> getData() {
        return this.data;
    }

    public final boolean getHasMore() {
        Boolean a10;
        l pagination = getPagination();
        if (pagination != null && (a10 = b.a(pagination, "hasMore")) != null) {
            return a10.booleanValue();
        }
        return false;
    }

    public final l getMeta() {
        return this.meta;
    }

    public final int getPage() {
        Integer c10;
        l pagination = getPagination();
        if (pagination != null && (c10 = b.c(pagination, "page")) != null) {
            return c10.intValue();
        }
        return 0;
    }

    public final int getPerPage() {
        Integer c10;
        l pagination = getPagination();
        if (pagination != null && (c10 = b.c(pagination, "perPage")) != null) {
            return c10.intValue();
        }
        return 0;
    }
}
