package com.apptionlabs.meater_app.data;

import kotlin.Metadata;
import wh.m;

/* compiled from: Appliance.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006!"}, d2 = {"Lcom/apptionlabs/meater_app/data/Appliance;", "", "imageId", "", "name", "", "detailText", "haveSafetyInfo", "", "(ILjava/lang/String;Ljava/lang/String;Z)V", "getDetailText", "()Ljava/lang/String;", "setDetailText", "(Ljava/lang/String;)V", "getHaveSafetyInfo", "()Z", "setHaveSafetyInfo", "(Z)V", "getImageId", "()I", "setImageId", "(I)V", "getName", "setName", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /tmp/meat/meat/classes.dex */
public final /* data */ class Appliance {
    private String detailText;
    private boolean haveSafetyInfo;
    private int imageId;
    private String name;

    public Appliance(int i10, String str, String str2, boolean z10) {
        m.f(str, "name");
        m.f(str2, "detailText");
        this.imageId = i10;
        this.name = str;
        this.detailText = str2;
        this.haveSafetyInfo = z10;
    }

    public static /* synthetic */ Appliance copy$default(Appliance appliance, int i10, String str, String str2, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = appliance.imageId;
        }
        if ((i11 & 2) != 0) {
            str = appliance.name;
        }
        if ((i11 & 4) != 0) {
            str2 = appliance.detailText;
        }
        if ((i11 & 8) != 0) {
            z10 = appliance.haveSafetyInfo;
        }
        return appliance.copy(i10, str, str2, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final int getImageId() {
        return this.imageId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDetailText() {
        return this.detailText;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHaveSafetyInfo() {
        return this.haveSafetyInfo;
    }

    public final Appliance copy(int imageId, String name, String detailText, boolean haveSafetyInfo) {
        m.f(name, "name");
        m.f(detailText, "detailText");
        return new Appliance(imageId, name, detailText, haveSafetyInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Appliance)) {
            return false;
        }
        Appliance appliance = (Appliance) other;
        if (this.imageId == appliance.imageId && m.a(this.name, appliance.name) && m.a(this.detailText, appliance.detailText) && this.haveSafetyInfo == appliance.haveSafetyInfo) {
            return true;
        }
        return false;
    }

    public final String getDetailText() {
        return this.detailText;
    }

    public final boolean getHaveSafetyInfo() {
        return this.haveSafetyInfo;
    }

    public final int getImageId() {
        return this.imageId;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.imageId) * 31) + this.name.hashCode()) * 31) + this.detailText.hashCode()) * 31;
        boolean z10 = this.haveSafetyInfo;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final void setDetailText(String str) {
        m.f(str, "<set-?>");
        this.detailText = str;
    }

    public final void setHaveSafetyInfo(boolean z10) {
        this.haveSafetyInfo = z10;
    }

    public final void setImageId(int i10) {
        this.imageId = i10;
    }

    public final void setName(String str) {
        m.f(str, "<set-?>");
        this.name = str;
    }

    public String toString() {
        return "Appliance(imageId=" + this.imageId + ", name=" + this.name + ", detailText=" + this.detailText + ", haveSafetyInfo=" + this.haveSafetyInfo + ")";
    }
}
