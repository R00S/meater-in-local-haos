package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;

/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* renamed from: V */
    protected boolean f3640V;

    /* renamed from: W */
    private CharSequence f3641W;

    /* renamed from: X */
    private CharSequence f3642X;

    /* renamed from: Y */
    private boolean f3643Y;

    /* renamed from: Z */
    private boolean f3644Z;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    @Override // androidx.preference.Preference
    /* renamed from: U0 */
    public boolean mo3944U0() {
        return (this.f3644Z ? this.f3640V : !this.f3640V) || super.mo3944U0();
    }

    /* renamed from: Z0 */
    public boolean m4090Z0() {
        return this.f3640V;
    }

    /* renamed from: a1 */
    public void m4091a1(boolean z) {
        boolean z2 = this.f3640V != z;
        if (z2 || !this.f3643Y) {
            this.f3640V = z;
            this.f3643Y = true;
            m4046y0(z);
            if (z2) {
                mo4028f0(mo3944U0());
                mo3942e0();
            }
        }
    }

    /* renamed from: b1 */
    public void m4092b1(boolean z) {
        this.f3644Z = z;
    }

    /* renamed from: c1 */
    public void m4093c1(CharSequence charSequence) {
        this.f3642X = charSequence;
        if (m4090Z0()) {
            return;
        }
        mo3942e0();
    }

    /* renamed from: d1 */
    public void m4094d1(CharSequence charSequence) {
        this.f3641W = charSequence;
        if (m4090Z0()) {
            mo3942e0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: e1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void m4095e1(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            boolean r1 = r4.f3640V
            r2 = 0
            if (r1 == 0) goto L1c
            java.lang.CharSequence r1 = r4.f3641W
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1c
            java.lang.CharSequence r0 = r4.f3641W
            r5.setText(r0)
        L1a:
            r0 = 0
            goto L2e
        L1c:
            boolean r1 = r4.f3640V
            if (r1 != 0) goto L2e
            java.lang.CharSequence r1 = r4.f3642X
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2e
            java.lang.CharSequence r0 = r4.f3642X
            r5.setText(r0)
            goto L1a
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r1 = r4.mo3960U()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L3e
            r5.setText(r1)
            r0 = 0
        L3e:
            r1 = 8
            if (r0 != 0) goto L43
            goto L45
        L43:
            r2 = 8
        L45:
            int r0 = r5.getVisibility()
            if (r2 == r0) goto L4e
            r5.setVisibility(r2)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.m4095e1(android.view.View):void");
    }

    /* renamed from: f1 */
    protected void m4096f1(C0568l c0568l) {
        m4095e1(c0568l.m4161a(R.id.summary));
    }

    @Override // androidx.preference.Preference
    /* renamed from: l0 */
    protected void mo3939l0() {
        super.mo3939l0();
        boolean z = !m4090Z0();
        if (m4034k(Boolean.valueOf(z))) {
            m4091a1(z);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: o0 */
    protected Object mo3948o0(TypedArray typedArray, int i2) {
        return Boolean.valueOf(typedArray.getBoolean(i2, false));
    }

    @Override // androidx.preference.Preference
    /* renamed from: s0 */
    protected void mo3949s0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.mo3949s0(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.mo3949s0(savedState.getSuperState());
        m4091a1(savedState.f3645f);
    }

    @Override // androidx.preference.Preference
    /* renamed from: t0 */
    protected Parcelable mo3950t0() {
        Parcelable parcelableMo3950t0 = super.mo3950t0();
        if (m4025b0()) {
            return parcelableMo3950t0;
        }
        SavedState savedState = new SavedState(parcelableMo3950t0);
        savedState.f3645f = m4090Z0();
        return savedState;
    }

    @Override // androidx.preference.Preference
    /* renamed from: u0 */
    protected void mo3951u0(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        m4091a1(m4005N(((Boolean) obj).booleanValue()));
    }

    static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0556a();

        /* renamed from: f */
        boolean f3645f;

        /* renamed from: androidx.preference.TwoStatePreference$SavedState$a */
        static class C0556a implements Parcelable.Creator<SavedState> {
            C0556a() {
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
            this.f3645f = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f3645f ? 1 : 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
