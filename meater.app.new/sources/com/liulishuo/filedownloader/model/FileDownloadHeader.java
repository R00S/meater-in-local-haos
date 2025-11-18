package com.liulishuo.filedownloader.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class FileDownloadHeader implements Parcelable {
    public static final Parcelable.Creator<FileDownloadHeader> CREATOR = new C8697a();

    /* renamed from: f */
    private HashMap<String, List<String>> f33014f;

    /* renamed from: com.liulishuo.filedownloader.model.FileDownloadHeader$a */
    static class C8697a implements Parcelable.Creator<FileDownloadHeader> {
        C8697a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileDownloadHeader createFromParcel(Parcel parcel) {
            return new FileDownloadHeader(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FileDownloadHeader[] newArray(int i2) {
            return new FileDownloadHeader[i2];
        }
    }

    public FileDownloadHeader() {
    }

    /* renamed from: a */
    public void m27551a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        if (str2 == null) {
            throw new NullPointerException("value == null");
        }
        if (this.f33014f == null) {
            this.f33014f = new HashMap<>();
        }
        List<String> arrayList = this.f33014f.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f33014f.put(str, arrayList);
        }
        if (arrayList.contains(str2)) {
            return;
        }
        arrayList.add(str2);
    }

    /* renamed from: b */
    public HashMap<String, List<String>> m27552b() {
        return this.f33014f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f33014f.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeMap(this.f33014f);
    }

    protected FileDownloadHeader(Parcel parcel) {
        this.f33014f = parcel.readHashMap(String.class.getClassLoader());
    }
}
