package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import s1.X;

/* loaded from: classes.dex */
class AlertController {

    /* renamed from: A, reason: collision with root package name */
    NestedScrollView f20536A;

    /* renamed from: C, reason: collision with root package name */
    private Drawable f20538C;

    /* renamed from: D, reason: collision with root package name */
    private ImageView f20539D;

    /* renamed from: E, reason: collision with root package name */
    private TextView f20540E;

    /* renamed from: F, reason: collision with root package name */
    private TextView f20541F;

    /* renamed from: G, reason: collision with root package name */
    private View f20542G;

    /* renamed from: H, reason: collision with root package name */
    ListAdapter f20543H;

    /* renamed from: J, reason: collision with root package name */
    private int f20545J;

    /* renamed from: K, reason: collision with root package name */
    private int f20546K;

    /* renamed from: L, reason: collision with root package name */
    int f20547L;

    /* renamed from: M, reason: collision with root package name */
    int f20548M;

    /* renamed from: N, reason: collision with root package name */
    int f20549N;

    /* renamed from: O, reason: collision with root package name */
    int f20550O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f20551P;

    /* renamed from: R, reason: collision with root package name */
    Handler f20553R;

    /* renamed from: a, reason: collision with root package name */
    private final Context f20555a;

    /* renamed from: b, reason: collision with root package name */
    final p f20556b;

    /* renamed from: c, reason: collision with root package name */
    private final Window f20557c;

    /* renamed from: d, reason: collision with root package name */
    private final int f20558d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f20559e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f20560f;

    /* renamed from: g, reason: collision with root package name */
    ListView f20561g;

    /* renamed from: h, reason: collision with root package name */
    private View f20562h;

    /* renamed from: i, reason: collision with root package name */
    private int f20563i;

    /* renamed from: j, reason: collision with root package name */
    private int f20564j;

    /* renamed from: k, reason: collision with root package name */
    private int f20565k;

    /* renamed from: l, reason: collision with root package name */
    private int f20566l;

    /* renamed from: m, reason: collision with root package name */
    private int f20567m;

    /* renamed from: o, reason: collision with root package name */
    Button f20569o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f20570p;

    /* renamed from: q, reason: collision with root package name */
    Message f20571q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f20572r;

    /* renamed from: s, reason: collision with root package name */
    Button f20573s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f20574t;

    /* renamed from: u, reason: collision with root package name */
    Message f20575u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f20576v;

    /* renamed from: w, reason: collision with root package name */
    Button f20577w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f20578x;

    /* renamed from: y, reason: collision with root package name */
    Message f20579y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f20580z;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20568n = false;

    /* renamed from: B, reason: collision with root package name */
    private int f20537B = 0;

    /* renamed from: I, reason: collision with root package name */
    int f20544I = -1;

    /* renamed from: Q, reason: collision with root package name */
    private int f20552Q = 0;

    /* renamed from: S, reason: collision with root package name */
    private final View.OnClickListener f20554S = new a();

    public static class RecycleListView extends ListView {

        /* renamed from: B, reason: collision with root package name */
        private final int f20581B;

        /* renamed from: C, reason: collision with root package name */
        private final int f20582C;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.f42697c2);
            this.f20582C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i.j.f42702d2, -1);
            this.f20581B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i.j.f42707e2, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f20581B, getPaddingRight(), z11 ? getPaddingBottom() : this.f20582C);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message messageObtain = (view != alertController.f20569o || (message3 = alertController.f20571q) == null) ? (view != alertController.f20573s || (message2 = alertController.f20575u) == null) ? (view != alertController.f20577w || (message = alertController.f20579y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f20553R.obtainMessage(1, alertController2.f20556b).sendToTarget();
        }
    }

    public static class b {

        /* renamed from: A, reason: collision with root package name */
        public int f20584A;

        /* renamed from: B, reason: collision with root package name */
        public int f20585B;

        /* renamed from: C, reason: collision with root package name */
        public int f20586C;

        /* renamed from: D, reason: collision with root package name */
        public int f20587D;

        /* renamed from: F, reason: collision with root package name */
        public boolean[] f20589F;

        /* renamed from: G, reason: collision with root package name */
        public boolean f20590G;

        /* renamed from: H, reason: collision with root package name */
        public boolean f20591H;

        /* renamed from: J, reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f20593J;

        /* renamed from: K, reason: collision with root package name */
        public Cursor f20594K;

        /* renamed from: L, reason: collision with root package name */
        public String f20595L;

        /* renamed from: M, reason: collision with root package name */
        public String f20596M;

        /* renamed from: N, reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f20597N;

        /* renamed from: a, reason: collision with root package name */
        public final Context f20599a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f20600b;

        /* renamed from: d, reason: collision with root package name */
        public Drawable f20602d;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f20604f;

        /* renamed from: g, reason: collision with root package name */
        public View f20605g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f20606h;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence f20607i;

        /* renamed from: j, reason: collision with root package name */
        public Drawable f20608j;

        /* renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f20609k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f20610l;

        /* renamed from: m, reason: collision with root package name */
        public Drawable f20611m;

        /* renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f20612n;

        /* renamed from: o, reason: collision with root package name */
        public CharSequence f20613o;

        /* renamed from: p, reason: collision with root package name */
        public Drawable f20614p;

        /* renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f20615q;

        /* renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f20617s;

        /* renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f20618t;

        /* renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f20619u;

        /* renamed from: v, reason: collision with root package name */
        public CharSequence[] f20620v;

        /* renamed from: w, reason: collision with root package name */
        public ListAdapter f20621w;

        /* renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f20622x;

        /* renamed from: y, reason: collision with root package name */
        public int f20623y;

        /* renamed from: z, reason: collision with root package name */
        public View f20624z;

        /* renamed from: c, reason: collision with root package name */
        public int f20601c = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f20603e = 0;

        /* renamed from: E, reason: collision with root package name */
        public boolean f20588E = false;

        /* renamed from: I, reason: collision with root package name */
        public int f20592I = -1;

        /* renamed from: O, reason: collision with root package name */
        public boolean f20598O = true;

        /* renamed from: r, reason: collision with root package name */
        public boolean f20616r = true;

        class a extends ArrayAdapter<CharSequence> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ RecycleListView f20625B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f20625B = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = b.this.f20589F;
                if (zArr != null && zArr[i10]) {
                    this.f20625B.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        class C0298b extends CursorAdapter {

            /* renamed from: B, reason: collision with root package name */
            private final int f20627B;

            /* renamed from: C, reason: collision with root package name */
            private final int f20628C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ RecycleListView f20629D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ AlertController f20630E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0298b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f20629D = recycleListView;
                this.f20630E = alertController;
                Cursor cursor2 = getCursor();
                this.f20627B = cursor2.getColumnIndexOrThrow(b.this.f20595L);
                this.f20628C = cursor2.getColumnIndexOrThrow(b.this.f20596M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f20627B));
                this.f20629D.setItemChecked(cursor.getPosition(), cursor.getInt(this.f20628C) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f20600b.inflate(this.f20630E.f20548M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ AlertController f20632B;

            c(AlertController alertController) {
                this.f20632B = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                b.this.f20622x.onClick(this.f20632B.f20556b, i10);
                if (b.this.f20591H) {
                    return;
                }
                this.f20632B.f20556b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ RecycleListView f20634B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ AlertController f20635C;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f20634B = recycleListView;
                this.f20635C = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = b.this.f20589F;
                if (zArr != null) {
                    zArr[i10] = this.f20634B.isItemChecked(i10);
                }
                b.this.f20593J.onClick(this.f20635C.f20556b, i10, this.f20634B.isItemChecked(i10));
            }
        }

        public b(Context context) {
            this.f20599a = context;
            this.f20600b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            ListAdapter dVar;
            RecycleListView recycleListView = (RecycleListView) this.f20600b.inflate(alertController.f20547L, (ViewGroup) null);
            if (this.f20590G) {
                dVar = this.f20594K == null ? new a(this.f20599a, alertController.f20548M, R.id.text1, this.f20620v, recycleListView) : new C0298b(this.f20599a, this.f20594K, false, recycleListView, alertController);
            } else {
                int i10 = this.f20591H ? alertController.f20549N : alertController.f20550O;
                if (this.f20594K != null) {
                    dVar = new SimpleCursorAdapter(this.f20599a, i10, this.f20594K, new String[]{this.f20595L}, new int[]{R.id.text1});
                } else {
                    dVar = this.f20621w;
                    if (dVar == null) {
                        dVar = new d(this.f20599a, i10, R.id.text1, this.f20620v);
                    }
                }
            }
            alertController.f20543H = dVar;
            alertController.f20544I = this.f20592I;
            if (this.f20622x != null) {
                recycleListView.setOnItemClickListener(new c(alertController));
            } else if (this.f20593J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f20597N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f20591H) {
                recycleListView.setChoiceMode(1);
            } else if (this.f20590G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f20561g = recycleListView;
        }

        public void a(AlertController alertController) {
            View view = this.f20605g;
            if (view != null) {
                alertController.k(view);
            } else {
                CharSequence charSequence = this.f20604f;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                Drawable drawable = this.f20602d;
                if (drawable != null) {
                    alertController.m(drawable);
                }
                int i10 = this.f20601c;
                if (i10 != 0) {
                    alertController.l(i10);
                }
                int i11 = this.f20603e;
                if (i11 != 0) {
                    alertController.l(alertController.c(i11));
                }
            }
            CharSequence charSequence2 = this.f20606h;
            if (charSequence2 != null) {
                alertController.n(charSequence2);
            }
            CharSequence charSequence3 = this.f20607i;
            if (charSequence3 != null || this.f20608j != null) {
                alertController.j(-1, charSequence3, this.f20609k, null, this.f20608j);
            }
            CharSequence charSequence4 = this.f20610l;
            if (charSequence4 != null || this.f20611m != null) {
                alertController.j(-2, charSequence4, this.f20612n, null, this.f20611m);
            }
            CharSequence charSequence5 = this.f20613o;
            if (charSequence5 != null || this.f20614p != null) {
                alertController.j(-3, charSequence5, this.f20615q, null, this.f20614p);
            }
            if (this.f20620v != null || this.f20594K != null || this.f20621w != null) {
                b(alertController);
            }
            View view2 = this.f20624z;
            if (view2 != null) {
                if (this.f20588E) {
                    alertController.s(view2, this.f20584A, this.f20585B, this.f20586C, this.f20587D);
                    return;
                } else {
                    alertController.r(view2);
                    return;
                }
            }
            int i12 = this.f20623y;
            if (i12 != 0) {
                alertController.q(i12);
            }
        }
    }

    private static final class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<DialogInterface> f20637a;

        public c(DialogInterface dialogInterface) {
            this.f20637a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f20637a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, p pVar, Window window) {
        this.f20555a = context;
        this.f20556b = pVar;
        this.f20557c = window;
        this.f20553R = new c(pVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, i.j.f42587F, i.a.f42407n, 0);
        this.f20545J = typedArrayObtainStyledAttributes.getResourceId(i.j.f42592G, 0);
        this.f20546K = typedArrayObtainStyledAttributes.getResourceId(i.j.f42602I, 0);
        this.f20547L = typedArrayObtainStyledAttributes.getResourceId(i.j.f42612K, 0);
        this.f20548M = typedArrayObtainStyledAttributes.getResourceId(i.j.f42617L, 0);
        this.f20549N = typedArrayObtainStyledAttributes.getResourceId(i.j.f42627N, 0);
        this.f20550O = typedArrayObtainStyledAttributes.getResourceId(i.j.f42607J, 0);
        this.f20551P = typedArrayObtainStyledAttributes.getBoolean(i.j.f42622M, true);
        this.f20558d = typedArrayObtainStyledAttributes.getDimensionPixelSize(i.j.f42597H, 0);
        typedArrayObtainStyledAttributes.recycle();
        pVar.l(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int i() {
        int i10 = this.f20546K;
        return i10 == 0 ? this.f20545J : this.f20552Q == 1 ? i10 : this.f20545J;
    }

    private void o(ViewGroup viewGroup, View view, int i10, int i11) {
        View viewFindViewById = this.f20557c.findViewById(i.f.f42520u);
        View viewFindViewById2 = this.f20557c.findViewById(i.f.f42519t);
        X.F0(view, i10, i11);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void t(ViewGroup viewGroup) {
        int i10;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f20569o = button;
        button.setOnClickListener(this.f20554S);
        if (TextUtils.isEmpty(this.f20570p) && this.f20572r == null) {
            this.f20569o.setVisibility(8);
            i10 = 0;
        } else {
            this.f20569o.setText(this.f20570p);
            Drawable drawable = this.f20572r;
            if (drawable != null) {
                int i11 = this.f20558d;
                drawable.setBounds(0, 0, i11, i11);
                this.f20569o.setCompoundDrawables(this.f20572r, null, null, null);
            }
            this.f20569o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f20573s = button2;
        button2.setOnClickListener(this.f20554S);
        if (TextUtils.isEmpty(this.f20574t) && this.f20576v == null) {
            this.f20573s.setVisibility(8);
        } else {
            this.f20573s.setText(this.f20574t);
            Drawable drawable2 = this.f20576v;
            if (drawable2 != null) {
                int i12 = this.f20558d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f20573s.setCompoundDrawables(this.f20576v, null, null, null);
            }
            this.f20573s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f20577w = button3;
        button3.setOnClickListener(this.f20554S);
        if (TextUtils.isEmpty(this.f20578x) && this.f20580z == null) {
            this.f20577w.setVisibility(8);
        } else {
            this.f20577w.setText(this.f20578x);
            Drawable drawable3 = this.f20580z;
            if (drawable3 != null) {
                int i13 = this.f20558d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f20577w.setCompoundDrawables(this.f20580z, null, null, null);
            }
            this.f20577w.setVisibility(0);
            i10 |= 4;
        }
        if (y(this.f20555a)) {
            if (i10 == 1) {
                b(this.f20569o);
            } else if (i10 == 2) {
                b(this.f20573s);
            } else if (i10 == 4) {
                b(this.f20577w);
            }
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f20557c.findViewById(i.f.f42521v);
        this.f20536A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f20536A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f20541F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f20560f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f20536A.removeView(this.f20541F);
        if (this.f20561g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f20536A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f20536A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f20561g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void v(ViewGroup viewGroup) {
        View viewInflate = this.f20562h;
        if (viewInflate == null) {
            viewInflate = this.f20563i != 0 ? LayoutInflater.from(this.f20555a).inflate(this.f20563i, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !a(viewInflate)) {
            this.f20557c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f20557c.findViewById(i.f.f42513n);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f20568n) {
            frameLayout.setPadding(this.f20564j, this.f20565k, this.f20566l, this.f20567m);
        }
        if (this.f20561g != null) {
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void w(ViewGroup viewGroup) {
        if (this.f20542G != null) {
            viewGroup.addView(this.f20542G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f20557c.findViewById(i.f.f42498N).setVisibility(8);
            return;
        }
        this.f20539D = (ImageView) this.f20557c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f20559e) || !this.f20551P) {
            this.f20557c.findViewById(i.f.f42498N).setVisibility(8);
            this.f20539D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f20557c.findViewById(i.f.f42509j);
        this.f20540E = textView;
        textView.setText(this.f20559e);
        int i10 = this.f20537B;
        if (i10 != 0) {
            this.f20539D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.f20538C;
        if (drawable != null) {
            this.f20539D.setImageDrawable(drawable);
        } else {
            this.f20540E.setPadding(this.f20539D.getPaddingLeft(), this.f20539D.getPaddingTop(), this.f20539D.getPaddingRight(), this.f20539D.getPaddingBottom());
            this.f20539D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void x() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f20557c.findViewById(i.f.f42518s);
        int i10 = i.f.f42499O;
        View viewFindViewById4 = viewFindViewById3.findViewById(i10);
        int i11 = i.f.f42512m;
        View viewFindViewById5 = viewFindViewById3.findViewById(i11);
        int i12 = i.f.f42510k;
        View viewFindViewById6 = viewFindViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(i.f.f42514o);
        v(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i10);
        View viewFindViewById8 = viewGroup.findViewById(i11);
        View viewFindViewById9 = viewGroup.findViewById(i12);
        ViewGroup viewGroupH = h(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupH2 = h(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupH3 = h(viewFindViewById9, viewFindViewById6);
        u(viewGroupH2);
        t(viewGroupH3);
        w(viewGroupH);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (viewGroupH == null || viewGroupH.getVisibility() == 8) ? 0 : 1;
        boolean z12 = (viewGroupH3 == null || viewGroupH3.getVisibility() == 8) ? false : true;
        if (!z12 && viewGroupH2 != null && (viewFindViewById2 = viewGroupH2.findViewById(i.f.f42494J)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z11 != 0) {
            NestedScrollView nestedScrollView = this.f20536A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f20560f == null && this.f20561g == null) ? null : viewGroupH.findViewById(i.f.f42497M);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupH2 != null && (viewFindViewById = viewGroupH2.findViewById(i.f.f42495K)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f20561g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view = this.f20561g;
            if (view == null) {
                view = this.f20536A;
            }
            if (view != null) {
                o(viewGroupH2, view, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f20561g;
        if (listView2 == null || (listAdapter = this.f20543H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i13 = this.f20544I;
        if (i13 > -1) {
            listView2.setItemChecked(i13, true);
            listView2.setSelection(i13);
        }
    }

    private static boolean y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i.a.f42406m, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f20555a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f20561g;
    }

    public void e() {
        this.f20556b.setContentView(i());
        x();
    }

    public boolean f(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f20536A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f20536A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public void j(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f20553R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f20578x = charSequence;
            this.f20579y = message;
            this.f20580z = drawable;
        } else if (i10 == -2) {
            this.f20574t = charSequence;
            this.f20575u = message;
            this.f20576v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f20570p = charSequence;
            this.f20571q = message;
            this.f20572r = drawable;
        }
    }

    public void k(View view) {
        this.f20542G = view;
    }

    public void l(int i10) {
        this.f20538C = null;
        this.f20537B = i10;
        ImageView imageView = this.f20539D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f20539D.setImageResource(this.f20537B);
            }
        }
    }

    public void m(Drawable drawable) {
        this.f20538C = drawable;
        this.f20537B = 0;
        ImageView imageView = this.f20539D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f20539D.setImageDrawable(drawable);
            }
        }
    }

    public void n(CharSequence charSequence) {
        this.f20560f = charSequence;
        TextView textView = this.f20541F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void p(CharSequence charSequence) {
        this.f20559e = charSequence;
        TextView textView = this.f20540E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(int i10) {
        this.f20562h = null;
        this.f20563i = i10;
        this.f20568n = false;
    }

    public void r(View view) {
        this.f20562h = view;
        this.f20563i = 0;
        this.f20568n = false;
    }

    public void s(View view, int i10, int i11, int i12, int i13) {
        this.f20562h = view;
        this.f20563i = 0;
        this.f20568n = true;
        this.f20564j = i10;
        this.f20565k = i11;
        this.f20566l = i12;
        this.f20567m = i13;
    }
}
