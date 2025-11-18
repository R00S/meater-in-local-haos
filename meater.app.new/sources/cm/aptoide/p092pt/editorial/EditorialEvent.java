package cm.aptoide.p092pt.editorial;

import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class EditorialEvent {
    private final Type clickType;
    private final int firstVisibleItemPosition;

    /* renamed from: id */
    private final long f8877id;
    private final int lastVisibleItemPosition;
    private final List<EditorialMedia> media;
    private final String packageName;
    private final int position;
    private final String url;

    public enum Type {
        ACTION,
        APPCARD,
        BUTTON,
        CANCEL,
        PAUSE,
        RESUME,
        MEDIA,
        MEDIA_LIST
    }

    public EditorialEvent(Type type, String str) {
        this.clickType = type;
        this.url = str;
        this.firstVisibleItemPosition = -1;
        this.lastVisibleItemPosition = -1;
        this.media = null;
        this.f8877id = -1L;
        this.packageName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.position = -1;
    }

    public Type getClickType() {
        return this.clickType;
    }

    public int getFirstVisiblePosition() {
        return this.firstVisibleItemPosition;
    }

    public long getId() {
        return this.f8877id;
    }

    public int getLastVisibleItemPosition() {
        return this.lastVisibleItemPosition;
    }

    public List<EditorialMedia> getMedia() {
        return this.media;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getPosition() {
        return this.position;
    }

    public String getUrl() {
        return this.url;
    }

    public EditorialEvent(Type type, long j2, String str) {
        this.clickType = type;
        this.f8877id = j2;
        this.packageName = str;
        this.url = HttpUrl.FRAGMENT_ENCODE_SET;
        this.firstVisibleItemPosition = -1;
        this.lastVisibleItemPosition = -1;
        this.media = null;
        this.position = -1;
    }

    public EditorialEvent(Type type, int i2, int i3, int i4, List<EditorialMedia> list) {
        this.clickType = type;
        this.firstVisibleItemPosition = i2;
        this.lastVisibleItemPosition = i3;
        this.position = i4;
        this.media = list;
        this.url = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f8877id = -1L;
        this.packageName = HttpUrl.FRAGMENT_ENCODE_SET;
    }
}
