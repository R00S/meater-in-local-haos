package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: V */
    int f3615V;

    /* renamed from: W */
    int f3616W;

    /* renamed from: X */
    private int f3617X;

    /* renamed from: Y */
    private int f3618Y;

    /* renamed from: Z */
    boolean f3619Z;

    /* renamed from: a0 */
    SeekBar f3620a0;

    /* renamed from: b0 */
    private TextView f3621b0;

    /* renamed from: c0 */
    boolean f3622c0;

    /* renamed from: d0 */
    private boolean f3623d0;

    /* renamed from: e0 */
    boolean f3624e0;

    /* renamed from: f0 */
    private SeekBar.OnSeekBarChangeListener f3625f0;

    /* renamed from: g0 */
    private View.OnKeyListener f3626g0;

    /* renamed from: androidx.preference.SeekBarPreference$a */
    class C0552a implements SeekBar.OnSeekBarChangeListener {
        C0552a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            if (z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f3624e0 || !seekBarPreference.f3619Z) {
                    seekBarPreference.m4078d1(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.m4079e1(i2 + seekBarPreference2.f3616W);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f3619Z = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f3619Z = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f3616W != seekBarPreference.f3615V) {
                seekBarPreference.m4078d1(seekBar);
            }
        }
    }

    /* renamed from: androidx.preference.SeekBarPreference$b */
    class ViewOnKeyListenerC0553b implements View.OnKeyListener {
        ViewOnKeyListenerC0553b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f3622c0 && (i2 == 21 || i2 == 22)) || i2 == 23 || i2 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f3620a0;
            if (seekBar != null) {
                return seekBar.onKeyDown(i2, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f3625f0 = new C0552a();
        this.f3626g0 = new ViewOnKeyListenerC0553b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0576t.f3888r1, i2, i3);
        this.f3616W = typedArrayObtainStyledAttributes.getInt(C0576t.f3897u1, 0);
        m4075Z0(typedArrayObtainStyledAttributes.getInt(C0576t.f3891s1, 100));
        m4076a1(typedArrayObtainStyledAttributes.getInt(C0576t.f3900v1, 0));
        this.f3622c0 = typedArrayObtainStyledAttributes.getBoolean(C0576t.f3894t1, true);
        this.f3623d0 = typedArrayObtainStyledAttributes.getBoolean(C0576t.f3903w1, false);
        this.f3624e0 = typedArrayObtainStyledAttributes.getBoolean(C0576t.f3906x1, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: c1 */
    private void m4074c1(int i2, boolean z) {
        int i3 = this.f3616W;
        if (i2 < i3) {
            i2 = i3;
        }
        int i4 = this.f3617X;
        if (i2 > i4) {
            i2 = i4;
        }
        if (i2 != this.f3615V) {
            this.f3615V = i2;
            m4079e1(i2);
            m4047z0(i2);
            if (z) {
                mo3942e0();
            }
        }
    }

    /* renamed from: Z0 */
    public final void m4075Z0(int i2) {
        int i3 = this.f3616W;
        if (i2 < i3) {
            i2 = i3;
        }
        if (i2 != this.f3617X) {
            this.f3617X = i2;
            mo3942e0();
        }
    }

    /* renamed from: a1 */
    public final void m4076a1(int i2) {
        if (i2 != this.f3618Y) {
            this.f3618Y = Math.min(this.f3617X - this.f3616W, Math.abs(i2));
            mo3942e0();
        }
    }

    /* renamed from: b1 */
    public void m4077b1(int i2) {
        m4074c1(i2, true);
    }

    /* renamed from: d1 */
    void m4078d1(SeekBar seekBar) {
        int progress = this.f3616W + seekBar.getProgress();
        if (progress != this.f3615V) {
            if (m4034k(Integer.valueOf(progress))) {
                m4074c1(progress, false);
            } else {
                seekBar.setProgress(this.f3615V - this.f3616W);
                m4079e1(this.f3615V);
            }
        }
    }

    /* renamed from: e1 */
    void m4079e1(int i2) {
        TextView textView = this.f3621b0;
        if (textView != null) {
            textView.setText(String.valueOf(i2));
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: k0 */
    public void mo3931k0(C0568l c0568l) {
        super.mo3931k0(c0568l);
        c0568l.itemView.setOnKeyListener(this.f3626g0);
        this.f3620a0 = (SeekBar) c0568l.m4161a(C0572p.f3740c);
        TextView textView = (TextView) c0568l.m4161a(C0572p.f3741d);
        this.f3621b0 = textView;
        if (this.f3623d0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f3621b0 = null;
        }
        SeekBar seekBar = this.f3620a0;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f3625f0);
        this.f3620a0.setMax(this.f3617X - this.f3616W);
        int i2 = this.f3618Y;
        if (i2 != 0) {
            this.f3620a0.setKeyProgressIncrement(i2);
        } else {
            this.f3618Y = this.f3620a0.getKeyProgressIncrement();
        }
        this.f3620a0.setProgress(this.f3615V - this.f3616W);
        m4079e1(this.f3615V);
        this.f3620a0.setEnabled(mo4024a0());
    }

    @Override // androidx.preference.Preference
    /* renamed from: o0 */
    protected Object mo3948o0(TypedArray typedArray, int i2) {
        return Integer.valueOf(typedArray.getInt(i2, 0));
    }

    @Override // androidx.preference.Preference
    /* renamed from: s0 */
    protected void mo3949s0(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.mo3949s0(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.mo3949s0(savedState.getSuperState());
        this.f3615V = savedState.f3627f;
        this.f3616W = savedState.f3628g;
        this.f3617X = savedState.f3629h;
        mo3942e0();
    }

    @Override // androidx.preference.Preference
    /* renamed from: t0 */
    protected Parcelable mo3950t0() {
        Parcelable parcelableMo3950t0 = super.mo3950t0();
        if (m4025b0()) {
            return parcelableMo3950t0;
        }
        SavedState savedState = new SavedState(parcelableMo3950t0);
        savedState.f3627f = this.f3615V;
        savedState.f3628g = this.f3616W;
        savedState.f3629h = this.f3617X;
        return savedState;
    }

    @Override // androidx.preference.Preference
    /* renamed from: u0 */
    protected void mo3951u0(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        m4077b1(m4007O(((Integer) obj).intValue()));
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0551a();

        /* renamed from: f */
        int f3627f;

        /* renamed from: g */
        int f3628g;

        /* renamed from: h */
        int f3629h;

        /* renamed from: androidx.preference.SeekBarPreference$SavedState$a */
        static class C0551a implements Parcelable.Creator<SavedState> {
            C0551a() {
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
            this.f3627f = parcel.readInt();
            this.f3628g = parcel.readInt();
            this.f3629h = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f3627f);
            parcel.writeInt(this.f3628g);
            parcel.writeInt(this.f3629h);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0569m.f3733k);
    }
}
