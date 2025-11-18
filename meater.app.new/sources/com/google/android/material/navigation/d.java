package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import com.google.android.material.internal.k;

/* compiled from: NavigationBarPresenter.java */
/* loaded from: classes2.dex */
public class d implements j {

    /* renamed from: B, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f36882B;

    /* renamed from: C, reason: collision with root package name */
    private c f36883C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f36884D = false;

    /* renamed from: E, reason: collision with root package name */
    private int f36885E;

    /* compiled from: NavigationBarPresenter.java */
    static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0472a();

        /* renamed from: B, reason: collision with root package name */
        int f36886B;

        /* renamed from: C, reason: collision with root package name */
        k f36887C;

        /* compiled from: NavigationBarPresenter.java */
        /* renamed from: com.google.android.material.navigation.d$a$a, reason: collision with other inner class name */
        class C0472a implements Parcelable.Creator<a> {
            C0472a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        a() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f36886B);
            parcel.writeParcelable(this.f36887C, 0);
        }

        a(Parcel parcel) {
            this.f36886B = parcel.readInt();
            this.f36887C = (k) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    public void a(int i10) {
        this.f36885E = i10;
    }

    public void b(c cVar) {
        this.f36883C = cVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public int c() {
        return this.f36885E;
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(boolean z10) throws Resources.NotFoundException {
        if (this.f36884D) {
            return;
        }
        if (z10) {
            this.f36883C.d();
        } else {
            this.f36883C.p();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(androidx.appcompat.view.menu.e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h(androidx.appcompat.view.menu.e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void j(Context context, androidx.appcompat.view.menu.e eVar) {
        this.f36882B = eVar;
        this.f36883C.b(eVar);
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(Parcelable parcelable) {
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            this.f36883C.o(aVar.f36886B);
            this.f36883C.n(E7.c.b(this.f36883C.getContext(), aVar.f36887C));
        }
    }

    public void l(boolean z10) {
        this.f36884D = z10;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean m(m mVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable n() {
        a aVar = new a();
        aVar.f36886B = this.f36883C.getSelectedItemId();
        aVar.f36887C = E7.c.c(this.f36883C.getBadgeDrawables());
        return aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(androidx.appcompat.view.menu.e eVar, boolean z10) {
    }
}
