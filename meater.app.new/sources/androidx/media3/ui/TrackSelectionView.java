package androidx.media3.ui;

import U1.I;
import U1.K;
import X1.C1804a;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import e3.C3181B;
import e3.C3189e;
import e3.InterfaceC3184E;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m8.AbstractC4009y;

/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: B, reason: collision with root package name */
    private final int f28167B;

    /* renamed from: C, reason: collision with root package name */
    private final LayoutInflater f28168C;

    /* renamed from: D, reason: collision with root package name */
    private final CheckedTextView f28169D;

    /* renamed from: E, reason: collision with root package name */
    private final CheckedTextView f28170E;

    /* renamed from: F, reason: collision with root package name */
    private final b f28171F;

    /* renamed from: G, reason: collision with root package name */
    private final List<K.a> f28172G;

    /* renamed from: H, reason: collision with root package name */
    private final Map<U1.H, I> f28173H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f28174I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f28175J;

    /* renamed from: K, reason: collision with root package name */
    private InterfaceC3184E f28176K;

    /* renamed from: L, reason: collision with root package name */
    private CheckedTextView[][] f28177L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f28178M;

    /* renamed from: N, reason: collision with root package name */
    private Comparator<c> f28179N;

    private class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.c(view);
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final K.a f28181a;

        /* renamed from: b, reason: collision with root package name */
        public final int f28182b;

        public c(K.a aVar, int i10) {
            this.f28181a = aVar;
            this.f28182b = i10;
        }

        public U1.s a() {
            return this.f28181a.b(this.f28182b);
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static Map<U1.H, I> b(Map<U1.H, I> map, List<K.a> list, boolean z10) {
        HashMap map2 = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            I i11 = map.get(list.get(i10).a());
            if (i11 != null && (z10 || map2.isEmpty())) {
                map2.put(i11.f16869a, i11);
            }
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(View view) {
        if (view == this.f28169D) {
            e();
        } else if (view == this.f28170E) {
            d();
        } else {
            f(view);
        }
        i();
    }

    private void d() {
        this.f28178M = false;
        this.f28173H.clear();
    }

    private void e() {
        this.f28178M = true;
        this.f28173H.clear();
    }

    private void f(View view) {
        this.f28178M = false;
        c cVar = (c) C1804a.e(view.getTag());
        U1.H hA = cVar.f28181a.a();
        int i10 = cVar.f28182b;
        I i11 = this.f28173H.get(hA);
        if (i11 == null) {
            if (!this.f28175J && this.f28173H.size() > 0) {
                this.f28173H.clear();
            }
            this.f28173H.put(hA, new I(hA, AbstractC4009y.H(Integer.valueOf(i10))));
            return;
        }
        ArrayList arrayList = new ArrayList(i11.f16870b);
        boolean zIsChecked = ((CheckedTextView) view).isChecked();
        boolean zG = g(cVar.f28181a);
        boolean z10 = zG || h();
        if (zIsChecked && z10) {
            arrayList.remove(Integer.valueOf(i10));
            if (arrayList.isEmpty()) {
                this.f28173H.remove(hA);
                return;
            } else {
                this.f28173H.put(hA, new I(hA, arrayList));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (!zG) {
            this.f28173H.put(hA, new I(hA, AbstractC4009y.H(Integer.valueOf(i10))));
        } else {
            arrayList.add(Integer.valueOf(i10));
            this.f28173H.put(hA, new I(hA, arrayList));
        }
    }

    private boolean g(K.a aVar) {
        return this.f28174I && aVar.d();
    }

    private boolean h() {
        return this.f28175J && this.f28172G.size() > 1;
    }

    private void i() {
        this.f28169D.setChecked(this.f28178M);
        this.f28170E.setChecked(!this.f28178M && this.f28173H.size() == 0);
        for (int i10 = 0; i10 < this.f28177L.length; i10++) {
            I i11 = this.f28173H.get(this.f28172G.get(i10).a());
            int i12 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f28177L[i10];
                if (i12 < checkedTextViewArr.length) {
                    if (i11 != null) {
                        this.f28177L[i10][i12].setChecked(i11.f16870b.contains(Integer.valueOf(((c) C1804a.e(checkedTextViewArr[i12].getTag())).f28182b)));
                    } else {
                        checkedTextViewArr[i12].setChecked(false);
                    }
                    i12++;
                }
            }
        }
    }

    private void j() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f28172G.isEmpty()) {
            this.f28169D.setEnabled(false);
            this.f28170E.setEnabled(false);
            return;
        }
        this.f28169D.setEnabled(true);
        this.f28170E.setEnabled(true);
        this.f28177L = new CheckedTextView[this.f28172G.size()][];
        boolean zH = h();
        for (int i10 = 0; i10 < this.f28172G.size(); i10++) {
            K.a aVar = this.f28172G.get(i10);
            boolean zG = g(aVar);
            CheckedTextView[][] checkedTextViewArr = this.f28177L;
            int i11 = aVar.f16977a;
            checkedTextViewArr[i10] = new CheckedTextView[i11];
            c[] cVarArr = new c[i11];
            for (int i12 = 0; i12 < aVar.f16977a; i12++) {
                cVarArr[i12] = new c(aVar, i12);
            }
            Comparator<c> comparator = this.f28179N;
            if (comparator != null) {
                Arrays.sort(cVarArr, comparator);
            }
            for (int i13 = 0; i13 < i11; i13++) {
                if (i13 == 0) {
                    addView(this.f28168C.inflate(e3.z.f40493a, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f28168C.inflate((zG || zH) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.f28167B);
                checkedTextView.setText(this.f28176K.a(cVarArr[i13].a()));
                checkedTextView.setTag(cVarArr[i13]);
                if (aVar.h(i13)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.f28171F);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f28177L[i10][i13] = checkedTextView;
                addView(checkedTextView);
            }
        }
        i();
    }

    public boolean getIsDisabled() {
        return this.f28178M;
    }

    public Map<U1.H, I> getOverrides() {
        return this.f28173H;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f28174I != z10) {
            this.f28174I = z10;
            j();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f28175J != z10) {
            this.f28175J = z10;
            if (!z10 && this.f28173H.size() > 1) {
                Map<U1.H, I> mapB = b(this.f28173H, this.f28172G, false);
                this.f28173H.clear();
                this.f28173H.putAll(mapB);
            }
            j();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f28169D.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(InterfaceC3184E interfaceC3184E) {
        this.f28176K = (InterfaceC3184E) C1804a.e(interfaceC3184E);
        j();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f28167B = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f28168C = layoutInflaterFrom;
        b bVar = new b();
        this.f28171F = bVar;
        this.f28176K = new C3189e(getResources());
        this.f28172G = new ArrayList();
        this.f28173H = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f28169D = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(C3181B.f40328x);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(e3.z.f40493a, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f28170E = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(C3181B.f40327w);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }
}
