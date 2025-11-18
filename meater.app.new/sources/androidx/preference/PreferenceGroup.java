package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.content.p003d.C0264g;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p024c.p041e.C0873g;

/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* renamed from: V */
    final C0873g<String, Long> f3603V;

    /* renamed from: W */
    private final Handler f3604W;

    /* renamed from: X */
    private List<Preference> f3605X;

    /* renamed from: Y */
    private boolean f3606Y;

    /* renamed from: Z */
    private int f3607Z;

    /* renamed from: a0 */
    private boolean f3608a0;

    /* renamed from: b0 */
    private int f3609b0;

    /* renamed from: c0 */
    private InterfaceC0549b f3610c0;

    /* renamed from: d0 */
    private final Runnable f3611d0;

    /* renamed from: androidx.preference.PreferenceGroup$a */
    class RunnableC0548a implements Runnable {
        RunnableC0548a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f3603V.clear();
            }
        }
    }

    /* renamed from: androidx.preference.PreferenceGroup$b */
    public interface InterfaceC0549b {
        /* renamed from: a */
        void m4070a();
    }

    /* renamed from: androidx.preference.PreferenceGroup$c */
    public interface InterfaceC0550c {
        /* renamed from: c */
        int mo4071c(Preference preference);

        /* renamed from: f */
        int mo4072f(String str);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f3603V = new C0873g<>();
        this.f3604W = new Handler();
        this.f3606Y = true;
        this.f3607Z = 0;
        this.f3608a0 = false;
        this.f3609b0 = Integer.MAX_VALUE;
        this.f3610c0 = null;
        this.f3611d0 = new RunnableC0548a();
        this.f3605X = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0576t.f3858h1, i2, i3);
        int i4 = C0576t.f3864j1;
        this.f3606Y = C0264g.m1767b(typedArrayObtainStyledAttributes, i4, i4, true);
        int i5 = C0576t.f3861i1;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            m4065k1(C0264g.m1769d(typedArrayObtainStyledAttributes, i5, i5, Integer.MAX_VALUE));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: j1 */
    private boolean m4054j1(Preference preference) {
        boolean zRemove;
        synchronized (this) {
            preference.m4040r0();
            if (preference.m4003M() == this) {
                preference.m4029g(null);
            }
            zRemove = this.f3605X.remove(preference);
            if (zRemove) {
                String strM3997J = preference.m3997J();
                if (strM3997J != null) {
                    this.f3603V.put(strM3997J, Long.valueOf(preference.mo3994H()));
                    this.f3604W.removeCallbacks(this.f3611d0);
                    this.f3604W.post(this.f3611d0);
                }
                if (this.f3608a0) {
                    preference.mo4036n0();
                }
            }
        }
        return zRemove;
    }

    /* renamed from: Z0 */
    public void m4055Z0(Preference preference) {
        m4056a1(preference);
    }

    /* renamed from: a1 */
    public boolean m4056a1(Preference preference) {
        long jM4145d;
        if (this.f3605X.contains(preference)) {
            return true;
        }
        if (preference.m3997J() != null) {
            PreferenceGroup preferenceGroupM4003M = this;
            while (preferenceGroupM4003M.m4003M() != null) {
                preferenceGroupM4003M = preferenceGroupM4003M.m4003M();
            }
            String strM3997J = preference.m3997J();
            if (preferenceGroupM4003M.m4057b1(strM3997J) != null) {
                Log.e("PreferenceGroup", "Found duplicated key: \"" + strM3997J + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        if (preference.m4001L() == Integer.MAX_VALUE) {
            if (this.f3606Y) {
                int i2 = this.f3607Z;
                this.f3607Z = i2 + 1;
                preference.m4008O0(i2);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).m4066l1(this.f3606Y);
            }
        }
        int iBinarySearch = Collections.binarySearch(this.f3605X, preference);
        if (iBinarySearch < 0) {
            iBinarySearch = (iBinarySearch * (-1)) - 1;
        }
        if (!m4063h1(preference)) {
            return false;
        }
        synchronized (this) {
            this.f3605X.add(iBinarySearch, preference);
        }
        C0566j c0566jM4014S = m4014S();
        String strM3997J2 = preference.m3997J();
        if (strM3997J2 == null || !this.f3603V.containsKey(strM3997J2)) {
            jM4145d = c0566jM4014S.m4145d();
        } else {
            jM4145d = this.f3603V.get(strM3997J2).longValue();
            this.f3603V.remove(strM3997J2);
        }
        preference.m4033j0(c0566jM4014S, jM4145d);
        preference.m4029g(this);
        if (this.f3608a0) {
            preference.mo4031h0();
        }
        m4030g0();
        return true;
    }

    /* renamed from: b1 */
    public <T extends Preference> T m4057b1(CharSequence charSequence) {
        T t;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(m3997J(), charSequence)) {
            return this;
        }
        int iM4061f1 = m4061f1();
        for (int i2 = 0; i2 < iM4061f1; i2++) {
            PreferenceGroup preferenceGroup = (T) m4060e1(i2);
            if (TextUtils.equals(preferenceGroup.m3997J(), charSequence)) {
                return preferenceGroup;
            }
            if ((preferenceGroup instanceof PreferenceGroup) && (t = (T) preferenceGroup.m4057b1(charSequence)) != null) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: c1 */
    public int m4058c1() {
        return this.f3609b0;
    }

    /* renamed from: d1 */
    public InterfaceC0549b m4059d1() {
        return this.f3610c0;
    }

    /* renamed from: e1 */
    public Preference m4060e1(int i2) {
        return this.f3605X.get(i2);
    }

    @Override // androidx.preference.Preference
    /* renamed from: f0 */
    public void mo4028f0(boolean z) {
        super.mo4028f0(z);
        int iM4061f1 = m4061f1();
        for (int i2 = 0; i2 < iM4061f1; i2++) {
            m4060e1(i2).m4039q0(this, z);
        }
    }

    /* renamed from: f1 */
    public int m4061f1() {
        return this.f3605X.size();
    }

    /* renamed from: g1 */
    protected boolean mo4062g1() {
        return true;
    }

    @Override // androidx.preference.Preference
    /* renamed from: h0 */
    public void mo4031h0() {
        super.mo4031h0();
        this.f3608a0 = true;
        int iM4061f1 = m4061f1();
        for (int i2 = 0; i2 < iM4061f1; i2++) {
            m4060e1(i2).mo4031h0();
        }
    }

    /* renamed from: h1 */
    protected boolean m4063h1(Preference preference) {
        preference.m4039q0(this, mo3944U0());
        return true;
    }

    /* renamed from: i1 */
    public boolean m4064i1(Preference preference) {
        boolean zM4054j1 = m4054j1(preference);
        m4030g0();
        return zM4054j1;
    }

    /* renamed from: k1 */
    public void m4065k1(int i2) {
        if (i2 != Integer.MAX_VALUE && !m4022Y()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f3609b0 = i2;
    }

    /* renamed from: l1 */
    public void m4066l1(boolean z) {
        this.f3606Y = z;
    }

    /* renamed from: m1 */
    void m4067m1() {
        synchronized (this) {
            Collections.sort(this.f3605X);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: n0 */
    public void mo4036n0() {
        super.mo4036n0();
        this.f3608a0 = false;
        int iM4061f1 = m4061f1();
        for (int i2 = 0; i2 < iM4061f1; i2++) {
            m4060e1(i2).mo4036n0();
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: s0 */
    protected void mo3949s0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.mo3949s0(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f3609b0 = savedState.f3612f;
        super.mo3949s0(savedState.getSuperState());
    }

    @Override // androidx.preference.Preference
    /* renamed from: t0 */
    protected Parcelable mo3950t0() {
        return new SavedState(super.mo3950t0(), this.f3609b0);
    }

    @Override // androidx.preference.Preference
    /* renamed from: v */
    protected void mo4042v(Bundle bundle) {
        super.mo4042v(bundle);
        int iM4061f1 = m4061f1();
        for (int i2 = 0; i2 < iM4061f1; i2++) {
            m4060e1(i2).mo4042v(bundle);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: x */
    protected void mo4045x(Bundle bundle) {
        super.mo4045x(bundle);
        int iM4061f1 = m4061f1();
        for (int i2 = 0; i2 < iM4061f1; i2++) {
            m4060e1(i2).mo4045x(bundle);
        }
    }

    static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0547a();

        /* renamed from: f */
        int f3612f;

        /* renamed from: androidx.preference.PreferenceGroup$SavedState$a */
        static class C0547a implements Parcelable.Creator<SavedState> {
            C0547a() {
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

        SavedState(Parcel parcel) {
            super(parcel);
            this.f3612f = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f3612f);
        }

        SavedState(Parcelable parcelable, int i2) {
            super(parcelable);
            this.f3612f = i2;
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
