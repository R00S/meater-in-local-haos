package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.C0087g;
import androidx.appcompat.view.menu.C0089i;
import androidx.appcompat.view.menu.InterfaceC0093m;
import androidx.appcompat.view.menu.SubMenuC0098r;
import com.google.android.material.badge.C7939a;
import com.google.android.material.internal.ParcelableSparseArray;

/* loaded from: classes2.dex */
public class BottomNavigationPresenter implements InterfaceC0093m {

    /* renamed from: f */
    private C0087g f29769f;

    /* renamed from: g */
    private C7962c f29770g;

    /* renamed from: h */
    private boolean f29771h = false;

    /* renamed from: i */
    private int f29772i;

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C7954a();

        /* renamed from: f */
        int f29773f;

        /* renamed from: g */
        ParcelableSparseArray f29774g;

        /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState$a */
        static class C7954a implements Parcelable.Creator<SavedState> {
            C7954a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f29773f);
            parcel.writeParcelable(this.f29774g, 0);
        }

        SavedState(Parcel parcel) {
            this.f29773f = parcel.readInt();
            this.f29774g = (ParcelableSparseArray) parcel.readParcelable(SavedState.class.getClassLoader());
        }
    }

    /* renamed from: a */
    public void m23930a(C7962c c7962c) {
        this.f29770g = c7962c;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: b */
    public void mo492b(C0087g c0087g, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: c */
    public void mo493c(boolean z) {
        if (this.f29771h) {
            return;
        }
        if (z) {
            this.f29770g.m23963d();
        } else {
            this.f29770g.m23967k();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: d */
    public boolean mo520d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: e */
    public boolean mo494e(C0087g c0087g, C0089i c0089i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: f */
    public boolean mo495f(C0087g c0087g, C0089i c0089i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    public int getId() {
        return this.f29772i;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: h */
    public void mo497h(Context context, C0087g c0087g) {
        this.f29769f = c0087g;
        this.f29770g.mo478b(c0087g);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: i */
    public void mo521i(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f29770g.m23966j(savedState.f29773f);
            this.f29770g.setBadgeDrawables(C7939a.m23853b(this.f29770g.getContext(), savedState.f29774g));
        }
    }

    /* renamed from: j */
    public void m23931j(int i2) {
        this.f29772i = i2;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: k */
    public boolean mo499k(SubMenuC0098r subMenuC0098r) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m
    /* renamed from: l */
    public Parcelable mo523l() {
        SavedState savedState = new SavedState();
        savedState.f29773f = this.f29770g.getSelectedItemId();
        savedState.f29774g = C7939a.m23854c(this.f29770g.getBadgeDrawables());
        return savedState;
    }

    /* renamed from: m */
    public void m23932m(boolean z) {
        this.f29771h = z;
    }
}
