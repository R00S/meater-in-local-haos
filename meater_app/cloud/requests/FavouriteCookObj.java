package com.apptionlabs.meater_app.cloud.requests;

import kotlin.Metadata;

/* compiled from: FavouriteCookObj.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/apptionlabs/meater_app/cloud/requests/FavouriteCookObj;", "", "()V", "cookId", "", "getCookId", "()Ljava/lang/String;", "setCookId", "(Ljava/lang/String;)V", "isFavourite", "", "()Z", "setFavourite", "(Z)V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /tmp/meat/meat/classes.dex */
public final class FavouriteCookObj {
    private String cookId;
    private boolean isFavourite;

    public final String getCookId() {
        return this.cookId;
    }

    /* renamed from: isFavourite, reason: from getter */
    public final boolean getIsFavourite() {
        return this.isFavourite;
    }

    public final void setCookId(String str) {
        this.cookId = str;
    }

    public final void setFavourite(boolean z10) {
        this.isFavourite = z10;
    }
}
