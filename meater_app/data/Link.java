package com.apptionlabs.meater_app.data;

import kotlin.Metadata;
import wh.m;

/* compiled from: Link.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/apptionlabs/meater_app/data/Link;", "", "image", "", "title", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "getTitle", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /tmp/meat/meat/classes.dex */
public final /* data */ class Link {
    private final String image;
    private final String title;
    private final String url;

    public Link(String str, String str2, String str3) {
        m.f(str, "image");
        m.f(str2, "title");
        m.f(str3, "url");
        this.image = str;
        this.title = str2;
        this.url = str3;
    }

    public static /* synthetic */ Link copy$default(Link link, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = link.image;
        }
        if ((i10 & 2) != 0) {
            str2 = link.title;
        }
        if ((i10 & 4) != 0) {
            str3 = link.url;
        }
        return link.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final Link copy(String image, String title, String url) {
        m.f(image, "image");
        m.f(title, "title");
        m.f(url, "url");
        return new Link(image, title, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Link)) {
            return false;
        }
        Link link = (Link) other;
        if (m.a(this.image, link.image) && m.a(this.title, link.title) && m.a(this.url, link.url)) {
            return true;
        }
        return false;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((this.image.hashCode() * 31) + this.title.hashCode()) * 31) + this.url.hashCode();
    }

    public String toString() {
        return "Link(image=" + this.image + ", title=" + this.title + ", url=" + this.url + ")";
    }
}
